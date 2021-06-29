package exerciciosdia25;

import java.math.BigDecimal;

public class ContaCorrente {
    private String conta;
    private String agencia;
    private BigDecimal saldo;

    public ContaCorrente(ContaCorrente contaCorrente) {
        setConta(contaCorrente.getConta());
        setAgencia(contaCorrente.getAgencia());
        setSaldo(contaCorrente.getSaldo());
    }

    public ContaCorrente() {
    }

    public ContaCorrente(String conta, String agencia, BigDecimal saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void deposito(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public boolean saque(BigDecimal valor) {
        if(this.saldo.doubleValue() >= valor.doubleValue()) {
            this.saldo = this.saldo.subtract(valor);
            return true;
        }
        return false;
    }

    public void devolucao(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void transferencia(ContaCorrente contaCorrente, BigDecimal valor) {
        if(this.saldo.doubleValue() >= valor.doubleValue()) {
            this.saldo = this.saldo.subtract(valor);
            contaCorrente.deposito(valor);
        }
    }
}
