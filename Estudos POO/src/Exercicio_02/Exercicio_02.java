package Exercicio_02;
import java.util.Scanner;
/**
 *
 * @author Contai
 */
//2 – Um funcionário de uma empresa recebe anualmente aumento salarial. Sabe-se que:
//a)       Esse funcionário foi contratado em 2005 com salário inicial de R$1000,00.
//b)      Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.
//c)       A partir de 2007 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.
//Faça um programa que determine o salário atual desse funcionário.

public class Exercicio_02 {
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
       double salarioAtual = 1000;
       double aumento = 0.015;
      
       for(int i =2006, j = 1;i<=2016;i++,j = j * 2){
          double porcentagemAtual = j * aumento;
          salarioAtual =  salarioAtual * ( 1 + ( j * aumento));
 
       } 
       
       System.out.println("Salario atual é: " + salarioAtual);
       
   }
}
