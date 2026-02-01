class X {
    int i, j;

    X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    int finalSum() {
        return i + j;
    }
}
class Y extends X {

    Y(int i, int j) {
        super(i, j);
    }

    int findProduct() {
        return i * j;
    }
}
class Z extends Y {

    Z(int i, int j) {
        super(i, j);
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {

        Z obj = new Z(10, 5);

        int sum = obj.finalSum();
        int product = obj.findProduct();

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}

    

