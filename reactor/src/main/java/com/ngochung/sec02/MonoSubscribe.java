package com.ngochung.sec02;

import com.ngochung.courseUtil.Utils;
import reactor.core.publisher.Mono;

public class MonoSubscribe {
  public static void main(String[] args) {
    // publisher
    Mono<Integer> mono = Mono.just("football")
            .map(String:: length)
            .map(l -> l/0);

    // subscribe
    mono.subscribe(
            Utils.onNext(),
            Utils.onError(),
            Utils.onComplete()
    );
  }
}
