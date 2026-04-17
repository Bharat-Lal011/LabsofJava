class WashingMachine {

    void switchOn() {
        System.out.println("Machine ON");
    }

    int acceptClothes(int n) {
        return n;
    }

    void acceptDetergent() {
        System.out.println("Detergent added");
    }

    void switchOff() {
        System.out.println("Machine OFF");
    }
}

public class TestWM {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.switchOn();
        int clothes = wm.acceptClothes(5);
        System.out.println("Clothes accepted: " + clothes);
        wm.acceptDetergent();
        wm.switchOff();
    }
}