package model;

public class Conta {
	
    private int agencia;
    private int codigo;
    private int saldo;
    private float limite;

  
    public Conta() {
    }

    // Getters e setters
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void deposita(float valor) {
        saldo += valor;
    }


    public void saca(float valor) throws LimiteExcedidoExcecao {
        if (valor > saldo + limite) {
            throw new LimiteExcedidoExcecao("Limite de saque excedido. Limite total: " + (saldo + limite));
        } else {
            saldo -= valor;
        }
    }
}
