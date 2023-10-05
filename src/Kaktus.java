public class Kaktus extends Växt {
    public Kaktus(String name, double height) {
        super(name, height);
    }

    @Override
    public String getVätskeTyp() {
        return "mineralvatten";
    }

    @Override
    public double getVätskeMängd() {
        return 0.02;
    }
}