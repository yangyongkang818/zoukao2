package com.yyk.common;

import java.util.Calendar;
import java.util.Date;

public class PersonTest {

	public static void main(String[] args) throws Exception {
		
		for(int i=0;i<10000;i++){
			Person p=new Person();//创建Person对象
			//给name赋值
			p.setName(StringUtil.generateChineseName());
			//给年龄赋值
			p.setAge(RandomUtil.random(1, 120));
			//给介绍赋值
			p.setAbout(StringUtil.randomChineseString(140));
			
			//Calendar calendar=new Calendar();
			
			Date date=new Date();
			
			p.setCreated(new Date());
			
			System.out.println("第"+i+"个："+p);
		}
		
		
	}
}
