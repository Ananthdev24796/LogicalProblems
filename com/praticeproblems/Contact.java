/**
 * 
 */
package com.bridgelabz.com.praticeproblems;

/**
 * @author admin
 *
 */
public class Contact {

	/**
	 * @param args
	 */
	
	private static Contact contact = null;
	
	
	private void contact() {
		
	}
	
	public static Contact getinstance() {
		
		if(contact == null ) {
			contact = new Contact();
		}
		return contact;  
	}
	
	public void getContactDetails() {
		System.out.println("Contact Details");
		
	}
	
	public static void main(String[] args) {
		Contact obj1 = Contact.getinstance();
		System.out.println(obj1);
		
		Contact obj2 = Contact.getinstance();
		System.out.println(obj2);
		
		

	}

}
