/*
Programa que permite almacenar los datos de un empleado tales como: 
Nombres, Apellidos, Cargo, Salario.
Aumentar el salario en un 20% de los empleados cuyo salario sea menor de 12 mil .
 */
package empleado;

import forms.FrmEmpleado;
import models.Data;

/**
 *
 * @author ERICK MARTINEZ
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmEmpleado frm = new FrmEmpleado();
        frm.setVisible (true);
        
    }
    
}
