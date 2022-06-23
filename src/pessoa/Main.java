package pessoa;

public class Main {
    String nome;
    String classe;
    String raca;
    String esp;
    float pointsarena;
    float GS;
    int numbermounts;
    int howmanyprof;
    boolean guild;
    boolean week;
    boolean cooldown;

    void status() {
        System.out.println("Meu nome é " + this.nome);
        System.out.println("Sou " + this.classe + " jogo de " + this.esp);
        System.out.println("Meu GS é " + this.GS);
        System.out.println("Status semanal: " +this.week);
        System.out.println("Status 25N: " +this.cooldown);
    }

    void doweek() {
        if (this.week == true) {
            System.out.println("Fiz a semanal hoje!");
        } else {
            System.out.println("Não, tem vaga no grupo?");
        }
    }

    void dolk25n() {
        if (this.cooldown == true) {
            System.out.println("Estou em CD, só amanhã.");
        } else {
            System.out.println("Tem vaga para Tanker?");
        }
    }

    void haveaguild() {
        this.guild = true;
    }
}