package com.study.demo;
/**
 * 使用变量名称：描述人的信息
 * @author luozhipeng
 * @date   2020年6月21日
 */
public class Demo3 {

	public static void main(String[] args) {
		//变量不要使用中文
		//变量命名：一个英文单词或缩写，二是两个单词中间使用"_" 下划线，三驼峰式命名；
		//类名称首字母大写，方法名首字母小写，变量名首字母小写；
		String userName = "李四";
		//name:姓名
		String user_name = "张三";//字符串使用是双引号（""）
		//age:年龄
		int age = 18 ;
		//salary:月薪
		double salary = 3000.58;
		//address:地址
		String address = "地址";
		//hobbys:爱好 多个使用数组
		String hobbys = "打篮球，看电视";
		//sex：性别
		char sex = '男';
		
		System.out.println("姓名:"+user_name);
		System.out.println("年龄:"+age);
		System.out.println(); //输出空行
		System.out.println("月薪:"+salary);
		System.out.println("地址:"+address);
		System.out.println("爱好:"+hobbys);
		System.out.println("性别:"+sex);
		System.out.println("--------------");
		System.out.println("姓名:"+userName);
		   
	}

}
