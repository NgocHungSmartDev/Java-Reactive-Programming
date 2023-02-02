package com.ngochung.flux;

import com.ngochung.courseUtil.Utils;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

public class Lec01FluxIntro {
  public static void main(String[] args) {

    Flux<Object> flux = Flux.just(1, 2, 3, "a", "aaa");

    flux.subscribe(
            (Consumer<? super Object>) Utils.onNext(),
            Utils.onError(),
            Utils.onComplete());


  }
}
