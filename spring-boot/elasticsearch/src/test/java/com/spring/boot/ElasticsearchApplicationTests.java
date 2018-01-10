package com.spring.boot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

	@Autowired
	private WebApplicationContext context;
	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		this.mockMvc = webAppContextSetup(this.context).build();//获取mockMvc实例
	}


	@Test
	public void create() throws Exception {

		String uri = "/api/article";

		//====================================请求开始=================================
		//request构建
		RequestBuilder request = MockMvcRequestBuilders.post(uri)
				.contentType(MediaType.APPLICATION_JSON)
				.header("SESSIONNO", "");
		// 执行请求
		MvcResult mvcResult = mockMvc.perform(request).andReturn() ;

		//获取response
		MockHttpServletResponse response = mvcResult.getResponse();
		//====================================请求结束=================================

		int status = response.getStatus();
		String content = response.getContentAsString();

		Assert.assertTrue("正确", status == 200);
		Assert.assertFalse("错误", status != 200);

		System.out.println("返回结果："+status);
		System.out.println(content);
	}

}
