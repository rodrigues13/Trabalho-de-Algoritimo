package Exercicio_03;

import java.util.Scanner;

/*3 – Uma empresa possui vários funcionários e pretende fazer alguns reajustes 
nos salários, além de colocar alguns de férias premium. Dentre os funcionários 
existem alguns que já passaram da hora de aposentar e precisam ser informados 
da aposentadoria.

Faça um programa que apresente para o usuário um menu com as opções:

1 – Reajuste dos salários

2 – Aposentadorias

3 – Sair

Regras:

a)       O reajuste deverá ser 20% para salários até 1500 e 30% para salários 
acima de 1500 e menor que 2000. Se o funcionário tiver salário acima de 2000 
emitir mensagem de que não haverá aumento. Informar o salário atual.

b)       O funcionário deverá ser avisado da aposentadoria se a idade 
for maior que 70 anos ou se o tempo de serviço for maior que 35 anos.*/
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = 0;

        while (entrada != 3) {

            System.out.println("----->Exercicio Nº 3<-----");
            System.out.println("==========================");
            System.out.println("Menu Opção !");
            System.out.println("--------------------------");
            System.out.println("1 - Reajuste dos salarios\n2 - Aoposentadoria\n3 - Sair");
            entrada = input.nextInt();

            if (entrada == 1) {
                salario();
            } else if (entrada == 2) {
                aposentadoria();
            } else if(entrada < 0 & entrada >4) {
                System.out.println("Opção invalida !!!");
            }
        }
    }

    public static void salario() {
        Scanner input = new Scanner(System.in);
        double x = 0.20, y = 0.30;
        double salarioAtual = 0;

        System.out.println("informe salario:");
        double salario = input.nextInt();

        if (salario <= 1500) {
            salarioAtual = (salario * x) + salario;
            System.out.println("Seu salario atualizado é " + salarioAtual);
        } else if (salario > 1500 & salario <= 2000) {
            salarioAtual = (salario * y) + salario;
            System.out.println("Seu salario atualizado é " + salarioAtual);
        } else {
            System.out.println("Não avera aumento salarial para você !");
        }
    }

    public static void aposentadoria() {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe Idade:");
        int idade = input.nextInt();

        if (idade > 70) {
            System.out.println("Você tem direito a aposentadoria !");
        } else {
            System.out.println("Tempo de trabalho");
            int tempo = input.nextInt();

            if (tempo > 35) {
                System.out.println("Você tem direito a aposentadoria !");
            } else {
                System.out.println("Você não podera aposentar ainda !");
            }
        }
    }
}
