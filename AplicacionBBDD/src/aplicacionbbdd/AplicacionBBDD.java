/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionbbdd;

import java.util.Calendar;
import java.util.TimeZone;
import java.sql.*;

/**
 *
 * @author Medac
 */
public class AplicacionBBDD {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException , ClassNotFoundException {
        // TODO code application logic 
        String BD ="paises";
        String usuario = "root";
        String pass = " ";
        String host ="localhost";
        
        //cargar o registrar driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Inicia la condicion
        Calendar now = Calendar.getInstance();
        TimeZone zonaHorario = now.getTimeZone();
        Connection connection=(Connection)DriverManager.getConnection("jdbc:mysql://"+host+"/"+BD+"?user="+usuario+"&password="+pass+"&userLegacyDateTimeCode=false&ServerTimeZone="+zonaHorario.getID());
      
        
        //Crear tabla
        PreparedStatement st= null;
        try{
            st= connection.prepareStatement("CREATE TABLE paises(pais varchar(50)not null,acronimo CHAR(3),poblacion int(20))");
            st.execute();
            st.close();
        }
        catch(SQLException sqle ){
            System.out.println("Error"+sqle.getMessage());
        }
    }
    
}
