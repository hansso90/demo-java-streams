package nl.lemkes.demo.java.streams.traffic;

import nl.lemkes.demo.java.streams.util.RandomUtil;

public enum Color {
  BLUE,
  RED,
  ORANGE,
  WHITE,
  BLACK,
  SILVER;

  public static Color getRandomColor() {
    final int x = RandomUtil.nextInt(Color.values().length);
    return Color.values()[x];
  }
}
