package ganshane.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tapestry5.beaneditor.NonVisual;

@Entity
public class Employee {
    
    private Long id;

    private String firstName;

    private String lastName;

    private Date hireDate;

    // Accessors for the fields.  JPA doesn't use these, but your application does.
    @NonVisual
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    } 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 

    public String getLastName() {
        return lastName;
    } 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 

    public Date getHireDate() {
        return hireDate;
    } 
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    } 
}