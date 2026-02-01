abstract class figure {
    final double pi = 3.1420;
    double total_area, volume;

    public abstract void CalcArea();

    public abstract void CalcVolume();

    public abstract void DispArea();

    public abstract void DispVolume();

}
 class Cone extends figure {
    double n, s, h; // n is radius and s is slant height.

    Cone(double n, double s, double h) {
        this.n = n;
        this.s = s;
        this.h = h;
    }

    public void CalcArea() {
        total_area = (pi * n * n) + (pi * n * s);
    }

    public void CalcVolume() {
        volume = (pi * n * n * h);
    }

    public void DispArea() {
        System.out.println("Area of Cone =  " + total_area);
    }

    public void DispVolume() {
        System.out.println("Volume of Cone =  " + volume);
    }
}

 class Sphere extends figure {
    double r;

    Sphere(double r) {
        this.r = r;

    }

    public void CalcArea() {
        total_area = 4.0 * pi * r * r;
    }

    public void CalcVolume() {
        volume = (4.0 * pi * r * r * r) / 3.0;
    }

    public void DispArea() {
        System.out.println("Area of Sphere =  " + total_area);
    }

    public void DispVolume() {
        System.out.println("Volume of Sphere =  " + volume);
    }

}

 class Cylinder extends figure {
    double h;
    double r;

    Cylinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public void CalcArea() {
        total_area = (2 * pi * r * r) + 2 * pi * r * h;
    }
    public void CalcVolume() {
        volume = pi * r * r * h;
    }
    public void DispArea () {
        System.out.println("Area of Cylinder = " + total_area);
    } 
    public void DispVolume () {
        System.out.println(" Volume of Cylinder " + volume );
    }
}

public class Demo {
    public static void main(String[] args) {

        Cone C = new Cone(4, 6, 5);
        Sphere S = new Sphere(5);
        Cylinder Cy = new Cylinder(3, 6);

        C.CalcArea();
        C.CalcVolume();
        C.DispArea();
        C.DispVolume();

        System.out.println();

        S.CalcArea();
        S.CalcVolume();
        S.DispArea();
        S.DispVolume();

        System.out.println();

        Cy.CalcArea();
        Cy.CalcVolume();
        Cy.DispArea();
        Cy.DispVolume();

        System.out.println();

    }
}