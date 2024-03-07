package admin.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import department.model.service.DepartmentService;
import department.model.vo.Department;

/**
 * Servlet implementation class SelectRequestTerminateDept
 */
@WebServlet("/srtd")
public class SelectRequestTerminateDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectRequestTerminateDept() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ArrayList<Department> list = new DepartmentService().selectRequestTerminateDept();
		String keyword = (String)request.getParameter("keyword");
		if(keyword == null) {
			keyword = "";
			RequestDispatcher view = null;
			
			view = request.getRequestDispatcher("views/admin/AdminDeptTerminate.jsp");
			request.setAttribute("list", list);
			request.setAttribute("keyword", keyword);
			view.forward(request, response);
		} else {
			response.sendRedirect("/petmily/adf?keyword="+URLEncoder.encode(keyword, "UTF-8"));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
