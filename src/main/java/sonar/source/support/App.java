package sonar.source.support;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
	private long computationId;
	private String marginTypeKey;
	private BigDecimal cashMarginAmount;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
	public static String[] getColumnNames() {
		return new String[1];
	}
}
