//Definição do pacote que contém essa classe
package Java_OO_02_CriacaoEManipulacaoDeObjetos;

//Definição de uma classe pública
public class ProgramaUsarTelevisor_c {

    //Definição do método main (Ponto de Entrada do Programa)
    public static void main(String[] args) {

        //Criando um objeto da classe Televisor (do tipo Televisor)
        Televisor tv01 = new Televisor();

        //Atribuindo 150 ao atributo canal
        tv01.canal = 150;
        //Atribuindo 3 ao atributo volume
        tv01.volume = 3;

        //Fazendo chamada ao método aumentarVolume
        tv01.aumentarVolume();
        //Fazendo chamada ao método aumentarVolume
        tv01.aumentarVolume();

        //Fazendo chamada ao método diminuirVolume
        tv01.diminuirVolume();

        //Fazendo chamada ao método trocarCanal
        // passando o valor 10 como parâmetro
        tv01.trocarCanal(10);

        //Fazendo chamada ao método mostrarInformacoes
        tv01.mostrarInformacoes();
    }
}
