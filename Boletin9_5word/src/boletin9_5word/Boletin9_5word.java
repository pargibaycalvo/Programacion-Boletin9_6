
package boletin9_5word;

import javax.swing.JOptionPane;

public class Boletin9_5word {

    public static void main(String[] args) {
        int opcion;
        Series obx = new Series();
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Opcion a ejecutar(1 2 3): "));
        switch(opcion){
            case 1: obx.serie1(obx.numero());
                break;
            case 2: obx.serie2(obx.numero());
                break;
            case 3: obx.serie3(obx.numero());
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Saliendo.");
                break;
            default: 
                JOptionPane.showMessageDialog(null,"Opcion no correcta");
        }
        }while(opcion!=0);
        
    }
    
}
