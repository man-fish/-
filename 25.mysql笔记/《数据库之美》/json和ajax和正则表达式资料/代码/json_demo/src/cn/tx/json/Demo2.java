package cn.tx.json;

import java.util.Date;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import cn.tx.model.Person;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Person p = new Person("����",28, new Date(), "��Ϫ��");
		
		//����json���ö���
		/*JsonConfig jc = new JsonConfig();
		String[] attrs = {"birthday","name"};
		jc.setExcludes(attrs);
		
		//��mapת����json����
		JSONObject obj = JSONObject.fromObject(p, jc);*/
		JSONObject obj = JSONObject.fromObject(p);
		//��json����ת�����ַ���
		String result = obj.toString();
		System.out.println(result);
		
	}

}
