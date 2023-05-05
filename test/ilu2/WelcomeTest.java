package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	@Test
	void exigence1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
		assertEquals(Welcome.welcome("Bob"), "Hello, Bob");
	}
	
	@Test
	void exigence2() {
		assertEquals(Welcome.welcome(null), "Hello, my friend");
		assertEquals(Welcome.welcome(""), "Hello, my friend");
		assertEquals(Welcome.welcome("  "), "Hello, my friend");
	}
	
	@Test
	void exigence3() {
		assertEquals(Welcome.welcome("JERRY"), "HELLO, JERRY !");
	}
	
	@Test
	void exigence4() {
		assertEquals(Welcome.welcome("amy,bob"), "Hello, Amy, Bob");
		assertEquals(Welcome.welcome("amy, bob"), "Hello, Amy, Bob");
	}
	
	@Test
	void exigence5() {
		assertEquals(Welcome.welcome("Amy,bob,jerry"), "Hello, Amy, Bob, Jerry");
		assertEquals(Welcome.welcome("Amy,bob,jerry,martin"), "Hello, Amy, Bob, Jerry, Martin");

	}
	
	@Test
	void exigence6() {
		assertEquals(Welcome.welcome("Amy, BOB, jerry"), "Hello, Amy, Jerry. AND HELLO, BOB !");
	}
}
