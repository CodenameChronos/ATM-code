package optionpane;
import javax.swing.JOptionPane;
public class OPtionPane {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un sgundo valor entero"));
        
        c = a + b;
        
        //System.out.print(c);
        JOptionPane.showMessageDialog(
                null, "El resultado de "+a+" + "+b+" es igual a:\n"+
                        c+".");
    }
    
}
