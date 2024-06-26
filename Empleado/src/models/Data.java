/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author EMARTINEZ
 */
public class Data {
    private int id;
    private String name;
    private String lastname;
    private String cargo;
    private double salario;

    public Data() {
    }

    public Data(int id, String name, String lastname, String cargo, double salario) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", lastname=").append(lastname);
        sb.append(", cargo=").append(cargo);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

   
}
