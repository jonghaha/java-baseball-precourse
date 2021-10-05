package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VaildationUtilsTest {
	VaildationUtils vaildationUtils = new VaildationUtils();

	@Test
	void 세자리_숫자인가() {
		String userInput = "12345";

		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			vaildationUtils.isThreeDigit(userInput);
		}).withMessageContaining("[ERROR] 세자리 숫자가 아닙니다.");
	}

	@Test
	void 숫자이면서_1_9_사이인가() {
		String userInput = "가나다";

		assertThatIllegalArgumentException().isThrownBy(() -> {
			vaildationUtils.isNumber(userInput);
		}).withMessageContaining("[ERROR] 문자는 입력할 수 없고 1 ~ 9 사이의 숫자만 입력해주세요.");
	}

	@Test
	void 중복이있는가() {
		String userInput = "111";

		assertThatIllegalArgumentException().isThrownBy(() -> {
			vaildationUtils.isOverlap(userInput);
		}).withMessageContaining("[ERROR] 중복되는 수가 있습니다.");
	}
}
