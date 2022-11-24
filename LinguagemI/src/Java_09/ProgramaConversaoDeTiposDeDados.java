//Define o pacote que contém esta classe
package Java_09;

//Cria uma classe pública chamada "ProgramaSequenciasDeEscape"
public class ProgramaConversaoDeTiposDeDados {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declarando uma variável do tipo int
        int i = 10;
        
        //Imprime na tela o valor de uma variável
        System.out.println("x: " + i);
        
        
        //Convertendo o valor armazenado de int para float
        float f = (float)10;
        
        //Imprime na tela o valor de uma variável
        System.out.println("f: " + f);
        
     
        
        //Convertendo o valor armazenado de float para double
        double d = (double)f;
        
        //Imprime na tela o valor de uma variável
        System.out.println("d: " + d);
        
        
        //Declarando uma variável do tipo String
        String s = "10";
        
        //Imprime na tela o valor de uma variável
        System.out.println("s: " + s);
        
        
        //Convertendo o valor armazenado de String para int
        int i2 = Integer.parseInt(s);
        
        //Imprime na tela o valor de uma variável
        System.out.println("i2: " + i2);
        
        
        //Declarando uma variável do tipo String
        String s2 = "10.54";
        
        //Imprime na tela o valor de uma variável
        System.out.println("s2: " + s2);
        
        
        //Convertendo o valor armazenado de String para float
        float f2 = Float.parseFloat(s2);
        
        //Imprime na tela o valor de uma variável
        System.out.println("f2: " + f2);
        
        
        //Convertendo o valor armazenado de String para double
        double d2 = Float.parseFloat(s2);
        
        //Imprime na tela o valor de uma variável
        System.out.println("d2: " + d2);
        
        
        //Declarando uma variável do tipo int
        int i3 = 11;
        
        //Imprime na tela o valor de uma variável
        System.out.println("i3: " + i3);
        
        
        //Convertendo o valor armazenado de int para String
        String s3 = String.valueOf(i3);
        
        //Imprime na tela o valor de uma variável
        System.out.println("s3: " + s3);
        
        
        //Declarando uma variável do tipo float
        float f3 = 120.4f;
        
        //Imprime na tela o valor de uma variável
        System.out.println("f3: " + f3);
        
        
        //Convertendo o valor armazenado de float para String
        String s4 = String.valueOf(f3);
        
        //Imprime na tela o valor de uma variável
        System.out.println("s4: " + s4);
        
        
        //Declarando uma variável do tipo double
        double d3 = 1243.54;
        
        //Imprime na tela o valor de uma variável
        System.out.println("d3: " + d3);
        
        
        //Convertendo o valor armazenado de double para String
        String s5 = String.valueOf(d3);
        
        //Imprime na tela o valor de uma variável
        System.out.println("s5: " + s5);
    }
    
}
