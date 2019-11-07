package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.SistemaOhlajdeniya;
import services.SistemaOhlajdeniyaService;

public class SistemaOhlajdeniyaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public SistemaOhlajdeniyaServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter SistemaOhlajdeniya doGet");

	Gson gson = new Gson();
	SistemaOhlajdeniyaService sistemaOhlajdeniyaService = new SistemaOhlajdeniyaService();
	List<SistemaOhlajdeniya> sistemaOhlajdeniyaList = sistemaOhlajdeniyaService.findAllSistemaOhlajdeniya();
	String json = gson.toJson(sistemaOhlajdeniyaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter SistemaOhlajdeniya doPost");

	SistemaOhlajdeniya sistemaOhlajdeniya = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    sistemaOhlajdeniya = gson.fromJson((String) en.nextElement(), SistemaOhlajdeniya.class);
	}

	SistemaOhlajdeniyaService sistemaOhlajdeniyaService = new SistemaOhlajdeniyaService();
	sistemaOhlajdeniyaService.createSistemaOhlajdeniya(sistemaOhlajdeniya);

	// response
	List<SistemaOhlajdeniya> sistemaOhlajdeniyaList = sistemaOhlajdeniyaService.findAllSistemaOhlajdeniya();
	String json = gson.toJson(sistemaOhlajdeniyaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter SistemaOhlajdeniya doPut");

	SistemaOhlajdeniya sistemaOhlajdeniya = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    sistemaOhlajdeniya = gson.fromJson((String) en.nextElement(), SistemaOhlajdeniya.class);
	}

	SistemaOhlajdeniyaService sistemaOhlajdeniyaService = new SistemaOhlajdeniyaService();
	sistemaOhlajdeniyaService.updateSistemaOhlajdeniya(sistemaOhlajdeniya);

	// response
	List<SistemaOhlajdeniya> sistemaOhlajdeniyaList = sistemaOhlajdeniyaService.findAllSistemaOhlajdeniya();
	String json = gson.toJson(sistemaOhlajdeniyaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter SistemaOhlajdeniya doDelete");

	SistemaOhlajdeniya sistemaOhlajdeniya = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    sistemaOhlajdeniya = gson.fromJson((String) en.nextElement(), SistemaOhlajdeniya.class);
	}

	SistemaOhlajdeniyaService sistemaOhlajdeniyaService = new SistemaOhlajdeniyaService();
	sistemaOhlajdeniyaService.deleteSistemaOhlajdeniya(sistemaOhlajdeniya);

	// response
	List<SistemaOhlajdeniya> sistemaOhlajdeniyaList = sistemaOhlajdeniyaService.findAllSistemaOhlajdeniya();
	String json = gson.toJson(sistemaOhlajdeniyaList);
	response.getWriter().write(json);
    }

}
