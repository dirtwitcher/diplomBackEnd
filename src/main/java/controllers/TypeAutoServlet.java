package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.TypeAuto;
import services.TypeAutoService;

public class TypeAutoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public TypeAutoServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter TypeAuto doGet");

	Gson gson = new Gson();
	TypeAutoService typeAutoService = new TypeAutoService();
	List<TypeAuto> typeAutoList = typeAutoService.findAllTypeAuto();
	String json = gson.toJson(typeAutoList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter TypeAuto doPost");

	TypeAuto typeAuto = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    typeAuto = gson.fromJson((String) en.nextElement(), TypeAuto.class);
	}

	TypeAutoService typeAutoService = new TypeAutoService();
	typeAutoService.createTypeAuto(typeAuto);

	// response
	List<TypeAuto> typeAutoList = typeAutoService.findAllTypeAuto();
	String json = gson.toJson(typeAutoList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter TypeAuto doPut");

	TypeAuto typeAuto = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    typeAuto = gson.fromJson((String) en.nextElement(), TypeAuto.class);
	}

	TypeAutoService typeAutoService = new TypeAutoService();
	typeAutoService.updateTypeAuto(typeAuto);

	// response
	List<TypeAuto> typeAutoList = typeAutoService.findAllTypeAuto();
	String json = gson.toJson(typeAutoList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter TypeAuto doDelete");

	TypeAuto typeAuto = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    typeAuto = gson.fromJson((String) en.nextElement(), TypeAuto.class);
	}

	TypeAutoService typeAutoService = new TypeAutoService();
	typeAutoService.deleteTypeAuto(typeAuto);

	// response
	List<TypeAuto> typeAutoList = typeAutoService.findAllTypeAuto();
	String json = gson.toJson(typeAutoList);
	response.getWriter().write(json);
    }

}
