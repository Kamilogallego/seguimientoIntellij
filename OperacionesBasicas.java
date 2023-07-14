package OperacionesBasicas;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // el static es una Instancia de la creacion del objeto.

        String  a = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
        String  b = JOptionPane.showInputDialog(null, "Ingrese el segundo número");
        double n1 = Double.parseDouble(a);
        double n2 = Double.parseDouble(b);
        double suma = n1 + n2;
        double resta = n1 - n2;
        double mult = n1 * n2;
        double div = n1 / n2;
        JOptionPane.showMessageDialog(null, "Los resultados fueron: \n"+
                                                    "la suma fue:"+suma+ "\n"
                                                        + "La resta fue:"+resta+ "\n"
                                                            + "La multiplicación fue:" + mult +"\n" +
                                                                "La división fue:" +div);

    }

}