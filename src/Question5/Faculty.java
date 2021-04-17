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
public class Faculty extends Employee {

    private String officeHours;
    private int numberOfTeachingSubjects;

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public int getNumberOfTeachingSubjects() {
        return numberOfTeachingSubjects;
    }

    public void setNumberOfTeachingSubjects(int numberOfTeachingSubjects) {
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            String date_hired, String officeHours, int numberOfTeachingSubjects) {
        super(name, address, phoneNumber, emailAddress, office, salary, date_hired);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("OfficeHours: %s\nNumberOfTeachingSubjects: %d\n", getOfficeHours(),
                getNumberOfTeachingSubjects());
    }

}
