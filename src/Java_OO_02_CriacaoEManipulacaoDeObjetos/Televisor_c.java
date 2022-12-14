//Definição do pacote que contém essa classe
package Java_OO_02_CriacaoEManipulacaoDeObjetos;

//Definição de uma classe pública
public class Televisor_c {

    //Definição de um atributo público do tipo int
    public int volume;
    //Definição de um atributo público do tipo int
    public int canal;

    //Definição de um método públic sem retorno
    // e sem parâmetros de entrada
    public void aumentarVolume()
    {
        //Incrementa um atributo
        volume++;
    }

    //Definição de um método públic sem retorno
    // e sem parâmetros de entrada
    public void diminuirVolume()
    {
        //Decrementa um atributo
        volume--;
    }

    //Definição de um método públic sem retorno
    // e com 01 parâmetro de entrada do tipo int
    public void trocarCanal(int c)
    {
        //atribui o valor do parâmetro de entrada ao atributo
        canal = c;
    }

    //Definição de um método públic sem retorno
    // e sem parâmetros de entrada
    public void mostrarInformacoes()
    {
        //Exibe texto concatenado no console (tela)
        System.out.println("Volume: " + volume + "\nCanal: " + canal);
    }
}
