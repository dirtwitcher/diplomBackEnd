package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Dvigatel;
import services.DvigatelService;

public class DvigatelServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public DvigatelServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Dvigatel doGet");

	Gson gson = new Gson();
	DvigatelService dvigatelService = new DvigatelService();
	List<Dvigatel> dvigatelList = dvigatelService.findAllDvigatel();
	String json = gson.toJson(dvigatelList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Dvigatel doPost");

	Dvigatel dvigatel = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    dvigatel = gson.fromJson((String) en.nextElement(), Dvigatel.class);
	}

	DvigatelService dvigatelService = new DvigatelService();
	dvigatelService.createDvigatel(dvigatel);

	// response
	List<Dvigatel> dvigatelList = dvigatelService.findAllDvigatel();
	String json = gson.toJson(dvigatelList);
	response.getWriter().write(json);
    }

}
