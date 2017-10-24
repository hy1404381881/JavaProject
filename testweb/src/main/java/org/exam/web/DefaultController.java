package org.exam.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
/**
 * Created by xin on 15/1/7.
 */
@Controller
public class DefaultController {
	@RequestMapping("/")
	public String index(Model model,HttpServletRequest request,String action,String msg){
		HttpSession session=request.getSession();
		if ("set".equals(action)){
			session.setAttribute("msg", msg);
		}else if ("get".equals(action)){
			String message=(String)session.getAttribute("msg");
			System.out.println("message = " + message);
			model.addAttribute("msgFromRedis",message);
		}
		return "index";
	}
}
