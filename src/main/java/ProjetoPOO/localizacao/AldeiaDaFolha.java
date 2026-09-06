package ProjetoPOO.localizacao;

import ProjetoPOO.Personagens.Personagem;

import java.util.ArrayList;

public class AldeiaDaFolha {
    private ArrayList<Personagem> personagems;

    public AldeiaDaFolha(){

        personagems = new ArrayList<>();

       }

       public void addPersonagem(Personagem p){
        personagems.add(p);
       }



}
