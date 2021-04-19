
public class Kitten implements Comparable <Kitten> {
    private String name;
    private String color;
    private LocalDate birthDate;
    private int numKittens;
    private boolean fed;
    
    public Kitten(){
        this.name = "";
        this.color = "";
        this.birthDate = LocalDate.now();
        this.numKittens = 0;
        this.fed  = false;
    }
    
    public Kitten(String name, String color, String birthDate, int numKittens, boolean fed){
        this.name = name;
        this.color = color;
        this.birthDate = convertStrToDate(birthDate);
        this.numKittens = numKittens;
        this.fed  = fed;

    }

    public int compareTo(Kitten other){
        int result = this.name.compareTo(other.name);
        if(result == 0){
            result = this.color.compareTo(other.color);
        }
        return result;
    }
}
