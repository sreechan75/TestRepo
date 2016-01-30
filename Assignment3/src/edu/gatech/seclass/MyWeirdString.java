package edu.gatech.seclass;

import java.util.HashMap;
import java.util.Map;

public class MyWeirdString implements MyWeirdStringInterface {

	private String weirdString;

	Map<Integer, String> mp = new HashMap<Integer, String>();
	
	public MyWeirdString() {
		
		mp.put(1, "I");
		mp.put(2, "II");
		mp.put(3, "III");
		mp.put(4, "IV");
		mp.put(5, "V");
		mp.put(6, "VI");
		mp.put(7, "VII");
		mp.put(8, "VIII");
		mp.put(9, "IX");
	}
	
	@Override
	public void setWeirdString(String string) {
		
		weirdString = string;
		
		if(weirdString == null)
			throw new IllegalArgumentException("null is an Invalid String.");
		
	}//setWeirdString

	@Override
	public String getWeirdString() {

		return weirdString;
	
	} //getWeirdString

	@Override
	public String getEvenCharacters() {

		StringBuffer evenStringBuffer = new StringBuffer();
		
		for(int i=0; i<weirdString.length(); i++) {
			
			if((i+1) < weirdString.length()) //check if index is not exceeding the string length.
				evenStringBuffer.append(weirdString.charAt(++i));
		}
		
		return evenStringBuffer.toString();
	
	}//getEvenCharacters

	@Override
	public String getOddCharacters() {

		StringBuffer oddStringBuffer = new StringBuffer();
		
		for(int i=0; i<weirdString.length(); i++) {
			
			oddStringBuffer.append(weirdString.charAt(i++));
		}
		
		return oddStringBuffer.toString();
	
	}//getOddCharacters

	@Override
	public int countDigits() {

		int count = 0;
		
		for(int i=0; i<weirdString.length(); i++) {
			if(Character.isDigit(weirdString.charAt(i))) {
				count++;
			}
		}
		 
		
		return count;
	
	}//countDigits

	@Override
	public void convertDigitsToRomanNumeralsInSubstring(int startPosition,	int endPosition) throws MyIndexOutOfBoundsException,
			IllegalArgumentException {

		if(startPosition > endPosition) {
			throw new IllegalArgumentException("startPosition/endPosition Invalid");
		}
		else if(startPosition > getWeirdString().length() || endPosition > getWeirdString().length()) {
			throw new MyIndexOutOfBoundsException();
		}
		
		String inputStr = getWeirdString();
		
		StringBuffer outputStrBuffer = new StringBuffer();
		
		String subStr = inputStr.substring(startPosition, endPosition);
		System.out.println("subStr::"+subStr);
		
		StringBuffer subStrBuffer = new StringBuffer();
		
		try {

			for(int i=0; i<subStr.length(); i++) {
				
				int digit = 0;
				
				if(Character.isDigit(subStr.charAt(i))) {
					
					digit = Character.getNumericValue(subStr.charAt(i));
					System.out.println("digit::"+digit);
					if(digit > 0) {
						
						subStrBuffer.append(mp.get(digit));
					}
					else {
						subStrBuffer.append(digit);
					}
				}
				else {
					subStrBuffer.append(subStr.charAt(i));
				}
			}
			System.out.println("subStrBuffer::"+subStrBuffer);
			
			outputStrBuffer.append(inputStr.substring(0, startPosition));
			outputStrBuffer.append(subStrBuffer);
			outputStrBuffer.append(inputStr.substring(endPosition, inputStr.length()));
		
			System.out.println("outputStrBuffer::"+outputStrBuffer.toString());
			
			setWeirdString(outputStrBuffer.toString());
		}
		catch(MyIndexOutOfBoundsException sobe) {

			throw new MyIndexOutOfBoundsException();
		}
		catch(IllegalArgumentException iae) {

			throw new IllegalArgumentException(iae.getMessage());
		}
		
	}//convertDigits

	
	public static void main(String [] args) throws Exception {
		
		MyWeirdString mws = new MyWeirdString();
		mws.setWeirdString(args[0]);
		System.out.println(mws.getWeirdString());
		System.out.println("even string::"+mws.getEvenCharacters());
		System.out.println("odd string::"+mws.getOddCharacters());

//		System.out.println("digit count::"+mws.countDigits());
		
	}//main
	
}//class
