package Java_OO_02_CriacaoEManipulacaoDeObjetos;

public class ProgramaUsarTelevisor {

    public static void main(String[] args) {
        Televisor tv01 = new Televisor();

        tv01.mostrarInformacoes();

        tv01.canal = 150;
        tv01.volume = 3;

        tv01.mostrarInformacoes();

        tv01.aumentarVolume();
        tv01.aumentarVolume();

        tv01.mostrarInformacoes();

        tv01.diminuirVolume();

        tv01.mostrarInformacoes();

        tv01.trocarCanal(10);

        tv01.mostrarInformacoes();
    }
}
