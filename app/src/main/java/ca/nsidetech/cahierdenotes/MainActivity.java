package ca.nsidetech.cahierdenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSauvegarder;
    private EditText edtNoteStudent;
    private EditText edtCourseName;
    private EditText edtStudentName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liaison();
    }

    private void liaison() {
        btnSauvegarder = findViewById(R.id.btnSauvegarderNote);
        edtStudentName = findViewById(R.id.edtStudentName);
        edtCourseName = findViewById(R.id.edtCourseName);
        edtNoteStudent = findViewById(R.id.edtStudentNote);

        btnSauvegarder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}