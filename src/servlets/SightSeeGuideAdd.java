package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SightSeeGuideAO;
import Model.SightSeeGuideModel;

/**
 * Servlet implementation class AddSightSeeGuide
 */
@WebServlet("/AddSightSeeGuide")
public class SightSeeGuideAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SightSeeGuideAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String tour_code = request.getParameter("tour_code");
		String guide_no = request.getParameter("guide_no");
		String guide_name = request.getParameter("guide_name");
		System.out.println("SightSeeGuideAdd: "+ tour_code + ", " +guide_no + ", " + guide_name);
		new SightSeeGuideAO().insertSightSeeGuide(new SightSeeGuideModel(tour_code, guide_no, guide_name));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
