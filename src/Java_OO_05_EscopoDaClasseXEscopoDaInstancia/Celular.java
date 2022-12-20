package Java_OO_05_EscopoDaClasseXEscopoDaInstancia;

public class Celular {

    public long numero;
    public static String operadora;

    public static void trocarOperadora(String operadora)
    {
        Celular.operadora = operadora;
    }

    public void mostrarInformacoes()
    {
        System.out.println("Número: " + numero + "\nOperadora: " + operadora + "\n");
    }

}
