package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.RulevoeUpravlenie;
import services.RulevoeUpravlenieService;

public class RulevoeUpravlenieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public RulevoeUpravlenieServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter RulevoeUpravlenie doGet");

	Gson gson = new Gson();
	RulevoeUpravlenieService rulevoeUpravlenieService = new RulevoeUpravlenieService();
	List<RulevoeUpravlenie> rulevoeUpravlenieList = rulevoeUpravlenieService.findAllRulevoeUpravlenie();
	String json = gson.toJson(rulevoeUpravlenieList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter RulevoeUpravlenie doPost");

	RulevoeUpravlenie rulevoeUpravlenie = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    rulevoeUpravlenie = gson.fromJson((String) en.nextElement(), RulevoeUpravlenie.class);
	}

	RulevoeUpravlenieService rulevoeUpravlenieService = new RulevoeUpravlenieService();
	rulevoeUpravlenieService.createRulevoeUpravlenie(rulevoeUpravlenie);

	// response
	List<RulevoeUpravlenie> rulevoeUpravlenieList = rulevoeUpravlenieService.findAllRulevoeUpravlenie();
	String json = gson.toJson(rulevoeUpravlenieList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter RulevoeUpravlenie doPut");

	RulevoeUpravlenie rulevoeUpravlenie = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    rulevoeUpravlenie = gson.fromJson((String) en.nextElement(), RulevoeUpravlenie.class);
	}

	RulevoeUpravlenieService rulevoeUpravlenieService = new RulevoeUpravlenieService();
	rulevoeUpravlenieService.updateRulevoeUpravlenie(rulevoeUpravlenie);

	// response
	List<RulevoeUpravlenie> rulevoeUpravlenieList = rulevoeUpravlenieService.findAllRulevoeUpravlenie();
	String json = gson.toJson(rulevoeUpravlenieList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter RulevoeUpravlenie doDelete");

	RulevoeUpravlenie rulevoeUpravlenie = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    rulevoeUpravlenie = gson.fromJson((String) en.nextElement(), RulevoeUpravlenie.class);
	}

	RulevoeUpravlenieService rulevoeUpravlenieService = new RulevoeUpravlenieService();
	rulevoeUpravlenieService.deleteRulevoeUpravlenie(rulevoeUpravlenie);

	// response
	List<RulevoeUpravlenie> rulevoeUpravlenieList = rulevoeUpravlenieService.findAllRulevoeUpravlenie();
	String json = gson.toJson(rulevoeUpravlenieList);
	response.getWriter().write(json);
    }

}
