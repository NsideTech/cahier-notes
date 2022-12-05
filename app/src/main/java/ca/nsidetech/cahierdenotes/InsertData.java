package ca.nsidetech.cahierdenotes;

import static ca.nsidetech.cahierdenotes.DBUtil.JDBC_DRIVER;

import android.os.AsyncTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData extends AsyncTask<String, String, String> {
    String msg = "";
    private final String nom;
    private final int note;

    public InsertData(String nom, int note) {
        this.nom = nom;
        this.note = note;
    }

    @Override
    protected void onPreExecute() {
    }

    @Override
    protected String doInBackground(String... strings) {
        Connection conn = null;

        try {
            Class.forName(JDBC_DRIVER).newInstance();
            conn = DriverManager.getConnection(DBUtil.DB_URL, DBUtil.USERNAME, DBUtil.PASSWORD);

            String req = " insert into matiere (nom, note) values (?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(req);
            preparedStmt.setString(1, nom);
            preparedStmt.setInt(2, note);

            preparedStmt.execute();

            conn.close();
            msg = "Processus complété";
        } catch (SQLException connError) {
            msg = "Une exception a été levée pour JDBC";
            connError.printStackTrace();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        } finally {

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}