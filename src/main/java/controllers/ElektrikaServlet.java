package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Elektrika;
import services.ElektrikaService;

public class ElektrikaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ElektrikaServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Elektrika doGet");

	Gson gson = new Gson();
	ElektrikaService elektrikaService = new ElektrikaService();
	List<Elektrika> elektrikaList = elektrikaService.findAllElektrika();
	String json = gson.toJson(elektrikaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Elektrika doPost");

	Elektrika elektrika = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    elektrika = gson.fromJson((String) en.nextElement(), Elektrika.class);
	}

	ElektrikaService elektrikaService = new ElektrikaService();
	elektrikaService.createElektrika(elektrika);

	// response
	List<Elektrika> elektrikaList = elektrikaService.findAllElektrika();
	String json = gson.toJson(elektrikaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter Elektrika doPut");

	Elektrika elektrika = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    elektrika = gson.fromJson((String) en.nextElement(), Elektrika.class);
	}

	ElektrikaService elektrikaService = new ElektrikaService();
	elektrikaService.updateElektrika(elektrika);

	// response
	List<Elektrika> elektrikaList = elektrikaService.findAllElektrika();
	String json = gson.toJson(elektrikaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter Elektrika doDelete");

	Elektrika elektrika = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    elektrika = gson.fromJson((String) en.nextElement(), Elektrika.class);
	}

	ElektrikaService elektrikaService = new ElektrikaService();
	elektrikaService.deleteElektrika(elektrika);

	// response
	List<Elektrika> elektrikaList = elektrikaService.findAllElektrika();
	String json = gson.toJson(elektrikaList);
	response.getWriter().write(json);
    }

}
