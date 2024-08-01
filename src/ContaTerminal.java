
import java.util.Scanner;

public class ContaTerminal {

    

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = sc.next();

        System.out.print("Digite o número da sua Agência: ");
        String agency = sc.next();

        System.out.print("Digite o número da sua conta: ");
        int accountNumber = sc.nextInt();

        System.out.print("Digite o seu saldo: ");
        Double balance = sc.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("A sua agência é " + agency + " e a sua conta é " + accountNumber + ".");
        System.out.println("O seu saldo " + balance + " já está disponível para saque.");
    }
}
