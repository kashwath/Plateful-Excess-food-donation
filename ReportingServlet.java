

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ReportingServlet
 */
@WebServlet("/reporting.do")
public class ReportingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ReportingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		request.setAttribute("name",name );
        
		request.getRequestDispatcher("/WEB-INF/Views/report.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		request.setAttribute("name",name );
		
		request.getRequestDispatcher("/WEB-INF/Views/moneyreport.jsp").forward(request, response);
	}

}
