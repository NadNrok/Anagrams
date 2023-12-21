package ua.com.fm.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void testReverseEachWord() {

		assertEquals("d1cba hgf!e", Reverse.reverseEachWord("a1bcd efg!h"));
	}

	@Test
	void testReverseStr() {
		assertEquals("d1cba", Reverse.reverseStr("a1bcd"));
	}

	@Test
	void testReverseEachWordWithNull() {
		assertThrows(IllegalArgumentException.class, () -> Reverse.reverseEachWord(null));
	}

	@Test
	void testReverseEachWordWithEmptyString() {
		assertEquals("", Reverse.reverseEachWord(""));
	}

	@Test
	void testReverseEachWordWithSingleSpaceInput() {
		assertEquals(" ", Reverse.reverseEachWord(" "));
	}

	@Test
	void testReverseEachWordWithSeveralSpacesInput() {
		assertEquals("   ", Reverse.reverseEachWord("   "));
	}

	@Test
	void testReverseEachWordWithSingleCharacterInput() {
		assertEquals("a", Reverse.reverseEachWord("a"));
	}

	@Test
	void testReverseEachWordWithMultipleSameLetterInput() {
		assertEquals("aaa", Reverse.reverseEachWord("aaa"));
	}

	@Test
	void testReverseEachWordWithMixedCaseInput() {
		assertEquals("Aa", Reverse.reverseEachWord("aA"));
	}

	@Test
	void testReverseEachWordWithDifferentLettersInput() {
		assertEquals("cba", Reverse.reverseEachWord("abc"));
	}

	@Test
	void testReverseEachWordWithOnlySymbolsInput() {
		assertEquals("!@#$", Reverse.reverseEachWord("!@#$"));
	}

	@Test
	void testReverseEachWordWithSeveralWordsInput() {
		assertEquals("dcba hgfe", Reverse.reverseEachWord("abcd efgh"));
	}
}
