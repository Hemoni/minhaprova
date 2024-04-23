import java.util.ArrayList;

public class jogador {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    int votos;
    public void incrementaUmVoto() {
        this.votos = getVotos() + 1;
    }

}

