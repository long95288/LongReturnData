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
 * Servlet implementation class ReturnJsonData
 */
@WebServlet("/ReturnJsonData")
public class ReturnJsonData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReturnJsonData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			/*�����������*/
			response.setContentType("text/html;charset=utf-8");
//			response.getWriter().append("Served at: ").append(request.getContextPath());
//			response.getWriter().println("</br>���ύ��һ��get����");
			/** ������Ӧͷ����ajax������� **/
			response.addHeader("Access-Control-Allow-Origin","http://127.0.0.1:8020");
			/* �Ǻű�ʾ���е��������󶼿��Խ��ܣ� */
			response.setHeader("Access-Control-Allow-Methods", "GET,POST");
//			//��������
			
			PrintWriter out=response.getWriter();
			//JSONObject json=JsonReader.receivePost(request);
			
			JSONObject servedata=new JSONObject();
			JSONArray sliderlist = new JSONArray();
			JSONObject slider=new JSONObject();
	

			//дJSON����
			slider.put("id", "firstpage");
			slider.put("img", "headimg/jiuzhouicon.jpg");
			slider.put("content", "��һ��");
			sliderlist.add(slider);
			
			//дJSON����
			slider.put("id", "secondtpage");
			slider.put("img", "headimg/lushan.jpg");
			slider.put("content", "�ڶ���");
			sliderlist.add(slider);
			
			//дJSON����
			slider.put("id", "thirdtpage");
			slider.put("img", "headimg/zhumulangmafeng.jpg");
			slider.put("content", "������");
			sliderlist.add(slider);
			
			//дJSON����
			slider.put("id", "forthpage");
			slider.put("img", "headimg/wuyihsan.jpg");
			slider.put("content", "������");
			sliderlist.add(slider);
			
			servedata.put("sliderlist", sliderlist);
			
			JSONArray cardlist = new JSONArray();
			JSONObject card = new JSONObject();
			
			card.put("id", "huangsan");
			card.put("logo", "headimg/huangsanicon.jpg");
			card.put("name", "���ջ�ɽ");
			card.put("intro", "�����Ļ�����Ȼ˫���Ų���������ʹ�԰������AAAAA�����ξ���");
			card.put("imgs", "showimg/huangshow1.jpg");
			cardlist.add(card);
			
			card.put("id", "jiuzhou");
			card.put("logo", "headimg/jiuzhouicon.jpg");
			card.put("name", "��������");
			card.put("intro", "���ݹ�����ǩ��˳��ἡ���˳���ݣ�λ�ھ����س���9�������--ԭΪ��˳�ݣ�������");
			card.put("imgs", "showimg/jiuzhoushow1.jpg");
			cardlist.add(card);
			
			card.put("id", "hukou");
			card.put("logo", "showimg/hukoushow3.jpg");
			card.put("name", "�����ٲ�");
			card.put("intro", "�����ٲ��ǹ��Ҽ��羰��ʤ��������AAAA�����ξ��� ����������ʡ�Ӱ����˴��غ����磬����ɽ��ʡ�ٷ��м��غ�����Ϊ��ʡ�������ξ�����");
			card.put("imgs", "showimg/hukoushow2.jpg");
			cardlist.add(card);

			servedata.put("cardlist", cardlist);
			
			out.print(servedata);
			System.out.println(servedata);
//			
			
//			json.put("username", "����");
//			json.put("����", "12345678");
//			json.put("����", "http://192.168.1.103:8080/documment/upload/show2.jpg");			
			//jsonArray.add(json);			
//			//���json
//			out.print(json);
//			
//			System.out.println(json);
			
			//out.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
