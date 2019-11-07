package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.OsvetPribory;
import services.OsvetPriboryService;

public class OsvetPriboryServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public OsvetPriboryServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter OsvetPribory doGet");

	Gson gson = new Gson();
	OsvetPriboryService osvetPriboryService = new OsvetPriboryService();
	List<OsvetPribory> osvetPriboryList = osvetPriboryService.findAllOsvetPribory();
	String json = gson.toJson(osvetPriboryList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter OsvetPribory doPost");

	OsvetPribory osvetPribory = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    osvetPribory = gson.fromJson((String) en.nextElement(), OsvetPribory.class);
	}

	OsvetPriboryService osvetPriboryService = new OsvetPriboryService();
	osvetPriboryService.createOsvetPribory(osvetPribory);

	// response
	List<OsvetPribory> osvetPriboryList = osvetPriboryService.findAllOsvetPribory();
	String json = gson.toJson(osvetPriboryList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter OsvetPribory doPut");

	OsvetPribory osvetPribory = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    osvetPribory = gson.fromJson((String) en.nextElement(), OsvetPribory.class);
	}

	OsvetPriboryService osvetPriboryService = new OsvetPriboryService();
	osvetPriboryService.updateOsvetPribory(osvetPribory);

	// response
	List<OsvetPribory> osvetPriboryList = osvetPriboryService.findAllOsvetPribory();
	String json = gson.toJson(osvetPriboryList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter OsvetPribory doDelete");

	OsvetPribory osvetPribory = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    osvetPribory = gson.fromJson((String) en.nextElement(), OsvetPribory.class);
	}

	OsvetPriboryService osvetPriboryService = new OsvetPriboryService();
	osvetPriboryService.deleteOsvetPribory(osvetPribory);

	// response
	List<OsvetPribory> osvetPriboryList = osvetPriboryService.findAllOsvetPribory();
	String json = gson.toJson(osvetPriboryList);
	response.getWriter().write(json);
    }

}
