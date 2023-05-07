package semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        ArrayList<String> alunosDados = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String nome = "";
        boolean inicializar = true;
        double nota1;
        double nota2;
        double nota3;
        double media;


        while (inicializar) {
            System.out.println("Digite o nome do aluno ou FIM para finalizar");
            nome = entrada.next();
            if (!nome.equalsIgnoreCase("FIM")) {
                System.out.println("Digite a primeira nota");
                nota1 = entrada.nextDouble();
                System.out.println("Digite a segunda nota");
                nota2 = entrada.nextDouble();
                System.out.println("Digite a terceira nota");
                nota3 = entrada.nextDouble();
                alunosDados.add(nome);
                media = (nota1 + nota2 + nota3) / 3;
                alunosDados.add(String.valueOf(nota1));
                alunosDados.add(String.valueOf(nota2));
                alunosDados.add(String.valueOf(nota3));
                alunosDados.add(String.valueOf(media));
                if (media >= 7.0) {
                    alunosDados.add("Aprovado");
                } else {
                    alunosDados.add("Reprovado");
                }
            } else {
                inicializar = false;
            }
        }
       alunosDados.forEach(System.out::println);

    }
}
