package com.zzp.test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.zzp.beans.Teacher;
import com.zzp.util.CompareUtils;

public class Test {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.setName("张三丰");
		teacher1.setAge(23);
		teacher1.setAmount(new BigDecimal(12345.66));
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("李四海");
		teacher2.setAge(25);
		teacher2.setAmount(new BigDecimal(12345.66));
		
		try {
			List<Map<String, Object>> list = CompareUtils.compareTwoClass(teacher1, teacher2);
			System.out.println(list);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}