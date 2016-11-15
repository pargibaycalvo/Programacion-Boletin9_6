
package boletin9_6word;

public class Boletin9_6word {

    public static void main(String[] args) {
        // TODO code application logic here
       
        sueldo obx = new sueldo();
        float num;
        do{
            num= obx.Pidesueldo();
            if((int)num!=0)
            obx.Calculosueldo(num);
            
        }while((int)num!=0);
        obx.Muestra();
    }
    
}
    
    

