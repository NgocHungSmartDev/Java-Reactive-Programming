package com.learnreactiveprogramming.service;

import java.util.List;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxAndMonoGeneratorService {
  public static Flux<String> fluxNames() {
    return Flux.fromIterable(List.of("Arsenal", "Man City", "Chelsea", "Liverpool")).log();
  }

  public static Mono<String> monoName() {
    return Mono.just("Smart Dev").log();
  }

  public static void main(String[] args) {
//    fluxNames()
//        .subscribe(
//            name -> {
//              System.out.println(name);
//            });

    monoName().subscribe(name -> System.out.println(name));
  }
}
