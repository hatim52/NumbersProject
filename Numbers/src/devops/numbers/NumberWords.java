package devops.numbers;
import java.util.*;

public class NumberWords {
	
	public static final ArrayList<String> tensNum = new ArrayList<String>(){{
	add(0,"");
	add(1,"TEN");
	add(2,"TWENTY");
	add(3,"THIRTY");
	add(4,"FORTY");
	add(5,"FIFTY");
	add(6,"SIXTY");
	add(7,"SEVENTY");
	add(8,"EIGHTY");
	add(9,"NINETY");
	}};
	
	public static final ArrayList<String> unitsNum = new ArrayList<String>(){{
	add(0,"ZERO");
	add(1,"ONE");
	add(2,"TWO");
	add(3,"THREE");
	add(4,"FOUR");
	add(5,"FIVE");
	add(6,"SIX");
	add(7,"SEVEN");
	add(8,"EIGH");
	add(9,"NINE");
	add(10,"TEN");
	add(11,"ELEVEN");
	add(12,"TWELVE");
	add(13,"THIRTEEN");
	add(14,"FOURTEEN");
	add(15,"FIFTEEN");
	add(16,"SIXTEEN");
	add(17,"SEVENTEEN");
	add(18,"EIGHTEEN");
	add(19,"NINETEEN");
	add(20,"TWENTY");
	}};
	
		
	public String toWords( int number ) {
		String result = "" ;
		String cent = "HUNDRED";
		
		int len=Integer.toString(number).length();
		
		if (number < 0 || number > 999){
			result="Number out of range";
			return result.trim() ;
		}
		if (number == 0){
			result ="Exit";
			return result.trim() ;
		}
		
		//while (number >0){
			switch (len)
			{
			case 3:  //result = unitsNum.get(number%10) + " " +result ;
			         result= this.TripleDigit(number);
       		         break;
			
			case 2:
			         result= this.doubleDigit(number);
                	 break;
            
			case 1:
				    result = this.unitsNum.get(number%10) + "  " + result ;
				    break;
			}

		//}
		
		System.out.println("Result" + result);
		return result.trim() ;
	}
  
	
	
   public String doubleDigit ( int number ){
	   String result = "" ;
	if (number <= 20){
		   result = this.unitsNum.get(number) + " " +result ;
 	 }
		 else {
			 if (number%10 == 0){
				 result = this.tensNum.get(number/10) + " " +result ;
			 }
			 else {	 
			     result = this.unitsNum.get(number%10) + " " +result ;
			     number=number/10;
			     result = this.tensNum.get(number%10) + " " +result ;
			 }
		 }
	return result.trim() ;
}
   public String TripleDigit ( int number ){
	   String result = "" ;
	if (number%100 == 0 ){
   	 result = this.unitsNum.get(number/100) + " HUNDRED " +result ;
   	return result.trim() ;
    }
	 result= doubleDigit(number%100);
     number=number/100;
   	 result = this.unitsNum.get(number%10) + " HUNDRED " + result ;
    	
   return result.trim() ;
   }
}
