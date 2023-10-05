import javax.swing.*;

public class Huvudprogram {
    public static void main(String[] args) {
        Växt[] växter = {
                new Kaktus("Igge",0.2),
                new Palm("Laura",5),
                new KöttätandeVäxt("Meatloaf",0.7),
                new Palm("Olof",1)
        };
        while (true) {

            String växtInput = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            if (växtInput.isEmpty()) break;

            boolean found = false;
            for (Växt växt : växter) {
                if (växt.getName().equals(växtInput)) {
                    found = true;
                    JOptionPane.showMessageDialog(null,  växt.getName() + " ska få " + växt.getVätskeMängd() + " liter " + växt.getVätskeTyp() + ".");
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Det finns ingen växt med namnet " + växtInput);
            }
        }
    }
}