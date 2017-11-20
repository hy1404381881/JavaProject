package com.cn.hnust.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IClass;
import com.cn.hnust.pojo.Classes;
@Service
public class ClassServiceImpl {
	@Autowired
	private IClass iClass;
	public Classes getClass(int id) {
		Classes model=iClass.getClass(id);
		return model;
	}
	public Classes getClass2(int id) {
		Classes model=iClass.getClass2(id);
		return model;
	}
	public Classes getClass3(int id) {
		Classes model=iClass.getClass3(id);
		return model;
	}
	public Classes getClass4(int id) {
		Classes model=iClass.getClass4(id);
		return model;
	}
}
