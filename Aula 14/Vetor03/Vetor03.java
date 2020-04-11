package vetor03;

import java.util.Arrays;

/**
 *
 * @author Code36u4r60
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double v[] = {3.5,2.75,9,-4.5};
        Arrays.sort(v);
        
        for (double valor : v) {
            System.out.println(valor);
        }       
    }
}
