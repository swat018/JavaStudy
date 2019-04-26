package d.string.practice;

public class UseStringMethods {
	public static void main(String[] args) {
		UseStringMethods sample = new UseStringMethods();
		String text = "The String class represents character strings.";
		String findStr = "string";
		
		sample.printWords(text);
		sample.findString(text, findStr);
		sample.findAnyCaseString(text, findStr);
		sample.countChar(text, 's');
		sample.printContainWords(text, "ss");
	}
	
	public void printWords(String str) {
		String[] splitArray = str.split(" ");
		for (String temp:splitArray) {
			System.out.println(temp);
		}
	}
	public void findString(String str, String findStr) {
		int idx = str.indexOf(findStr);
		if (idx != -1) {
			System.out.println("string is appeared at " + idx);
		}
	}
	public void findAnyCaseString(String str, String findStr) {
		String lowerStr = str.toLowerCase();
		String lowerFindStr = findStr.toLowerCase();
		int idx = lowerStr.indexOf(lowerFindStr);
		if (idx != -1) {
//			System.out.println("string is appeared at " + str.toLowerCase().indexOf(findStr));
			System.out.println("string is appeared at " + idx);

	
		}
	}
	public void countChar(String str, char c) {
		int cnt = 0;
		char[] ch = str.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
			if (ch[i]==c) {
				cnt++;
			}
		}
		
		System.out.println("char '" + c + "' count is  " + cnt);
	}
	public void printContainWords(String str, String findStr) {
		String[] splitArray = str.split(" ");
		for (String temp:splitArray) {
			if (temp.contains(findStr)) {
				System.out.println(temp +  " contains " + findStr);
			}
		}
	}
}
