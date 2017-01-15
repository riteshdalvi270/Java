package java8.lambda.example1;

/**
 * Created by ritesh on 1/14/17.
 */
@FunctionalInterface
public interface Converter<T,F> {

    T converter(F from);

    default void usage() {

        System.out.println("Converter is called");
    }
}
