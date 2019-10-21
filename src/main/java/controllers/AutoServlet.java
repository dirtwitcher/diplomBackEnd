package controllers;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Auto;
import services.AutoService;

public class AutoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    // private AutoService autoService;
    // private Auto auto;

    public AutoServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	System.out.println("Enter AUTO doGet");
	// TODO Auto-generated method stub
	// response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE");

	System.out.println("Enter AUTO doPost");

	Auto auto = null;

	Gson gson = new Gson();
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    auto = gson.fromJson((String) en.nextElement(), Auto.class);
	}

	System.out.println(auto);

	AutoService autoService = new AutoService();
	autoService.createAuto(auto);

// ----------------------------------------------

	autoService.findAllAuto();

	String json = new Gson().toJson(autoService);
	response.setContentType("application/jsonp");
	response.getWriter().write(json);
    }

}
