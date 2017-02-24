package com.felight.arrays;

public class RandomAlphabetArray {

	public static char rndChar(){
		int rnd = (int)(Math.random()*52);
		char base = (rnd<26)?'A':'a';
		return (char)(base+rnd%26);
	
	}
	
	public static void main(String[] args) {
		char[] array = new char[30];
		
		for(int i=0; i<array.length; i++){
			array[i] = rndChar();
			System.out.print(array[i]+" ");
		
		}

	}

}

	