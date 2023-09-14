package problem.solving.java;

public class Parameterized {

  public <T> T max(T a, T b) {
    boolean areString = a instanceof String && b instanceof String;
    boolean areNumber = a instanceof Integer && b instanceof Integer;

    if (areString) {
      return ((String) a).length() > ((String) b).length() ? a : b;
    } else if (areNumber) {
      return (Integer) a > (Integer) b ? a : b;
    }

    return null;
  }
}
