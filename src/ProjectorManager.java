
import static java.lang.System.out;

import java.util.*;
import java.util.stream.Collectors;

public class ProjectorManager {
    public static void projectorManagerTask() {
        List<Projector> projectors = Arrays.asList(
                new Projector("Projector1", 2020, 500, "Sony"),
                new Projector("Projector2", 2021, 1500, "Epson"),
                new Projector("Projector3", 2024, 300, "Sony")
        );

        out.println("Всі проектори: " + projectors);

        String specifiedManufacturer = "Sony";
        List<Projector> manufacturerProjectors = projectors.stream().filter(p -> p.getManufacturer().equals(specifiedManufacturer)).collect(Collectors.toList());
        out.println("Проектори виробника " + specifiedManufacturer + ": " + manufacturerProjectors);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Projector> currentYearProjectors = projectors.stream().filter(p -> p.getYear() == currentYear).collect(Collectors.toList());
        out.println("Проектори поточного року: " + currentYearProjectors);

        double minPrice = 400;
        List<Projector> expensiveProjectors = projectors.stream().filter(p -> p.getPrice() > minPrice).collect(Collectors.toList());
        out.println("Проектори дорожче " + minPrice + ": " + expensiveProjectors);

        List<Projector> sortedByPriceAsc = projectors.stream().sorted(Comparator.comparing(Projector::getPrice)).collect(Collectors.toList());
        out.println("Проектори за ціною зростання: " + sortedByPriceAsc);

        List<Projector> sortedByPriceDesc = projectors.stream().sorted(Comparator.comparing(Projector::getPrice).reversed()).collect(Collectors.toList());
        out.println("Проектори за ціною спадання: " + sortedByPriceDesc);

        List<Projector> sortedByYearAsc = projectors.stream().sorted(Comparator.comparing(Projector::getYear)).collect(Collectors.toList());
        out.println("Проектори за роком випуску зростання: " + sortedByYearAsc);

        List<Projector> sortedByYearDesc = projectors.stream().sorted(Comparator.comparing(Projector::getYear).reversed()).collect(Collectors.toList());
        out.println("Проектори за роком випуску спадання: " + sortedByYearDesc);
    }
}
