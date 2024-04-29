package funcionario;

public class Funcionario_ {

    private String name;
    private int age;
    private double salary;

    public Funcionario_(){
    }
    public Funcionario_(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }git status

    public double increaseSalary(double percentage){
        return salary += salary * percentage / 100;
    }

    public String toString(){
        return name + ", age: " + age + ", salary: " + salary;
    }

}
