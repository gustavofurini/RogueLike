package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //ITENS DE ATAQUE
        ItemDeAtq item1 = new ItemDeAtq("Espada longa","Em geral, foram chamadas de espadas longas, espadas com 80 cm" +
                " a 1,15 m de comprimento total e peso entre 0,9 kg e 1,5 kg. Da 5 de dano.", 5);
        ItemDeAtq item2 = new ItemDeAtq("Adaga","É uma espada mais curta semelhanta a uma faca," +
                "que te tras vantagem no combate corpo a corpo e de curta distancia. Da 2 de dano.", 2);
        ItemDeAtq item3 = new ItemDeAtq("Arco e Flecha","Arco e feito de madeira e propício para o combate de longa distância. Da 3 de dano.", 3);
        ItemDeAtq item4 = new ItemDeAtq("Livro de Magia", "O livro de magia e feito especialmente para os magos," +
                "libera magia de todos os 5 elementos. Da 3 de dano.",3 );
        ItemDeAtq item5 = new ItemDeAtq("Lança", "A lança pode ser ultilizada no combate corpo a corpo  e também" +
                "no combate de longa distância arremessando-a. Da 4 de dano.", 4);
        //ITENS DE DEFESA
        ItemDeDef item6 = new ItemDeDef("Escudo de Madeira","Escudo feito de madeira. Protege 1 de dano", 1);
        ItemDeDef item7 = new ItemDeDef("Escudo de Pedra","Escudo feito de pedra. Protege 2 de dano", 2);
        ItemDeDef item8 = new ItemDeDef("Escudo de Aço","Escudo feito de aço. Protege 3 de dano", 3);
        ItemDeDef item9 = new ItemDeDef("Escudo de Metal","Escudo feito de metal. Protege 4 de dano", 4);
        ItemDeDef item10 = new ItemDeDef("Escudo de Adamantium","Escudo feito de adamantium. Protege 5 de dano", 5);

        ArrayList<Item> itemMago = new ArrayList<Item>();
        itemMago.add(item4);
        ArrayList<Item> itemGuerreiro = new ArrayList<Item>();
        itemGuerreiro.add(item1);
        ArrayList<Item> itemArqueiro = new ArrayList<Item>();
        itemArqueiro.add(item3);
        ArrayList<Item> itemLadrao = new ArrayList<Item>();
        itemLadrao.add(item2);
        ArrayList<Item> itemLanceiro = new ArrayList<Item>();
        itemLanceiro.add(item5);


        //CLASSES
        Classe c1 = new Classe("Mago","Os magos geralmente preferem lutar com magia ao invés de espada. Os magos têm muita versatilidade com seus feitiços" +
               " e habilidades que ganham com seus estudos, ultilizam do Livro de Magia", itemMago, 3, 3, 20);
        Classe c2 = new Classe("Guerreiro", "Guerreiros são ótimos lutadores marciais, sempre prontos para o combate. Possuem magnificas habilidades de combate." +
                " Ele possui poderosas habilidades combativas e são mais acostumados com o combate com espadas", itemGuerreiro,5,4,20);
        Classe c3 = new Classe("Arqueiro", "Um arqueiro possue a proeza no uso de arco, e nem mesmo um guerreiro muito experiente" +
                " pode se igualar as suas capacidades. Para ser um bom arqueiro e necessário frieza e pontaria", itemArqueiro, 3,3,20);
        Classe c4 = new Classe("Ladrão", "Eles são especialistas em furtividade e assassinatos, utilizam as adagas como utensilio de batalha," +
                " mas se bobear eles fogem do combate em um piscar de olhos.", itemLadrao, 3,2,20);
        Classe c5 = new Classe("Lanceiro", "Os lanceiros possuem maestria em utilizar lanças tanto para se defender e atacar." +
                "Lanceiros possuem vantagens pois conseguem usa-la tanto para combates corpo a corpo e de longa distância. ",itemLanceiro,4,3,20 );

        //MONSTROS
        MonstroNormal m1 = new MonstroNormal("Goblin", "Semelhantes a duendes, são velozes e fortes, não possuem muita inteligência mas a " +
                "sua força bruta compensa.", 3,10,itemLadrao );
        MonstroNormal m2 = new MonstroNormal("Esqueleto", "São fisicamente fracos, utilizam o seu arco e flecha como metódo de combate",4,9,itemArqueiro);
        MonstroNormal m3 = new MonstroNormal("Bruxa", "As bruxas utilizam magia negra contra seus adversários, na maioria das vezes" +
                "são crueis usando os seus feitiços.", 5,13,itemMago);
        MonstroNormal m4 = new MonstroNormal("Principe das Trevas", "Andam em um cavalo preto e usam uma grande lança escura. Cuidado! " +
                "Esta lança é muito mais afiada do que parece", 6, 20,itemLanceiro);
        MonstroChefe m5 = new MonstroChefe("Gigante","O Gigante é o Rei do feudo, tem mais de 10 metros de altura" +
                "e é temido por todos.", 7,30,itemGuerreiro,"O Gigante foi esnobado por seu pai, por ser medroso, com raiva deixou" +
                "o castelo. Acabou se tornando o Rei deste feudo e tem como objetivo, criar um exercito para atacar seu pai.");

        ArrayList<Monstro> monstro1  = new ArrayList<Monstro>();
        monstro1.add(m1);
        ArrayList<Monstro> monstro2 = new ArrayList<Monstro>();
        monstro2.add(m2);
        ArrayList<Monstro> monstro3 = new ArrayList<Monstro>();
        monstro3.add(m3);
        ArrayList<Monstro> monstro4 = new ArrayList<Monstro>();
        monstro4.add(m4);
        ArrayList<Monstro> monstro5 = new ArrayList<Monstro>();
        monstro5.add(m5);


        //FASES
        Fases fase1 = new Fases("GOBLINLÂNDIA", "Para chegar ao castelo do gigante é necessário, passar pela temida" +
                "cidade dos goblins.", 1, monstro1);
        Fases fase2 = new Fases("CAVERNDA ASSOMBRADA", "Boatas que todos que entram nessa caverna nao conseguem sair." +
                "Precisamos chegar o quanto antes no castelo, e por aqui é o caminho mais curto.",2,monstro2);
        Fases fase3 = new Fases("PANTANO ALMADIÇOADO", "Este pantano é o local com maior concentração de bruxas dessa região." +
                "As bruxas são perversas e sempre buscam novas pessoas para testar suas magias.", 3,monstro3);
        Fases fase4 = new Fases("ENTRADA DO CASTELO", "Após passar pelo pantano amaldiçoado, você se da de cara com a entrada do castelo," +
                "porém há varios princípes das trevas de guardas no portão.", 4,monstro4);
        Fases fase5 = new Fases("SALA DO REINO","Enfim conseguiu passar todos os obstáculos, e agora está cara a cara com o rei gigante" +
                "hora de cumprir sua missão.", 5, monstro5);
        
        System.out.println("oi")


    }
}
