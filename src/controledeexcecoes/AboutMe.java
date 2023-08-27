package controledeexcecoes;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite sua altura: ");
            double altura = Double.parseDouble(scanner.nextLine());


            //imprimindo os dados obtidos pelo usuario
            System.out.printf("Olá, me chamo %s %s ", nome.toUpperCase(), sobrenome.toUpperCase());
            System.out.printf("Tenho %d anos.", idade);
            System.out.printf("Minha altura é %.2f cm ", altura);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Inconsistência de informações, idade deve ser do tipo inteiro" +
                    " e altura devem ser numéricos, separado por . (ex.: 1.65");
        }

    }
}
