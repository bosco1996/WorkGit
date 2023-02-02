package org.base;

public class GitPractice {
	public static void main(String[] args) {
		System.out.println("Git practice \n");
		String s = "sun shines";
		System.out.println(s);
<<<<<<< HEAD
		System.out.println("now add code in Branch B");
		char charAt = s.charAt(0);
		System.out.println("first letter is : "+charAt);
=======
		boolean contains = s.contains("s");
		System.out.println(contains);
>>>>>>> 7f81652fa8ff5999d113eb4d5247ebbb8a949976
	}

}
