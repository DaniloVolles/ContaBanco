
import java.util.Scanner;

public class ContaTerminal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {        

        String name = inputCustomerName();
        String agencyNumber = inputAgencyNumber(); 
        int accountNumber = inputAccountNumber();    
        Double balance = inputBalanceValue();       

        displayInfo(name, agencyNumber, accountNumber, balance);
    }

    private static String inputCustomerName(){
        System.out.print("Digite o seu nome: ");
        String name = sc.next();
        return name;
    }

    private static String inputAgencyNumber(){
        System.out.print("Digite o número da sua Agência: ");
        String agency = sc.next();
        return agency;
    }

    private static int inputAccountNumber(){
        System.out.print("Digite o número da sua conta: ");
        int accountNumber = sc.nextInt();
        return accountNumber;
    }

    private static Double inputBalanceValue(){
        System.out.print("Digite o seu saldo: ");
        Double balance = sc.nextDouble();
        return balance;
    }

    private static void displayInfo(String name, String agencyNumber, int accountNumber, Double balance){
        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("O número da sua agência é " + agencyNumber + " e o número da sua conta é " + accountNumber + ".");
        System.out.println("O seu saldo de " + balance + " reais já está disponível para saque.");
    }
}
