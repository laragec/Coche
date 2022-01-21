package poo;
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho; 
    private int motor; 
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero;
    private boolean climatizador;
    
    public Coche(){
        ruedas=4;
        largo=2000;
        ancho=250;
        motor=1600;
        peso_plataforma=700;
    }
    
    //Getter: public/private + tipo de dato a devolver + nombre del método() + {código con return}
    public String getLargo(){
        return largo+" cm de largo, ";
    }
    
    public String getRuedas(){
        return ruedas+" ruedas,";
    }
    
    public String getColor(){
        return " color: "+color+",";
    }
    
    public String getAsientos(){
        if(asientos_cuero==true){
            return " con asientos de cuero,";
        } else{
            return " sin asientos de cuero,";
        }
    }
    
    public String getPeso(){
        int peso_carroceria=500;
        peso_total=peso_plataforma+peso_carroceria;
        if (asientos_cuero==true) {
            peso_total+=50;
        }
        if (climatizador) {
            peso_total+=15;
        }
        return " peso: "+peso_total+ " kg.";
    }
    
    public String getClimatizador(){
        if(climatizador==true){
            return " y con climatizador.";
        } else{
            return " y sin climatizador.";
        }
    }
    
    public String getDatos(){
        return "Coche con: "+getLargo()+getRuedas()+getColor()+getAsientos()+getPeso()+getClimatizador();
    }
    
    //Setter: public/private + void + nombre de la función(parámetros) + {código}
    public void setColor(String color){
        this.color = color;
    }
    
    public void setAsientos(String asientos_cuero){
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        } else{
            this.asientos_cuero=false;
        }
    }
    
    public void setClimatizador(String climatizador){
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador=true;            
        } else{
            this.climatizador=false;
        }
    }
}
