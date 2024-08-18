package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    //La única clase que existe en esta instancia
    private static Conexion conx = null;
    //atributos
    private static Connection con = null;
    private static String url = "jdbc:sqlserver://localhost;"
        + "databaseName=SisAppLibros;"
        + "Persist Security Info=True;";
    private static String user = "sa";
    private static String password = "1234";
    
    //Constructor
    public Conexion() {
        
    }
    
    public static Conexion obtInstancia(){
        //Instanciamos la conexion
        if (conx==null){
            conx = new Conexion();
        }
        return conx;
    }
    
    //Métodos    
    public static Connection obtConexion(){
        if (estaConectado()==false){
            Conexion.crearConexion();
        }   
        return con;
    }   
    
    @SuppressWarnings("UseSpecificCatch")
    public static boolean estaConectado ()
    {
        boolean resp = false;
        try {
            resp =! ((con==null)||(con.isClosed()));
        }
        catch (Exception e){
            System.out.println("Error al consultar el estadode la Conexion: "+ e.getMessage());
        }
        return resp;
    }
    
    public static void crearConexion()
    {
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con= DriverManager.getConnection (url, user, password);
        }
        catch (ClassNotFoundException e){
            con=null;
            System.out.println("Error al cargar el driver: " +e.getMessage());
        }
        catch (SQLException e) {
            con =null;
            System.out.println("Error alestablecer la conexión: " +e.getMessage());
            
        }
    }
        
    @SuppressWarnings("CallToPrintStackTrace")
    public static void cerrarConexion (Connection con){
        if (estaConectado()!=false){
            try{
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error al cerrar la conexión: "+ e.getMessage());
            }
        }
    }
}    