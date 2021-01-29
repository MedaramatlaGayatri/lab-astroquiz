package controller;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.EligibilityCheck;

@WebServlet(urlPatterns= {"/eligiblemain"})
public class Eligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**Create an object for the EligibilityCheck class in Eligibility.*
6.  *Call the checkQuizAnswers(String points) method with the object created.*
7.  *Store the return value in a boolean variable
 
    */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String points=request.getParameter("points");
	EligibilityCheck eligibilitycheck = new EligibilityCheck();
	boolean spaceEligible = eligibilitycheck.checkQuizAnswer(points);
	System.out.print(spaceEligible);
	if(spaceEligible)
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/success.html");
		rd.forward(request, response);	
	}
	else
	{
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/fail.jsp");
		rd.forward(request, response);
		
	}

}
}
