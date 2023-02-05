import java.util.Scanner;
import java.util.Arrays;

class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

class Pet {
  private String type;
  private String name;

  public Pet(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  private void strokePet() {
    System.out.println("Ohhh, look who's a good " + type + "!");
  }

  private void playFetch() {
    System.out.println("Get it " + name + " get it!");
    System.out.println("Good "+ type + " Now bring it back to me!");
    System.out.println("No, to me!");
  }
  
  private void feedPet() {
    System.out.println("There you go buddy, now you should be good for a while!");
  }
  
  private void bedTime() {
    System.out.println("Good Night " + name + "! Sweet dreams and see you in the morning!");
    System.exit(0); // This took me a long time to discover, but this closes the program.
  }

  private void defaultTrig() {
    System.out.println("Your " + type + " doesn't know that trick!");
  }
}

class Dog extends Pet {
  public Dog(String name) {
    super("dog", name);
  }
}

class Cat extends Pet {
  public Cat(String name) {
    super("cat", name);
  }
}
System.out.println("Hello!");
System.out.println("Are you interested in a new dog or cat?");
String[][] board = {{" /\\_/\\    /\\_/\\"},
                    {"( ^.^ )  ( v.v )"}};
          // The leading tab chars (\t) indent the board 
System.out.println("\t" + Arrays.toString(board[0]));
System.out.println("\t" + Arrays.toString(board[1]));
String answer = scanner.nextLine();
if (answer.equalsIgnoreCase("yes")) {
  System.out.println("Wonderful, which one would you like?");
  String petType = scanner.nextLine();
  Pet pet;
  if (petType.equalsIgnoreCase("dog")) {
    System.out.println("What would you like to name your new dog?");
    String petName = scanner.nextLine();
    pet = new Dog(petName);
      while (true) {
        System.out.println("How would you like to care for your new pet?");
        System.out.println("1. Stroke");
        System.out.println("2. Play Fetch");
        System.out.println("3. Fill their food and water bowl");
        System.out.println("4. Get ready for bed to prepare for another day in paradise");
        int action = scanner.nextInt();
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
  } else if (petType.equalsIgnoreCase("cat")) {
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
      } else {
        System.out.println("Sorry, we only have dogs and cats available");
      }
    } else if (answer.equalsIgnoreCase("no")) {
      System.out.println("Such a shame, please come back if you reconsider");
    } else {
      System.out.println("My apologies, but in order to move forward, we require a yes or no response.");
    }
  }
}
