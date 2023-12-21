package ua.com.fm.anagrams;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a word or sentence to reverse it: ");
		Reverse.reverseEachWord(sc.nextLine());
		System.out.println("\nWrite a word or sentence to reverse it: ");
		Reverse.reverseEachWord(sc.nextLine());
		sc.close();
	}

}
