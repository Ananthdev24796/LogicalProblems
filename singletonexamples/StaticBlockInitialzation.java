package com.bridgelabz.singletonexamples;

public class StaticBlockInitialzation {
	
	private StaticBlockInitialzation() {
		
	}
	
	private static StaticBlockInitialzation theOnlyInstance ;
	
	static {
		try {
			theOnlyInstance = new StaticBlockInitialzation();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static StaticBlockInitialzation getInstance() {
		return theOnlyInstance;
		
	}
	
	
	
	

}
