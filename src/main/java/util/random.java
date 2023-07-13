package util;

import java.security.SecureRandom;

public class random {
	public static String sett() {
		SecureRandom ran = new SecureRandom();
		String s1 = Integer.toString(ran.nextInt(10));
		String s2 = Integer.toString(ran.nextInt(10));
		String s3 = Integer.toString(ran.nextInt(10));
		String s4 = Integer.toString(ran.nextInt(10));
		String s5 = Integer.toString(ran.nextInt(10));
		String s6 = Integer.toString(ran.nextInt(10));
		String s = s1+s2+s3+s4+s5+s6;
		return s;
	}

	
}
