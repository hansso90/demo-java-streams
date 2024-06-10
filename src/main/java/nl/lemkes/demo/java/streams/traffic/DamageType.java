package nl.lemkes.demo.java.streams.traffic;

import nl.lemkes.demo.java.streams.util.RandomUtil;

public enum DamageType {
  CAR_PAINT,
  DOOR_DAMAGE,
  AIRCO_PROBLEMS,
  WINDOW_BROKEN;

  public static DamageType getRandomDamage() {
    final int x = RandomUtil.nextInt(DamageType.values().length);
    return DamageType.values()[x];
  }
}
