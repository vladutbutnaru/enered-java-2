package ro.adi.mesajController;

public class Palindrom {

	public boolean palindrom(int z){
		
		
		int palindrome = z; // copied number into variable
	    int reverse = 0;

	    while (palindrome != 0) {
	        int remainder = palindrome % 10;
	        reverse = reverse * 10 + remainder;
	        palindrome = palindrome / 10;
	    }

	    // if original and reverse of number is equal means
	    // number is palindrome in Java
	    if (z == reverse) {
	        return true;
	    }
	    return false;
	}
}

