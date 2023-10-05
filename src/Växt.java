abstract public class Växt implements Vattning{
    protected String name;   //INKAPSLING
    protected double height;

    public String getName() {
        return name;
    }
    public Växt(String name,double height){
        this.name = name;
        this.height = height;
    }
}
