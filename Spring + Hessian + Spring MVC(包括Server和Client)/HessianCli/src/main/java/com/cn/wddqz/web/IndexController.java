package com.cn.wddqz.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.wddqz.manage.LoginTestInterfa;

/**
 * 通过Controller调用hessian接口
 * 类名称：IndexController
 * 类描述：
 * 创建人：wodediqizhang@163.com
 * 修改时间：2016-6-20 下午4:22:02
 * Modification History:
 * =============================================================================
 *   Author         Date          Description
 *   ------------ ---------- ---------------------------------------------------
 *   ghb            2016-6-20        创建文档 
 * =============================================================================
 * @version 1.0.0
 *
 */
@Controller
public class IndexController {

	@Autowired
	private LoginTestInterfa loginTestInterfa;
	@RequestMapping("/login")
	public ModelAndView indexView(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String loginInfo = loginTestInterfa.qualifyInfo(name,email);
		System.out.println("loginInfo="+loginInfo);
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", loginInfo);
		return mv;
	}
}
