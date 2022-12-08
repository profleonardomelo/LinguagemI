//Define o pacote que contém esta classe
package Java_09_ProgramaConversaoDeTiposDeDados;

//Cria uma classe pública chamada "ProgramaConversaoDeTiposDeDados_C"
public class ProgramaConversaoDeTiposDeDados_C {

    //Cria o método principal (função) "main"
    public static void main(String[] args) {
        
        //Declarando uma variável do tipo int
        int i = 10;
        
        //Convertendo o valor armazenado de int para float
        float f = (float)i;
        
        //Convertendo o valor armazenado de float para double
        double d = (double)f;
        
        //Declarando uma variável do tipo String
        String s = "10";
        
        //Convertendo o valor armazenado de String para int
        int i2 = Integer.parseInt(s);
        
        //Declarando uma variável do tipo String
        String s2 = "10.54";
        
        //Convertendo o valor armazenado de String para float
        float f2 = Float.parseFloat(s2);
        
        //Convertendo o valor armazenado de String para double
        double d2 = Double.parseDouble(s2);
        
        //Declarando uma variável do tipo int
        int i3 = 11;
        
        //Convertendo o valor armazenado de int para String
        String s3 = String.valueOf(i3);
        
        //Declarando uma variável do tipo float
        float f3 = 120.4f;
        
        //Convertendo o valor armazenado de float para String
        String s4 = String.valueOf(f3);
        
        //Declarando uma variável do tipo double
        double d3 = 1243.54;
        
        //Convertendo o valor armazenado de double para String
        String s5 = String.valueOf(d3);
    }
    
}
