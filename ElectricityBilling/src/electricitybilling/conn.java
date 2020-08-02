
package electricitybilling;

import java.sql.*;

public class conn {
    
    Connection c;
    Statement s;
    
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://project2","root","1234");
            s=c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
