package annotation.trainning.deprecation;

/**
 * This class is used to demonstrate how to deprecate APIs.
 */

public class Box {

    public static void noDeprecated(){
        System.out.println("This is a normal method");
    }

    /**
     * Deprecated ordinarily (forRemoval=false).
     * @deprecated  Do not use it.
     */
    @Deprecated(since = "11")
    public static void deprecatedOrdinarily(){
        System.out.println("This is a deprecated ordinarily method");
    }

    /**
     * Deprecated terminally (forRemoval=true).
     * @deprecated  Do not use it.
     */
    @Deprecated(since = "2", forRemoval = true)
    public static void deprecatedTerminally(){
        System.out.println("This is a deprecated terminally method");
    }


}
