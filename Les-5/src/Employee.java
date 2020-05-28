public class Employee {
    private String FIO, position, email, cell, salary, age;

    public String getAge() {
        return age;
    }

    Employee(String FIO, String position, String email, String cell, String salary, String age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.cell = cell;
        this.salary = salary;
        this.age = age;
    }

    void showEmployee(){
        System.out.println(FIO+' '+position+' ' + email + ' ' + cell + ' ' + salary + ' ' + age);
    }

}
