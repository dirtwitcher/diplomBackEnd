package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.ToplivnayaSistema;
import services.ToplivnayaSistemaService;

public class ToplivnayaSistemaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ToplivnayaSistemaServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter ToplivnayaSistema doGet");

	Gson gson = new Gson();
	ToplivnayaSistemaService toplivnayaSistemaService = new ToplivnayaSistemaService();
	List<ToplivnayaSistema> toplivnayaSistemaList = toplivnayaSistemaService.findAllToplivnayaSistema();
	String json = gson.toJson(toplivnayaSistemaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter ToplivnayaSistema doPost");

	ToplivnayaSistema toplivnayaSistema = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    toplivnayaSistema = gson.fromJson((String) en.nextElement(), ToplivnayaSistema.class);
	}

	ToplivnayaSistemaService toplivnayaSistemaService = new ToplivnayaSistemaService();
	toplivnayaSistemaService.createToplivnayaSistema(toplivnayaSistema);

	// response
	List<ToplivnayaSistema> toplivnayaSistemaList = toplivnayaSistemaService.findAllToplivnayaSistema();
	String json = gson.toJson(toplivnayaSistemaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter ToplivnayaSistema doPut");

	ToplivnayaSistema toplivnayaSistema = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    toplivnayaSistema = gson.fromJson((String) en.nextElement(), ToplivnayaSistema.class);
	}

	ToplivnayaSistemaService toplivnayaSistemaService = new ToplivnayaSistemaService();
	toplivnayaSistemaService.updateToplivnayaSistema(toplivnayaSistema);

	// response
	List<ToplivnayaSistema> toplivnayaSistemaList = toplivnayaSistemaService.findAllToplivnayaSistema();
	String json = gson.toJson(toplivnayaSistemaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter ToplivnayaSistema doDelete");

	ToplivnayaSistema toplivnayaSistema = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    toplivnayaSistema = gson.fromJson((String) en.nextElement(), ToplivnayaSistema.class);
	}

	ToplivnayaSistemaService toplivnayaSistemaService = new ToplivnayaSistemaService();
	toplivnayaSistemaService.deleteToplivnayaSistema(toplivnayaSistema);

	// response
	List<ToplivnayaSistema> toplivnayaSistemaList = toplivnayaSistemaService.findAllToplivnayaSistema();
	String json = gson.toJson(toplivnayaSistemaList);
	response.getWriter().write(json);
    }

}
