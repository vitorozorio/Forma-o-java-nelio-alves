package org.example.model;

public class NotaAluno {

    private String name;
    private double nota1, nota2, nota3;

    public NotaAluno(String name, double nota1, double nota2, double nota3) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void testeNotas(){

        double media = this.nota1 + this.nota2 + this.nota3;

        if (media >= 60) {
            System.out.println(this.name +" aprovado com a nota :" + media);
        } else {
            System.out.println(this.name +" reprovado com a nota :" + media
            + "\npontuação faltante :" + (60 - media));
        }
    }
}
