import java.util.ArrayList;
import java.util.List;


public class Litter {
    private static List<Kitten> kittens = new ArrayList<>();
    private static final int MAX_KITTIES = 20;
    // private List<Kitten> kittens;
    // kittens = new ArrayList<>(20);

     // private Kitten[] kittens;
     // kittens = new Kitten[20];

     public static boolean tooMany(){
         return kittens.size() >= MAX_KITTIES;
     }
     public static void viewKittens(){
        // for(int i =0; i <= MAX_KITTIES; i++){
        //     System.out.print(kittens[i].toString());
        // }
        for(Kitten str: kittens){
            System.out.println(str);
        }
     }

    public static void addKitten(Kitten kitten){
        // for(int i = 0; i <= kittens(20); i++){
        //     if kittens(i) == ' '{
        //     }
        // }
        if(kittens.size() <= 20){
            kittens.add(kitten);
        }
    }

    public static void adoptKitten(Kitten kitten){
        // delete kitten from arraylist

    }

    public static void feedKitten(){
        // check if kitten is fed before feeding
    }

    public static void viewKittensByColor(){
        // sort by color
    }

    public static void viewKittensByGender(){
        // sort by gender
    }

}
