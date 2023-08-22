package test.java.problem.solving.java;

import org.junit.jupiter.api.Test;

import main.java.problem.solving.java.MyClass;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {

    @Test
    public void testSubtract() {
        MyClass myClass = new MyClass();
        int result = myClass.subtract(10, 3);
        assertEquals(7, result);
    }
}
