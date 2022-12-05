package ca.nsidetech.cahierdenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnVoir;
    private Button btnSauvegarder;
    private ListView listView1;
    private EditText txtNote;
    private EditText txtNomMatiere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVoir = findViewById(R.id.buttonShow);
        btnSauvegarder = findViewById(R.id.buttonSave);
        txtNomMatiere = findViewById(R.id.editTextNom);
        txtNote = findViewById(R.id.editTextNote);

        btnSauvegarder.setOnClickListener(view -> {
            // ajouter un controle pour valider que les données sont valides
            String nomMatiere = txtNomMatiere.getText().toString();
            int note = Integer.parseInt(txtNote.getText().toString());

            // remplacer cette fonction avec un appel vers notre service pour sauvegarde
            InsertData insert = new InsertData(nomMatiere,note);
            insert.execute();

        });
        btnVoir.setOnClickListener(view -> {
            // remplacer cette fonction avec un appel vers notre service pour recupérer
            GetData data = new GetData(MainActivity.this, listView1);
            data.execute();
        });
    }
}