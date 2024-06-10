package nl.lemkes.demo.java.streams;

import java.util.List;
import java.util.Map;
import nl.lemkes.demo.java.streams.infrastructure.Construction;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Car;
import nl.lemkes.demo.java.streams.traffic.Color;
import nl.lemkes.demo.java.streams.traffic.DamageReportRecord;
import nl.lemkes.demo.java.streams.traffic.TrafficGenerator;

public class Main {

  public static final String PARKING_NAME_A = "Parking A (Expensive)";
  public static final String PARKING_NAME_B = "Parking B";
  public static final String PARKING_NAME_C = "Parking C (Cheap)";

  public static void main(final String[] args) {

    // Construct me a harbor with three parkingspots
    final Harbor harbor =
        Construction.buildHarborWith(
            Construction.buildParkingArea(PARKING_NAME_A, 25, 50),
            Construction.buildParkingArea(PARKING_NAME_B, 50, 75),
            Construction.buildParkingArea(PARKING_NAME_C, 100, 1000));

    // Traffic fill the parking areas at this harbor
    final List<Car> cars = TrafficGenerator.generateTraffic(200L, 400L);

    harbor.park(cars);

    // System.out.println(harbor);

    System.out.println("-----------------------------------");

    // Give me a report of the harbor
    generatorRapport(harbor);
  }

  public static void generatorRapport(final Harbor harbor) {
    // Exercise 1
    final List<Car> blueCarsAtParkingA = Exercise1.getAllBlueCarsOfParkingA(harbor);
    System.out.println("The blue cars on parking A is:" + blueCarsAtParkingA);

    // Exercise 2
    final Integer totalAmountOfAllCarsAtHarbor = Exercise2.getTotalAmountOfAllCarsOfHarbor(harbor);
    System.out.println("The total amount of all cars: " + totalAmountOfAllCarsAtHarbor);

    // Exercise 3
    final Long totalBlueCarsAtAllParking = Exercise3.getTotalBlueCarsAtAllParking(harbor);
    System.out.println("The total amount of blue cars: " + totalBlueCarsAtAllParking);

    // Exersise 4
    final Map<Color, Long> amountsOfColorsOnParkingArea =
        Exercise4.getAmountsOfColorsOnHarbor(harbor);
    System.out.println("amount of colors on the parking area: " + amountsOfColorsOnParkingArea);

    // Exercise 5
    final DamageReportRecord damageReportRecord =
        Exercise5.getLatestDamageReportRecordOfTheHarbor(harbor);
    System.out.println("Latest damageReport: " + damageReportRecord);

    // Exercise 6
    final List<Exercise6.ParkingAreaStatisticsAdvanced> getParkingAreaStatisticsOfParkingArea =
        Exercise6.getParkingAreaAdvancedStatisticsOfParkingArea(harbor);
    System.out.println("Parking Lot Area Statistics: " + getParkingAreaStatisticsOfParkingArea);
  }
}
