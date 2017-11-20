package com.cn.wddqz.manage.impl;

import com.cn.wddqz.manage.LoginTestInterfa;
import org.springframework.stereotype.Service;
/**
 * Hessian Server的接口实现，client调用接口，会在这里进行业务处理
 * 类名称：LoginTestImpl
 * 类描述：
 * 创建人：wodediqizhang@163.com
 * 修改时间：2016-6-20 下午4:22:44
 * Modification History:
 * =============================================================================
 *   Author         Date          Description
 *   ------------ ---------- ---------------------------------------------------
 *   ghb            2016-6-20        创建文档 
 * =============================================================================
 * @version 1.0.0
 *
 */
@Service("loginTestInterfa")
public class LoginTestImpl implements LoginTestInterfa {

	@Override
	public String qualifyInfo(String name, String mail) {
		System.out.println("Hessian Server 接口调用");
		return "名字：["+name+"],邮箱：["+mail+"]";
	}
}
