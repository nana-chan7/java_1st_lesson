package thread;

public class Oder {
    private String name;
public static void main(String[] args) {
new OrderApp("Coffee");
}
public OrderApp(String name) {
this.name = name;
}
public void order() {
System.out.println(name);
Thread.sleep(1000);
System.out.println("Order");
}
}
