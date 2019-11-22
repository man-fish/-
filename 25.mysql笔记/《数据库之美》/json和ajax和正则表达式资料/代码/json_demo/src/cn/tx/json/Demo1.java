package cn.tx.json;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.tx.model.Person;
import net.sf.json.JSONObject;

public class Demo1 {
	
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "����");
		map.put("age", 12);
		map.put("address", "����");
		Person p = new Person("����",28, new Date(), "��Ϫ��");
		map.put("person", p);
		//��mapת����json����
		JSONObject obj = JSONObject.fromObject(map);
		//��json����ת�����ַ���
		String result = obj.toString();
		System.out.println(result);
		
	}

}
