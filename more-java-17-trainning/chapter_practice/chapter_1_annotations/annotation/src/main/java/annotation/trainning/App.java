package annotation.trainning;

import annotation.trainning.deprecation.PersonalConsumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        PersonalConsumer functionalInterface = x -> System.out.println(x);
        System.out.println( "Hello World!" );
    }
}
