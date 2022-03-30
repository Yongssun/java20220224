package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		// Map:(Key,value)쌍으로 저장
		// (key,value):entry,entry는 순서가 없음
		// key 중복 불가

		Map<String, String> map = new HashMap<>();
		// put: entry 추가
		map.put("bts", "boy group");
		map.put("aespa", "girl group");
		map.put("tesla", "car");
		map.put("tesla", "elon musk"); // 키 중복되 3번째를 4번째가 덮어씀
		// size: entry 수
		int size = map.size();
		System.out.println(size);
		// get : key를 사용해서 value 얻음
		String val1 = map.get("bts");
		String val2 = map.get("aespa");
		String val3 = map.get("tesla");
		String val4 = map.get("bitcoin");
		
		System.out.println();
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
System.out.println(val1.charAt(0));
		// keyset: key를 set 타입으로 리턴
		Set<String> keys = map.keySet();
		System.out.println(keys);

		// 전체 탐색1: keyset, get
		Set<String> keyset = map.keySet();

		for (String key : keyset) {
			String value = map.get(key);

			System.out.println(key + ":" + value);
		}
//전체탐색 2:entrySet
	Set<Map.Entry<String, String>>	entries = map.entrySet();
	System.out.println(entries);
	
	for(Map.Entry<String,String> entry:entries) {
		System.out.println(entry);
	}
		//remove:key로 entry 삭제
	map.remove("tesla");
	System.out.println(map.size());
	System.out.println(map);
	
	//containsKey : key가 있는지 확인
	System.out.println(map.containsKey("aespa"));
	System.out.println(map.containsKey("tesla"));
	System.out.println(map.get("tesla")==null);
	
	}
	
}
