package com.mybatis.v1;

import com.mybatis.v1.config.SpringMybatisConfig;
import com.mybatis.v1.dao.AccountMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/4 15:07
 */
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(SpringMybatisConfig.class);

	/*	AccountServiceImpl accountService = (AccountServiceImpl) context.getBean("accountServiceImpl");
		AccountInfo accountInfo = accountService.qryById("1234562");
		System.out.println(accountInfo);*/

		AccountMapper accountMapper = (AccountMapper) context.getBean("accountMapper");

		accountMapper.qryById("11111");

	}

}
