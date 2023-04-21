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
}
