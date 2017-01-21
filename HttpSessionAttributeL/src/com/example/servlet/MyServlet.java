package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		// we need to get a session object from request:
        HttpSession httpSession = request.getSession();
        // put thread to sleep to see slowly result what happening:
        this.sleep();
        // we use same attribute as CompanyName, and we trigger a listener, addAttribute:
        httpSession.setAttribute("CompanyName", "Amazon");
        
        this.sleep();
        // triger a httpSession listener replacedAttribute():
        httpSession.setAttribute("CompanyName", "Ebay");
        
        this.sleep();
     // triger a httpSession listener removeAttribute():
        httpSession.removeAttribute("CompanyName");
   }
	
	// method that put thread to sleep:
	private void sleep() {
        try {
            Thread.sleep(6500);
        }
        catch (InterruptedException var1_1) {
            var1_1.printStackTrace();
        }
    }
}
