package encapsulation;

import javax.swing.*;

public class MainHouse {
    public static void main (String[] args) {
        House house = new House();
        house.setDireccion(JOptionPane.showInputDialog("ingrese la direccion"));
        house.setNumero_De_alcoba(2);
        house.setPropietario("juan");
    }
}
