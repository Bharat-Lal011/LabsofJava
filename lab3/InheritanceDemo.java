class figure {
    double r, a, v;

    public void dispArea() {
        System.out.println("Area : " + a);
    }

    public void dispVolume() {
        System.out.println("Volume : " + v);
    }
}

class Cone extends figure {
    double h, s;
    final double p = 3.14;

    public void CalcArea() {
        a = (p * r * r) + (p * r * s);
    }

    public void CalcVolume() {
        v = (p * r * r * h) / 3.0;
    }

}

public class InheritanceDemo {
    public static void main(String[] args) {
        Cone C = new Cone();
        C.r = 5;
        C.h = 3.34;
        C.s = 6.67;

        C.CalcArea();
        C.CalcVolume();

        C.dispArea();
        C.dispVolume();

    }

}
