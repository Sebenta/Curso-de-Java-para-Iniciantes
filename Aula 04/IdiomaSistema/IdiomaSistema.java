
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author code36u4r60
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Locale locale = Locale.getDefault();
        System.out.println("O seu sistema esta em " + locale.getDisplayLanguage());
    }
    
}
