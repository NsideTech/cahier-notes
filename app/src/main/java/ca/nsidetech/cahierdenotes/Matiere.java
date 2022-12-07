package ca.nsidetech.cahierdenotes;

import java.io.Serializable;

public class Matiere implements Serializable {

    private Long Id;
    private String studentName;
    private String courseName;
    private double noteStudents;

    public Matiere(Long id, String studentName, String courseName, double noteStudents) {
        Id = id;
        this.studentName = studentName;
        this.courseName = courseName;
        this.noteStudents = noteStudents;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getNoteStudents() {
        return noteStudents;
    }

    public void setNoteStudents(double noteStudents) {
        this.noteStudents = noteStudents;
    }
}
