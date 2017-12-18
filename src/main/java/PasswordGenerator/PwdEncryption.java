package PasswordGenerator;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.openqa.selenium.WebDriver;

public class PwdEncryption {
	
	WebDriver driver1;
	
	public PwdEncryption(){
		
	}
	
	public PwdEncryption(WebDriver driver){
		this.driver1=driver;
	}
	
	
	// encode data on your side using BASE64
	public String pwdEncode(String key){
		Base64.Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(key.getBytes(StandardCharsets.UTF_8) );
		//System.out.println("Encoded String : " + new String(encodedString));
		return new String(encodedString);
	}
	
	public String pwdDecode(String key){
	// Decode data on other side, by processing encoded data
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(key);
		//Verify the decoded string
		//System.out.println("Decoded String : " + new String(decodedByteArray));
		return new String(decodedByteArray);
	
	}
	
	public static void main(String [] args) {
		String password = "Test";
		PwdEncryption generate = new PwdEncryption();
		System.out.println("Encoded String : " + generate.pwdEncode(password));
		System.out.println("Decoded string : " + generate.pwdDecode("VGVzdA=="));
		
		
		
	}
}
