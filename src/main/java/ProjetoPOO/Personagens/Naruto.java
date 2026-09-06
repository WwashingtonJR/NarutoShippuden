package ProjetoPOO.Personagens;

import ProjetoPOO.Sapaiada.Sapos;
import ProjetoPOO.caldas.Kyuubi;
import ProjetoPOO.interfaces.ContratoSapos;

import java.util.ArrayList;

public class Naruto extends Personagem implements ContratoSapos {

    private ArrayList<Sapos> sapos;
    private Kyuubi kyuubi;
    public Naruto(){
    kyuubi = new Kyuubi();
    sapos = new ArrayList<>();
    }


    @Override
    public void contrato() {
        System.out.println("Contrato já esta assinado dos Sapos!");
    }

    public void addSaposContrato(Sapos s){
        sapos.add(s);
    }


}
