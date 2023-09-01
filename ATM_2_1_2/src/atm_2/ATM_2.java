package atm_2;
import javax.swing.JOptionPane;
public class ATM_2 {
    
    private Integer saldo = 0;
    private Integer accion = 0;
    private final Saldo_compartido fondos = new Saldo_compartido();


    public static void main(String[] args) {
        Saldo_compartido fondos = new Saldo_compartido();
        Login llamar = new Login();
        llamar.setVisible(true);
    }
    
     public void core() {
        saldo();
        fondos.setSaldo(saldo);
        Option_frame call = new Option_frame(fondos, this);
        call.setVisible(true);
        Option_frame.callto = this;
        /*opcion();
        if (accion != 2) {
            ingresar();
        } else {
            retiro();
        }
        Login llamar = new Login();
        llamar.setVisible(false);*/
    }
    
        public void retiro(Saldo_compartido fondos){
        int retirar;
        do{
        retirar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
        } while(retirar<0);
        if (saldo>=retirar){
            JOptionPane.showMessageDialog(null, "Se han retirado $"+retirar);
            saldo=saldo-retirar;
        } else{
            JOptionPane.showMessageDialog(null, "Su saldo es insuficiente para esta transaccion");
        }
        fondos.setSaldo(saldo);
    }
    
    public void saldo(){
        do{
            saldo = Integer.valueOf(JOptionPane.showInputDialog("Ingrese su saldo inicial"));
        } while (saldo<=0);
    }
    
    public void ingresar(Saldo_compartido fondos){
        int abono;
        do{
        abono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea abonar"));
        } while (abono<=0);
        JOptionPane.showMessageDialog(null, "Se han abonado $"+abono);
        saldo=saldo+abono;
        fondos.setSaldo(fondos.getSaldo() + abono);
    }
    

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}