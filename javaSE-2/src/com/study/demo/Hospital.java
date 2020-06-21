package com.study.demo;
/**
 * 医院信息使用变量输出
 * @author luozhipeng
 * @date   2020年6月21日
 * 练习
 */

public class Hospital {

	public static void main(String[] args) {
		String hospital = "天水三院";
		String idcard = "650214199001015988";
		String name = "王三";
		String mobile = "17794256337";
		String visitType = "社保卡";
		String department = "外科";
		String doctor = "终南山";
		String date = "20200621";
		double cost = 15.00;
		String expensetype = "专家门诊";
		int ordernumber = 01;
		String paymode = "微信支付";
		String warning = "弃诊超过三次将取消优先出号！";
		
		System.out.println("天水三院"+hospital);
		System.out.println("身份证号码:"+idcard);
		System.out.println("姓名:"+name);
		System.out.println("电话号码:"+mobile);
		System.out.println("就诊类型:"+visitType);
		System.out.println("科室:"+department);
		System.out.println("医生:"+doctor);
		System.out.println("就诊日期:"+date);
		System.out.println("挂号费:"+cost);
		System.out.println("费用类型:"+expensetype);
		System.out.println("就诊号:"+ordernumber);
		System.out.println("支付方式:"+paymode);
		System.out.println();
		System.out.println("--------挂号成功--------");
		System.out.println("警示:"+warning);
	
	}

}
