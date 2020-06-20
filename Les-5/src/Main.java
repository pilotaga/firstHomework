public class Main {

    public static void main(String[] args) {
	    doTask1();
    }

    static void doTask1(){
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Andrey Sergeevich","progremmer", "prias@prog.com", "92898929", "200000", "45");
        employees[1] = new Employee("Ivanov Sergey Sergeevich","engineer", "engis@prog.com", "746872364378", "150000", "30");
        employees[2] = new Employee("Ivanov Ivan Sergeevich","administrator", "adiis@prog.com", "48574857", "120000", "25");
        employees[3] = new Employee("Ivanov Alexey Sergeevich","marketing manager", "mais@prog.com", "234234", "150000", "23");
        employees[4] = new Employee("Ivanov Maxim Sergeevich","director", "dims@prog.com", "45345", "300000", "56");

        for(int i = 0; i < employees.length; i++){
            if (Integer.parseInt(employees[i].getAge())>40) employees[i].showEmployee();
        }
    }
}
