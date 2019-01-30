package onlineocr;

import java.util.Base64;

public class Utils {
	public static byte [] Base64Decode(String encodedString) {
		return Base64.getDecoder().decode(encodedString);
	}
}
