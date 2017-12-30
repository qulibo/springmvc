package lession01;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
	@RequestMapping("/test")
	public String index(HttpServletResponse response, HttpServletRequest request) throws IOException {
		response.getWriter().println("hellow spring "+request.getParameter("id"));
		return null;
	}
	
}

