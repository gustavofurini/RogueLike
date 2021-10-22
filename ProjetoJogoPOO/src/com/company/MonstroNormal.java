package com.company;

import java.util.ArrayList;

public class MonstroNormal extends Monstro {
    public MonstroNormal(String nome, String descricao, int forca, int saude, ArrayList<Item> itemMonstro){
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setForca(forca);
        this.setSaude(saude);
        this.setItemMonstro(itemMonstro);

    }
}
