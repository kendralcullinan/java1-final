import java.util.ArrayList;
import java.util.List;

public class Litter {
    private static List<Kitten> kittens = new ArrayList<>();
    private static final int MaxKitties = 20;
    // private List<Kitten> kittens;
    // kittens = new ArrayList<>(20);

     // private Kitten[] kittens;
     // kittens = new Kitten[20];

     public static void viewKittens(){
        System.out.print(kittens.toString());
     }

    public static void addKitten(Kitten kitten){
        // for(int i = 0; i <= kittens(20); i++){
        //     if kittens(i) == ' '{
        //     }
        // }
        while(kittens.size() <= 20){
            Litter.addKitten(kitten);
        }
    }

    public static void adoptKitten(Kitten kitten){
        // delete kitten from arraylist
    }

    public static void feedKitten(){
        // check if kitten is fed before feeding
    }

    public static void viewKittensByGender(){
        // sort by gender
    }

}
