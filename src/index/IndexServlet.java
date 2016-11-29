package index;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	private int pageCounter = 0;
	
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("pageCounter",pageCounter());
		request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request, response); 	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setAttribute("pageCounter",pageCounter());
		request.setAttribute("name",request.getParameter("name"));
		request.setAttribute("surname",request.getParameter("surname"));
		request.setAttribute("title",request.getParameter("title"));
		request.setAttribute("textContent",request.getParameter("textContent"));
    	request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request, response); 	
    	
	}
	
	private synchronized int pageCounter(){
		return ++pageCounter;
	}

}
