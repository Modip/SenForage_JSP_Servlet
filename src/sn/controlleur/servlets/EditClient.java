package sn.controlleur.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.ClientImpl;
import sn.senforage.dao.IClient;
import sn.senforage.dao.IVillage;
import sn.senforage.dao.VillageImpl;

@WebServlet (urlPatterns = "/EditClient" , name = "editclient")
public class EditClient extends HttpServlet {

	public EditClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 IClient clientdao = new ClientImpl();
		 IVillage villagedao = new VillageImpl();
		 
		req.setAttribute("list_client", clientdao.getAll());
		req.setAttribute("list_village", villagedao.getAll());
		req.getRequestDispatcher("/view/EditClient.jsp").forward(req, resp);

	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	
	}
	
}
