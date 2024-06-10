package nl.lemkes.demo.java.streams.util;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {
  private static Random random = new Random();

  public static int nextInt(final int max) {
    return random.ints(0, max).findFirst().getAsInt();
  }

  public static int nextInt(final int min, final int max) {
    return random.ints(min, max).findFirst().getAsInt();
  }

  public static long nextLong(final long min, final long max) {
    return random.longs(min, max).findFirst().getAsLong();
  }

  public static LocalDate randomLocalDate() {
    final Long now = LocalDate.now().toEpochDay();
    final Long past = LocalDate.now().minusYears(24).toEpochDay();
    final long randomDayInLong = ThreadLocalRandom.current().nextLong(past, now);
    return LocalDate.ofEpochDay(randomDayInLong);
  }
}
