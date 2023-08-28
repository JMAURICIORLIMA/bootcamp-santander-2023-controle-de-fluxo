package controledeexcecoes.excecaocustomizada;

public class CepInvalidoException extends Exception {
    public static void main(String[] args) {

        try {
            String meuCepFormatado = formatarCep("2376506");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}


