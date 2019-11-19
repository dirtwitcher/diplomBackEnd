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

import entity.KuzovnieDetali;
import services.KuzovnieDetaliService;

public class KuzovnieDetaliServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public KuzovnieDetaliServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter KuzovnieDetali doGet");

	Gson gson = new Gson();
	KuzovnieDetaliService kuzovnieDetaliService = new KuzovnieDetaliService();
	List<KuzovnieDetali> kuzovnieDetaliList = kuzovnieDetaliService.findAllKuzovnieDetali();
	String json = gson.toJson(kuzovnieDetaliList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter KuzovnieDetali doPost");

	KuzovnieDetali kuzovnieDetali = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    kuzovnieDetali = gson.fromJson((String) en.nextElement(), KuzovnieDetali.class);
	}

	KuzovnieDetaliService kuzovnieDetaliService = new KuzovnieDetaliService();
	kuzovnieDetaliService.createKuzovnieDetali(kuzovnieDetali);

	// response
	List<KuzovnieDetali> kuzovnieDetaliList = kuzovnieDetaliService.findAllKuzovnieDetali();
	String json = gson.toJson(kuzovnieDetaliList);
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

	System.out.println("Enter KuzovnieDetali doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	KuzovnieDetali kuzovnieDetali = gson.fromJson(body, KuzovnieDetali.class);

	KuzovnieDetaliService kuzovnieDetaliService = new KuzovnieDetaliService();
	kuzovnieDetaliService.updateKuzovnieDetali(kuzovnieDetali);

	// response
	List<KuzovnieDetali> kuzovnieDetaliList = kuzovnieDetaliService.findAllKuzovnieDetali();
	String json = gson.toJson(kuzovnieDetaliList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter KuzovnieDetali doDelete");

	Integer kuzovnieDetaliId = Integer.parseInt(request.getParameter("id_kuzovnieDetali"));

	KuzovnieDetaliService kuzovnieDetaliService = new KuzovnieDetaliService();
	KuzovnieDetali kuzovnieDetali = kuzovnieDetaliService.findKuzovnieDetali(kuzovnieDetaliId);
	kuzovnieDetaliService.deleteKuzovnieDetali(kuzovnieDetali);

	// response
	Gson gson = new Gson();
	List<KuzovnieDetali> kuzovnieDetaliList = kuzovnieDetaliService.findAllKuzovnieDetali();
	String json = gson.toJson(kuzovnieDetaliList);
	response.getWriter().write(json);
    }

}
