package kr.smhrd.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.API.KakaoAPI;
import kr.smhrd.model.NkDAO;
import kr.smhrd.model.RecipeBasicsVO;

public class GoLoginController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) {
		
		
		Boolean check =true;
		
		request.setAttribute("check", check);
		
		return "Login";
	}

}
