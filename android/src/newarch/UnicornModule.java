package com.reactnativeunicorn;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

public class UnicornModule extends NativeUnicornSpec {
  public static final String NAME = UnicornModuleImpl.NAME;

  UnicornModule(ReactApplicationContext context) {
    super(context);
  }

  @Override
  @NonNull
  public String getName() {
    return UnicornModuleImpl.NAME;
  }

  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    UnicornModuleImpl.multiply(a, b, promise);
  }
}
