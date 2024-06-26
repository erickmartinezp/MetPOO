/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.City;

/**
 *
 * @author EMARTINEZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    City city = new City();
    ArrayList<City> listado = new ArrayList();

    
    
    String id = JOptionPane.showInputDialog("Dime el id: ");
    String name = JOptionPane.showInputDialog("Dime el nombre: ");
    String description = JOptionPane.showInputDialog("Dime la descrpción: ");
    
    city.setId(Integer.parseInt(id));
    city.setName(name);
    city.setDescription(description);
    JOptionPane.showMessageDialog(null, city);
    
    
    }
}
