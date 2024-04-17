package model;

public class OperacaoController {
    public int operacaoValor(int numero) throws NumeroNegativoExcecao {
        if (numero < 0) {
            throw new NumeroNegativoExcecao("O parâmetro não pode ser negativo.");
        }

        return (numero % 2 == 0) ? numero * numero : numero * numero * numero;
    }
}
