package Java_18_ProgramaEstruturasDeRepeticaoWhile;

public class ProgramaEstruturasDeRepeticaoWhile {

    public static void main(String[] args) {
        
        int i = 0;
        
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        
        System.out.println();
        
        i = 1;
        
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
        
        System.out.println("\nAcabou!");
    }
    
}
