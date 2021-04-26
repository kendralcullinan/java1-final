import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String menuTitle = "Main Menu";
        String prompt = "Select an option:";
        String[] menuOptions = {
            "See Kittens",
            "Add a Kitty Cat",
            "Adopt Kittens",
            "Feed Kittens",
            "Name Kittens",
            "Get number of Kitties",
            "View Kitties by Gender",
            "View Kitties by Color"

        };
        int choice = 0;
        while (true) {
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            UIUtility.showSectionTitle(menuOptions[Integer.valueOf(choice) - 1]);
            switch (choice) {
                case 1:
                    Litter.viewKittens();
                    break;
                case 2:
                    addKitten(scanner);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                
            }
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
    
    public static void addKitten(Scanner scanner){
        String kittenName = Helpers.input(scanner, "Enter the kitty's name: ");
        String kittenGender= Helpers.input(scanner, "Enter the kitty's gender: ");
        String kittenBirthDate = Helpers.input(scanner, "Enter the kitty's birthday!: ");
        String kittenNumKittens = Helpers.input(scanner, "How many kittens has the kitty had? ");
        int numKittensInt = UIUtility.validateIntInput(kittenNumKittens, 12, scanner);
  
        String kittenFed= Helpers.input(scanner, "Has the kitten been fed? [1 - Yes! or 2 - Nope]");
        boolean fedBool = kittenFed.equals("1") || kittenFed.toLowerCase().charAt(0) == 'y' ? true : false;
        Kitten kitten = new Kitten();
        kitten.setName(kittenName);
        kitten.setGender(kittenGender);
        kitten.setBirthDate(kittenBirthDate);
        kitten.setNumKittens(kittenNumKittens);
        kitten.setFed(kittenFed);
        Litter.addKitten(kitten);
        System.out.println("/nKitten added!!!!");
        UIUtility.pressEnterToContinue(scanner);
    }
}