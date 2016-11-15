
package boletin9_6word;

import javax.swing.JOptionPane;

public class sueldo {
    
    private int numtot,num1000,num1750;

    public int getNumtot() {
        return numtot;
    }

    public int getNum1000() {
        return num1000;
    }

    public int getNum1750() {
        return num1750;
    }
    
    public int Pidesueldo(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad"));
        while(num<0){ // volvera a  pedir el numero si es menor que 0 o mayor que 10
            num=Integer.parseInt(JOptionPane.showInputDialog("ERROR, introduzca una cantidad positiva:"));
        }
        return num;
    }
    
    public void Calculosueldo(float soldo){
        if(soldo<1000) num1000++;
        if((soldo>=1000)&&(soldo<=1750)) num1750++; 
        numtot++;
    }
    
    public void Muestra() {
        System.out.println("Empleados que cobran entre 1000 e 1750: " 
      +getNum1750()+ "\n Empleados que combran menos de 1000: " +(getNum1000()*100/getNumtot())+" %");
    }
    
    
}
    

