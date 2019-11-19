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

import entity.OtoplenieKondei;
import services.OtoplenieKondeiService;

public class OtoplenieKondeiServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public OtoplenieKondeiServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter OtoplenieKondei doGet");

	Gson gson = new Gson();
	OtoplenieKondeiService otoplenieKondeiService = new OtoplenieKondeiService();
	List<OtoplenieKondei> otoplenieKondeiList = otoplenieKondeiService.findAllOtoplenieKondei();
	String json = gson.toJson(otoplenieKondeiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter OtoplenieKondei doPost");

	OtoplenieKondei otoplenieKondei = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    otoplenieKondei = gson.fromJson((String) en.nextElement(), OtoplenieKondei.class);
	}

	OtoplenieKondeiService otoplenieKondeiService = new OtoplenieKondeiService();
	otoplenieKondeiService.createOtoplenieKondei(otoplenieKondei);

	// response
	List<OtoplenieKondei> otoplenieKondeiList = otoplenieKondeiService.findAllOtoplenieKondei();
	String json = gson.toJson(otoplenieKondeiList);
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

	System.out.println("Enter OtoplenieKondei doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	OtoplenieKondei otoplenieKondei = gson.fromJson(body, OtoplenieKondei.class);

	OtoplenieKondeiService otoplenieKondeiService = new OtoplenieKondeiService();
	otoplenieKondeiService.updateOtoplenieKondei(otoplenieKondei);

	// response
	List<OtoplenieKondei> otoplenieKondeiList = otoplenieKondeiService.findAllOtoplenieKondei();
	String json = gson.toJson(otoplenieKondeiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter OtoplenieKondei doDelete");

	Integer otoplenieKondeiId = Integer.parseInt(request.getParameter("id_otoplenieKondei"));

	OtoplenieKondeiService otoplenieKondeiService = new OtoplenieKondeiService();
	OtoplenieKondei otoplenieKondei = otoplenieKondeiService.findOtoplenieKondei(otoplenieKondeiId);
	otoplenieKondeiService.deleteOtoplenieKondei(otoplenieKondei);

	// response
	Gson gson = new Gson();
	List<OtoplenieKondei> otoplenieKondeiList = otoplenieKondeiService.findAllOtoplenieKondei();
	String json = gson.toJson(otoplenieKondeiList);
	response.getWriter().write(json);
    }

}
