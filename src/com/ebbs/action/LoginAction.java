package com.ebbs.action;

import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("execute"+"1221111111111111111111111");
		return super.execute();
	}
	public String login() throws Exception{
		
		System.out.println("login 。。。。。。。。。");
		return "SUCCESS";
	}
	
	@Test
	public void test(){
		String uuid=com.ebbs.util.DataUtil.generateUUID();
		System.out.println(uuid);
	}
	
}
