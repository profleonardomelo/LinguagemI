package Java_OO_04_CriacaoEManipulacaoDeObjetos2;

public class ProgramaUsarTelevisor {

    public static void main(String[] args) {
        Televisor tv01 = new Televisor();
        Televisor tv02 = new Televisor();

        tv01.mostrarInformacoes();
        tv02.mostrarInformacoes();

        tv01.canal = 150;
        tv01.volume = 3;

        tv01.mostrarInformacoes();
        tv02.mostrarInformacoes();

        tv02.canal = 200;
        tv02.volume = 4;

        tv01.mostrarInformacoes();
        tv02.mostrarInformacoes();

        tv01.aumentarVolume();
        tv01.aumentarVolume();

        tv01.mostrarInformacoes();
        tv02.mostrarInformacoes();

        tv02.aumentarVolume();
        tv02.aumentarVolume();

        tv01.mostrarInformacoes();
        tv02.mostrarInformacoes();

        tv01.diminuirVolume();

        tv02.diminuirVolume();

        tv01.mostrarInformacoes();
        tv02.mostrarInformacoes();


        tv01.trocarCanal(10);

        tv02.trocarCanal(20);

        tv01.mostrarInformacoes();
        tv02.mostrarInformacoes();

    }
}
