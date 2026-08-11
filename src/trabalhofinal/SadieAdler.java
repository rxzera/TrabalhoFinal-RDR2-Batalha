package trabalhofinal;

public class SadieAdler extends Personagem {

    public SadieAdler() {
        super("Sadie Adler", 100, 15);
    }

    @Override
    public void usarHabilidade1(Personagem alvo) {
        // Fúria da Vingança: dano altíssimo, mas ela fica exposta depois
        alvo.receberDano(forcaAtaque * 3);
        this.exposto = true;
    }

    @Override
    public void usarHabilidade2(Personagem alvo) {
        // Faca Rápida: dano leve, sempre acerta
        alvo.receberDano(forcaAtaque / 2);
    }

    @Override
    public String getNomeHabilidade1() { return "Fúria da Vingança"; }

    @Override
    public String getNomeHabilidade2() { return "Faca Rápida"; }
}