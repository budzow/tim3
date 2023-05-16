package sonar.source.support;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    int myPow(int num, int exponent) {
        num = num * myPow(num, exponent - 1); // Noncompliant
        return num;  // this is never reached
    }
}
