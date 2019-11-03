package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

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

}
