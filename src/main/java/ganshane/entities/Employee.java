package ganshane.entities;
import java.util.Date;
import java.io.Serializable;

import javax.persistence.Entity;

import ganshane.entities.impl.AbstractPersistModel;

@Entity
public class Employee extends AbstractPersistModel implements Serializable{
    

    private String firstName;

    private String lastName;

    private Date hireDate;

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