package trabalhofinal;

public class JohnMarston extends Personagem {

    public JohnMarston() {
        super("John Marston", 100, 15);
    }

    @Override
    public void usarHabilidade1(Personagem alvo) {
        // Mira Precisa: dano alto
        alvo.receberDano(forcaAtaque * 2);
    }

    @Override
    public void usarHabilidade2(Personagem alvo) {
        // Laço: prende o inimigo (ele perde o próximo turno)
        alvo.turnoPreso = true;
    }

    @Override
    public String getNomeHabilidade1() { return "Mira Precisa"; }

    @Override
    public String getNomeHabilidade2() { return "Laço"; }
}