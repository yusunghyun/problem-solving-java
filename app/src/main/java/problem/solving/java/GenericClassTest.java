package problem.solving.java;

public class GenericClassTest {

  public static void main(String[] args) {
    Parameterized gc = new Parameterized();

    System.out.println(gc.max(5, 4));
    System.out.println(gc.max(1, 2));
    System.out.println(gc.max("Data", "Structure"));
  }
}
