package by.http.news.controller;

import java.io.IOException;

import by.http.news.bean.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String command = request.getParameter("command");

		String jspFile = "/index.jsp";

		System.out.println(command);
		System.out.println();

		RequestDispatcher requestDispatcher;

		if (command != null) {

			if (command.equals("jsp")) {

				jspFile = "/WEB-INF/jsp/" + request.getParameter("action") + ".jsp";
				
			}

			if (command.equals("userAction")) {

				jspFile = "/WEB-INF/jsp/answer.jsp";

				String name = request.getParameter("name");
				String login = request.getParameter("login");
				String password = request.getParameter("password");

				User user = (name != null) ? new User(name, login, password) : new User(login, password);

				print(user);

				request.setAttribute("user", user);

			}

		}
		
		requestDispatcher = request.getRequestDispatcher(jspFile);

		requestDispatcher.forward(request, response);

	}

	private void print(User user) {

		System.out.println(user.toString());

	}

}