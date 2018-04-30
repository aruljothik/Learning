package com.regularexpression;

public class RegularExpTest {

	public static void main(String[] args) {

		/*String checkSingleWordString = "#";
		Pattern pattern = Pattern.compile("\\W");//Non Word Character
		//Pattern pattern = Pattern.compile("\\w");//Word Character
		Matcher matcher = pattern.matcher(checkSingleWordString);
		System.out.println(matcher.matches());*/
		
		String toCheckAllowedCharc = "ef";
		//Below check only single character
		//Character Classes
//		System.out.println(toCheckAllowedCharc.matches("[abc]"));
		//System.out.println(toCheckAllowedCharc.matches("[^abc]"));
//		System.out.println(toCheckAllowedCharc.matches("[a-zA-Z]"));
//		System.out.println(toCheckAllowedCharc.matches("[a-d[m-p]]"));
		//System.out.println(toCheckAllowedCharc.matches("[a-z&&[def]]"));
		//[a-z&&[^bc]]
		//[a-z&&[^m-p]]
		
		
	}

}
