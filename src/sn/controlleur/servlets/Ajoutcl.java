package sn.controlleur.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.senforage.dao.ClientImpl;
import sn.senforage.dao.IClient;
import sn.senforage.dao.IVillage;
import sn.senforage.dao.VillageImpl;
import sn.senforage.entities.Client;
import sn.senforage.entities.Village;


@WebServlet(urlPatterns = "/AddClient" , name = "addclient")
public class Ajoutcl extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private IClient clientdao;
	private IVillage villagedao;

	
	public Ajoutcl() {
		
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		clientdao = new ClientImpl();
		villagedao = new VillageImpl();
				
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("list_village", villagedao.getAll());
		
		request.getRequestDispatcher("/view/AddClient.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Creation des clients
		
		Client client = new Client ();
		
		String prenom = request.getParameter("prenom").toString ();
		String nom = request.getParameter("nom").toString ();
		String adresse = request.getParameter("adresse").toString ();
		String telephone = request.getParameter("telephone").toString ();

		int id=Integer.parseInt(request.getParameter("village_id").toString());
		Village village = villagedao.get(id) ;
		
		
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setAdresse(adresse);
		client.setTelephone(telephone) ;
		client.setVillage(village); 
		int ok = clientdao.add(client);
		//System.out.println("Client bien enregistrer");
		request.setAttribute("list_client", clientdao.getAll());

		request.getRequestDispatcher("/view/EditClient.jsp").forward(request, response);

		
	}


}
