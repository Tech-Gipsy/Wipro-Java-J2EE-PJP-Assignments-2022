// Initialize a character variable in a program and 

// print 'Alphabhet' if the initialized value is an alphabhet, 

// print 'Digit' if the initialized value is a number, and 

// print 'Special Character', if the initialized value is anything else.
public class fsc5 {


    public static void main(String[] args){
    char c = '@';
		if((c >= 65 && c <= 90) || (c >= 97 && c <= 122) ) {
        System.out.println("Alphabet");
    }
		else if(c >= 48 && c <= 57) {
        System.out.println("Numeric");
    }
		else {
        System.out.println("Special Character");
    }
}
}
