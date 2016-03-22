package servlets;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ReguScheBookBusAO;
import Model.ReguScheBookBusModel;

/**
 * Servlet implementation class ReguScheBookBusUpdate
 */
@WebServlet("/ReguScheBookBusUpdate")
public class ReguScheBookBusUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReguScheBookBusUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tour_code = request.getParameter("tour_code");
		String destination = request.getParameter("destination");
		String description = request.getParameter("description");
		int bus_no = Integer.parseInt(request.getParameter("bus_no"));
		int driver_no = Integer.parseInt(request.getParameter("driver_no"));
		String depart_location = request.getParameter("depart_location");
		Date depart_date = Date.valueOf(request.getParameter("depart_date"));
		Time depart_time = Time.valueOf(request.getParameter("depart_time"));
		int max_participants = Integer.parseInt(request.getParameter("max_participants"));
		int no_of_participants = Integer.parseInt(request.getParameter("no_of_participants"));
		
		ReguScheBookBusModel reguTemp = new ReguScheBookBusModel(
				tour_code, destination, description, 
				bus_no, driver_no, depart_location, 
				depart_date, depart_time, max_participants, 
				no_of_participants);
		System.out.println("ReguScheBookBusUpdate: " + reguTemp);
		
		new ReguScheBookBusAO().updateReguScheBookBus(reguTemp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
