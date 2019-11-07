package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.KorpusaPatrubki;
import services.KorpusaPatrubkiService;

public class KorpusaPatrubkiServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public KorpusaPatrubkiServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter KorpusaPatrubki doGet");

	Gson gson = new Gson();
	KorpusaPatrubkiService korpusaPatrubkiService = new KorpusaPatrubkiService();
	List<KorpusaPatrubki> korpusaPatrubkiList = korpusaPatrubkiService.findAllKorpusaPatrubki();
	String json = gson.toJson(korpusaPatrubkiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter KorpusaPatrubki doPost");

	KorpusaPatrubki korpusaPatrubki = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    korpusaPatrubki = gson.fromJson((String) en.nextElement(), KorpusaPatrubki.class);
	}

	KorpusaPatrubkiService korpusaPatrubkiService = new KorpusaPatrubkiService();
	korpusaPatrubkiService.createKorpusaPatrubki(korpusaPatrubki);

	// response
	List<KorpusaPatrubki> korpusaPatrubkiList = korpusaPatrubkiService.findAllKorpusaPatrubki();
	String json = gson.toJson(korpusaPatrubkiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter KorpusaPatrubki doPut");

	KorpusaPatrubki korpusaPatrubki = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    korpusaPatrubki = gson.fromJson((String) en.nextElement(), KorpusaPatrubki.class);
	}

	KorpusaPatrubkiService korpusaPatrubkiService = new KorpusaPatrubkiService();
	korpusaPatrubkiService.updateKorpusaPatrubki(korpusaPatrubki);

	// response
	List<KorpusaPatrubki> korpusaPatrubkiList = korpusaPatrubkiService.findAllKorpusaPatrubki();
	String json = gson.toJson(korpusaPatrubkiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter KorpusaPatrubki doDelete");

	KorpusaPatrubki korpusaPatrubki = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    korpusaPatrubki = gson.fromJson((String) en.nextElement(), KorpusaPatrubki.class);
	}

	KorpusaPatrubkiService korpusaPatrubkiService = new KorpusaPatrubkiService();
	korpusaPatrubkiService.deleteKorpusaPatrubki(korpusaPatrubki);

	// response
	List<KorpusaPatrubki> korpusaPatrubkiList = korpusaPatrubkiService.findAllKorpusaPatrubki();
	String json = gson.toJson(korpusaPatrubkiList);
	response.getWriter().write(json);
    }

}
