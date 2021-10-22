package com.company;

public class ItemDeAtq extends Item{
    private int danoDeAtq;

    public ItemDeAtq(String nome, String descricao, int danoDeAtq){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setDanoDeAtq(danoDeAtq);
    }

    public int getDanoDeAtq() {
        return danoDeAtq;
    }

    public void setDanoDeAtq(int danoDeAtq) {
        this.danoDeAtq = danoDeAtq;
    }
}
