public class Main {

    public static void main(String[] args) {
        Car objectA = new Car();
        Merseders objectB = new Merseders("AG53", Enum.BLACK, 2017);
        Merseders objectC = new Merseders("GT1630", Enum.WHITE, 2020);
        objectA.makeVoice();
        objectB.makeVoice();
        objectC.makeVoice();
        System.out.println("________________________________");
        objectB.getInfo();
        System.out.println("________________________________");
        objectC.getInfo();

    }
}