public class KöttätandeVäxt extends Växt{
    public KöttätandeVäxt(String name, double height){
        super(name,height);
    }
    @Override
    public String getVätskeTyp() {
        return "proteindryck";
    }

    @Override
    public double getVätskeMängd() {
        return 0.1 + (this.height * 0.2);
    }

}
