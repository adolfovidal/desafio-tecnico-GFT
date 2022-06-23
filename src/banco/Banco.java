package banco;

public class Banco {
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumeroConta(1111);
        p1.setTitular("Paula Vidal");
        p1.Conta("ContaCorrente");

        Banco p2 = new Banco();
        p2.setNumeroConta(2222);
        p2.setTitular("Pingo Nelson");
        p2.Conta("ContaPoupança");

        p1.status();
        p2.status();
    }

    private void status() {
    }

    private void Conta(String contaCorrente) {
    }

    private void setTitular(String paula_vidal) {
    }

    private void setNumeroConta(int i) {
    }
}
