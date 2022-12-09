//Define o pacote que contém esta classe
package Java_02_ProgramaTiposDeDadosEVariaveis;

//Cria uma classe pública chamada "ProgramaTiposDeDadosEVariaveis_C" 
public class ProgramaTiposDeDadosEVariaveis_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declara e inicializa uma variável do tipo char
        char c = 'a';
        
        //Declara e inicializa uma variável do tipo inteiro
        //(metade da capacidade armazenamento)
        short sh = 1;
        
        //Declara e inicializa uma variável do tipo inteiro
        int i = 2;
        
        //Declara e inicializa uma variável do tipo inteiro 
        //(dobro da capacidade armazenamento)
        long l = 3;
        
        //Modificando o valor da variável l
        l = 4;
        
        //Declara e inicializa uma variável do tipo decimal 
        //(valores numéricos com casas decimais)
        float f = 10.9f; 
        
        //Declara e inicializa uma variável do tipo decimal 
        //(valores numéricos com casas decimais) 
        //(dobro da capacidade armazenamento)
        double d = 11.98;
        
        //Declara e inicializa uma variável do tipo String (texto)
        String s = "Ola mundo.";
        
        //Declara e inicializa uma variável do tipo Boolean 
        //(Valores lógicos [Verdadeiro ou Falso])
        //true para verdadeiro
        //false para falso
        boolean b = true;

        //Imprime na tela o valor armazenado numa variável do tipo char
        System.out.println("Valor da variavel c: " + c);
        
        //Imprime na tela o valor armazenado numa variável do tipo short
        System.out.println("Valor da variavel sh: " + sh);
        
        //Imprime na tela o valor armazenado numa variável do tipo int
        System.out.println("Valor da variavel i: " + i);

        //Imprime na tela o valor armazenado numa variável do tipo long
        System.out.println("Valor da variavel l: " + l);

        //Imprime na tela o valor armazenado numa variável do tipo float
        System.out.println("Valor da variavel f: " + f);

        //Imprime na tela o valor armazenado numa variável do tipo double
        System.out.println("Valor da variavel d: " + d);

        //Imprime na tela o valor armazenado numa variável do tipo String
        System.out.println("Valor da variavel s: " + s);
        
        //Imprime na tela o valor armazenado numa variável do tipo boolean
        System.out.println("Valor da variavel b: " + b);           
    }
}
