
package testdeentrada;
import  java.util.Scanner;

public class TestDeEntrada {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese cantidad de entregas a realizar: ");
        int entregas = intro.nextInt();
        int cont = 0;
        double distancia = 0;
        double TotalLt = 0;
        
        while (cont < entregas){
            
             
            System.out.print("Ingresar coodenadas ");
            System.out.println("eje x:");
            int x = intro.nextInt();
            int xx = x;
            System.out.println("eje y:");
            int y = intro.nextInt(); 
            int yy = y;
            if (cont==1){
                x = Math.abs(xx-x);
                y = Math.abs(yy-y);
            }
            //PROCESO 
            double x2 = Math.pow(x, 2);
            double y2 = Math.pow(y, 2);
            double h = Math.sqrt(x2+y2);
            distancia = distancia+h;
            if (distancia > 50*15){
                System.out.println("*******Pase a CARGAR combustible!*******");
            }
            double lt = h*100/750;
            TotalLt = TotalLt+lt;
            System.out.println("Usted necesita "+TotalLt+" para el viaje");
            System.out.println("Distancia total: "+distancia+" km");
            cont++;
            
        }
        
    }
    
}
