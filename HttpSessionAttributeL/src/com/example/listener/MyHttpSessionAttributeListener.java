package com.example.listener;
import javax.servlet.http.*;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener{
	// implements all methods from HttpSessionAttributeListener, remeber 
	// HttpSessionBindingEvent event, if is HttpSession Attribute or Binding
	// always be HttpSessionBindingEvent :
	public void attributeAdded(HttpSessionBindingEvent event){
	     System.out.println("\n###################################\n");
	     System.out.println("attributeAdded method has been called in " + getClass().getName());
	     System.out.println("Newly added attribute name = " + event.getName() + 
	    		 ", value = " + event.getValue());
	     // ofcourse from this event you can get session object:
	     HttpSession httpSession = event.getSession();
	     System.out.println("Getting session object which is : " + httpSession + 
	    		 ", only from HttpSessionBindingEvent");
	     System.out.println("\n###################################\n");
	}
	
	public void attributeReplaced(HttpSessionBindingEvent event){
	    System.out.println("\n###################################\n");
        System.out.println("attributeReplaced method has been called in "+getClass().getName());
        System.out.println("Replaced attribute name = " + event.getName() + 
        		", value = " + event.getValue());
        System.out.println("\n###################################\n");
	}
	
	public void attributeRemoved(HttpSessionBindingEvent event){
	    System.out.println("\n###################################\n");
        System.out.println("attributeRemoved method has been called in " + this.getClass().getName());
        System.out.println("Removed attribute name = " + event.getName() + 
        		", value = " + event.getValue());
        System.out.println("\n###################################\n");
	}
}
