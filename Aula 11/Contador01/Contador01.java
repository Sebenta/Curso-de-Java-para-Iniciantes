package contador01;

/**
 *
 * @author Code36u4r60
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 0;
        while (cc++ < 10) {
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if(cc == 7){
                break;
            }
            System.out.println("Cambalhota " + cc);
        }
    }

}
