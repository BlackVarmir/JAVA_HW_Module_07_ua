
import static java.lang.System.out;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbers {
    public static void randomNumbersTask() {
        List<Integer> numbers = new Random().ints(100,-100, 100)
                .boxed()
                .collect(Collectors.toList());
        long positiveCount = numbers.stream().filter(n -> n > 0).count();
        long negativeCount = numbers.stream().filter(n -> n < 0).count();
        long doubleDigitCount = numbers.stream().filter(n -> Math.abs(n) >= 10 && Math.abs(n) < 100).count();
        long mirroredCount = numbers.stream().filter(RandomNumbers::isMirrored).count();

        out.println("Кількість додатних: " + positiveCount);
        out.println("Кількість від’ємних: " + negativeCount);
        out.println("Кількість двозначних: " + doubleDigitCount);
        out.println("Кількість дзеркальних чисел: " + mirroredCount);

    }

    private static boolean isMirrored(int number) {
        String str = String.valueOf(Math.abs(number));
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
