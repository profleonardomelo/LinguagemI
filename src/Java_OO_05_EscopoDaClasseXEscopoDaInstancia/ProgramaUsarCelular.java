package Java_OO_05_EscopoDaClasseXEscopoDaInstancia;

public class ProgramaUsarCelular {

    public static void main(String[] args) {

        Celular c01 = new Celular();
        Celular c02 = new Celular();
        Celular c03 = new Celular();

        c01.numero = 99991111;
        c02.numero = 99992222;
        c03.numero = 99993333;

        Celular.operadora = "Vivo";

        c01.mostrarInformacoes();
        c02.mostrarInformacoes();
        c03.mostrarInformacoes();

        Celular.trocarOperadora("Tim");

        c01.mostrarInformacoes();
        c02.mostrarInformacoes();
        c03.mostrarInformacoes();
    }
}
