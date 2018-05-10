package leetcodeprac.Q0xx.Q06x;

import java.util.HashMap;

public class Q067AddBinary {
	
	public Q067AddBinary() {}

	public String addBinary(String a, String b) {

		StringBuffer result = new StringBuffer();
		
		int lengthA = a.length()-1;
		int lengthB = b.length()-1;
		
		String add = "0" ;
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("0", 0);
		map1.put("1", 1);
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(0, "0");
		map2.put(1, "1");

		int tmpA;
		int tmpB;
		
		while (lengthA >= 0 || lengthB >= 0 ) {
			tmpA = (lengthA >= 0 ) ? map1.get(a.charAt(lengthA)+"") : map1.get("0") ;
			tmpB = (lengthB >= 0 ) ? map1.get(b.charAt(lengthB)+"") : map1.get("0") ;
			result.insert(0,
					map2.get(
							( tmpA
							+ tmpB
							+ map1.get(add)
							) % 2
					)
					);
			add = (tmpA + tmpB + map1.get(add)) > 1 ? "1" : "0" ;
			
			lengthA--;
			lengthB--;
		}
		if ( add.equals("1") ) {
			result.insert(0, "1");
		}
		if ( result.length() == 0 ) {
			result.append("0");
		} 
		
		return result.toString();
	}
}
