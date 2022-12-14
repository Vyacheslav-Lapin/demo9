package ru.vlapin.experiments.demo9.model.jsonplaceholder;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Jacksonized
@Builder(toBuilder = true)
public class Address {

  String street;

  String suite;

  String city;

  @JsonProperty("zipcode")
  String zipCode;

  Geo geo;
}
