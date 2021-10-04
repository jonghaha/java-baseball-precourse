package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
	@Test
	void 스트라이크인가() {
		Ball computer = new Ball(1, 3);
		String strike = computer.compareBall(new Ball(1, 3));
		assertThat(strike).isEqualTo("STRIKE");
	}
}
