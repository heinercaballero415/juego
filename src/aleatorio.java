import javax.swing.*;

public class aleatorio {
    public static void main (String [] args) {

        int numero, aleatorio, i = 0;


        aleatorio = (int) (Math.random() * 100);
        JOptionPane.showMessageDialog(null, "bienvenidos a  nuestro juego");

            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "porfavor ingrese un numero" + "\n" +
                    "el numero debe ser de 0 hasta 100"));


            while (numero != aleatorio) {

            if (numero == aleatorio) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero menor al anterior"));

            } else if (numero > aleatorio) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero menor al anterior"));
            } else if (numero < aleatorio) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero mayor al anterior"));
            }
            else {
                i++;
                JOptionPane.showMessageDialog(null,"las veses que lo intento son" + i);
            }

JOptionPane.showMessageDialog(null,"siguelo intentando");
        }}}











