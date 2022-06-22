package com.reactnativeunicorn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;

/**
 * This is where the module implementation lives
 * The exposed methods can be defined in the `newarch` and `oldarch` folders
 */
public class UnicornModuleImpl  {
  public static final String NAME = "Unicorn";

  public static void multiply(double a, double b, Promise promise) {
    promise.resolve(a * b);
  }
}
