package FigPackage;

public abstract class Figure {
    double r;
    double a;
    double v;
    final double pi = 3.1428;

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}
