package nl.lemkes.demo.java.streams.infrastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import nl.lemkes.demo.java.streams.util.RandomUtil;

public class Construction {

  public static Harbor buildHarborWith(final ParkingArea... parkingAreas) {
    return new Harbor(Arrays.asList(parkingAreas));
  }

  public static ParkingArea buildParkingArea(
      final String name, final Integer minSpots, final Integer maxSpots) {
    return new ParkingArea(
        name,
        RandomUtil.nextInt(minSpots, maxSpots),
        Collections.synchronizedList(new ArrayList<>()));
  }
}
