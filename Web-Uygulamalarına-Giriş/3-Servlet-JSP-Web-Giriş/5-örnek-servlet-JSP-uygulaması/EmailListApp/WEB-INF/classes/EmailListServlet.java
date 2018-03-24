import java.io*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.UserDB;

public class EmailServletClass extends HTTPServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException
	{
		String url = "/index.html";
		
		// get current action
		String action = request.getParameter("action");

		if(action == null)
			action = "join";

		// perform action and set URL to appropriate page 	
		if(action.equals("join"))
		{
			url = "/index.html";
		}
		else if(action.equals("add")
		{
			// get parameters from the request
			String firstName = request.getParameter("firstName");
			String lastName  = request.getParameter("lastName");
			String email     = request.getParameter("email");

			// store data in User object and save User object in database
			User user = new User(firstName, lastName, email);
			UserDB.insert(user);

			// set User object in url and set URL
			request.setAttribute("user", user);
			url = "/thanks.jsp";
		}

		// forward request and reponse object to specified URL
		getServletContext()
			.getRequestDispatcher(url)
			.forward(request, response);

	}

	@Override
	protected void doGet(HttpServletRequest, HttpServletResponse)
				throws IOException, ServletException
	{
		doPost(request, response);
	}
}

		
		
