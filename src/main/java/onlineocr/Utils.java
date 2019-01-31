package onlineocr;

import java.util.Base64;

public class Utils {
	public static byte [] Base64Decode(String encodedString) {
		return Base64.getDecoder().decode(encodedString);
	}

	public static byte [] Base64Encode(byte [] byteArray) {
		return Base64.getEncoder().encode(byteArray);
	}
}
