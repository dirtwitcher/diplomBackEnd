package controllers;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.KolesaDiski;
import services.KolesaDiskiService;

public class KolesaDiskiServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public KolesaDiskiServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "GET");

	System.out.println("Enter KolesaDiski doGet");

	Gson gson = new Gson();
	KolesaDiskiService kolesaDiskiService = new KolesaDiskiService();
	List<KolesaDiski> kolesaDiskiList = kolesaDiskiService.findAllKolesaDiski();
	String json = gson.toJson(kolesaDiskiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "POST");

	System.out.println("Enter KolesaDiski doPost");

	KolesaDiski kolesaDiski = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    kolesaDiski = gson.fromJson((String) en.nextElement(), KolesaDiski.class);
	}

	KolesaDiskiService kolesaDiskiService = new KolesaDiskiService();
	kolesaDiskiService.createKolesaDiski(kolesaDiski);

	// response
	List<KolesaDiski> kolesaDiskiList = kolesaDiskiService.findAllKolesaDiski();
	String json = gson.toJson(kolesaDiskiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "PUT");

	System.out.println("Enter KolesaDiski doPut");

	KolesaDiski kolesaDiski = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    kolesaDiski = gson.fromJson((String) en.nextElement(), KolesaDiski.class);
	}

	KolesaDiskiService kolesaDiskiService = new KolesaDiskiService();
	kolesaDiskiService.updateKolesaDiski(kolesaDiski);

	// response
	List<KolesaDiski> kolesaDiskiList = kolesaDiskiService.findAllKolesaDiski();
	String json = gson.toJson(kolesaDiskiList);
	response.getWriter().write(json);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	response.setHeader("Access-Control-Allow-Methods", "DELETE");

	System.out.println("Enter KolesaDiski doDelete");

	KolesaDiski kolesaDiski = null;

	Gson gson = new Gson();
	@SuppressWarnings("rawtypes")
	Enumeration en = request.getParameterNames();

	while (en.hasMoreElements()) {
	    kolesaDiski = gson.fromJson((String) en.nextElement(), KolesaDiski.class);
	}

	KolesaDiskiService kolesaDiskiService = new KolesaDiskiService();
	kolesaDiskiService.deleteKolesaDiski(kolesaDiski);

	// response
	List<KolesaDiski> kolesaDiskiList = kolesaDiskiService.findAllKolesaDiski();
	String json = gson.toJson(kolesaDiskiList);
	response.getWriter().write(json);
    }

}
