//Carolina Pérez Alvarado A01631526
import javax.swing.*;
public class MonteCarlo {
	public static double AproximarPi(int num) {
		double aciertos = 0;
		double intentos = 0;
		for (int i = 0; i < num; i++) {
			double r = Math.random();
			double x = -1 + 2 * r;
			double z = Math.random();
			double y = -1 + 2 * z;
			if ((x*x + y*y) <= 1) {
				aciertos += 1;
			}
			intentos += 1;
		}
		double aprox = 4 * (aciertos / intentos);	
		return aprox;	
	}
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas veces quieres intentar?"));
		System.out.println(AproximarPi(num));
	}
}