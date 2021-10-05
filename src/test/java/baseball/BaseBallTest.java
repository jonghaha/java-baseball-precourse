package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseBallTest {
	List<Ball> comBall = new ArrayList<>();
	BaseBall computer;

	@BeforeEach
	void init() {
		comBall.add(new Ball(1, 3));
		comBall.add(new Ball(2, 5));
		comBall.add(new Ball(3, 2));
		computer = new BaseBall(comBall);
	}

	@Test
	void 원스트라이크_확인() {
		computer.playBall(new Ball(2, 5));
		assertThat(computer.getStrike()).isEqualTo(1);
	}

	@Test
	void 원볼_확인() {
		computer.playBall(new Ball(2, 3));
		assertThat(computer.getBall()).isEqualTo(1);
	}

	@Test
	void 낫싱_확인() {
		computer.playBall(new Ball(1, 8));
		computer.playBall(new Ball(2, 7));
		computer.playBall(new Ball(3, 9));
		assertThat(computer.getBall()).isEqualTo(0);
		assertThat(computer.getStrike()).isEqualTo(0);
	}
}
