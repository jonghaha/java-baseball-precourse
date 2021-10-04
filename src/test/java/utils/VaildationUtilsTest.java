package utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VaildationUtilsTest {
	@Test
	void 숫자가_1_9_사이인가() {
		assertThat(VaildationUtils.vaildNumber(0)).isFalse();
		assertThat(VaildationUtils.vaildNumber(10)).isFalse();
		assertThat(VaildationUtils.vaildNumber(1)).isTrue();
		assertThat(VaildationUtils.vaildNumber(9)).isTrue();
	}
}
