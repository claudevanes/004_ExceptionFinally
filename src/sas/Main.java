/*
 * This example shows how to use finally block to 
 * catch runtime exceptions (Illegal Argument Exception) 
 * by the use of e.getMessage().
 */

package sas;

import java.util.logging.Logger;
import ses.*;

public class Main {

	public Main() {
		}

	public final static Logger LOGGER = Logger.getLogger(Main.class.getName());

	
	public static void main(String[] args) {

		LOGGER.info("");
        new ExceptionFinally().doTheWork();
        
	}

}
