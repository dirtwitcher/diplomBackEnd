package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Auto;
import services.AutoService;

public class AutoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public AutoServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Auto doGet");

	Gson gson = new Gson();
	AutoService autoService = new AutoService();
	List<Auto> autoList = autoService.findAllAuto();
	String json = gson.toJson(autoList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Auto doPost");

	Auto auto = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    auto = gson.fromJson((String) en.nextElement(), Auto.class);
	}

	AutoService autoService = new AutoService();
	autoService.createAuto(auto);

	// response
	List<Auto> autoList = autoService.findAllAuto();
	String json = gson.toJson(autoList);
	response.getWriter().write(json);
    }

    // update
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter Auto doPut");

	Auto auto = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    auto = gson.fromJson((String) en.nextElement(), Auto.class);
	}

	AutoService autoService = new AutoService();
	autoService.updateAuto(auto);

	// response
	List<Auto> autoList = autoService.findAllAuto();
	String json = gson.toJson(autoList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter Auto doDelete");

	Auto auto = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    auto = gson.fromJson((String) en.nextElement(), Auto.class);
	}

	AutoService autoService = new AutoService();
	autoService.deleteAuto(auto);

	// response
	List<Auto> autoList = autoService.findAllAuto();
	String json = gson.toJson(autoList);
	response.getWriter().write(json);
    }

}
