
import static java.lang.System.out;

import java.util.*;
import java.util.stream.Collectors;

public class DeviceManager {
    public static void deviceManagerTask(){
        List<Device> devices = Arrays.asList(
                new Device("Device1", 2020, 500, "Black", "Laptop"),
                new Device("Device2", 2021, 1500, "White", "Smartphone"),
                new Device("Device3", 2022, 300, "Black", "Tablet")
        );

        out.println("Всі пристрої: " + devices);
        List<Device> blackDevices = devices.stream().filter(d -> d.getColor().equals("Black")).collect(Collectors.toList());
        out.println("Пристрої чорного кольору: " + blackDevices);

        int specifiedYear = 2021;
        List<Device> devicesOfYear = devices.stream().filter(d -> d.getYear() == specifiedYear).collect(Collectors.toList());
        out.println("Пристрої " + specifiedYear + " року: " + devicesOfYear);

        double minPrice = 400;
        List<Device> expensiveDevices = devices.stream().filter(d -> d.getPrice() > minPrice).collect(Collectors.toList());
        out.println("Пристрої дорожче " + minPrice + ": " + expensiveDevices);

        String specifiedType = "Laptop";
        List<Device> devicesOfType = devices.stream().filter(d -> d.getType().equals(specifiedType)).collect(Collectors.toList());
        out.println("Пристрої типу " + specifiedType + ": " + devicesOfType);

        int startYear = 2020, endYear = 2022;
        List<Device> devicesInRange = devices.stream().filter(d -> d.getYear() >= startYear && d.getYear() <= endYear).collect(Collectors.toList());
        out.println("Пристрої між " + startYear + " і " + endYear + " роками: " + devicesInRange);
    }
}