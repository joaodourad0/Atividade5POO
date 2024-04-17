package model;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(1000);
        conta.setLimite(500);

        try {
            conta.saca(1600); 
        } catch (LimiteExcedidoExcecao e) {
            System.out.println(e.getMessage());
        }
    }
}
