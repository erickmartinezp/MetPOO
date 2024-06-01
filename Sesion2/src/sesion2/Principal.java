/* Comentario Multilinea
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

import  java.util.ArrayList;

/**
 *
 * @author EMARTINEZ
 */
public class Principal {

    /** Comentario JavaDoc
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person leonardo = new Person ("Leonoardo", "Moncada", 1.79f, 23);
        Person belen = new Person ("Belen", "Acuña", 1.63f, 20);
        Person celeste = new Person ("Celeste", "Martinez", 1.62f, 39);
        Person isaac = new Person ("Isaac", "Martinez", 1.66f, 13);
        Person samantha = new Person ("Samantha", "Martinez", 1.50f, 11);
        Person samuel = new Person ("Samuel", "Martinez", 1.53f, 12);
        Person domingo = new Person ("Domingo", "Martinez", 1.60f, 70);
        
        //System.out.println("Datos de Leonardo: " + leonardo);
        //System.out.println(belen);
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(leonardo);
        people.add(belen);
        people.add(celeste);
        people.add(isaac);
        people.add(samuel);
        people.add(domingo);
       
        for (Person person : people) {
            System.out.println(person);
        }
    }
   
    
    
}
