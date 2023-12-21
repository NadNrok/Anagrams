package ua.com.fm.anagrams;

public class Reverse {

	public static String reverseStr(String incomingStr) {

		char[] letters = incomingStr.toCharArray();
		int lettersEnd = letters.length - 1;
		for (int el = 0; el < lettersEnd;) {
			if (Character.isLetter(letters[el]) & Character.isLetter(letters[lettersEnd])) {
				char temp = letters[el];
				letters[el] = letters[lettersEnd];
				letters[lettersEnd] = temp;
				lettersEnd--;
				el++;
			} else if (!Character.isLetter(letters[lettersEnd])) {
				lettersEnd--;
			} else if (!Character.isLetter(letters[el])) {
				el++;

			}
		}
		return String.valueOf(letters);

	}

	public static String reverseEachWord(String incomingStr) {
		String[] words = incomingStr.split(" ");
		StringBuilder receivedStr = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			receivedStr.append(reverseStr(words[i]));
			if (i < words.length - 1) {
				receivedStr.append(" ");
			}
		}
		return receivedStr.toString();

	}

}