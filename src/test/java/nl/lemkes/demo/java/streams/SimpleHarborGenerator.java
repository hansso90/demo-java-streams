package nl.lemkes.demo.java.streams;

import static nl.lemkes.demo.java.streams.Main.PARKING_NAME_A;
import static nl.lemkes.demo.java.streams.Main.PARKING_NAME_B;
import static nl.lemkes.demo.java.streams.Main.PARKING_NAME_C;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import nl.lemkes.demo.java.streams.infrastructure.Construction;
import nl.lemkes.demo.java.streams.infrastructure.Harbor;
import nl.lemkes.demo.java.streams.traffic.Car;
import nl.lemkes.demo.java.streams.traffic.Color;
import nl.lemkes.demo.java.streams.traffic.DamageReportRecord;
import nl.lemkes.demo.java.streams.traffic.DamageType;

public class SimpleHarborGenerator {

  public static final Harbor getSimpleHarbor() {
    final Harbor harbor =
        Construction.buildHarborWith(
            Construction.buildParkingArea(PARKING_NAME_A, 2, 3),
            Construction.buildParkingArea(PARKING_NAME_B, 5, 6),
            Construction.buildParkingArea(PARKING_NAME_C, 10, 11));

    // Traffic fill the parking areas at this harbor
    final List<Car> cars =
        List.of(
            new Car(1, Color.BLACK, UUID.fromString("e249964d-2f63-4698-8f52-340ffdce4d13"), null),
            new Car(2, Color.SILVER, UUID.fromString("36e0178a-470c-45b1-bfcd-f05e585bbeaa"), null),
            new Car(3, Color.BLACK, UUID.fromString("7bc220e2-8d14-447f-8ce0-b31d4627d7aa"), null),
            new Car(
                4,
                Color.BLUE,
                UUID.fromString("f86be719-6509-4431-b22f-5421229393cd"),
                List.of(
                    new DamageReportRecord(LocalDate.now().minusDays(2), DamageType.DOOR_DAMAGE))),
            new Car(5, Color.RED, UUID.fromString("0c04627e-d80c-4047-b418-17a918c7fc71"), null),
            new Car(6, Color.BLACK, UUID.fromString("7d6cea46-0969-40d9-87f8-fa75ba3dc490"), null),
            new Car(7, Color.BLACK, UUID.fromString("e39330e6-7a73-413f-935d-cb8dbbf5a63c"), null),
            new Car(
                8,
                Color.BLACK,
                UUID.fromString("fd3d5cfa-41df-4dfe-b242-2d20bc6dc96b"),
                List.of(
                    new DamageReportRecord(LocalDate.now().minusDays(15), DamageType.CAR_PAINT))),
            new Car(9, Color.BLUE, UUID.fromString("55ee0a1b-5847-4e01-9612-748120d9893e"), null),
            new Car(10, Color.BLACK, UUID.fromString("ff3e0ace-c110-4e0c-a170-d470d749eb12"), null),
            new Car(
                11,
                Color.WHITE,
                UUID.fromString("b86b1f1c-206b-46c8-b76d-3cb31118dda7"),
                List.of(new DamageReportRecord(LocalDate.now(), DamageType.AIRCO_PROBLEMS))),
            new Car(12, Color.BLACK, UUID.fromString("74f85271-8701-4aff-a48a-8b16fb073202"), null),
            new Car(13, Color.BLACK, UUID.fromString("cb4889d8-f40c-4066-ab90-6a0a71a7db4e"), null),
            new Car(14, Color.WHITE, UUID.fromString("05688062-ceb9-47f2-965e-16fed9602bd3"), null),
            new Car(
                15, Color.SILVER, UUID.fromString("f38e870f-23e1-4ea9-92de-3c543cbd3865"), null),
            new Car(
                16, Color.SILVER, UUID.fromString("e249964d-2f63-4698-8f52-340ffdce4d13"), null));

    harbor.park(cars);

    return harbor;
  }
}
