import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        /*
         * String nome = args[0];
        String sobreNome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
         */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Olá, meu nome é " + nome + " " + sobreNome + ". Tenho " + idade + " anos." + " Minha altura é " + altura);
    }
}
