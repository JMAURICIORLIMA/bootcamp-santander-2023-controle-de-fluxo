public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;
//        Elevando o valor do saque acima do valor do saldo a instrução abaixo não será execultada.
//        double valorSolicitado = 26.0;


        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;

            System.out.printf("Saldo disponível: R$ %.2f%n ", saldo);
        }
    }
}
