
import static java.lang.System.out;

import java.util.*;
import java.util.stream.Collectors;

public class Products {
    public static void productsTask() {
        List<String> products = Arrays.asList("Молоко", "Хліб", "Яйця", "Сир", "Молоко", "Масло", "Йогурт", "Молоко");
        String userInput = "Молоко";
        char startingLetter = 'М';

        out.println("Всі продукти: " + products);
        List<String> shortNames = products.stream().filter(p -> p.length() < 5).collect(Collectors.toList());
        out.println("Продукти з назвою менше п'яти символів: " + shortNames);

        long productCount = products.stream().filter(p -> p.equals(userInput)).count();
        out.println("Кількість продуктів з назвою \"" + userInput + "\": " + productCount);

        List<String> startingWithLetter = products.stream().filter(p -> p.charAt(0) == startingLetter).collect(Collectors.toList());
        out.println("Продукти, що починаються на \"" + startingLetter + "\": " + startingWithLetter);

        List<String> milkCategory = products.stream().filter(p -> p.equals("Молоко")).collect(Collectors.toList());
        out.println("Продукти із категорії «Молоко»: " + milkCategory);
    }
}
