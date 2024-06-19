import org.postgresql.util.PSQLException;

import java.sql.*;



public class Main {
    public static void main(String[] args) throws PSQLException, SQLException {


        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname= "postgres";
        String password = "19092002";
        String sql = "UPDATE sname FROM student where sid = 2 ";


        Connection con  = DriverManager.getConnection(url,uname,password);
        System.out.println("Yay! Connection Established");
        Statement st = con.createStatement();
        System.out.println("Statement ");
       ResultSet rs = st.executeQuery(sql);

       while(rs.next()){
           System.out.print(rs.getInt("sid")+" - ");
           System.out.print(rs.getString("sname")+" - ");
           System.out.print(rs.getInt("marks"));
           System.out.println();
       }

        con.close();

        System.out.println("Connection Closed");


    }
}