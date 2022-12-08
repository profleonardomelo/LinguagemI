package Java_09_ProgramaConversaoDeTiposDeDados;

public class ProgramaConversaoDeTiposDeDados {

    public static void main(String[] args) {

        int i = 10;
        float f = (float)i;
        double d = (double)f;

        String s = "10";
        int i2 = Integer.parseInt(s);
        
        String s2 = "10.54";
        float f2 = Float.parseFloat(s2);
        double d2 = Double.parseDouble(s2);
        
        int i3 = 11;
        String s3 = String.valueOf(i3);
        
        float f3 = 120.4f;
        String s4 = String.valueOf(f3);

        double d3 = 1243.54;
        String s5 = String.valueOf(d3);
    }
    
}
