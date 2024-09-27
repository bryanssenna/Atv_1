public class CaldeiraChocolate {
    
    private static CaldeiraChocolate instancia;
    
    private boolean vazia;
    private boolean fervida;

    private CaldeiraChocolate() {
        this.vazia = true;
        this.fervida = false;
    }

    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher() {
        if (vazia) {
            vazia = false;
            fervida = false;
            System.out.println("Caldeira preenchida com leite e chocolate.");
        } else {
            System.out.println("A caldeira já está cheia, não é possível preenchê-la.");
        }
    }

    public void ferver() {
        if (!vazia && !fervida) {
            fervida = true;
            System.out.println("A mistura de leite e chocolate está fervendo.");
        } else if (vazia) {
            System.out.println("A caldeira está vazia, não é possível ferver.");
        } else {
            System.out.println("A mistura já foi fervida, não é possível fervê-la novamente.");
        }
    }

    public void drenar() {
        if (!vazia && fervida) {
            vazia = true;
            fervida = false;
            System.out.println("A mistura fervida foi drenada. A caldeira está vazia.");
        } else if (vazia) {
            System.out.println("A caldeira está vazia, não há nada para drenar.");
        } else {
            System.out.println("A mistura ainda não foi fervida, não é possível drenar.");
        }
    }
}
