import java.sql.*;

class database {

        private String DB_URL = "jdbc:mysql://localhost/FruitAtWork";
        //  Database credentials
        private String USER = "ars";
        private String PASS = "Mahbod69@";

        public Connection make_connetion {
            Connection conn = null;
            Statement stmt = null;
            try{
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                //STEP 3: Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);

                //STEP 4: Execute a query
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
                }//end finally try
            }//end try
        return stmt;
        }//end main
    }//end FirstExample
