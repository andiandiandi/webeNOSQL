package post;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/PostServlet")
public class PostServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -187861334299095072L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    	
    	req.getRequestDispatcher("WEB-INF/views/post.jsp").forward(req, res);
    	
    	    	
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	doGet(req, res);
    }
	
}