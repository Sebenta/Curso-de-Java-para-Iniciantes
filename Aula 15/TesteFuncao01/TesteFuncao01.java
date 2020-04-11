package testefuncao01;

/**
 *
 * @author Code36u4r60
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma(5, 2);
        System.out.println(sm);
    }

}
