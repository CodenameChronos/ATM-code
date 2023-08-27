package mayormenor;
import javax.swing.JOptionPane;
public class MayorMenor {

    public static void main(String[] args) {
        int numA, numB, numC;
        numA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer número."));
        numB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del segundo número."));
        numC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del tercer número."));
        
        if (numA>numB && numA>numC){
            System.out.print(numA);
            if (numB>numC){
                    System.out.print(" " + numB + " " + numC);
                } else{
                    System.out.print(" " + numC + " " + numB);
                }
            
        }else if (numB>numC && numB>numA){
                System.out.print(numB);
                if (numA>numC){
                    System.out.print(" " + numA + " " + numC);
                } else{
                    System.out.print(" " + numC + " " + numA);
                }
        } else {
            System.out.print(numC);
            if (numB>numA){
                System.out.print(" " + numB + " " + numA);
            }else {
                        System.out.print(" " + numA + " " + numB);
                        }
            }
        } 
}     
