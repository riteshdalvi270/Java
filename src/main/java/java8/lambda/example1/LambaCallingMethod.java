package java8.lambda.example1;

/**
 * Created by ritesh on 1/14/17.
 */
public class LambaCallingMethod {

    public static void main(String args[]) {

        Something something = new Something();

        Converter<String,String> converter = something :: startsWith;

        System.out.println(converter.converter("Java"));
    }
}
