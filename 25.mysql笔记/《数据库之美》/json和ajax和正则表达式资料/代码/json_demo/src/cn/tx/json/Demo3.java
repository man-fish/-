package cn.tx.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import cn.tx.model.Person;

public class Demo3 {
	
	public static void main(String[] args) {
		
		Person p = new Person("����",28, new Date(), "��Ϫ��");
		
		//String[] names = {"���", "����", "����"};
		
		//Object [] objs = {p, "����", 23};
		
		List list = new ArrayList();
		list.add(p);
		list.add("����");
		list.add(53);
 		JSONArray obj = JSONArray.fromObject(list);
		String result = obj.toString();
		System.out.println(result);
		
		
	}

}
