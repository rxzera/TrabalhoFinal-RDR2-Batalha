package trabalhofinal;

public class ArthurMorgan extends Personagem {

    public ArthurMorgan() {
        super("Arthur Morgan", 100, 15);
    }

    @Override
    public void usarHabilidade1(Personagem alvo) {
        // Tiro Duplo: ataca duas vezes com metade do dano
        alvo.receberDano(forcaAtaque / 2);
        if (alvo.estaVivo()) {
            alvo.receberDano(forcaAtaque / 2);
        }
    }

    @Override
    public void usarHabilidade2(Personagem alvo) {
        // Golpe de Coronha: atordoa o inimigo
        alvo.receberDano(forcaAtaque / 3);
        alvo.atordoado = true;
    }

    @Override
    public String getNomeHabilidade1() { return "Tiro Duplo"; }

    @Override
    public String getNomeHabilidade2() { return "Golpe de Coronha"; }
}