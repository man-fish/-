package cn.tx.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import cn.tx.model.Person;

public class Demo5 {
	
	public static void main(String[] args) {
		
		/*List<Person> pList = new ArrayList<Person>();
		for(int i = 0; i < 5;i ++){
			Person p = new Person(\"����\"+i,28, new Date(), \"��Ϫ��\");
			pList.add(p);
		}
		
		JSONArray ja = JSONArray.fromObject(pList);
		String result = ja.toString();
		System.out.println(result);*/
		
		String str = "[{\"address\":\"��Ϫ��\",\"age\":28,\"birthday\":{\"date\":8,\"day\":6,\"hours\":16,\"minutes\":24,\"month\":9,\"seconds\":34,\"time\":1475915074368,\"timezoneOffset\":-480,\"year\":116},\"name\":\"����0\"},{\"address\":\"��Ϫ��\",\"age\":28,\"birthday\":{\"date\":8,\"day\":6,\"hours\":16,\"minutes\":24,\"month\":9,\"seconds\":34,\"time\":1475915074368,\"timezoneOffset\":-480,\"year\":116},\"name\":\"����1\"},{\"address\":\"��Ϫ��\",\"age\":28,\"birthday\":{\"date\":8,\"day\":6,\"hours\":16,\"minutes\":24,\"month\":9,\"seconds\":34,\"time\":1475915074368,\"timezoneOffset\":-480,\"year\":116},\"name\":\"����2\"},{\"address\":\"��Ϫ��\",\"age\":28,\"birthday\":{\"date\":8,\"day\":6,\"hours\":16,\"minutes\":24,\"month\":9,\"seconds\":34,\"time\":1475915074368,\"timezoneOffset\":-480,\"year\":116},\"name\":\"����3\"},{\"address\":\"��Ϫ��\",\"age\":28,\"birthday\":{\"date\":8,\"day\":6,\"hours\":16,\"minutes\":24,\"month\":9,\"seconds\":34,\"time\":1475915074368,\"timezoneOffset\":-480,\"year\":116},\"name\":\"����4\"}]";
		JSONArray ja = JSONArray.fromObject(str);
		//����json���ö���
		JsonConfig jc = new JsonConfig();
		//����json��Ҫת������
		jc.setRootClass(Person.class);
		List<Person> pList = (List<Person>) JSONSerializer.toJava(ja,jc);
		/*for(int i = 0; i < pList.size(); i++){
			Person person = pList.get(i);
			System.out.println(person);
		}*/
		for(Person p : pList){
			System.out.println(p.getName());
		}
		//System.out.println(pList);
	}

}
