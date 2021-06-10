import java.util.*;

public class Ejercicio10 {

	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int num, sum = 0, cont = 0, men = 0;
		do{
			System.out.print("Ingrese el numero: ");
			num = sc.nextInt();
			if (num %6 ==0){
				cont+=1;
			} 
			else if (num < 10) {
			sum+=num;
			}
			sum+=num;
		} 
		while (sum <= 1000);
		System.out.println("La cantidad de números múltiplos de 6:" + cont);
		System.out.println("La suma de los números que se encuentran entre el 1 y el 10 es de:" + sum);
	}
}