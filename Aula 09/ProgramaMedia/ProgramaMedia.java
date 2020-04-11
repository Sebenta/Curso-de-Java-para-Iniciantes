
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        float n1 = scan.nextFloat();
        
        System.out.print("Nota 2: ");
        float n2 = scan.nextFloat();

        float m = (n1 + n2) / 2;
        
        System.out.println("A sua média é " + m);       
        
        if(m > 9){
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
        
    }

}
