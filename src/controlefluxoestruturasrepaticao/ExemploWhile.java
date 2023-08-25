package controlefluxoestruturasrepaticao;

import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.printf("Doce do valor: R$ %.2f Adicionado no carrinho %n", valorDoce);
            mesada -= valorDoce;
        }

        System.out.printf("Mesada: R$ %.2f%n", mesada);
        System.out.println("Anya gastou toda a sua mesada em doces");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
         */
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
