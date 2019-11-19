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

import entity.DopTovari;
import services.DopTovariService;

public class DopTovariServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public DopTovariServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter DopTovari doGet");

	Gson gson = new Gson();
	DopTovariService dopTovariService = new DopTovariService();

	List<DopTovari> dopTovariList = dopTovariService.findAllDopTovari();
	String json = gson.toJson(dopTovariList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter DopTovari doPost");

	DopTovari dopTovari = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    dopTovari = gson.fromJson((String) en.nextElement(), DopTovari.class);
	}

	DopTovariService dopTovariService = new DopTovariService();
	dopTovariService.createDopTovari(dopTovari);

	// response
	List<DopTovari> dopTovariList = dopTovariService.findAllDopTovari();
	String json = gson.toJson(dopTovariList);
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

	System.out.println("Enter DopTovari doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	DopTovari dopTovari = gson.fromJson(body, DopTovari.class);

	DopTovariService dopTovariService = new DopTovariService();
	dopTovariService.updateDopTovari(dopTovari);

	// response
	List<DopTovari> dopTovariList = dopTovariService.findAllDopTovari();
	String json = gson.toJson(dopTovariList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter DopTovari doDelete");

	Integer dopTovariId = Integer.parseInt(request.getParameter("id_dopTovari"));

	DopTovariService dopTovariService = new DopTovariService();
	DopTovari dopTovari = dopTovariService.findDopTovari(dopTovariId);
	dopTovariService.deleteDopTovari(dopTovari);

	// response
	Gson gson = new Gson();
	List<DopTovari> dopTovariList = dopTovariService.findAllDopTovari();
	String json = gson.toJson(dopTovariList);
	response.getWriter().write(json);
    }

}
