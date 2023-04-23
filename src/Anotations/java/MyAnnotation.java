import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Vladislav Osada
 * @date 23.04.2023 13:23
 */

@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String nameAuthor() default "Vlad";
    String dateOfCreation();
}
