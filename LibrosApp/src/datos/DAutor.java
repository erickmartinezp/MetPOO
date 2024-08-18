
package datos;

import entidades.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DAutor {
    //Atributos de la clase
    Conexion conexion = new Conexion();
    Connection conn = null;
    ResultSet rs = null; // La interfaz ResultSet proporciona métodos de obtención 
    //(getString, etc.) para recuperar valores de columna de la fila actual.
    
    private PreparedStatement ps = null; //Una sentencia SQL se compila previamente 
    //y se almacena en un objeto PreparedStatement
    
    //Métodos
    public void obtRegistros() {
        try {
            conn = Conexion.obtConexion();
        String tSQL = "Select * from Autores";
        
            ps = conn.prepareStatement(tSQL,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE,
                    ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public ArrayList<Autor> listarAutor() {
        ArrayList<Autor> lista = new ArrayList<>();
        try {
            this.obtRegistros();
            while (rs.next()) {
                lista.add (new Autor(
                    rs.getInt("AuthorID"),
                    rs.getString ("FirstName"),
                    rs. getString ("LastName")
                ));
            }
        }   catch (SQLException ex){
            System.out.println("Error al listar autir " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    Conexion.cerrarConexion(conn);
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return lista;
    }

    public boolean guardarAutor (Autor a) {
        boolean guardado = false;
        this.obtRegistros();
        try {
            rs.moveToInsertRow();
            rs.updateString("FirstName", a.getFirstName());
            rs.updateString("LastName", a.getLastName());
            rs.insertRow();
            rs.moveToCurrentRow();
            guardado = true;
        } catch (SQLException ex) {
            System.out.println("Error al guardar el autor: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    Conexion.cerrarConexion(conn);
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return guardado;
    }
    
    public boolean existeAutor (int id) {
        boolean resp = false;
        this.obtRegistros();
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getInt("AuthorID") == id){
                    
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el autor: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    Conexion.cerrarConexion(conn);
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return resp;
    }
    
    public boolean editarAutor (Autor a) {
        boolean resp = false;
        this.obtRegistros();
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getInt("AuthorID") == a.getAuthorID()){
                    rs.updateString("FirstName", a.getFirstName());
                    rs.updateString("LastName", a.getLastName());    
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al editar el autor: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    Conexion.cerrarConexion(conn);
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return resp;
    }    

    public boolean eliminarAutor (int id) {
        boolean resp = false;
        this.obtRegistros();
        try {
            rs.beforeFirst();
            while (rs.next()) {
                if (rs.getInt("AuthorID") == id){
                    rs.deleteRow();
                    resp = true;
                    break;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el autor: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    Conexion.cerrarConexion(conn);
                }
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return resp;
    }
}
