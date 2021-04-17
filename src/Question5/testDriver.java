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
public class testDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Vinay Kumar Paspula - Question 5");
        Person person = new Person("James", "1234 South University Drive Ohio-64457", "660-224-8719", "James@nwmissori.edu");
        System.out.println(person.toString());
        
        Student student = new Student("Vinay Paspula", "1115N College Drive Maryville Mo-64468", "660-215-8877", "s541769@nwmissouri.edu", 4.0);
        System.out.println(student.toString());
        
        Employee employee = new Employee("Colden Hall - 1500", 8790.00, "04/15/2020", person);
        System.out.println(employee.toString());
        
        Faculty faculty = new Faculty("John", "54 Forest Drive NY-78834", "641-456-8167", "John@nwmissori.edu", "Colden Hall - 1243", 10990.30, "01/21/2020", "MWF- 8:00pm-9:00pm",4);
        System.out.println(faculty.toString());
        
        Staff staff = new Staff("Robert", "858 Mountain road CA-57798", "879-463-8669", "Robert@nwmissori.edu", "Admin - 1200", 7000.00, "07/03/2019", "Advisor");
        System.out.println(staff.toString());

    }
}
