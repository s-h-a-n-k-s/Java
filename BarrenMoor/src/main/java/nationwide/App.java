package nationwide;

import java.util.Scanner;

public final class App {

	private static Scanner scanner = new Scanner(System.in);

	private static int playerHorizontalPosition = (int) (Math.random() * 20 + 1);
	private static int playerVerticalPosition = (int) (Math.random() * 20 + 1);

	private static int treasureHorizontalPosition = (int) (Math.random() * 20 + 1);
	private static int treasureVerticalPosition = (int) (Math.random() * 20 + 1);

	private static int handOfGodHorizontalPosition = (int) (Math.random() * 20 + 1);
	private static int handOfGodVerticalPosition = (int) (Math.random() * 20 + 1);

	private static int tadasPresentationHorizontalPosition = (int) (Math.random() * 20 + 1);
	private static int tadasPresentationVerticalPosition = (int) (Math.random() * 20 + 1);

	private static boolean gameFinished = false;
    public static void main(String[] args) {
		System.out.println("You awaken to find yourself in a barren moor. You're holding a compass. There's probably some treasure around here somewhere. Type 'look' to look around.");
		System.out.println(treasureVerticalPosition + " " + playerVerticalPosition);

		while(!gameFinished) {
			String input = scanner.next();
			useInput(input);
		}
	}
	
	private static void useInput(String input) {
		switch (input.toLowerCase()) {
			case "look": System.out.println("You see mist. It's unhelpful."); System.out.println("Type 'north', 'south', 'east' or 'west' to move around."); break;

			case "north":
				playerVerticalPosition += 1;
				playerMoved("north");
				break;
				
			case "south":
				playerVerticalPosition -= 1;
				playerMoved("south");
				break;
				
			case "east":
				playerHorizontalPosition += 1;
				playerMoved("east");
				break;
				
			case "west":
				playerHorizontalPosition -= 1;
				playerMoved("west");
				break;

			case "help": System.out.println("Type 'north', 'south', 'east' or 'west' to move around. This isn't exactly rocket science, is it?"); break;

			default:
				System.out.println("That input wasn't recognised. Type 'help' - you could use some.");
		}
	}

	private static void printMovementHint(String direction) {
		if (direction == "north") {
			if (playerVerticalPosition > treasureVerticalPosition) {
				System.out.println("You're going the wrong way. Probably.");
			} else {
				System.out.println("If there's any light at the end of this tunnel, it's this way.");
			}
		}

		if (direction == "south") {
			if (playerVerticalPosition < treasureVerticalPosition) {
				System.out.println("You're going the wrong way. Probably.");
			} else {
				System.out.println("If there's any light at the end of this tunnel, it's this way.");
			}
		}

		if (direction == "east") {
			if (playerHorizontalPosition > treasureHorizontalPosition) {
				System.out.println("You're going the wrong way. Probably.");
			} else {
				System.out.println("If there's any light at the end of this tunnel, it's this way.");
			}
		}

		if (direction == "west") {
			if (playerHorizontalPosition < treasureHorizontalPosition) {
				System.out.println("You're going the wrong way. Probably.");
			} else {
				System.out.println("If there's any light at the end of this tunnel, it's this way.");
			}
		}

		System.out.println("PLAYER: " + playerHorizontalPosition + " " + playerVerticalPosition);
		System.out.println("TREASURE: " + treasureHorizontalPosition + " " + treasureVerticalPosition);
		System.out.println("HAND OF GOD: " + handOfGodHorizontalPosition + " " + handOfGodVerticalPosition);
	}

	private static void playerMoved(String direction) {
		if (playerHorizontalPosition == treasureHorizontalPosition && playerVerticalPosition == treasureVerticalPosition) {
			gameFinished = true;
			System.out.println("");
			System.out.println("Congratulations! You found the treasure.");
			System.out.println("");
			System.out.println("You sweep the dirt off the top of the treasure chest and pull it up out of the ground.");
			System.out.println("Using all of your strength, you pry open the lid.");
			System.out.println("Inside, you find a note. It reads: 'Did you have a credit card before the year 2003? You may have inadvertently taken out Payment Protection Insurance. Call the PPI guys today to reclaim thousands!'");
		} else if (playerHorizontalPosition == handOfGodHorizontalPosition && playerVerticalPosition == handOfGodVerticalPosition) {
			gameFinished = true;
			System.out.println("");
			System.out.println("You've been smited by the hand of God.");
			System.out.println("Don't read too much into this, but maybe it's time to start going to church?");
			System.out.println("Try again. Or don't. I'm a terminal, I can't tell you what to do.");
		} else if (playerHorizontalPosition == tadasPresentationHorizontalPosition && playerVerticalPosition == tadasPresentationVerticalPosition) {
			gameFinished = true;
			System.out.println("");
			System.out.println("You've stumbled upon Tadas giving a presentation on Linux out in the swamps.");
			System.out.println("You instantly die of boredom.");
		} else {
			printMovementHint(direction);
			printRandomEncouragement(direction);
		}
	}

	private static void printRandomEncouragement(String direction) {
		int number = (int) (Math.random() * 10 + 1);

		switch (number) {
			case 1: System.out.println("Look at you go!"); break;
			case 2: System.out.println("Ooh, " + direction + "! Get you!"); break;
			case 3: System.out.println("The last player went " + direction + " once... it didn't go well."); break;
			case 4: System.out.println("Have you considered going the opposite way?"); break;
			case 5: System.out.println("Are you determined to die out here?"); break;
			case 6: System.out.println("There's TREASURE out here! Go find it!!"); break;
			case 7: System.out.println("If you go north you'll find a sandwich."); break;
			case 8: System.out.println("You probably shouldn't listen to these hints."); break;
			case 9: System.out.println("Is this treasure really /that/ important to you?"); break;
			case 10: System.out.println("I don't know about you, but I'm lost."); break;
		}
	}
}
