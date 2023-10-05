public class Palm extends Växt{
    public Palm(String name, double height){
        super(name,height);
    }
    @Override
    public String getVätskeTyp() {    //POLYMORFISM
        return "kranvatten";
    }

    @Override
    public double getVätskeMängd() {
        return 0.5 * this.height;
    }


}
