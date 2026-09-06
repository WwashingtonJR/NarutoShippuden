package ProjetoPOO;


import ProjetoPOO.Personagens.Naruto;
import ProjetoPOO.Personagens.Pain;
import ProjetoPOO.Personagens.Sakura;
import ProjetoPOO.Sapaiada.Sapo1;
import ProjetoPOO.Sapaiada.Sapo2;
import ProjetoPOO.Sapaiada.Sapo3;
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


        Sapo1 sapo1 = new Sapo1();
        Sapo2 sapo2 = new Sapo2();
        Sapo3 sapo3 = new Sapo3();

       naruto.addSaposContrato(sapo1);
       naruto.addSaposContrato(sapo2);
       naruto.addSaposContrato(sapo3);

       aldeiaFolha = null;
       naruto = null;

        // Ilha dos Sapos

        IlhaDosSapos IlhaSapos = new IlhaDosSapos();

        IlhaSapos.addSapos(sapo1);
        IlhaSapos.addSapos(sapo2);
        IlhaSapos.addSapos(sapo3);


    }
}