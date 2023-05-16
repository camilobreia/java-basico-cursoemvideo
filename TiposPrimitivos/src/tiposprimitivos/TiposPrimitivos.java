package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o nome do aluno: ");
    String nome = teclado.nextLine(); //para receber a informação de entrada
    System.out.print("Digite a nota do aluno: ");
    float nota = teclado.nextFloat(); 
    teclado.close();
    // System.out.println("A nota é " + nota);

    // System.out.printf("A nota de %s é %.2f", nome, nota); //SOUT formatado (o número equivale a quantidade de casa decimais)

    System.out.format("A nota de %s é de %.2f \n", nome, nota); //mesma coisa que o printf

    }
}
