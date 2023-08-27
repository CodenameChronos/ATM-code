package atm_2;
import javax.swing.JOptionPane;
public class ATM_2 {
    
    private Integer saldo = 0;
    private Integer accion = 0;

    public static void main(String[] args) {
        ATM_2 bank = new ATM_2();
        bank.core();
        /*bank.saldo();
        bank.opcion();
        switch (accion){
        case 1 -> bank.ingresar(saldo);
        case 2 -> bank.retiro(saldo);
        switch (accion) {
            case 1 -> bank.ingresar(saldo);
            case 2 -> bank.retiro(saldo);
            default -> JOptionPane.showMessageDialog(null, "Opción inválida");
        }*/
    }
    
     public void core() {
        saldo();
        opcion();
        if (accion != 2) {
            ingresar();
        } else {
            retiro();
        }
    }
    
        public void retiro(){
        int retirar;
        do{
        retirar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
        } while(retirar<0);
        if (saldo>=retirar){
            JOptionPane.showMessageDialog(null, "Se han retirado $"+retirar);
            saldo=saldo-retirar;
            JOptionPane.showMessageDialog(null, """
                                                Su saldo actual es de:
                                                $"""+saldo);
        } else{
            JOptionPane.showMessageDialog(null, "Su saldo es insuficiente para esta transaccion");
        }
    }
    
    public void saldo(){
        do{
            saldo = Integer.valueOf(JOptionPane.showInputDialog("Ingrese su saldo inicial"));
        } while (saldo<=0);
        JOptionPane.showMessageDialog(null, """
                                            Su saldo inicial es de:
                                            $"""+saldo);
    }
    
    public void ingresar(){
        int abono;
        do{
        abono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea abonar"));
        } while (abono<=0);
        saldo=saldo+abono;
        JOptionPane.showMessageDialog(null, """
                                            Su nuevo saldo es de:
                                            $"""+saldo);
    }
    
    public void opcion(){
        do{
            accion = Integer.valueOf(JOptionPane.showInputDialog("""
                                            Bienvenido a su banca en linea.
                                            Marque 1 para abonar a su cuenta.
                                            Marque 2 para retirar de su cuenta."""));
        } while (accion!=1 && accion!=2);
    }
    
}