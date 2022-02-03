package course1.lesson5.homework5;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee[] employeeData = new Employee[5];

        employeeData[0] = new Employee("Russell Crowe", "detective", "crowe@nypd.com", "+1 646-610-5000", 4000, 57);
        employeeData[1] = new Employee("Tiger Woods", "golf player", "tiger@golf.com", "+1 919-719-7950", 10000, 46);
        employeeData[2] = new Employee("Michael Jordan", "basketball player", "air@jordan.com", "+1 312-455-4000", 7000, 58);
        employeeData[3] = new Employee("Odette Annable", "actress", "odette@housemd.com", "+1 609-924-9300", 5000, 36);
        employeeData[4] = new Employee("Marc Marquez", "motorcycle racer ", "marquez@motogp.com", "+1 970-330-0975", 20000, 28);

        for (Employee i : employeeData) {
            if (i.getAge() > 40) {
                i.info();
            }
        }
    }
}