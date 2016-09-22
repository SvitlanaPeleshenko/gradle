package enums;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
  
  @Target(ElementType.METHOD)
  @Retention(RetentionPolicy.RUNTIME)
  public @interface  TestInfo {
    String[] testIds();
    String testName();
    String basedOnStory();
    Priority priority() default Priority.MEDIUM;
  }


