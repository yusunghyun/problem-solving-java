package problem.solving.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyClassTest {

  @Test
  public void testSubtract() {
    MyClass myClass = new MyClass();
    int result = myClass.subtract(10, 3);
    assertEquals(7, result);
  }
}
