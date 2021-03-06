import java.util.Scanner;
/** 
* Bisiesto nos calculara si un año es bisiesto o si no lo es.
* un año es bisiesto si al dividirlo por 4 este nos da un resultado entero y un residuo de cero.
* @author Dylan Juarez
* @version 1.0
*/
public class BisiestoPractica01{
        /** 
        *Metodo Main
        *@param args
        */
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el año del que deseas saber si es Bisiesto o no: ");
        double año = in.nextDouble();
        double  resultado = año / 4; //un año es bisiesto si es divisible entre 4  a/b = c 
        int resultadoEntero = (int)resultado;
        double residuo = 4*resultado - 4*resultadoEntero; // sacamos el residuo de la division entre 4 : r = a(b/a - c) 
        if (residuo == 0) { // un año es bisiesto porque es divisible entre 4 por lo tanto, su residuo es cero: a(b/a - c) = 0
        	System.out.println("El año " + (int)año  + " es bisiesto");
        }else{System.out.println("El año " + (int)año + " no es bisiesto");}

        

	}
}
