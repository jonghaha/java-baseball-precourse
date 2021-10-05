package utils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class VaildationUtils {
	private final int INPUT_MAX_LENGTH = 3;
	private final String REGEX = "[0-9]+";

	public List<Integer> validNumber(String userValue) {
		isThreeDigit(userValue);
		isNumber(userValue);
		return isOverlap(userValue);
	}

	/*
	* 세자리 숫자 검증
	* */
	public void isThreeDigit(String userValue) {
		if (userValue.length() != INPUT_MAX_LENGTH) {
			throw new IllegalArgumentException("[ERROR] 세자리 숫자가 아닙니다.");
		}
	}

	/*
	* 숫자 및 1~9 숫자 검증
	* */
	public void isNumber(String userValue) {
		if (!userValue.matches(REGEX)) {
			throw new IllegalArgumentException("[ERROR] 문자는 입력할 수 없고 1 ~ 9 사이의 숫자만 입력해주세요.");
		}
	}

	/*
	* 중복 검증
	* */
	public List<Integer> isOverlap(String userValue) {
		Set<Integer> userNumber = separateNumber(userValue);
		if (userNumber.size() != INPUT_MAX_LENGTH) {
			throw new IllegalArgumentException("[ERROR] 중복되는 수가 있습니다.");
		}

		return new ArrayList<>(userNumber);
	}

	/*
	 * 숫자로 분리하여 Set으로 변환
	 * */
	private Set<Integer> separateNumber(String userValue) {
		int inputValue = Integer.parseInt(userValue);
		Set<Integer> inputNumber = new LinkedHashSet<>();

		inputNumber.add(inputValue / 100); // 100의 자리
		inputNumber.add((inputValue % 100) / 10); // 10의 자리
		inputNumber.add(inputValue % 10); // 1의 자리

		return inputNumber;
	}
}
