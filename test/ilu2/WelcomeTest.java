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
	
	/* @Test
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
		assertEquals(Welcome.welcome("Amy, BOB, jerry, MARTIN"), "Hello, Amy, Jerry. AND HELLO, BOB, MARTIN !");
	}
	*/
	
	@Test
	void exigence7() {
		assertEquals(Welcome.welcome("bob, amy, jerry"), "Hello, Bob, Amy and Jerry");
		assertEquals(Welcome.welcome("bob, AMY, jerry, JACK"), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
		assertEquals(Welcome.welcome("AMY, bob, jerry, JACK"), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
	}
	
	@Test
	void exigence8() {
		assertEquals(Welcome.welcome("bob      , amy "), "Hello, Bob and Amy");
		assertEquals(Welcome.welcome("bob      ,          amy           , jon"), "Hello, Bob, Amy and Jon");
	}
	
	@Test
	void exigence9() {
		assertEquals(Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob"), "Hello, Bob (x3) and Amy. AND HELLO, JERRY (x2) !");
		assertEquals(Welcome.welcome("BOB, JERRY, amy, BOB, JERRY, bob"), "Hello, Amy. AND HELLO, BOB (x3) AND JERRY (x2) !");
		assertEquals(Welcome.welcome("MARTIN, JERRY, BOB, bob, marie, amy, AMY"), "Hello, Marie and Amy (x2). AND HELLO, MARTIN, JERRY AND BOB (x2) !");
		assertEquals(Welcome.welcome("MARTIN, amy, amy"), "Hello, Amy (x2). AND HELLO, MARTIN !");
	}
}
