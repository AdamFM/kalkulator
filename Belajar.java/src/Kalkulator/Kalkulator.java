package Kalkulator;

public class Kalkulator {
    
       public static void main (String[] args){
            Data isi = new Data();
            isi.setX(10);
            isi.setY(2);
            
            System.out.println("Kalkulator \n");
            System.out.println("10 + 2 = "+(isi.getX()+isi.getY()));
            System.out.println("10 - 2 = "+(isi.getX()-isi.getY()));
            System.out.println("10 : 2 = "+(isi.getX()/isi.getY()));
            System.out.println("10 * 2 = "+(isi.getX()*isi.getY()));
        }
    
}
