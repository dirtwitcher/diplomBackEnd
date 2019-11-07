package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Transmissiya;
import services.TransmissiyaService;

public class TransmissiyaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public TransmissiyaServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Transmissiya doGet");

	Gson gson = new Gson();
	TransmissiyaService transmissiyaService = new TransmissiyaService();
	List<Transmissiya> transmissiyaList = transmissiyaService.findAllTransmissiya();
	String json = gson.toJson(transmissiyaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Transmissiya doPost");

	Transmissiya transmissiya = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    transmissiya = gson.fromJson((String) en.nextElement(), Transmissiya.class);
	}

	TransmissiyaService transmissiyaService = new TransmissiyaService();
	transmissiyaService.createTransmissiya(transmissiya);

	// response
	List<Transmissiya> transmissiyaList = transmissiyaService.findAllTransmissiya();
	String json = gson.toJson(transmissiyaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter Transmissiya doPut");

	Transmissiya transmissiya = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    transmissiya = gson.fromJson((String) en.nextElement(), Transmissiya.class);
	}

	TransmissiyaService transmissiyaService = new TransmissiyaService();
	transmissiyaService.updateTransmissiya(transmissiya);

	// response
	List<Transmissiya> transmissiyaList = transmissiyaService.findAllTransmissiya();
	String json = gson.toJson(transmissiyaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter Transmissiya doDelete");

	Transmissiya transmissiya = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    transmissiya = gson.fromJson((String) en.nextElement(), Transmissiya.class);
	}

	TransmissiyaService transmissiyaService = new TransmissiyaService();
	transmissiyaService.deleteTransmissiya(transmissiya);

	// response
	List<Transmissiya> transmissiyaList = transmissiyaService.findAllTransmissiya();
	String json = gson.toJson(transmissiyaList);
	response.getWriter().write(json);
    }

}
