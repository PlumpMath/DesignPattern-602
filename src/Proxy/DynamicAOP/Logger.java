package Proxy.DynamicAOP;

import java.util.Date;

public class Logger {
	public static void logging(Level level, String context){
		if(level.equals(Level.INFO)){
			System.out.println(new Date()+ " " + context);
		}
		if(level.equals(Level.DEBUGE)){
			System.out.println(new Date()+ " " + context);
		}
	}
}
