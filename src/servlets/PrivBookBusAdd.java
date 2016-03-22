package servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PrivBookBusAO;
import Model.PrivBookBusModel;

/**
 * Servlet implementation class PrivBookBusAdd
 */
@WebServlet("/PrivBookBusAdd")
public class PrivBookBusAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrivBookBusAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bus_no = request.getParameter("bus_no");
		int seat_capacity = Integer.parseInt(request.getParameter("seat_capacity"));
		int driver_no = Integer.parseInt(request.getParameter("driver_no"));
		Date depart_date = Date.valueOf(request.getParameter("depart_date"));
		Time depart_time = Time.valueOf(request.getParameter("depart_time"));
		String depart_location = request.getParameter("depart_location");
		Date return_date = Date.valueOf(request.getParameter("return_date"));
		Time return_time = Time.valueOf(request.getParameter("return_time"));
		String return_location = request.getParameter("return_location");
		String contact_person = request.getParameter("contact_person");
		int contact_tel = Integer.parseInt(request.getParameter("contact_tel"));
		
		PrivBookBusModel privTemp = new PrivBookBusModel(
				bus_no, seat_capacity, driver_no, 
				depart_date, depart_time, depart_location, 
				return_date, return_time, return_location, 
				contact_person, contact_tel);
		System.out.println("PrivBookBusAdd: " + privTemp);
		new PrivBookBusAO().insertPrivBookBus(privTemp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
