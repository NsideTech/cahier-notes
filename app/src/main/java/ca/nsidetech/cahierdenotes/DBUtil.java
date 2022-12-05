package ca.nsidetech.cahierdenotes;

public class DBUtil {
    static final String DATABASE_URL = "10.0.2.2"; //Important
    static final String DATABASE_NAME = "cahiernote";
    static final String USERNAME = "Osullivan";
    static final String PASSWORD = "Osullivan2021";

    //Nom du driver JDBC et URL de la base de données
//        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//        static final String DB_URL = "jdbc: mysql://" + DBUtil.DATABASE_URL + "/" + DBUtil.DATABASE_NAME + "?characterEncoding=latin1";

    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://" + DBUtil.DATABASE_URL + "/" + DBUtil.DATABASE_NAME + "?characterEncoding=latin1";
}
