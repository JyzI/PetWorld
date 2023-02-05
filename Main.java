import java.util.Scanner; // used to get user input
import java.util.Arrays; // used to resolve arrays

class Main { //replit runs the code from Main.java so this class must be used
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

class Pet { // this class is used to create objects, while also defining datat types and methods.
  private String type; // creating type instance
  private String name; // creating type instance

  public Pet(String type, String name) {
    this.type = type; // created a constructor for Pet with the type and name values
    this.name = name;
  }

  public String getType() { // used to retrieve the type
    return type;
  }

  public String getName() { // used to get the name
    return this.name;
  }

  public void setName(String name) { //used to set the name from user input
    this.name = name;
  }
  
  private void strokePet() { // used to apply the action and response from user input of selecting 1.
    System.out.println("Ohhh, look who's a good " + type + "!");
  }

  private void playFetch() { // used to apply the action and response from user input of selecting 2.
    System.out.println("Get it " + name + " get it!");
    System.out.println("Good "+ type + " Now bring it back to me!");
    System.out.println("No, to me!");
  }
  
  private void feedPet() { // used to apply the action and response from user input of selecting 3.
    System.out.println("There you go buddy, now you should be good for a while!");
  }
  
  private void bedTime() { // used to apply the action and response from user input of selecting 4.
    System.out.println("Good Night " + name + "! Sweet dreams and see you in the morning!");
    System.exit(0); // This took me a long time to discover, but this closes the program.
  }

  private void defaultTrig() { //used for input validation for whenever anything other that 1-4 is selected
    System.out.println("Your " + type + " doesn't know that trick!");
  }
}

// this class is used to define dog and extend it into the Pet class
class Dog extends Pet {
  public Dog(String name) {
    super("dog", name); // This is using the argument name to associate the name associated with the pet and type
  }
}

// this class is used to define cat and extend it into the Pet class
class Cat extends Pet {
  public Cat(String name) {
    super("cat", name); // This is using the argument name to associate the name associated with the pet and type
  }
}
System.out.println("Hello!"); // This is where the program officially starts, which is began with a greeting for the user
System.out.println("Are you interested in a new dog or cat?"); //this is where the user is presented with the option to say yes or no
String[][] board = {{" /\\_/\\    /\\_/\\"}, // a fun display was provided to make the program a little more pleasant
                    {"( ^.^ )  ( v.v )"}};
          // The leading tab chars (\t) indent the board 
System.out.println("\t" + Arrays.toString(board[0]));
System.out.println("\t" + Arrays.toString(board[1])); // this was inspired by the Tic-Tac-Toe program provided through the course
String answer = scanner.nextLine(); // scanner is used to grab user input
if (answer.equalsIgnoreCase("yes")) { //this if statement is looking specifically for a 'yes' answer.
  System.out.println("Wonderful, which one would you like?"); // if yes is executed as a response, the user will be asked for which type, dog or cat.
  String petType = scanner.nextLine(); // an additional user input is then requested, seeking dog or cat.
  Pet pet; // this is where the Pet class is used
  if (petType.equalsIgnoreCase("dog")) { // this is where dog is extended into the pet class
    System.out.println("What would you like to name your new dog?");
    String petName = scanner.nextLine(); // this seeks the user input to provide the associated pet with a name.
    pet = new Dog(petName);
      while (true) { // after a name as been provided, the user is then provided with 4 options, technically 5 though because of input validation with default.
        System.out.println("How would you like to care for your new pet?");
        System.out.println("1. Stroke"); 
        System.out.println("2. Play Fetch");
        System.out.println("3. Fill their food and water bowl");
        System.out.println("4. Get ready for bed to prepare for another day in paradise"); 
        int action = scanner.nextInt(); // users can then utilize 1, 2, 3, or 4 to perform an action with their pet. However, a default option is provided for anything other.
        scanner.nextLine();
        switch (action) {
          case 1:
            pet.strokePet();
            break;
          case 2:
            pet.playFetch();
            break;
          case 3:
            pet.feedPet();
            break;
          case 4:
            pet.bedTime();
            break;
          default:
            pet.defaultTrig();
        }
      }
  } else if (petType.equalsIgnoreCase("cat")) { //this is where cat is extended into the Pet class
    System.out.println("What would you like to name your new cat?");
    String petName = scanner.nextLine();
    pet = new Cat(petName);
      while (true) {
        System.out.println("How would you like to care for your new pet?");
        System.out.println("1. Stroke");
        System.out.println("2. Play fetch");
        System.out.println("3. Fill their food and water bowl");
        System.out.println("4. Get ready for bed to prepare for another day in paradise");
        int action = scanner.nextInt();
        scanner.nextLine();
        switch (action) {
          case 1: //a case label is assigned to each action
            pet.strokePet();
            break;
          case 2:
            pet.playFetch();
            break;
          case 3:
            pet.feedPet();
            break;
          case 4:
            pet.bedTime();
            break;
          default: //this default action will be used as a response for anything other than 1-4 being input
            pet.defaultTrig(); // when I attempted to use break;, it would not allowed case 4 to execute properly. This still works.
          }
        }
      } else {
        System.out.println("Sorry, we only have dogs and cats available"); //This is used if a user mistypes or asks for any other pet type available
      }
    } else if (answer.equalsIgnoreCase("no")) { // if the user decides they do not want a pet, they will be provided with this response and will have to re-run the program.
      System.out.println("Such a shame, please come back if you reconsider");
    } else {
      System.out.println("My apologies, but in order to move forward, we require a yes or no response."); //if anything else other than yes or no is input, they will be provided with this response and will have to re-run the program
    }
  }
}
