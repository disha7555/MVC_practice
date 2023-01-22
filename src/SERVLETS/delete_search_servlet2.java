package SERVLETS;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import VO.regi_vo;
import DAO.regi_dao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class delete_search_servlet2
 */
@WebServlet("/delete_search_servlet2")
public class delete_search_servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	int id1=Integer.parseInt(request.getParameter("id1"));
	PrintWriter out=response.getWriter();
	//out.println(id1);
	regi_vo t=new regi_vo();
	t.setId(id1);
	regi_dao w=new regi_dao();
	w.delete_search1(t);
	List ls1=w.delete_search();
	HttpSession s=request.getSession();
	s.setAttribute("list",ls1);
	response.sendRedirect("delete_search2.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
