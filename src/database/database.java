import java.sql.*;

class database
{
    public static void main(String[] a) {
        // Parameters to Create the connection
        String url = "jdbc:mysql://localhost:3306/mahbod";
        String user = "ars";
        String pass = "Mahbod69@";

        try
        {
            String sql_command = "SELECT * FROM Persons";
            Connection myConnection = DriverManager.getConnection(url,user,pass);
            Statement myStatment = myConnection.createStatement();
            ResultSet result = myStatment.executeQuery(sql_command);
            while (result.next()){
                System.out.println(result.getString("PersonID") + " " + result.getString("LastName") +
                        " " + result.getString("FirstName") + " " + result.getString("Address") + " " + result.getString("City"));
            }
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
}
