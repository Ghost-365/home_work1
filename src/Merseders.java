public class Merseders extends Car{

    private String nameModel;
    private Enum color;
    private int year;

    public Merseders(String nameModel, Enum color, int year) {
        this.nameModel = nameModel;
        this.color = color;
        this.year = year;
    }

    public String getNameModel() {
        return nameModel;
    }

    @Override
    public Enum getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.println("DRM");
    }

    public void getInfo() {
        System.out.println("NameModel: " + nameModel + "\nColor: " + color + "\nYear: " + year);
    }

}
