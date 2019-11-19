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

import entity.OsnaschKuzova;
import services.OsnaschKuzovaService;

public class OsnaschKuzovaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public OsnaschKuzovaServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter OsnaschKuzova doGet");

	Gson gson = new Gson();
	OsnaschKuzovaService osnaschKuzovaService = new OsnaschKuzovaService();
	List<OsnaschKuzova> osnaschKuzovaList = osnaschKuzovaService.findAllOsnaschKuzova();
	String json = gson.toJson(osnaschKuzovaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter OsnaschKuzova doPost");

	OsnaschKuzova osnaschKuzova = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    osnaschKuzova = gson.fromJson((String) en.nextElement(), OsnaschKuzova.class);
	}

	OsnaschKuzovaService osnaschKuzovaService = new OsnaschKuzovaService();
	osnaschKuzovaService.createOsnaschKuzova(osnaschKuzova);

	// response
	List<OsnaschKuzova> osnaschKuzovaList = osnaschKuzovaService.findAllOsnaschKuzova();
	String json = gson.toJson(osnaschKuzovaList);
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

	System.out.println("Enter OsnaschKuzova doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	OsnaschKuzova osnaschKuzova = gson.fromJson(body, OsnaschKuzova.class);

	OsnaschKuzovaService osnaschKuzovaService = new OsnaschKuzovaService();
	osnaschKuzovaService.updateOsnaschKuzova(osnaschKuzova);

	// response
	List<OsnaschKuzova> osnaschKuzovaList = osnaschKuzovaService.findAllOsnaschKuzova();
	String json = gson.toJson(osnaschKuzovaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter OsnaschKuzova doDelete");

	Integer osnaschKuzovaId = Integer.parseInt(request.getParameter("id_osnaschKuzova"));

	OsnaschKuzovaService osnaschKuzovaService = new OsnaschKuzovaService();
	OsnaschKuzova osnaschKuzova = osnaschKuzovaService.findOsnaschKuzova(osnaschKuzovaId);
	osnaschKuzovaService.deleteOsnaschKuzova(osnaschKuzova);

	// response
	Gson gson = new Gson();
	List<OsnaschKuzova> osnaschKuzovaList = osnaschKuzovaService.findAllOsnaschKuzova();
	String json = gson.toJson(osnaschKuzovaList);
	response.getWriter().write(json);
    }

}
