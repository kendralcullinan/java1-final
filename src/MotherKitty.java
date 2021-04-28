public class MotherKitty extends Kitten {
    private String ownerName;
    private int numKittens;

    public MotherKitty(){
        super();
        ownerName = "Animal Shelter";
        int numKittens = 0;
    }

    public MotherKitty(String name, String gender, String birthDate, String color, boolean fed, String ownerName){
        super(name, gender, birthDate, color, fed);
        this.ownerName = ownerName;
        this.numKittens = numKittens;
    }

    public string getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(string ownerName) {
        this.ownerName = ownerName;
    }

    public int getNumKittens() {
        return numKittens;
    }
    public static void setNumKittens(int numKittens) {
        this.numKittens = numKittens;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += ", Owner's Name: " + ownerName;

        return result;
    }

}