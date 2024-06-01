/* Parte de una clase: Nombre, Atributos y Metodo
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

/**
 *
 * @author EMARTINEZ
 */
public class Person {
    private String name;
    private String lastName;
    private float height;
    private int age;

    /**
     * Constructor vacío
     */
    
    public Person(){
}
    
    /**
     * Constructor JavaDoc con parámetros
     * @param name
     * @param lastName
     * @param height
     * @param age 
     */
    public Person(String name, String lastName, float height, int age){
        this.name = name;
        this.lastName = lastName;
        this.height = height;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
}

    @Override
    public String toString() {
        return "Nombres: " + name + "\nApellidos: " + lastName + "\nAltura: " + height + "\nEdad: " + age + '\n';
    }
    
    
    
}
