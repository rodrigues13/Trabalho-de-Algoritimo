package PSEUDOCÓDIGOS_EM_JAVA;

import java.util.Scanner;

/*
Exemplo 3)
Faça um programa que receba duas notas de seis alunos. Calcule e mostre:
a) A média aritmética das duas notas de cada aluno.
b) A mensagem de acordo com o quadro abaixo:
Até 3 Reprovado
Maior que 3 e menor que 7 Exame
Maior que 7 Aprovado
c) O total de alunos aprovados
d) O total de alunos em exame
e) O total de alunos reprovados
f) A média da classe
 */
public class Primeiro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---->boletim informativo !<----");
        System.out.println("===============================");
        double aluno1 = 0, nota1 = 0, cont1 = 0;
        double aluno2 = 0, nota2 = 0, cont2 = 0;
        double aluno3 = 0, nota3 = 0, cont3 = 0;
        double aluno4 = 0, nota4 = 0, cont4 = 0;
        double aluno5 = 0, nota5 = 0, cont5 = 0;
        double aluno6 = 0, nota6 = 0, cont6 = 0;
        double soma = 0;
        double totalAlnosAprovados;
        double totalAlunosReprovados = 0;
        double media = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Nota - Aluno 1");
            aluno1 = input.nextDouble();
            System.out.println("Nota - Aluno 2");
            aluno2 = input.nextDouble();
            System.out.println("Nota - Aluno 3");
            aluno3 = input.nextDouble();
            System.out.println("Nota - Aluno 4");
            aluno4 = input.nextDouble();
            System.out.println("Nota - Aluno 5");
            aluno5 = input.nextDouble();
            System.out.println("Nota - Aluno 6");
            aluno6 = input.nextDouble();

            nota1 = nota1 + aluno1 / 2;
            nota2 = nota2 + aluno2 / 2;
            nota3 = nota3 + aluno3 / 2;
            nota4 = nota4 + aluno4 / 2;
            nota5 = nota5 + aluno5 / 2;
            nota6 = nota6 + aluno6 / 2;

        }
        if (aluno1 >= 7) {
            System.out.println("Aluno Aprovado !!!");
            cont1++;

        } else if (aluno1 > 3 & aluno1 < 7) {
            System.out.println("Exame!");
            cont1++;

        } else if (aluno1 < 3) {
            System.out.println("Reporvado");
            cont1++;
        }
        if (aluno2 >= 7) {
            System.out.println("Aluno Aprovado !!!");
            cont2++;

        } else if (aluno2 > 3 & aluno2 < 7) {
            System.out.println("Exame!");
            cont2++;

        } else if (aluno2 < 3) {
            System.out.println("Reporvado");
            cont2++;
        }
        if (aluno3 >= 7) {
            System.out.println("Aluno Aprovado !!!");
            cont3++;

        } else if (aluno3 > 3 & aluno3 < 7) {
            System.out.println("Exame!");
            cont3++;

        } else if (aluno3 < 3) {
            System.out.println("Reporvado");
            cont3++;
        }
        if (aluno4 >= 7) {
            System.out.println("Aluno Aprovado !!!");
            cont4++;

        } else if (aluno4 > 3 & aluno4 < 7) {
            System.out.println("Exame!");
            cont4++;

        } else if (aluno4 < 3) {
            System.out.println("Reporvado");
            cont4++;
        }
        if (aluno5 >= 7) {
            System.out.println("Aluno Aprovado !!!");
            cont5++;

        } else if (aluno5 > 3 & aluno5 < 7) {
            System.out.println("Exame!");
            cont5++;

        } else if (aluno5 < 3) {
            System.out.println("Reporvado");
            cont5++;
        }
        if (aluno6 >= 7) {
            System.out.println("Aluno Aprovado !!!");
            cont6++;

        } else if (aluno6 > 3 & aluno6 < 7) {
            System.out.println("Exame!");
            cont6++;

        } else if (aluno6 < 3) {
            System.out.println("Reporvado");
            cont6++;
        }
        totalAlnosAprovados = cont1 + cont2 + cont3 + cont4 + cont5 + cont6;
        System.out.println("total " + totalAlnosAprovados);
        

    }
}
