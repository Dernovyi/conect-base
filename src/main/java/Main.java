
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        String name = "root";
        String password = "ladadetal";
        String url ="jdbc:mysql://localhost:3306/customers?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;


        try {
            Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            //statement.executeUpdate("DROP TABLE user");
            //statement.executeUpdate("CREATE TABLE  user (id INTEGER NOT NULL, name CHAR(100), PRIMARY KEY (id)");
           // statement.executeUpdate("CREATE TABLE user (id INT not null auto_increment, name CHAR(15), PRIMARY KEY (id)");

          // statement.executeUpdate("CREATE TABLE user (id INT not null auto_increment, name CHAR(30) not null, data DATE not null, PRIMARY KEY (id))");
             //statement.executeUpdate("INSERT INTO user (name, data )VALUES ('Serhii', '2019-05-18')");
            ResultSet resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }
}
