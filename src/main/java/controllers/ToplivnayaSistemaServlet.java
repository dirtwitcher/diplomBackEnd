package controllers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

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

    private static String inputStreamToString(InputStream inputStream) {
	String result = "";
	Scanner scanner = new Scanner(inputStream, "UTF-8");
	if (scanner.hasNext())
	    result = scanner.useDelimiter("\\A").next();
	else
	    result = "";
	scanner.close();
	return result;
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter ToplivnayaSistema doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	ToplivnayaSistema toplivnayaSistema = gson.fromJson(body, ToplivnayaSistema.class);

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

	Integer toplivnayaSistemaId = Integer.parseInt(request.getParameter("id_toplivnayaSistema"));

	ToplivnayaSistemaService toplivnayaSistemaService = new ToplivnayaSistemaService();
	ToplivnayaSistema toplivnayaSistema = toplivnayaSistemaService.findToplivnayaSistema(toplivnayaSistemaId);
	toplivnayaSistemaService.deleteToplivnayaSistema(toplivnayaSistema);

	// response
	Gson gson = new Gson();
	List<ToplivnayaSistema> toplivnayaSistemaList = toplivnayaSistemaService.findAllToplivnayaSistema();
	String json = gson.toJson(toplivnayaSistemaList);
	response.getWriter().write(json);
    }

}
