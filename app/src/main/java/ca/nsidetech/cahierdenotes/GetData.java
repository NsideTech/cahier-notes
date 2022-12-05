package ca.nsidetech.cahierdenotes;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GetData extends AsyncTask<String, String, String> {
    private List<Matiere> matieres = new ArrayList<>();
    String msg = "";
    private final Context context;
    private final ListView myListView;

    public GetData(Context context, ListView myListView) {
        this.context = context;
        this.myListView = myListView;
    }

    @Override
    protected void onPreExecute() {
    }

    @Override
    protected String doInBackground(String... strings) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Récupération de la connexion à la BD
            Class.forName(DBUtil.JDBC_DRIVER).newInstance();
            conn = DriverManager.getConnection(DBUtil.DB_URL, DBUtil.USERNAME, DBUtil.PASSWORD);
            stmt = conn.createStatement();

            // Exécution du select
            String req = "SELECT * FROM categorie";
            ResultSet rs = stmt.executeQuery(req);
            while (rs.next()) //On boucle pour récupérer les données et on les ajoute dans la map
            {
                int note = rs.getInt("note");
                String nom = rs.getString("nom");

                matieres.add(new Matiere(nom, note));
            }
            msg = "Processus complété";

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException connError) {
            msg = "Une exception a été levée pour JDBC";
            connError.printStackTrace();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        } finally //Fermeture de la connexion à la BD
        {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        return null;
    }

    @Override
    protected void onPostExecute(String msg) {
        //Les données de la BD sont envoyées vers un custom adapter pour populer la liste
        CustomMatiereListAdapter adapter = new CustomMatiereListAdapter(context, matieres);
        myListView.setAdapter(adapter);
    }
}
