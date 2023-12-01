package org.example.model;

public class SalarioFuncionario {

    private String name;
    private double grossSalary;
    private double tax;


    public SalarioFuncionario(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    private double netSalary(){
        return grossSalary - tax;
    }

    public double increaseSalary(double porcentage){
        double increment = porcentage / 100;
        return netSalary() + grossSalary * increment;
    }

    @Override
    public String toString() {
        return "Salario :" + netSalary();
    }
}
