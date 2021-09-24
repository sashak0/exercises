package com.example.exercises;

import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExercisesApplicationTests {

  @RepeatedTest(10)
	void testExponentialBinary() {
    int base = 21; 
    int power = 0;
    while (base + power > 20) {
      base = getRandomInt(0, 20);
      power = getRandomInt(0, 20);
    }
    long expectedResult = (long)Math.pow(base, power);
    long result = ExponentiationBinary.calculate(base, power);
		assert(expectedResult == result);
	}

	private int getRandomInt(int min, int max) {
		Random random = new Random();
		return random.ints(min, max).findFirst().getAsInt();
	}

}
