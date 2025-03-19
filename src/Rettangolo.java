public class Rettangolo extends Forma{
    private double base, altezza;
    public Rettangolo(){ //costruttore senza paramentri
    base = 6;
    altezza = 7;
    }
    public Rettangolo(double base, double altezza){ //costruttore con parametri
        this.base = base;
        this.altezza = altezza;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltezza(){
        return altezza;
    }

    public void setAltezza(double altezza){
        this.altezza=altezza;
    }
    @Override
     double calcolaArea(){  //implement metodo astratto
        return base * altezza;

    }
}
