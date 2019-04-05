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
			/*解决乱码问题*/
			response.setContentType("text/html;charset=utf-8");
//			response.getWriter().append("Served at: ").append(request.getContextPath());
//			response.getWriter().println("</br>你提交了一个get请求！");
			/** 设置响应头允许ajax跨域访问 **/
			response.addHeader("Access-Control-Allow-Origin","http://127.0.0.1:8020");
			/* 星号表示所有的异域请求都可以接受， */
			response.setHeader("Access-Control-Allow-Methods", "GET,POST");
//			//获得输出流
			
			PrintWriter out=response.getWriter();
			//JSONObject json=JsonReader.receivePost(request);
			
			JSONObject servedata=new JSONObject();
			JSONArray sliderlist = new JSONArray();
			JSONObject slider=new JSONObject();
	

			//写JSON数据
			slider.put("id", "firstpage");
			slider.put("img", "headimg/jiuzhouicon.jpg");
			slider.put("content", "第一张");
			sliderlist.add(slider);
			
			//写JSON数据
			slider.put("id", "secondtpage");
			slider.put("img", "headimg/lushan.jpg");
			slider.put("content", "第二张");
			sliderlist.add(slider);
			
			//写JSON数据
			slider.put("id", "thirdtpage");
			slider.put("img", "headimg/zhumulangmafeng.jpg");
			slider.put("content", "第三张");
			sliderlist.add(slider);
			
			//写JSON数据
			slider.put("id", "forthpage");
			slider.put("img", "headimg/wuyihsan.jpg");
			slider.put("content", "第四张");
			sliderlist.add(slider);
			
			servedata.put("sliderlist", sliderlist);
			
			JSONArray cardlist = new JSONArray();
			JSONObject card = new JSONObject();
			
			card.put("id", "huangsan");
			card.put("logo", "headimg/huangsanicon.jpg");
			card.put("name", "安徽黄山");
			card.put("intro", "世界文化与自然双重遗产，世界地质公园，国家AAAAA级旅游景区");
			card.put("imgs", "showimg/huangshow1.jpg");
			cardlist.add(card);
			
			card.put("id", "jiuzhou");
			card.put("logo", "headimg/jiuzhouicon.jpg");
			card.put("name", "广西旧州");
			card.put("intro", "旧州古名那签、顺安峒、归顺土州，位于靖西县城南9公里，旧州--原为归顺州（今靖西）");
			card.put("imgs", "showimg/jiuzhoushow1.jpg");
			cardlist.add(card);
			
			card.put("id", "hukou");
			card.put("logo", "showimg/hukoushow3.jpg");
			card.put("name", "壶口瀑布");
			card.put("intro", "壶口瀑布是国家级风景名胜区，国家AAAA级旅游景区 。西临陕西省延安市宜川县壶口乡，东濒山西省临汾市吉县壶口镇，为两省共有旅游景区。");
			card.put("imgs", "showimg/hukoushow2.jpg");
			cardlist.add(card);

			servedata.put("cardlist", cardlist);
			
			out.print(servedata);
			System.out.println(servedata);
//			
			
//			json.put("username", "李明");
//			json.put("密码", "12345678");
//			json.put("描述", "http://192.168.1.103:8080/documment/upload/show2.jpg");			
			//jsonArray.add(json);			
//			//输出json
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
