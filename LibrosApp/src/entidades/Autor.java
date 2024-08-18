
package entidades;

/**
 *
 * @author EMARTINEZ
 */
public class Autor {
    private int authorID;
    private String firstName;
    private String lastName;

    public Autor() {
    }

    public Autor(int authorID, String fistName, String lastName) {
        this.authorID = authorID;
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = fistName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    
}
