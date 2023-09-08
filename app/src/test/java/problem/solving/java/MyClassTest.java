package problem.solving.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyClassTest {

  private MyClass myClass;

  @BeforeEach
  public void setUp() {
    myClass = new MyClass();
  }

  @Test
  public void testAdd() {
    assertEquals(myClass.add(2, 3), 5);
    assertEquals(myClass.add(0, 0), 0);
    assertEquals(myClass.add(-2, -3), -5);
  }

  @Test
  public void testSubtract() {
    assertEquals(myClass.subtract(2, 3), -1);
    assertEquals(myClass.subtract(0, 0), 0);
    assertEquals(myClass.subtract(-2, -3), 1);
  }

  @Test
  public void testMultiply() {
    assertEquals(myClass.multiply(2, 3), 6);
    assertEquals(myClass.multiply(0, 3), 0);
    assertEquals(myClass.multiply(-2, -3), 6);
  }

  @Test
  public void testDivide() {
    assertEquals(myClass.divide(6, 3), 2);
    assertEquals(myClass.divide(0, 1), 0);
  }

  @Test
  public void testDivideByZero() {
    assertThrows(IllegalArgumentException.class, () -> myClass.divide(1, 0));
  }
}
