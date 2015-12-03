package kata6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonLoader {
    public static ArrayList read () throws ClassNotFoundException, SQLException {
        ArrayList<OtherPerson> list = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connect = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement statement = connect.createStatement();
        String query = "SELECT * FROM PEOPLE";
        ResultSet  rs = statement.executeQuery(query);
        while (rs.next()) {
            list.add(new OtherPerson(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getString(6)));
        }
        
        rs.close();
        statement.close();
        connect.close();
        return list;
    }
}
