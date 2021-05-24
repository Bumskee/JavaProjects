import java.util.LinkedList;

public class driver {
    public static void main(String[] args) {
        Species s1 = new Species("Sapiens", "Homo");
        System.out.println(s1.toString());
    }

    public LinkedList makeList(Specimen[] animals) {
        LinkedList<Specimen> list = new LinkedList<Specimen>();
        for (int i = 0; i < animals.length; i++) {
            list.add(animals[i]);
        }
        return list;
    }

    public LinkedList makeSpeciesList( LinkedList<Specimen> animals ) {
        LinkedList<Species> list = new LinkedList<Species>();
        for (int i = 0; i < animals.size(); i++) {
            list.add(animals.get(i).getTOA());
        }
        return list;
    }

    public LinkedList makeSpeciesListUnique( LinkedList<Species> allSpecies ) {
        LinkedList<Species> nondupe = new LinkedList<Species>();
        for (int i = 0; i < allSpecies.size(); i++) {
            if (!nondupe.contains(allSpecies.get(i))) {
                nondupe.add(allSpecies.get(i));
            }
        }
        return nondupe;
    }

    public void countSpecies(Specimen[] specimens, Species s) {
        int count = 0;
        for (int i = 0; i < specimens.length; i++) {
            if (s.equals(specimens[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
