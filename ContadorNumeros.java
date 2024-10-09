/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadornumeros;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class ContadorNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }

            contador++;
        }

        System.out.println("Você inseriu " + contador + " números.");
        
        scanner.close();
    }
    
}
