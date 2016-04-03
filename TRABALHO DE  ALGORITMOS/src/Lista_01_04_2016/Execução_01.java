package Lista_01_04_2016;

import java.util.Scanner;

public class Execução_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opçao = 0;
        while (opçao != 3) {
            System.out.println("--->Atividades do dia 01/04/2016<---");
            System.out.println("====================================");
            System.out.println("----------->Menu opção<-------------");
            System.out.println("1.Exercicio - Receber 10 Nº\n2.Exercicio - Urna\n3.Sair");
            opçao = input.nextInt();

            if (opçao == 1) {
                conjuntos_10_Nº();

            }
            if (opçao == 2) {
                eleiçoes();

            }
            if (opçao == 3) {
                System.out.println("Fim !!!");
            }
            if (opçao < 1 | opçao > 3) {
                System.out.println("Opção invalida !!!");
            }
        }
    }

    /*
        Exercício 1 - Faça um programa em C/C++ que receba dez números, 
        calcule e mostre a soma dos números pares e a quantidade de números 
        ímpares digitados.
     */
    public static void conjuntos_10_Nº() {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        int inpar = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe " + i + "ª numero");
            int num = input.nextInt();

            if (num % 2 == 0) {
                soma = soma + num;
            } else {
                inpar++;
            }
        }
        System.out.println("A soma dos numeros pares digitados é: " + soma);
        System.out.println("A quantidade dos numeros inpares informados são: " + inpar);
    }

    /*
    Em uma eleição presidencial existem quatro candidatos. 
    Os votos são informados por meio de código. 
    Os códigos utilizados são: 1, 2, 3, 4 Votos para os respectivos 
    candidatos 5 Voto nulo 6 Voto em branco Faça um programa que calcule e mostre: 
    o total de votos para cada candidato; o total de votos nulos; a porcentagem de votos
    em branco sobre o total de votos. Para finalizar o conjunto de votos digitados, 
    tem-se o valor zero e, para códigos inválidos, o programa deverá mostrar uma 
    mensagem “Voto inválido!”.
     */
    public static void eleiçoes() {
        Scanner input = new Scanner(System.in);
        int bolsonaro = 0;
        int lula = 0;
        int marina = 0;
        int aecio = 0;
        int nulo = 0;
        int branco = 0;
        int cand = 0;
        int porcentagemNulos;
        int cont = 0;
        while (cand != 7) {

            System.out.println("--->Eleições presidencial 2018<---");
            System.out.println("==================================");
            System.out.println("Codigo");
            System.out.println("1 - Bolsonaro\n2 - Lula\n3 - Marina\n4 - Aecio\n5 - Voto Branco\n6 - Nulo\n7 - Encerra eleições presidenciais");
            cand = input.nextInt();

            cont++;

            if (cand == 1) {
                bolsonaro++;
            }
            if (cand == 2) {
                lula++;
            }
            if (cand == 3) {
                marina++;
            }
            if (cand == 4) {
                aecio++;
            }
            if (cand == 5) {
                branco++;
            }
            if (cand == 6) {
                nulo++;
            }
            if (cand == 7) {
                System.out.println("Fim !");
            }
            if (cand < 1 | cand > 7) {
                System.out.println("Codigo invalido !!!");
            }
        }

        porcentagemNulos = (nulo * 100) / cont;

        System.out.println("Vatos para Bolsonaro: " + bolsonaro);
        System.out.println("Vatos para Lula: " + lula);
        System.out.println("Vatos para Marina: " + marina);
        System.out.println("Vatos para Aecio: " + aecio);
        System.out.println("Vatos em brancos Brancos: " + branco);
        System.out.println("Vatos Nulos: " + porcentagemNulos + "%");

    }

}
