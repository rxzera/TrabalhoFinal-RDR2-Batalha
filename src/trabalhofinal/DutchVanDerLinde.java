package trabalhofinal;

public class DutchVanDerLinde extends Personagem {

    public DutchVanDerLinde() {
        super("Dutch van der Linde", 100, 15);
    }

    @Override
    public void usarHabilidade1(Personagem alvo) {
        // Manipulação: atordoa o inimigo (reduz o ataque dele no próximo turno)
        alvo.atordoado = true;
    }

    @Override
    public void usarHabilidade2(Personagem alvo) {
        // Discurso Motivador: aumenta o próprio dano no próximo ataque
        this.multiplicadorDano = 1.5;
    }

    @Override
    public String getNomeHabilidade1() { return "Manipulação"; }

    @Override
    public String getNomeHabilidade2() { return "Discurso Motivador"; }
}