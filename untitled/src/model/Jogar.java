package model;

import java.util.Random;

public class Jogar {
    private String nome;
    private int dado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Jogar() {
        Random sorteio = new Random();
        this.dado = sorteio.nextInt(6) + 1;
    }


}

