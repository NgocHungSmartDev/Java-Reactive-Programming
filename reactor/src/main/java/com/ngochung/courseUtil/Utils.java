package com.ngochung.courseUtil;

import java.util.function.Consumer;

public class Utils {

  public static Consumer<? super Integer> onNext() {
    return o -> System.out.println("Received: " + o);
  }

  public static Consumer<Throwable> onError() {
    return e -> System.out.println("ERROR: " + e.getMessage());
  }

  public static Runnable onComplete() {
    return () -> System.out.println("Completed");
  }
}
