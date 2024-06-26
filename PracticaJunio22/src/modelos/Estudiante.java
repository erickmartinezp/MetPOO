/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EMARTINEZ
 */
public class Estudiante {
    private int id;
    private String name;
    private String apellido;
    private String carrera;
    private double promedio;

    public Estudiante() {
    }

    public Estudiante(int id, String name, String apellido, String carrera, double promedio) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        sb.append(", name=").append(name);
        sb.append(", apellido=").append(apellido);
        sb.append(", carrera=").append(carrera);
        sb.append(", promedio=").append(promedio);
        sb.append('}');
        return sb.toString();
    }
    
    public String getBeca() {
    if (promedio > 85) {
        return "El estudiante tiene derecho a una beca";
    } else {
        return "El estudiante no tiene derecho a una beca";
    }
    }
    
}
