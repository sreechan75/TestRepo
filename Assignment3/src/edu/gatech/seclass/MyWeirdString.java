package edu.gatech.seclass;

public class MyWeirdString implements MyWeirdStringInterface {


	private String weirdString;
	
	@Override
	public void setWeirdString(String string) {
		
		this.weirdString = string;
		
	} //setWeirdString

	@Override
	public String getWeirdString() {

		return weirdString;
	} //getWeirdString

	@Override
	public String getEvenCharacters() {

		StringBuffer evenStringBuffer = new StringBuffer();
		
		for(int i=0; i<weirdString.length(); i++) {
			
			evenStringBuffer.append(weirdString.charAt(++i));
		}
		
		return evenStringBuffer.toString();
	
	} //getEvenCharacters

	@Override
	public String getOddCharacters() {
		StringBuffer oddStringBuffer = new StringBuffer();
		
		for(int i=0; i<weirdString.length(); i++) {
			
			oddStringBuffer.append(weirdString.charAt(i++));
		}
		
		return oddStringBuffer.toString();
	
	} //getOddCharacters

	@Override
	public int countDigits() {
		// TODO Auto-generated method stub
		return 0;
	
	} //countDigits

	@Override
	public void convertDigitsToRomanNumeralsInSubstring(int startPosition,
			int endPosition) throws MyIndexOutOfBoundsException,
			IllegalArgumentException {
		// TODO Auto-generated method stub

	} //convertDigits

	
	public static void main(String [] args) throws Exception {
		
		MyWeirdString mws = new MyWeirdString();
		mws.setWeirdString(args[0]);
		System.out.println(mws.getWeirdString());
		System.out.println("even string::"+mws.getEvenCharacters());
		System.out.println("odd string::"+mws.getOddCharacters());
	
	} //main
	
} //class
