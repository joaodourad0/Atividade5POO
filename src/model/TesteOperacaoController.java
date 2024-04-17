package model;


public class TesteOperacaoController {
    public static void main(String[] args) {
        OperacaoController controller = new OperacaoController();

      
        try {
            int resultadoPar = controller.operacaoValor(4);
            System.out.println("Resultado para número par: " + resultadoPar);
        } catch (NumeroNegativoExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }

      
        try {
            int resultadoImpar = controller.operacaoValor(5);
            System.out.println("Resultado para número ímpar: " + resultadoImpar);
        } catch (NumeroNegativoExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }

       
        try {
            int resultadoNegativo = controller.operacaoValor(-3);
            System.out.println("Resultado para número negativo: " + resultadoNegativo);
        } catch (NumeroNegativoExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
