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

import entity.Podveska;
import services.PodveskaService;

public class PodveskaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public PodveskaServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Podveska doGet");

	Gson gson = new Gson();
	PodveskaService podveskaService = new PodveskaService();
	List<Podveska> podveskaList = podveskaService.findAllPodveska();
	String json = gson.toJson(podveskaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Podveska doPost");

	Podveska podveska = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    podveska = gson.fromJson((String) en.nextElement(), Podveska.class);
	}

	PodveskaService podveskaService = new PodveskaService();
	podveskaService.createPodveska(podveska);

	// response
	List<Podveska> podveskaList = podveskaService.findAllPodveska();
	String json = gson.toJson(podveskaList);
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

	System.out.println("Enter Podveska doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	Podveska podveska = gson.fromJson(body, Podveska.class);

	PodveskaService podveskaService = new PodveskaService();
	podveskaService.updatePodveska(podveska);

	// response
	List<Podveska> podveskaList = podveskaService.findAllPodveska();
	String json = gson.toJson(podveskaList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter Podveska doDelete");

	Integer podveskaId = Integer.parseInt(request.getParameter("id_podveska"));

	PodveskaService podveskaService = new PodveskaService();
	Podveska podveska = podveskaService.findPodveska(podveskaId);
	podveskaService.deletePodveska(podveska);

	// response
	Gson gson = new Gson();
	List<Podveska> podveskaList = podveskaService.findAllPodveska();
	String json = gson.toJson(podveskaList);
	response.getWriter().write(json);
    }

}
