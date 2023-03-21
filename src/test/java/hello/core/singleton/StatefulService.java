package hello.core.singleton;

public class StatefulService {

    // 이렇게 하면 안됨 ! ! !

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
