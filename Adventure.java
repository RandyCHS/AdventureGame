import java.util.*;

// What can you add to this example?
// - Create more rooms to explore
// - Add more items that the player can pick up
// - Add the "look" action that lets the player look at something
// - Use inheritance to create an `Item` class that items can inherit from. 
//   You can implement a `look` method for an `Item` that returns a simple description of it.
// - Use inheritance to create a `Scenery` class that locations like the cabin or 
//   basement can inherit from. `Scenery` should have a `look` method that will describe it. 
//   It can also hold items, like an inventory!
// - Use Regular Expressions to make the actions more flexible 
//   (for example, "pry floorboard" works, but "pry floorboards" doesn't!)

public class Adventure {
  Player player;
  String location;
  private Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    Adventure game = new Adventure();
    game.player = new Player();
    game.location = "cabin";
    game.cabin();
  }

  public String prompt(String promptString) {
    System.out.print(promptString);
    return s.nextLine();
  }

  private void cabin() {
    while (true) {
      System.out.println("----");
      System.out.println("You are standing in a small cabin.");
      System.out.println("A loose floorboard creaks under your feet.");

      if (!player.has("crowbar")) {
        System.out.println("There's a crowbar on the floor.");
      }

      String action = prompt("What do you want to do? ");
      switch (action) {
        case "pry floorboard":
          if (player.has("crowbar")) {
            System.out.println(
                "You pry the floorboards up with your crowbar,\nrevealing a ladder into a cool, dark basement.");
            basement();
            return;
          } else {
            System.out.println("You need something to pry it with.");
          }
          break;
        case "floor":
          action = prompt("Do what with the floor? ");
          if (action.equals("pry")) {
            if (player.has("crowbar")) {
              System.out.println(
                  "You pry the floorboards up with your crowbar, revealing a ladder into a cool, dark basement.");
              basement();
              return;
            } else {
              System.out.println("You need something to pry it with.");
            }
            break;
          } else {
            System.out.println("I don't understand...");
          }
          break;
        case "look":
          System.out.println("The lazy game developer hasn't made anything\ncool for you to see...");
          break;
        case "take":
          action = prompt("Take what? ");
          if (action.equals("crowbar") && !player.has("crowbar")) {
            System.out.println("You take the crowbar. It is rusty.");
            player.take("crowbar");
          } else {
            System.out.println("It seems the lazy game developer\nwon't let you take that.");
          }
          break;
        case "take crowbar":
          if (!player.has("crowbar")) {
            System.out.println("You take the crowbar. It is rusty.");
            player.take("crowbar");
          } else {
            System.out.println("You already have that.\nDid you forget already?");
          }
          break;
        case "quit":
          System.out.println("Bye!");
          System.exit(0);
          break;
        default:
          System.out.println("The lazy game developer hasn't taught\nyou how to do that yet...");
          break;
      }
    }
  }

  private void basement() {
    System.out.println("----");
    System.out.println("It seems like there would be something scary down\nhere if the programmer had added it...");
    System.out.println("TO BE CONTINUED");
  }
}