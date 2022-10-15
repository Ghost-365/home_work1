public class Car extends Transport {

    public void makeVoice() {
        System.out.println("BRMMMM");
    }

    public final void makeVoices(String voice) {
        System.out.println(voice);
    }
}
