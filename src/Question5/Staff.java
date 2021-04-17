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
public class Staff extends Employee {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            String date_hired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, date_hired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Title: %s\n", getTitle());
    }

}
