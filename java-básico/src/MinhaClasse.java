import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
   public static void main(String[] args) {
        System.out.println("Olá, tudo bem? Primeiro código rodando.");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println(nome);
}
}