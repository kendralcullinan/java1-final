public class MotherKitty extends Kitten {
    private String ownerName;

    public MotherKitty(){
        super();
        ownerName = "Animal Shelter";
    }

    public MotherKitty(String name, String ownerName, String gender, String birthDate, String color, int numKittens, boolean fed){
        super(name, gender, birthDate, color, numKittens, fed);
        this.ownerName = ownerName;
    }

    public string getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(string ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += ", Owner's Name: " + ownerName;

        return result;
    }

}