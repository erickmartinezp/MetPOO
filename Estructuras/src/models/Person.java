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
public class Person {
    private int id;
    private String name;
    private int edad;
    private double height;

    public Person() {
    }

    public Person(int id, String name, int edad, double height) {
        this.id = id;
        this.name = name;
        this.edad = edad;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", edad=" + edad + ", height=" + height + '}';
    }
    
    
}
