public class Genus {
    private String genusName;

    public Genus(String g) {setGenusName(g);}

    public String getGenusName() {return genusName;}

    public void setGenusName(String g) {genusName = g;}

    public String toString() {return "Genus: " + genusName + ".";}
}
