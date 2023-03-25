package no.navnesen;

import org.junit.jupiter.api.Test;

import static no.navnesen.Raise.raise;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RaiseTest {
	@Test
	public void raises() {
		assertThrows(
			Exception.class,
			() -> raise(new Exception("hello")),
			"hello"
		);
	}
}