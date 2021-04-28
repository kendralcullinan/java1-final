import java.time.LocalDate;
public class Kitten implements Comparable <Kitten> {
    private String name;
    private String gender;
    private LocalDate birthDate;
    private String color;
    // private int numKittens;
    private boolean fed;
    
    public Kitten(){
        this.name = "";
        this.gender = "";
        this.birthDate = LocalDate.now();
        this.color = "";
        // this.numKittens = 0;
        this.fed  = false;
    }
    
    public Kitten(String name, String gender, String birthDate, String color, boolean fed){
        this.name = name;
        this.gender = gender;
        this.birthDate = Helpers.convertStrToDate(birthDate);
        this.color = color;
        // this.numKittens = numKittens;
        this.fed  = fed;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = Helpers.convertStrToDate(birthDate);
    }
    public String getColor() {
        return color;
    }   
    public void setColor(String color) {
        this.color = color;
    }   
    // public int getNumKittens() {
    //     return numKittens;
    // }
    // public void setNumKittens(int numKittens) {
    //     this.numKittens = numKittens;  
    // }

    public boolean isFed() {
        return fed;
    }
    public void setFed(boolean kittenFed) { 
        this.fed = kittenFed;
    }
    
    public String toString(){
        String result = "";
        result += "Name: " + name + ", " + gender + birthDate;
        return result;
    }

    @Override
    public int compareTo(Kitten other){
        int result = this.name.compareTo(other.name);
        if(result == 0){
            result = this.color.compareTo(other.color);
        }
        return result;
    }

    
}
