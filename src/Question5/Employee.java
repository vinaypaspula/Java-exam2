/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Employee extends Person {

    private String office;
    private double salary;
    private String date_hired;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate_hired() {
        return date_hired;
    }

    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;
    }

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String date_hired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    public Employee(String office, double salary, String date_hired, Person person) {
        super(person.getName(), person.getAddress(), person.getPhoneNumber(), person.getEmailAddress());
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Office: %s\nSalary: %.2f\nDate_hired: %s\n", getOffice(), getSalary(),
                getDate_hired());
    }

}
