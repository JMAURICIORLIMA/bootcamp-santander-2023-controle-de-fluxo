package controlefluxoestruturasrepaticao;

public class ExemploForArray {

    public static void main(String[] args) {

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // For convencional
//        for (int x=0; x<alunos.length; x++) {
//            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
//        }

        // For each
        for (String aluno : alunos) {
            System.out.printf("O nome do aluno é: %s%n", aluno);
        }

    }
}
