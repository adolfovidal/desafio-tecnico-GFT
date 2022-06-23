package banco;

public abstract class Conta {
    public int numeroConta;
    private String titular;
    private float saldo;
    private String tipo;
    private boolean statusConta;

    public void status() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatusConta());
    }

    public void Conta(String c) {
        this.setTipo(c);
        this.setStatusConta(true);
        if (c == "Conta Corrente") {
            this.setSaldo((float) (saldo * 0.03));
        } else if (c == "Conta Poupança") {
            this.setSaldo((float) (saldo * 0.05));
        }
    }

    public void setStatusConta() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("StatusConta: " + this.getStatusConta());
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}