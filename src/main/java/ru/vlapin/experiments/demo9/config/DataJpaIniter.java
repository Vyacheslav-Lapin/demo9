package ru.vlapin.experiments.demo9.config;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.demo9.common.Loggable;
import ru.vlapin.experiments.demo9.dao.CatRepository;
import ru.vlapin.experiments.demo9.model.Cat;

import static ru.vlapin.experiments.demo9.common.Loggable.LogLevel.*;

@Component
@RequiredArgsConstructor
public class DataJpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  @Loggable(INFO)
  public void run(ApplicationArguments __) {
    Stream.of("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
