package Misclases;
import javax.swing.*;


public class tabla extends variables{
  public tabla(float numerouno, float numerodos)
  {
    super(numerouno, numerodos);
    if(numerouno == numerodos)
    {
      JOptionPane.showMessageDialog(null, "Los numeros ingresados son iguales\n que tenga un buen día");
    }else{
        if(numerouno > numerodos){
            JOptionPane.showMessageDialog(null,"[*] La tabla de multiplicación de "+numerouno+" es:");
            for(int i = 1; i <= 10; i++ )
            {
                JOptionPane.showMessageDialog(null,"[*] "+numerouno +" * "+ i +" = "+numerouno*i);
            }
            JOptionPane.showMessageDialog(null, "Gracias por su vista tenga un buen día");
        }else
        {
            if(numerodos > numerouno)
            {
                JOptionPane.showMessageDialog(null,"[*] La tabla de multiplicación de"+numerodos+" es:");
                for(int i = 1; i <= 10; i++)
                {
                   JOptionPane.showMessageDialog(null, "[*] " + numerodos +" * "+ i +" = "+numerodos*i);
                }
                JOptionPane.showMessageDialog(null, "Gracias por su vista tenga un buen día");
            }   
        }
    }
  }
}