package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

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

}
