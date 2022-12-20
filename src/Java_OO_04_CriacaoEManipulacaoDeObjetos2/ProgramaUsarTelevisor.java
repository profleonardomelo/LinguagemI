package Java_OO_04_CriacaoEManipulacaoDeObjetos2;

import Java_OO_02_CriacaoEManipulacaoDeObjetos.Televisor;

public class ProgramaUsarTelevisor {

    public static void main(String[] args) {
        Televisor tv01 = new Televisor();
        Televisor tv02 = new Televisor();

        tv01.canal = 150;
        tv01.volume = 3;

        tv02.canal = 200;
        tv02.volume = 4;

        tv01.aumentarVolume();
        tv01.aumentarVolume();

        tv02.aumentarVolume();
        tv02.aumentarVolume();

        tv01.diminuirVolume();

        tv02.diminuirVolume();

        tv01.trocarCanal(10);

        tv02.trocarCanal(20);


        tv01.mostrarInformacoes();
        System.out.println();
        tv02.mostrarInformacoes();
    }
}
