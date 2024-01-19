package Org.Nelio.ArryList.Model;

public class Funcionario extends User {

    Double salary;

    public Funcionario(Integer id, String name, Double salary) {
        super(id, name);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
