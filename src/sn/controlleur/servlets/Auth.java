package sn.controlleur.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.IUser;
import sn.senforage.dao.IVillage;
import sn.senforage.dao.UserImpl;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.User;

@WebServlet (urlPatterns = "/Auth" , name="auth")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	public Auth() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/Auth.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Intenciation de la classe implemente
		
		IUser userdao = new UserImpl();
		IVillage villagedao = new VillageImpl();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = userdao.getConnection(email, password);
		 if(user != null) {
				request.setAttribute("list_village", villagedao.getAll());

				request.getRequestDispatcher("/view/AddClient.jsp").forward(request, response);

		 } else {
				request.getRequestDispatcher("/view/Auth.jsp").forward(request, response);
				
		 }
		


		
		//doGet(request, response);
	}
	
	
}
