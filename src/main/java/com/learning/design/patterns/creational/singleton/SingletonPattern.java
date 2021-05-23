package com.learning.design.patterns.creational.singleton;

import java.util.UUID;

public class SingletonPattern {

  private static SingletonPattern instance;
  private static SingletonPattern threadSafeInstance;

  private String key;
  private String value;

  private SingletonPattern() {
    key = UUID.randomUUID().toString();
  }

  public static SingletonPattern getInstance() {
    if (instance == null) {
      instance = new SingletonPattern();
    }
    return instance;
  }

  public static synchronized SingletonPattern getThreadSafeInstance() {
    if (threadSafeInstance == null) {
      threadSafeInstance = new SingletonPattern();
    }
    return threadSafeInstance;
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
