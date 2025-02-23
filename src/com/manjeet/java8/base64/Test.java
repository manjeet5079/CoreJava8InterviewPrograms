package com.manjeet.java8.base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.UUID;

public class Test {

	// Base 64 Encode and Decode
	//Basic
	//URL
	//Mime

	public static void main(String[] args) {

		System.out.println("==Basic Encoding and Decoding==");

		String credentials="username:password";

		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(credentials.getBytes());
		System.out.println("encodeToString : "+encodeToString);

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeToString.getBytes());
		String decodeStr=new String(decode);
		System.out.println("decodeStr : "+decodeStr);

		System.out.println("==URL Encoding and Decoding==");

		String url ="https://www.youtube.com/watch?v=ZhMOINkAKqU&list=PLwIi8rEnGr6zVxFI9FWcRrFRZQj5scjwQ&index=15";
		Encoder urlEncoder = Base64.getUrlEncoder();
		String encodeToString2 = urlEncoder.encodeToString(url.getBytes());
		System.out.println("encodeToString2 : "+encodeToString2);

		Decoder urlDecoder = Base64.getUrlDecoder();
		byte[] decode2 = urlDecoder.decode(encodeToString2.getBytes());
		String urlDecodeStr = new String(decode2);
		System.out.println("urlDecodeStr : "+urlDecodeStr);

		System.out.println("==Mime Encoding and Decoding==");

		String uuidString = UUID.randomUUID().toString();
		System.out.println("uuidString : "+uuidString);

		Encoder mimeEncoder = Base64.getMimeEncoder();
		String mimeEncodeToString = mimeEncoder.encodeToString(uuidString.getBytes());
		System.out.println("mimeEncodeToString : "+mimeEncodeToString);

		Decoder mimeDecoder = Base64.getMimeDecoder();
		byte[] decode3 = mimeDecoder.decode(mimeEncodeToString.getBytes());
		String mimeDecodeStr=new String(decode3);
		System.out.println("mimeDecodeStr : "+mimeDecodeStr);
	}
}
