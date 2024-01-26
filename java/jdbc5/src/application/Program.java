
package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement st = null;
        
        try {
            conn = DB.getConnection();
            
           st = conn.prepareStatement(""
                   + "DELETE FROM department "
                   + "WHERE "
                   + "Id = ?");
           
           st.setInt(1, 2);
           
           int rowsAffected = st.executeUpdate();
           
            System.out.println("Done! Rows affected: " + rowsAffected);
            
        } catch (SQLException ex) {
            throw new DbIntegrityException(ex.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
