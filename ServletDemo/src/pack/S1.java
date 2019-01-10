package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		out.print("doGet calling");
		
		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("n");
		out.println(name);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		String name  = request.getParameter("me");
		if(name.length()<2){
			response.sendRedirect("index.html?a=1");
		}
		out.print("dopost calling "+name);
		
		String s [] = request.getParameterValues("C1");
		for(String ss : s){
			System.out.println(ss);
		}
	}

}
