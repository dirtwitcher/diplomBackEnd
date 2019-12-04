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

import entity.Kpp;
import services.KppService;

public class KppServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public KppServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Kpp doGet");

	Gson gson = new Gson();
	KppService kppService = new KppService();
	List<Kpp> kppList = kppService.findAllKpp();
	String json = gson.toJson(kppList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Kpp doPost");

	Kpp kpp = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    kpp = gson.fromJson((String) en.nextElement(), Kpp.class);
	}

	KppService kppService = new KppService();
	kppService.createKpp(kpp);

	// response
	List<Kpp> kppList = kppService.findAllKpp();
	String json = gson.toJson(kppList);
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

	System.out.println("Enter Kpp doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	Kpp kpp = gson.fromJson(body, Kpp.class);

	KppService kppService = new KppService();
	kppService.updateKpp(kpp);

	// response
	List<Kpp> kppList = kppService.findAllKpp();
	String json = gson.toJson(kppList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter Kpp doDelete");

	Integer kppId = Integer.parseInt(request.getParameter("id_kpp"));

	KppService kppService = new KppService();
	Kpp kpp = kppService.findKpp(kppId);
	kppService.deleteKpp(kpp);

	// response
	Gson gson = new Gson();
	List<Kpp> kppList = kppService.findAllKpp();
	String json = gson.toJson(kppList);
	response.getWriter().write(json);
    }

}
