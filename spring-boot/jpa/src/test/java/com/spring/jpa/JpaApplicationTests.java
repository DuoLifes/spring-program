package com.spring.jpa;

import com.alibaba.fastjson.JSON;
import com.spring.jpa.entity.Persion;
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

import java.util.UUID;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	private WebApplicationContext context;
	private MockMvc mockMvc;

	@Before
	public void setUp() throws Exception {
		this.mockMvc = webAppContextSetup(this.context).build();//获取mockMvc实例
	}

	@Test
	public void create() throws Exception {
		Persion partner = new Persion();
		partner.setPersionId(UUID.randomUUID().toString());
		partner.setPersionName("张佩宇");
		partner.setPersionAge(25);

		String jsonstr = JSON.toJSON(partner).toString();
		System.out.println("================================请求入参："+jsonstr);
		String uri = "/api/persion";

		//====================================请求开始=================================
		//request构建
		RequestBuilder request = MockMvcRequestBuilders.post(uri)
				.contentType(MediaType.APPLICATION_JSON)
				.header("SESSIONNO", "")
				.content(jsonstr) ;
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
