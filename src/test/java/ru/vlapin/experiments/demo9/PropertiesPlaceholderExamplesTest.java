package ru.vlapin.experiments.demo9;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.vlapin.experiments.demo9.model.AnnotationBasedSetterPropertiesPlaceholderExample;
import ru.vlapin.experiments.demo9.model.JavaConfigBasedSetterPropertiesPlaceholderExample;
import ru.vlapin.experiments.demo9.service.AnnotationBasedImmutablePropertiesPlaceholderExample;

@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class PropertiesPlaceholderExamplesTest {

  AnnotationBasedSetterPropertiesPlaceholderExample absppe;
  JavaConfigBasedSetterPropertiesPlaceholderExample jcbsppe;
  AnnotationBasedImmutablePropertiesPlaceholderExample abippe;

  @Test
  @SneakyThrows
  @DisplayName("Annotation based properties placeholder works correctly")
  void annotationBasedPropertiesPlaceholderWorksCorrectlyTest() {
    assertThat(absppe).isNotNull()
        .extracting(
            AnnotationBasedSetterPropertiesPlaceholderExample::getHost,
            AnnotationBasedSetterPropertiesPlaceholderExample::getPort)
        .contains("localhost", 8090);
  }

  @Test
  @SneakyThrows
  @DisplayName("Java config based properties placeholder works correctly")
  void javaConfigBasedPropertiesPlaceholderWorksCorrectlyTest() {
    assertThat(jcbsppe).isNotNull()
        .extracting(
            JavaConfigBasedSetterPropertiesPlaceholderExample::getHost,
            JavaConfigBasedSetterPropertiesPlaceholderExample::getPort)
        .contains("my.site.com", 8080);
  }

  @Test
  @SneakyThrows
  @DisplayName("Annotation based immutable properties placeholder works correctly")
  void annotationBasedImmutablePropertiesPlaceholderWorksCorrectlyTest() {
    assertThat(abippe).isNotNull()
        .extracting(
            AnnotationBasedImmutablePropertiesPlaceholderExample::getAuthMethod,
            AnnotationBasedImmutablePropertiesPlaceholderExample::getPassword,
            AnnotationBasedImmutablePropertiesPlaceholderExample::getUsername)
        .contains("basic", "qwerty", "user");
  }
}
