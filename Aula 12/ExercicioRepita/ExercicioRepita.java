package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Code36u4r60
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int soma = 0, qtd = 0, media = 0, pares = 0, impar = 0, maisDe100 = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número:<br> <em>(Valor 0 interrompe)</em></html>"));
            if (num != 0) {
                soma += num;
                qtd++;
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impar++;
                }

                if (num > 100) {
                    maisDe100++;
                }
            }
        } while (num != 0);

        media = soma / qtd;

        String str = "<html> Resultado final <hr>";
        str += "<br>Soma dos valores = " + soma;
        str += "<br>Número de valores pares = " + pares;
        str += "<br>Número de valores ímpares = " + impar;
        str += "<br>Número de valores acima de 100 = " + maisDe100;
        str += "<br>Valor médio = " + media;
        str += "</html>";
        JOptionPane.showMessageDialog(null, str);
    }

}
