package poo;
import javax.swing.JOptionPane;
public class CochePrincipal {
    public static void main(String[] args) {
        Coche Renault = new Coche();
        String color;
        String asientos;
        String clima;
        color=JOptionPane.showInputDialog("Introduzca el color del coche:");
        asientos=JOptionPane.showInputDialog("¿El coche tiene asientos de cuero?");
        clima=JOptionPane.showInputDialog("¿El coche tiene climatizador?");
        Renault.setColor(color);
        Renault.setAsientos(asientos);
        Renault.setClimatizador(clima);
        System.out.println(Renault.getDatos());
    }
}
