package warmup.company;

abstract class Employee {

    private String salary;
    private String name;
    private String department;

    public Employee(String salary, String name, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String info(){
        return name + "\n" + salary + "\n" + department;
    }
    public String doWork(){
        return "I am Working";
    }
}
