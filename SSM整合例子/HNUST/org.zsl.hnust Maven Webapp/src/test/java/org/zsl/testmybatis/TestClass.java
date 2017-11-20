package org.zsl.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.cglib.core.ClassesKey;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.pojo.Classes;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.impl.ClassServiceImpl;
import com.cn.hnust.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)	
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestClass {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Autowired
	private ClassServiceImpl classServiceImpl;
	@Test
	public void test1() {
		Classes model = classServiceImpl.getClass(1);
		
		logger.info(JSON.toJSONString(model));
	}
	@Test
	public void test2() {
		Classes model = classServiceImpl.getClass2(1);
		
		logger.info(JSON.toJSONString(model));
	}
	@Test
	public void test3() {
		Classes model = classServiceImpl.getClass3(1);
		
		logger.info(JSON.toJSONString(model));
	}
	@Test
	public void test4() {
		Classes model = classServiceImpl.getClass4(1);
		
		logger.info(JSON.toJSONString(model));
	}

}
