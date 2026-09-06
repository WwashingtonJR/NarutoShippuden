package ProjetoPOO;


import ProjetoPOO.Personagens.Naruto;
import ProjetoPOO.Personagens.Pain;
import ProjetoPOO.Personagens.Sakura;
import ProjetoPOO.localizacao.AldeiaDaFolha;
import ProjetoPOO.localizacao.IlhaDosSapos;

public class Main{
    static void main(String[] args) {

        Naruto naruto = new Naruto();
        Sakura sakura = new Sakura();
        Pain pain = new Pain();


        // Aldeia da Folha

        AldeiaDaFolha aldeiaFolha = new AldeiaDaFolha();
        aldeiaFolha.addPersonagem(naruto);
        aldeiaFolha.addPersonagem(sakura);
        aldeiaFolha.addPersonagem(pain);
        // Ilha dos Sapos

        IlhaDosSapos ilhaSapos = new IlhaDosSapos();




    }
}