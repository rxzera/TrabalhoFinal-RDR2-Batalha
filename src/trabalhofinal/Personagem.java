package trabalhofinal;

public abstract class Personagem {

    protected String nome;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int forcaAtaque;

    // Efeitos temporários (status) que podem afetar o personagem
    protected boolean atordoado = false;      // ataque reduzido no próximo turno
    protected boolean turnoPreso = false;     // perde o próximo turno
    protected boolean exposto = false;        // recebe mais dano no próximo turno
    protected double multiplicadorDano = 1.0; // bônus de dano no próximo ataque

    public Personagem(String nome, int vidaMaxima, int forcaAtaque) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.forcaAtaque = forcaAtaque;
    }

    // Ataque normal (todo personagem tem)
    public void atacar(Personagem alvo) {
        int dano = forcaAtaque;
        if (atordoado) {
            dano = dano / 2;
            atordoado = false;
        }
        dano = (int) (dano * multiplicadorDano);
        multiplicadorDano = 1.0;
        alvo.receberDano(dano);
    }
    
    public void curar() {
    int quantidadeCura = vidaMaxima / 4;
    vidaAtual += quantidadeCura;
    if (vidaAtual > vidaMaxima) {
        vidaAtual = vidaMaxima;
    }
}

    public void receberDano(int dano) {
        if (exposto) {
            dano = (int) (dano * 1.5);
            exposto = false;
        }
        vidaAtual -= dano;
        if (vidaAtual < 0) {
            vidaAtual = 0;
        }
    }

    public boolean estaVivo() {
        return vidaAtual > 0;
    }

    // Cada personagem (filho) vai implementar suas próprias habilidades
    public abstract void usarHabilidade1(Personagem alvo);
    public abstract void usarHabilidade2(Personagem alvo);
    public abstract String getNomeHabilidade1();
    public abstract String getNomeHabilidade2();

    // Getters
    public String getNome() { return nome; }
    public int getVidaAtual() { return vidaAtual; }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getForcaAtaque() { return forcaAtaque; }
    public boolean isTurnoPreso() { return turnoPreso; }
    public void liberarTurno() { turnoPreso = false; }
}