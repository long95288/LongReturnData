package com.Json;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

/**
 * Servlet implementation class AddMarkerApi
 */
@WebServlet("/AddMarkerApi")
public class AddMarkerApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMarkerApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		/** 设置响应头允许ajax跨域访问 **/
		response.addHeader("Access-Control-Allow-Origin","http://127.0.0.1:8020");
		/* 星号表示所有的异域请求都可以接受， */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		String cardid = request.getParameter("cardid");
		System.out.println("cardid"+cardid);
		
		String marker = request.getParameter("marker");
		System.out.println("标注:"+marker);
		
		
		JSONObject redata = new JSONObject();
		
		redata.put("detail", "你获得了详情");
		
		response.getWriter().print(redata);
		
		
	}

}
