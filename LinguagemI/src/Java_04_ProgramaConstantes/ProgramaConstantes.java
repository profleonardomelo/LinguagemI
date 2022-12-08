package Java_04_ProgramaConstantes;

public class ProgramaConstantes {

    public static void main(String[] args) {
        
        final double PI = 3.14;
        
        final int MILISEGUNDOS_POR_SEGUNDO = 1000;
        
        final long MILISEGUNDOS_POR_DIA = 24 * 60 * 60 * MILISEGUNDOS_POR_SEGUNDO;
        
        //MILISEGUNDOS_POR_SEGUNDO = 1001;
        

        System.out.println("Valor da constante PI: " + PI);
        
        System.out.println("Valor da constante MILISEGUNDOS_POR_SEGUNDO: " + MILISEGUNDOS_POR_SEGUNDO);
        
        System.out.println("Valor da constante MILISEGUNDOS_POR_DIA: " + MILISEGUNDOS_POR_DIA); 
    }
    
}
