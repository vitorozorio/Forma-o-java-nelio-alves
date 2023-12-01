package org.example.testes;
import org.example.model.AreaRetangulo;
import org.example.model.SalarioFuncionario;
import org.example.model.NotaAluno;

public class Testes {

    public static void main(String[] args) {

        /*
        *
        AreaRetangulo Retangulo = new AreaRetangulo(4,3);

        System.out.println(Retangulo);
         *
         **/

        SalarioFuncionario vitor = new SalarioFuncionario("vitor",4600,500);
        NotaAluno Vitor = new NotaAluno("vitor",30,40, 10);

        //System.out.println(vitor);

        Vitor.testeNotas();



    }

}
