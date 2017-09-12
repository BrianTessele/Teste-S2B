package s2b.tst.sum;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
    	 Scanner entrada = new Scanner(System.in);
         double a;
         double b;
         
         System.out.println("Digite o valor de a: ");
         a = entrada.nextDouble();
         
         System.out.println("Digite o valor de b: ");
         b = entrada.nextDouble();
         entrada.close();
    	double r = Sum.sum(a, b);
    	
    	System.out.printf("A= %f\n",a);
    	System.out.printf("B= %f\n",b);
    	System.out.printf("Resposta= %f\n", r);
    	
      
    } 
}
