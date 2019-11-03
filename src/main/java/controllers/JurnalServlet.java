package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Jurnal;
import services.JurnalService;

public class JurnalServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public JurnalServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter Jurnal doGet");

	Gson gson = new Gson();
	JurnalService jurnalService = new JurnalService();
	List<Jurnal> jurnalList = jurnalService.findAllJurnal();
	String json = gson.toJson(jurnalList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter Jurnal doPost");

	Jurnal jurnal = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    jurnal = gson.fromJson((String) en.nextElement(), Jurnal.class);
	}

	JurnalService jurnalService = new JurnalService();
	jurnalService.createJurnal(jurnal);

	// response
	List<Jurnal> jurnalList = jurnalService.findAllJurnal();
	String json = gson.toJson(jurnalList);
	response.getWriter().write(json);
    }

}
