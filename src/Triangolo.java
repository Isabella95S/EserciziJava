public class Triangolo extends Forma{

    private double base,altezza;

    Triangolo(){    //costruttore senza parametri
        base = 3;
        altezza = 5;
    }

    Triangolo(double base, double altezza){ //costruttore con parametri
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
    double calcolaArea() { //implement metodo astratto
        return base * altezza / 2;

    }
}
