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

	System.out.println("Enter KorpusaPatrubki doPut");

	String body = inputStreamToString(request.getInputStream());
	Gson gson = new Gson();
	KorpusaPatrubki korpusaPatrubki = gson.fromJson(body, KorpusaPatrubki.class);

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

	Integer korpusaPatrubkiId = Integer.parseInt(request.getParameter("id_korpusaPatrubki"));

	KorpusaPatrubkiService korpusaPatrubkiService = new KorpusaPatrubkiService();
	KorpusaPatrubki korpusaPatrubki = korpusaPatrubkiService.findKorpusaPatrubki(korpusaPatrubkiId);
	korpusaPatrubkiService.deleteKorpusaPatrubki(korpusaPatrubki);

	// response
	Gson gson = new Gson();
	List<KorpusaPatrubki> korpusaPatrubkiList = korpusaPatrubkiService.findAllKorpusaPatrubki();
	String json = gson.toJson(korpusaPatrubkiList);
	response.getWriter().write(json);
    }

}
