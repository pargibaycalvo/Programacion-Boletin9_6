
package boletin9_5word;

import javax.swing.JOptionPane;

public class Series {
    
    public int numero(){ // Metodo para calcular el numero de repeticiones que hace falta para los demas metodos
     int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero positivo:"));
        while((num<0) || (num>10)){ // Pedira el numero si es menor que 0 o mayor que 10
            num=Integer.parseInt(JOptionPane.showInputDialog("Incorrecto, por favor introduzca un numero positivo:"));
        }
        return num;
    }
    public void serie1(int num){
        System.out.print("Serie numero 1:\n");
        System.out.print("2 + ");
        for(int i=0;i<num;i++){
            if(i==(num-2)){
                System.out.print(2*num);
                break;
            }
                
            System.out.print((2*(i+2))+" + ");
        }
        System.out.println("");
    }
     public void serie2(int num){
        System.out.print("Serie numero 2:\n");
        int control = 0; // 0 cuando numero - y 1 cuando numero +
        
        for(int i=0;i<num;i++){
            if(control==0){
                System.out.print(" - "+(i+1));
                control=1;
            }
            else{
                System.out.print(" + "+(i+1));
                control=0;
            }
        }
         System.out.println("");
    }
    public void serie3(int num){
        System.out.print("Serie numero 3:\n");
        int control = 0; // 0 cuando numero1 y 1 cuando numero2
        int numero1=1,numero2=1;
        for(int i=0;i<num;i++){
            
            if(i==(num-1)){ // para la ultima iteracion 
               if(control==0){
               System.out.print(numero1);  
            }else{  
            System.out.print(numero2);
            numero1+=numero2;
            
            }
               break;
            }
            if(i==0){ // Para la primera iteracion(i=0) 
                System.out.print("0 ,");
                control=1;
                continue;
            }
            if(i==1){ // Para la segunda iteracion (i=1)
                System.out.print("1 ,");
                control=0;
                continue;
            }
            
            if(control==0){ // Si control está en 0 se imprime el numero1 y se actualiza el numero2 para la siguiente iteracion
               
               System.out.print((numero1)+" , ");
               numero2+=numero1;  
               control=1;
            }else{ // si control esta en 1 se imprime el numero2 y se actualiza el numero1 para la sigueiente iteracion
                
            System.out.print(numero2+" , ");
            numero1+=numero2;
            control=0;
            }
        }
        System.out.println("");
    }
}
    
        
    
    

