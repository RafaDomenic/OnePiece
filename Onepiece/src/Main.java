import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> rotaGrandLine = new ArrayList<>();

        rotaGrandLine.add("East Blue");
        rotaGrandLine.add("Alasbata");
        rotaGrandLine.add("Water 7");
        rotaGrandLine.add("Flutuante");

        for (String n : rotaGrandLine) {
            System.out.println(n);
        }

        System.out.println("\n===================\n");

        Iterator iterador = rotaGrandLine.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }


    }
}
