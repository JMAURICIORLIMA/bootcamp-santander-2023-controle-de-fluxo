package controlefluxocondicional;

public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 4;

//        String mensagem = (nota >= 7) ? "Aprovado" : "Reprovado";

        String mensagem = (nota >= 7) ? "Aprovado" : (nota >= 5 && nota < 7) ? "Prova de recuperação" : "Reprovado";

       /*
       if (nota >= 7) {
            mensagem = "Aprovado";
        } else if (nota >= 5 && nota < 7) {
            mensagem = "Prova de recuperação";
        } else {
            mensagem = "Reprovado";
        }
        */

        System.out.printf("%s", mensagem);

    }
}
