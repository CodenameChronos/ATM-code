package pndejada;
import javax.swing.JOptionPane;
public class Pndejada {
	public static void main (String[] args) {
		int bb;
		double b = 3.14159;
		double c = 273.15;
		int e = 17;
		int f = 4;
		bb = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
		int a = bb;
		double D = a + b + c + e + f;
		System.out.print(D);
	}
}