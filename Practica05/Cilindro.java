/** 
* clase cilindro nos calcula el area y volumen de un cilindro.
*@author Dylan Juarez
*@version 1.0
*/
public class Cilindro{
   /** 
   *Metodo Main
   *@param args
   */
    public static void main(String[] args){
    //definimos las variables que son el radio y la altura
        double radio = 10;
	double altura = 20;
    //area del cilindro A= 2PI * radio * (r+h)
	double suma_ra_al = radio + altura;
	double area_cilindro = 2 * Math.PI * radio * suma_ra_al;
	System.out.println("El area del cilindro es: " + area_cilindro + "cm^2");
    //volumen del cilindro V = PI * altura * radio^2
	double cuadrado = Math.pow(radio, 2);
	double volumen_cilindro = Math.PI * altura * cuadrado;
	System.out.println("El volumen del cilindro es: " + volumen_cilindro + "cm^3");
	
    }

}
