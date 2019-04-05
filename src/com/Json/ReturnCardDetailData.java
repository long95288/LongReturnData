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
//		response.getWriter().println("</br>���ύ��һ��get����");
		/** ������Ӧͷ����ajax������� **/
		response.addHeader("Access-Control-Allow-Origin","http://127.0.0.1:8020");
		/* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		String cardid = request.getParameter("cardid");
		System.out.println("cardid"+cardid);
		
		
		PrintWriter out=response.getWriter();
		JSONObject object = new JSONObject();
		JSONArray markerlist = new JSONArray(); // ��ע�б�
		JSONArray commentlist =new JSONArray();	// �����б�
		JSONObject list =new JSONObject();
		
		
		
		object.put("id", "#1234560.4655868980862685");
		object.put("longitude", "0.2100994609896647");
		object.put("latitude", "0.2100994609896647");
		object.put("html", "��ע1");
		object.put("content", "�����ע�Ǵӷ��������ص�");
		markerlist.add(object);
		object.put("id", "1234560.9134885568897888");
		object.put("longitude", "5.918010743903802");
		object.put("latitude", "0.40867581689927324");
		object.put("html", "��ע2");
		object.put("content", "�����ע�Ǵӷ��������ص�");
		
		markerlist.add(object);
		list.put("marklist", markerlist);
		
		list.put("img", "http://111.231.133.229:8888/long/document/show2.jpg");// ���ͼƬurl
		
		list.put("caption", "Bryce Canyon National Park <b>&copy; Mark Doliner</b>"); //ͼƬ����
		
		list.put("comments", commentlist);
		
		out.println(list);
		System.out.println(list);
		
		
	}

}
