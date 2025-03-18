public class Main {

    public static void main(String[] args){

        Forma f = new Forma();
        //double base;
        //double altezza;
        Rettangolo ret = new Rettangolo(10.0,20.8);
        Triangolo tri = new Triangolo(12.5, 3.4);
        f.calcolaArea();
        ret.calcolaArea();
        tri.calcolaArea();
    }
}
