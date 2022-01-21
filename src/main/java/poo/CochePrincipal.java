package poo;
public class CochePrincipal {
    public static void main(String[] args) {
        Coche Renault = new Coche();
        Renault.setColor("verde");
        Renault.setAsientos("si");
        Renault.setClimatizador("no");
        System.out.println(Renault.getDatos());
    }
    
}
