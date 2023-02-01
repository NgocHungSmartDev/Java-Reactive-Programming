package com.ngochung.sec02;

import reactor.core.publisher.Mono;

public class MonoJust {
  public static void main(String[] args) {
    // publisher
    Mono<Integer> mono = Mono.just(1);
    System.out.println(mono);

    // subscribe
    mono.subscribe(i -> System.out.println("received: "+ i));

  }
}
