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

	System.out.println(auto);

	AutoService autoService = new AutoService();
	autoService.createAuto(auto);

	// response
	List<Auto> autoList = autoService.findAllAuto();
	String json = gson.toJson(autoList);
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

	System.out.println("Enter Auto doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	Auto auto = gson.fromJson(body, Auto.class);

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

	Integer autoId = Integer.parseInt(request.getParameter("id_auto"));

	AutoService autoService = new AutoService();
	Auto auto = autoService.findAuto(autoId);
	autoService.deleteAuto(auto);

	// response
	Gson gson = new Gson();
	List<Auto> autoList = autoService.findAllAuto();
	String json = gson.toJson(autoList);
	response.getWriter().write(json);
    }

}
