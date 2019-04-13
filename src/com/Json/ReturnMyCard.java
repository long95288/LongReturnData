package com.Json;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class ReturnMyCard
 */
@WebServlet("/ReturnMyCard")
public class ReturnMyCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnMyCard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		JSONArray cardlist = new JSONArray();
		JSONObject item = new JSONObject();
		
		String uid = request.getParameter("account");
		System.out.println("请求的id:"+uid);
		
		
		item.put("headimg", "http://111.231.133.229:8888/long/document/d7e1b8292160dba5d1262233dfaf1234.jpg");
		item.put("name", "小李");
		item.put("dtime", "2016-06-03 15:30");
		item.put("id", "show1");
		item.put("img", "http://111.231.133.229:8888/long/document/show1.jpg");
		item.put("likes", "2");
		item.put("comments", "2");
		item.put("shares", "3");
		cardlist.add(item);
		
		item.put("headimg", "http://111.231.133.229:8888/long/document/d7e1b8292160dba5d1262233dfaf1234.jpg");
		item.put("name", "小李");
		item.put("dtime", "2016-06-03 15:30");
		item.put("id", "show2");
		item.put("img", "http://111.231.133.229:8888/long/document/show2.jpg");
		item.put("likes", "33");
		item.put("comments", "33");
		item.put("shares", "11");
		cardlist.add(item);
		
		response.getWriter().print(cardlist);
	}

}
