package ca.nsidetech.cahierdenotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EnregistrerNoteActivity extends AppCompatActivity {


    private Button btnSauvegarder;
    private EditText edtNoteStudent;
    private EditText edtCourseName;
    private EditText edtStudentName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enregistrer_note);
        liaison();
    }

    private void liaison() {

    }
}