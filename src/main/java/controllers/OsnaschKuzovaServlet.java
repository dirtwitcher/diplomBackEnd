package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

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

}
