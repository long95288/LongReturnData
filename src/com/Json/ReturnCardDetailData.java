package com.Json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class ReturnCardDetailData
 */
@WebServlet("/ReturnCardDetailData")
public class ReturnCardDetailData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnCardDetailData() {
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
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().println("</br>你提交了一个get请求！");
		/** 设置响应头允许ajax跨域访问 **/
		response.addHeader("Access-Control-Allow-Origin","http://127.0.0.1:8020");
		/* 星号表示所有的异域请求都可以接受， */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		String cardid = request.getParameter("cardid");
		System.out.println("cardid"+cardid);
		
		
		PrintWriter out=response.getWriter();
		JSONObject object = new JSONObject();
		JSONArray markerlist = new JSONArray(); // 标注列表
		JSONArray commentlist =new JSONArray();	// 评论列表
		JSONObject comment = new JSONObject();
		JSONObject list =new JSONObject();
		
		
		
		object.put("id", "#1234560.4655868980862685");
		object.put("longitude", "0.2100994609896647");
		object.put("latitude", "0.2100994609896647");
		object.put("html", "标注1");
		object.put("content", "这个标注是从服务器返回的");
		markerlist.add(object);
		object.put("id", "1234560.9134885568897888");
		object.put("longitude", "5.918010743903802");
		object.put("latitude", "0.40867581689927324");
		object.put("html", "标注2");
		object.put("content", "这个标注是从服务器返回的");
		
		markerlist.add(object);
		list.put("marklist", markerlist);
		
		list.put("img", "http://111.231.133.229:8888/long/document/show2.jpg");// 添加图片url
		
		list.put("caption", "黄石家公园 <b>&copy; Mark Doliner</b>"); //图片描述
		
		/*id:12345678|0.6563985603573026
		content:刚刚说个事
		ctime:2019-3-4 18:40:31*/
		// 配置评论列表
		comment.put("id", "12345678|0.6563985603573026");
		comment.put("headimg", "http://111.231.133.229:8888/long/document/77ed8bfaecbf87df0f2093708dcf487c.jpg");
		comment.put("name", "李四");
		comment.put("ctime","2019-3-4 18:40:31");
		comment.put("content", "这里真的很不错");
		commentlist.add(comment);
		
		comment.put("id", "12345678|0.6563985603574455");
		comment.put("headimg", "http://111.231.133.229:8888/long/document/d7e1b8292160dba5d1262233dfaf1234.jpg");
		comment.put("name", "小李");
		comment.put("ctime","2019-3-4 18:22:1");
		comment.put("content", "我也觉得不错");
		commentlist.add(comment);
		
		//
		
		list.put("comments", commentlist);
		
		out.println(list);
		System.out.println(list);
		
		
	}

}
