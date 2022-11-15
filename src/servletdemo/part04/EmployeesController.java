package servletdemo.part04;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8090/webdemo/empList

@WebServlet("/empList")
public class EmployeesController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeesDAO dao = EmployeesDAO.getInstance();
		req.setAttribute("aList",dao.listAll());
		
		String path = "/servletview/part04/list.jsp";
		RequestDispatcher dis = req.getRequestDispatcher(path);
		dis.forward(req, resp);
	
	} // end doGet()

} // end Class
