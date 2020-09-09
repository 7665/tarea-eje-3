package Misclases;
import javax.swing.*;
public class tablafinal {
  public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "/  \\------------------,\n" +
"\\_,|                      |\n" +
"    |BIENVENIDO.|\n" +
"    |    ,------------------ \n" +
"    \\_/_______________/  \n" +
"\n" +                
"tendrás que ingresar dos números que este programa determina si son iguales o uno es \nmás mayor que otro e imprimos la tabla de multiplicar.");
    float uno = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su numero uno:"));
    float dos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su numero dos:"));

    tabla hj = new tabla(uno,dos);

  }
}