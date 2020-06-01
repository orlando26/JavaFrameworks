package com.orlando.musicws.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.orlando.musicws.entity.Album;
import com.orlando.musicws.entity.Person;
import com.orlando.musicws.exceptions.NonUniqueAlbumException;
import com.orlando.musicws.exceptions.NonUniqueEmailException;

public class Validations {
	
	public static void checkUniqueAlbumTitle(Album album) throws NonUniqueAlbumException {
		if(!(album == null)) throw new NonUniqueAlbumException();
	}
	
	public static void checkEmail(Person person) throws NonUniqueEmailException{
		if(!(person == null)) throw new NonUniqueEmailException();
	}
	
	public static String hash(String password) {
		// algoritmo tipo hash SHA-256 - SHA-1
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			md = null;
			e.printStackTrace();
		}
		
		md.update(password.getBytes());
		
		byte byteData[] = md.digest();
		
		// Bytes to String 
		StringBuffer sb = new StringBuffer();
		for (int i = 0;i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		//
		// (byteData[i] & 0xff) + 0x100, 16)
		
		
		return sb.toString();
	}
	
}
