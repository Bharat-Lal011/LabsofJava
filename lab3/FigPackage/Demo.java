package FigPackage;

public class Demo {

    public static void main(String[] args) {

        Cone c = new Cone(3, 5, 7);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        System.out.println();

        Sphere s = new Sphere(4);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        System.out.println();

        Cylinder cy = new Cylinder(3, 6);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();
    }
}
