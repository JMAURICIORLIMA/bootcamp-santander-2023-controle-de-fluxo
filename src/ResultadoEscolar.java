public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 6;

        String mensagem = "";

        if (nota >= 7) {
            mensagem = "Aprovado";
        } else {
            mensagem = "Reprovado";
        }

        System.out.printf("%s", mensagem);

    }
}
