package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    String nome = teclado.nextLine(); //para receber a informação de entrada
    float nota = teclado.nextFloat(); 
    teclado.close();
    // System.out.println("A nota é " + nota);

    // System.out.printf("A nota de %s é %.2f", nome, nota); //SOUT formatado (o número equivale a quantidade de casa decimais)

    System.out.format("A nota de %s é de %.3f", nome, nota); //mesma coisa que o printf

    }
}
