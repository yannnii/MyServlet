package myservices;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
          
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
 
        String name = request.getParameter("username");
        String age = request.getParameter("userage");
        String gender = request.getParameter("usergender");
        String country = request.getParameter("usercountry");
         
        try {
        	out.println("<html>");
        	out.println("<head>");
        	out.println("<title>MyServlet</title>");
        	out.println("</head>");
        	out.println("<body>");
        	out.println("<h1>Reservation</h1>");
        	out.println(request.getParameter("username") + "'s You has been reserved.");
        	out.println("</body>");
        	out.println("</html>");
        	out.println("<p>Name: " + name + "</p>");
        	out.println("<p>Age: " + age + "</p>");
        	out.println("<p>Gender: " + gender + "</p>");
        	out.println("<p>Country: " + country + "</p>");
        } finally {
        	out.close();  
        }
    }
}