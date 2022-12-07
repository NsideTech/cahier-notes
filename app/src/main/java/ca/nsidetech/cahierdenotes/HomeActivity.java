package ca.nsidetech.cahierdenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private Button btnEnregistrerNote;
    private Button btnAfficherNote;
    private List<Matiere> matiereList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        liaison();
    }

    private void liaison() {
        btnAfficherNote = findViewById(R.id.btnAfficherNote);
        btnEnregistrerNote = findViewById(R.id.btnEnregistrerNote);

        btnEnregistrerNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}