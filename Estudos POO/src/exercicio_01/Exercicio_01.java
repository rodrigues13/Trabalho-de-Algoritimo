package exercicio_01;

/**
 * @author Contai
 */
//1 – Faça um programa que receba 8 números, calcule e mostre:
//a)       A soma dos números digitados;(ok)
//b)      A quantidade de números digitados;(ok)
//c)       A média dos números digitados;(ok
//d)      O maior número digitado ok;
//e)      O menor número digitado ok;
//f)        A média dos números pares ok;
//g)       A porcentagem dos números ímpares entre todos os números lidos.
import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       double entrada;
       double soma = 0;
       double qtd = 0;
       double media = 0;
       double maior = Integer.MIN_VALUE;
       double menor = Integer.MAX_VALUE;
       double soma_num_pares = 0;
       double qtd_impares = 0;
       double cont1 = 0;
       double media_par = 0;
               
       for (int i = 0; i<8;i++){
           
           System.out.println("Informe o Nº:");
           entrada = input.nextDouble();
          
           soma+=entrada;
           qtd++;
           media = soma/qtd;  
           
           if (entrada > maior){
               maior = entrada;
           }
           if (entrada < menor){
               menor = entrada;
           }
           if (entrada%2==0){
               
               cont1 ++;
               soma_num_pares+=entrada;
              
               // a media é igual a soma dos numeros pares / quantidade de numeros pares que foi digitado
           }else {
               qtd_impares++;  
           }
           
           
         
       }
        media_par = soma_num_pares / cont1;
        System.out.println("A soma dos Nº é: " + soma);
        System.out.println("Quantidade dos Nº digitados é: " + qtd);
        System.out.println("Media dos Nº digitados é: " +  media);
        System.out.println("Maior Nº " + maior);
        System.out.println("Menor Nº " + menor);
        System.out.println("Media dos Nº pares é: "+ media_par );
        System.out.println("A porcentagem dos números ímpares entre todos os números lidos é; "+ ((qtd_impares*100)/qtd));
    }
}
