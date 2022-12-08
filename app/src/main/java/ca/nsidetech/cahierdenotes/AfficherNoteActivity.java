package ca.nsidetech.cahierdenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class AfficherNoteActivity extends AppCompatActivity {

    private EditText edtGetStudentName;
    private Button btnRechercher;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afficher_note2);
        liaison();
    }

    private void liaison() {
        edtGetStudentName = findViewById(R.id.edtGetStudentName);
        btnRechercher = findViewById(R.id.btnRechercher);
        listView = findViewById(R.id.listView);

        btnRechercher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}