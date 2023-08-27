package atm;
import javax.swing.JOptionPane;

public class ATM{   
        public static void main (String[] args, Integer saldo, Integer accion){
        ATM bank = new ATM();
        bank.saldo();
        bank.opcion();
         if (accion!=2){
            bank.ingresar(saldo);
        } else{
            bank.retiro(saldo);
        }
    }
        
    public void caso (){
        
    }

    public void retiro(Integer saldo){
        int retirar;
        do{
        retirar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
        } while(retirar<0);
        if (saldo>=retirar){
            JOptionPane.showMessageDialog(null, "Se han retirado $"+retirar);
            saldo=saldo-retirar;
            JOptionPane.showMessageDialog(null, "Su saldo actual es de: $\n"+
            saldo);
        } else{
            JOptionPane.showMessageDialog(null, "Su saldo es insuficiente para esta transaccion");
        }
    }
    
    public void saldo(){
        int saldo;
        do{
            saldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su saldo inicial"));
        } while (saldo<=0);
        JOptionPane.showMessageDialog(null, "Su saldo inicial es de: $\n"+
                saldo);
    }
    
    public void ingresar(Integer saldo){
        int abono;
        do{
        abono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea abonar"));
        } while (abono<=0);
        saldo=saldo+abono;
        JOptionPane.showMessageDialog(null, "Su nuevo saldo es de: $\n"+
                saldo);
    }
    
    public void opcion(){
        int accion;
        do{
            accion = Integer.parseInt(JOptionPane.showInputDialog("""
                                            Bienvenido a su banca en linea.
                                            Marque 1 para abonar a su cuenta.
                                            Marque 2 para retirar de su cuenta."""));
        } while (accion!=1 || accion!=2);
    }
    
}

