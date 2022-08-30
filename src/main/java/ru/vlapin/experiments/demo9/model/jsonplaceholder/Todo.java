package ru.vlapin.experiments.demo9.model.jsonplaceholder;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Jacksonized
@Builder(toBuilder = true)
public class Todo {

  Long id;

  Long userId;

  String title;

  Boolean completed;
}