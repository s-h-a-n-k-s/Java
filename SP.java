class StringProcessing {
	public void WordCount (String message) {
		// System.out.println(message.split(" ").length);
		int word = 1;

		for (int i = 0; i < (message.length() - 1); i += 1) {
			
			if (message.substring(i, (1 + i)).equals(" ")) {
				word += 1;
			}
		}

		System.out.println(word);
	}

	public void printWords (String messageParam) {
		String word = "";
		String message = messageParam + " ";

		for (int i = 0; i < (message.length()); i += 1) {
			
			if (message.substring(i, (1 + i)).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word = word + message.substring(i, (1 + i));
			}
		}
	}

	public void printWordsBackwards (String messageParam) {
		String word = "";
		String printValue = "";
		String message = messageParam + " ";

		for (int i = 0; i < (message.length()); i += 1) {
			
			if (message.substring(i, (1 + i)).equals(" ")) {
				printValue = word + " " + printValue;
				word = "";
			} else {
				word = word + message.substring(i, (1 + i));
			}
		}

		// System.out.println(printValue);
		String printWord = "";

		for (int a = 0; a < (printValue.length()); a += 1) {
			
			if (printValue.substring(a, (1 + a)).equals(" ")) {
				System.out.println(printWord);
				printWord = "";
			} else {
				printWord = printWord + printValue.substring(a, (1 + a));
			}
		}
	}

	public void printWordsReversed (String messageParam) {
		String word = "";
		String printValue = "";
		String message = " " + messageParam;

		for (int i = message.length(); i>=1; i--) {
			if (message.substring((i - 1), i).equals(" ")) {
				printValue = printValue + word + " ";
				word = "";
			} else {
				word = word + message.substring((i - 1), i);
			}
		}

		System.out.println(printValue);
	}

	public void removeDuplicates (String messageParam) {
		String word = "";
		String message = messageParam + " ";
		String newMessage = "";

		// for (int i = 0; i < (message.length()); i += 1) {

		// 	if (message.substring(i, (1 + i)).equals(" ")) {
		// 		for (int a = 0; a < message.length(); a += 1) {
		// 			if (message.substring(a, (a + 1)).equals(word.substring(0, 1))) {
		// 				if (message.substring(a, (a + word.length())).equals(word)) {

		// 				} else {
		// 					newMessage = newMessage + word;
		// 				}
		// 			} else {
		// 				a = word.length() + a;
		// 				newMessage = newMessage + word;
		// 			}
		// 		}
		// 		word = "";
		// 	} else {
		// 		word = word + message.substring(i, (1 + i));
		// 	}
		// }

		// for (int i = 0; i < (message.length()); i += 1) {
			
		// 	if (message.substring(i, (1 + i)).equals(" ")) {
		// 		System.out.println("First Equals");
		// 		// System.out.println(word);

		// 		for (int a = 0; a <= newMessage.length(); a += 1) {
		// 			System.out.println("LOOP");
		// 			if (newMessage.length() > (a + 1)) {
		// 				if (newMessage.substring((a), (a + 1)).equals(word.substring(0, 1))) {
		// 					System.out.println("Equals");
		// 					// System.out.println(word);
		// 					// word = "";
		// 				} else {
		// 					// word = word + newMessage.substring(a, (1 + a));
		// 					newMessage = newMessage + word;
		// 				}
		// 			} else {
		// 				newMessage = newMessage + word;
		// 			}
		// 		}

		// 		word = "";
		// 	} else {
		// 		word = word + message.substring(i, (1 + i));
		// 	}
		// }

		// // newMessage = word;

		// System.out.println("NM: " + newMessage);

		// for (int i = 0; i < (message.length()); i += 1) {
			
		// 	if (message.substring(i, (1 + i)).equals(" ")) {
		// 		if (newMessage.length() > 0) {
		// 			for (int a = 0; a < (newMessage.length() - 1); a++) {
		// 				if (message.substring(i, (i + 1)).equals(word.substring(a, (a + 1)))) {
		// 					System.out.println("LETTER MATCHES");
		// 					// if (message.substring(i, (i + word.length())).equals(word.substring(a, (a + word.length())))) {

		// 					// } else {
		// 					// 	newMessage = newMessage + word;
		// 					// }
		// 				}
		// 			}

		// 		} else {
		// 			newMessage = newMessage + word;
		// 		}

		// 		word = "";
		// 	} else {
		// 		word = word + message.substring(i, (1 + i));
		// 	}

		// }

		// System.out.println(newMessage);

		

		// LOOP THROUGH MESSAGE PARAM
		// GET WORD
		// IF NEWMESSAGE LENGTH IS MORE THAN 0
			// LOOP THROUGH NEWMESSAGE
			// IF MESSAGE[0] == WORD[0]
				// IF MESSAGE[I:WORD.LENGTH()] != WORD
					// ADD WORD TO NEW MESSAGE
		// ELSE ADD WORD TO NEW MESSAGE

		// 2 functions - first function find the word; second function check if the word already exists in the new string
	}
}

class SP {
	public static void main (String xyz[]) {
		StringProcessing s = new StringProcessing();
		// s.printWords("Shafeeq is back");
		// System.out.println(" ");
		// s.printWordsBackwards("Shafeeq is back");
		// System.out.println(" ");
		// s.printWordsReversed("Shafeeq is back");
		// System.out.println(" ");

		s.removeDuplicates("Shafeeq is Shafeeq is Shafeeq");
		System.out.println(" ");
	}
}