import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Dados de entrada
        int numero;
        double saldo;
        String agencia;
        String nomeCliente;
        
        //import class scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua Agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o número da Conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o seu Nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo com 'virgula nas casas decimais': ");
        saldo = scanner.nextDouble();

         // Formata como moeda brasileira
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado = formatoMoeda.format(saldo);


        //exibição dos dados
        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+
        agencia+" , conta" +
        numero+" e seu saldo "+
        valorFormatado+" já está disponível para saque");
    }
}
