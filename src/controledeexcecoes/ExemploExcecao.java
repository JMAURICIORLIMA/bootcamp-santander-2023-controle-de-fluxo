package controledeexcecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    public static void main(String[] args) {
//        Gera uma exception. O compilador só identifica o erro ao executar o programa.
        Number valor = Double.valueOf("a1.75");

        try {
            valor = NumberFormat.getInstance().parse("a1.75");  // O compilador surgere o tratamento da exceção.
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
