package SERVLETS;
import VO.regi_vo;
import DAO.regi_dao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import DAO.regi_dao;

/**
 * Servlet implementation class search_servlet
 */
@WebServlet("/search_servlet")
public class search_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	int o=Integer.parseInt(request.getParameter("id"));
	regi_vo t=new regi_vo();
	t.setId(o);
	regi_dao w=new regi_dao();
	List ls=w.select(t);
	HttpSession s=request.getSession();
	s.setAttribute("list",ls);
	response.sendRedirect("search2.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
