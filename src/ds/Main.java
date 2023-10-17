package ds;

public class Main {
    public static void main(String[] args) {


        Phone phone = new SamsungPhone();
        phone.setNumber(123);
        phone.setModel("Samsung x11");
        phone.info();
        phone.receiveCall(" Alex");
    }
}