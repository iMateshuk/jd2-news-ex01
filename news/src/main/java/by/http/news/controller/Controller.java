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

		System.out.println(command);
		System.out.println();

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");

		if (command != null) {

			if (command.equals("jsp")) {

				requestDispatcher = request
						.getRequestDispatcher("/WEB-INF/jsp/" + request.getParameter("action") + ".jsp");
			}

			if (command.equals("userAction")) {
				
				String answer = "/WEB-INF/jsp/answer.jsp";

				String name;
				String login;
				String password;

				name = request.getParameter("name");
				login = request.getParameter("login");
				password = request.getParameter("password");

				User user;

				if (name != null) {

					user = new User(name, login, password);

				} else {

					user = new User(login, password);
				}

				print(user);

				request.setAttribute("user", user);

				requestDispatcher = request.getRequestDispatcher(answer);
			}

		}

		requestDispatcher.forward(request, response);

	}

	private void print(User user) {

		System.out.println(user.toString());

	}

}