
package application;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.BusinessException;

/**
 *
 * @author luiz.grenteski
 */
public class Program {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // Argumentos padrão.
        Locale.setDefault(Locale.US);
        
        // Inicio do programa.
        System.out.println("Enter account data: ");
        
        try {
            // Realiza a coleta de dados.
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            MemBuffer();
            String name = sc.nextLine();
            System.out.print("Initial Balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("WithDraw limit: ");
            double withDrawLimit = sc.nextDouble();
            
            // Realiza a instanciação de uma conta nova.
            Account account = new Account(number, name, initialBalance, withDrawLimit);
            
            // Realiza um saque.
            System.out.print("\nEnter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account.withDraw(withdraw);
            
            account.validateWithdraw(withdraw);
            
            // Mostra o novo saldo da conta.
            System.out.println("New Balance: " + account.getBalance());
            
        } catch (RuntimeException ex) {
            // Erro inesperado.
            System.out.println("Unexpected error");
        } catch (BusinessException ex) {
            // Erro tratado.
            System.out.println(ex.getMessage());
        }
        
        // Fecha o Scanner.
        sc.close();
    }
    
    public static void MemBuffer() {
        sc.nextLine();
    }
}
