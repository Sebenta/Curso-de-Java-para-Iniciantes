package classes;

/**
 *
 * @author Code36u4r60
 */
public class Fatorial {

    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int valor) {
        num = valor;
        int f = 1;
        String s = "";
        for (int i = valor; i > 1; i--) {
            f *= i;
            s += i + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }

    
    public int getFatorial(){
        return fat; 
   }
    
    public String getFormula(){
        return formula;
    }
    
    
}
