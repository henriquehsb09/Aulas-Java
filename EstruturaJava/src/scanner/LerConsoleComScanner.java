package scanner;

import java.util.Scanner;

public class LerConsoleComScanner {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        int idade = 8;
        String nome;
        
        do {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();
            
            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());
            
            System.out.println(nome + " tem " + idade + " anos");
        } while (idade >= 28);
        
        teclado.close();
    }
}