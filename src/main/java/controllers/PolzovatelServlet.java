package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Polzovatel;
import services.PolzovatelService;

public class PolzovatelServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public PolzovatelServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Polzovatel doGet");

	Gson gson = new Gson();
	PolzovatelService polzovatelService = new PolzovatelService();
	List<Polzovatel> polzovatelList = polzovatelService.findAllPolzovatel();
	String json = gson.toJson(polzovatelList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Polzovatel doPost");

	Polzovatel polzovatel = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    polzovatel = gson.fromJson((String) en.nextElement(), Polzovatel.class);
	}

	PolzovatelService polzovatelService = new PolzovatelService();
	polzovatelService.createPolzovatel(polzovatel);

	// response
	List<Polzovatel> polzovatelList = polzovatelService.findAllPolzovatel();
	String json = gson.toJson(polzovatelList);
	response.getWriter().write(json);
    }

}