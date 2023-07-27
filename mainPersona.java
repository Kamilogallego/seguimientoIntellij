package encapsulation;

import javax.swing.*;

class mainPersona {
    public static void main(String[] args) {
        Person person = new Person();

        Person.setName(JOptionPane.showInputDialog("ingrese el nombre"));
        System.out.println(person.getName());

        Person person1 = new Person();
        person1.setName("pepe");
    }
}
