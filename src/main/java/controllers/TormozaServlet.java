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

import entity.Tormoza;
import services.TormozaService;

public class TormozaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public TormozaServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Tormoza doGet");

	Gson gson = new Gson();
	TormozaService tormozaService = new TormozaService();
	List<Tormoza> tormozaList = tormozaService.findAllTormoza();
	String json = gson.toJson(tormozaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Tormoza doPost");

	Tormoza tormoza = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    tormoza = gson.fromJson((String) en.nextElement(), Tormoza.class);
	}

	TormozaService tormozaService = new TormozaService();
	tormozaService.createTormoza(tormoza);

	// response
	List<Tormoza> tormozaList = tormozaService.findAllTormoza();
	String json = gson.toJson(tormozaList);
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

	System.out.println("Enter Tormoza doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	Tormoza tormoza = gson.fromJson(body, Tormoza.class);

	TormozaService tormozaService = new TormozaService();
	tormozaService.updateTormoza(tormoza);

	// response
	List<Tormoza> tormozaList = tormozaService.findAllTormoza();
	String json = gson.toJson(tormozaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter Tormoza doDelete");

	Integer tormozaId = Integer.parseInt(request.getParameter("id_tormoza"));

	TormozaService tormozaService = new TormozaService();
	Tormoza tormoza = tormozaService.findTormoza(tormozaId);
	tormozaService.deleteTormoza(tormoza);

	// response
	Gson gson = new Gson();
	List<Tormoza> tormozaList = tormozaService.findAllTormoza();
	String json = gson.toJson(tormozaList);
	response.getWriter().write(json);
    }

}
