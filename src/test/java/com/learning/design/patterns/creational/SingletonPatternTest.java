package com.learning.design.patterns.creational;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class SingletonPatternTest {

  @Test
  public void test() {
    SingletonPattern singletonPattern = SingletonPattern.getInstance();
    SingletonPattern duplicate = SingletonPattern.getInstance();

    assertEquals(duplicate.getKey(), singletonPattern.getKey());

    singletonPattern.setValue("VALUE");
    assertEquals("VALUE", duplicate.getValue());
  }

  @Test
  public void makeItFail() {
    List<SingletonPattern> singletonPatterns = Stream.of(1, 2).parallel()
        .map(integer -> SingletonPattern.getInstance()).collect(Collectors.toList());

    assertNotEquals(singletonPatterns.get(0).getKey(), singletonPatterns.get(1).getKey());
  }

  @Test
  public void threadSafe() {
    List<SingletonPattern> singletonPatterns = Stream.of(1, 2).parallel()
        .map(integer -> SingletonPattern.getThreadSafeInstance()).collect(Collectors.toList());

    assertEquals(singletonPatterns.get(0).getKey(), singletonPatterns.get(1).getKey());
  }

  @Test
  public void timeDifferenceBetweenNormalAndThreadSafe() {
    long threadSafeTime = recordTimeForFunction(() -> SingletonPattern.getThreadSafeInstance());
    long normalTime = recordTimeForFunction(() -> SingletonPattern.getInstance());

    long diff = (threadSafeTime - normalTime) / normalTime;
    System.out.println(diff);
    assertTrue(diff > 5);
  }

  private long recordTimeForFunction(Supplier supplier) {
    final long startTime = System.nanoTime();
    supplier.get();
    final long endTime = System.nanoTime();
    System.out.println("Total execution time: " + (endTime - startTime));
    return endTime - startTime;
  }
}
