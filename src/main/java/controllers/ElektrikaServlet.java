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

	System.out.println("Enter Elektrika doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	Elektrika elektrika = gson.fromJson(body, Elektrika.class);

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

	Integer elektrikaId = Integer.parseInt(request.getParameter("id_elektrika"));

	ElektrikaService elektrikaService = new ElektrikaService();
	Elektrika elektrika = elektrikaService.findElektrika(elektrikaId);
	elektrikaService.deleteElektrika(elektrika);

	// response
	Gson gson = new Gson();
	List<Elektrika> elektrikaList = elektrikaService.findAllElektrika();
	String json = gson.toJson(elektrikaList);
	response.getWriter().write(json);
    }

}
