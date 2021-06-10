import java.util.*;
public class Ejercicio9{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int control=0;
		double promedio;
		double sumatoriaTemperatura=0;
		double t1;
		double t2;
		System.out.print("Ingrese T1: ");
		t1=scanner.nextDouble();
		System.out.print("Ingrese T2: ");
		t2=scanner.nextDouble();
		while(t1!=0) {
			
			if (5<=t1 && t1>=15 && 5<=t2 && t2>=15) {
				sumatoriaTemperatura=sumatoriaTemperatura+t1+t2;
				control=control+1;
			} else {
				System.out.println("Los datos son incorrectos");
			}
			System.out.print("Ingrese T1: ");
			t1=scanner.nextDouble();
			System.out.print("Ingrese T2: ");
			t2=scanner.nextDouble();
		}
		promedio=(sumatoriaTemperatura)/control;
		System.out.println("El promedio es: "+promedio);
	}
}