public class Specimen
{
    private String name;

    private int cageNumber;

    private Species toa; // "Type Of Animal"

    private String description;

    public Specimen( String a, int c, Species s, String marking)
    {
        setName(a);
        setCage(c);
        setTOA(s);
        setDescription(marking);
    }

    public void setName(String a){ name = a; }

    public void setCage(int c){ cageNumber = c; }

    public void setTOA(Species s){ toa = s; }

    public void setDescription(String marking) {description = marking;}

    public String getName(){ return name; }

    public int getCage(){ return cageNumber; }

    public Species getTOA(){ return toa; }

    public String getDescription() { return description;}

    public String toString()
    {
        return name + " is a " + toa + " in cage " + cageNumber;
    }
}