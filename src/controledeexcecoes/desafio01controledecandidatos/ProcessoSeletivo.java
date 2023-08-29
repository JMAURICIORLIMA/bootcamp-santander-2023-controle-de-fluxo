package controledeexcecoes.desafio01controledecandidatos;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        selecaoDeCandidatos();

        for (String selecionados : listaDeSelecionados) {
            System.out.println("Selecionado(a): " + selecionados);
        }

        for (String selecionados : listaDeSelecionados) {
            entrandoEmContato(selecionados);
        }

    }

    static ArrayList<String> listaDeSelecionados = new ArrayList<>();

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu) {
            System.out.printf("Conseguimos contato com %s, na %d tentativa.%n", candidato, tentativasRealizadas);
        } else {
            System.out.printf("Não conseguimos contato com %s, número máximo de tentativas realizadas%n", candidato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void selecaoDeCandidatos() {
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s informou este valor pretendito R$ %.2f%n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
                listaDeSelecionados.add(candidatos[candidatoAtual]);
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarSalarioPretendido(double salarioPretendido) {
        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDITADOS");
        }
    }
}
