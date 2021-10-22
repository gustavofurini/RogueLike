package com.company;

public class ItemDeDef extends Item{
    private int escudo;

    public ItemDeDef(String nome, String descricao, int escudo){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setEscudo(escudo);
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
}
