/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Lab-1 Pc-2
 */
public class Estudiante {
    private int id;
    private String nombres;
    private String apellidos;
    private String carrera;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(int id, String nombres, String apellidos, String carrera, double promedio) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{id=").append(id);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", carrera=").append(carrera);
        sb.append(", promedio=").append(promedio);
        sb.append('}');
        return sb.toString();
    }
    
    public String otorgarBeca() {
        if (promedio > 85) {
            return "¡Felicidades! El estudiante " + nombres + " " + apellidos + " ha sido otorgado una beca.";
        } else {
            return "Lo sentimos, el estudiante " + nombres + " " + apellidos + " no cumple con los requisitos para obtener una beca.";
        }
    }
    
}
