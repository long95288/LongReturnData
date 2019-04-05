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
 * Servlet implementation class ReturnUserInfo
 */
@WebServlet("/ReturnUserInfo")
public class ReturnUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnUserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
//		//��������
		
		PrintWriter out=response.getWriter();
		
		String uid = request.getParameter("uid");
		System.out.println(uid);
		if (uid.equals("12345678")) {
			JSONObject userinfo = new JSONObject();
			userinfo.put("name", "����");
			userinfo.put("account", "11876234@qq.com");
			userinfo.put("headimg", "http://111.231.133.229:8888/long/document/77ed8bfaecbf87df0f2093708dcf487c.jpg");
			userinfo.put("qq", "��");
			userinfo.put("tel", "13444124567");
			userinfo.put("email", "333@qq.com");
			userinfo.put("version", "V1.3");
			out.print(userinfo);
		}else {
			// ����505
			response.sendError(505);
		}
		
		
		
	}

}
