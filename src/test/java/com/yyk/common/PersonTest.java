package com.yyk.common;

import java.util.Calendar;
import java.util.Date;

public class PersonTest {

	public static void main(String[] args) throws Exception {
		
		for(int i=0;i<10000;i++){
			Person p=new Person();//����Person����
			//��name��ֵ
			p.setName(StringUtil.generateChineseName());
			//�����丳ֵ
			p.setAge(RandomUtil.random(1, 120));
			//�����ܸ�ֵ
			p.setAbout(StringUtil.randomChineseString(140));
			
			//Calendar calendar=new Calendar();
			
			Date date=new Date();
			
			p.setCreated(new Date());
			
			System.out.println("��"+i+"����"+p);
		}
		
		
	}
}
