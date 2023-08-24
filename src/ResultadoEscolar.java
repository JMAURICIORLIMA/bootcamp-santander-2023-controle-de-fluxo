public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 5;

        String mensagem = "";

        if (nota >= 7) {
            mensagem = "Aprovado";
        } else if (nota >= 5 && nota < 7) {
            mensagem = "Prova de recuperação";
        } else {
            mensagem = "Reprovado";
        }

        System.out.printf("%s", mensagem);

    }
}
