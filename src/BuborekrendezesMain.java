
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Ciklus i := n-1 –től 1 -ig
 Ciklus j := 0-től i-1 -ig
 Ha a[j] > a[j+1] akkor
 Csere( a[j], a[j+1] )
 Cilus vége
 Ciklus vége 
 */
public class BuborekrendezesMain {

    static List<HaziAllatFajta> rendezes(List<HaziAllatFajta> rendezetlen) {

        HaziAllatFajta csere;

        for (int i = rendezetlen.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (rendezetlen.get(j).getMennyibeKerul() > rendezetlen.get(j + 1).getMennyibeKerul()) {
                    csere = rendezetlen.get(j);
                    rendezetlen.set(j, rendezetlen.get(j + 1));
                    rendezetlen.set(j + 1, csere);

                }
            }
        }

        return rendezetlen;

    }

    static void kiiras(List<HaziAllatFajta> kiiras) {

        for (int i = 0; i < kiiras.size(); i++) {
            System.out.println(kiiras.get(i));
        }

    }

    public static void main(String[] args) {

        List<HaziAllatFajta> allatkak = new ArrayList<>();

        allatkak.add(new Kutya(1500, "Stevie"));
        allatkak.add(new Macska(1200, "Cicúr"));
        allatkak.add(new Kigyo(2500, "SnakeJazz"));
        allatkak.add(new Papagaj(200, "Csőri"));
        allatkak.add(new Macska(0, "Micike"));
        allatkak.add(new Papagaj(200, "Szilveszter"));

        System.out.println("Rendezetlen");
        kiiras(allatkak);
        rendezes(allatkak);
        System.out.println("\nRendezett");
        kiiras(allatkak);

    }

}
