/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package senhacorreta;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class SenhaCorreta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234; // Defina aqui a senha correta
        int senhaInformada;

        do {
            System.out.print("Digite a senha: ");
            senhaInformada = scanner.nextInt();
            
            if (senhaInformada != senhaCorreta) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (senhaInformada != senhaCorreta);

        System.out.println("Senha correta! Acesso concedido.");
        
        scanner.close();
    }
    
}
