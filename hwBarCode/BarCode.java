public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static int[] nums = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"}
    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if(zip.length() != 5){
	    throw new RuntimeException();
	}
	try{
	    _zip = Integer.parseInt(zip);
	    /*
	    String barCode = "";
	    for(int x = 0;x<5;x++){
	        barCode += nums[Integer.parseInt(zip.substring(x));
	    }
	    */
	}catch(NumberFormatException a){
	    System.out.println("Not a good zip");
	}
    }
    
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){}


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum = 0;
	for(int x =0:x<5;x++){
	    sum += Integer.parseInt(_zip.substring(x));
	   
	}
	return sum % 10;
    }
    
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){}


    public boolean equals(Object other){}
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){}
    // postcondition: compares the zip + checkdigit 

}