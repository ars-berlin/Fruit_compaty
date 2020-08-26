import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

public class DB{

    private String DB_URL = "jdbc:mysql://localhost/FruitAtWork";
    /** Database credentials */
    
    private String USER = "ars";
    private String PASS = "Mahbod69@";

    public Statement make_connetion(){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
        }catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally {
            //finally block used to close resources
            try {
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2) {}
            // nothing we can do
            try {
                if(conn!=null)
                    conn.close();
            }catch(SQLException se) {
                se.printStackTrace();
            }
        }
        return stmt;
    }
    public void close_connection(Statement stmt) throws SQLException {
        System.out.println("Closing the Connection to the DB ....");
        stmt.close();
    }

    public void add (String query){
    Statement stmt = make_connetion();
        stmt.executeQuery(strSelect);

    }
}
