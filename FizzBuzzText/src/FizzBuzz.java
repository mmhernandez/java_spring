
public class FizzBuzz {

//	private String fizzBuzz(int num) {
//		if(num % 15 == 0) {
//			return "FizzBuzz";
//		} else if(num % 3 == 0) {
//			return "Fizz";
//		} else if(num % 5 == 0) {
//			return "Buzz";
//		} else {
//			return Integer.toString(num);
//		}
//	}

	    public String fizzBuzz(int number) {
	        String rStr = "";
	        if(number % 3 == 0) {
	            rStr += "fizz";
	        }
	        if(number % 5 == 0) {
	            rStr += "buzz";
	        }
	        rStr = (rStr == "") ? Integer.toString(number) : rStr;
	        return rStr;
	    }

	
	public void getResults(int[] arr) {
		for(int each : arr) {
			String result = fizzBuzz(each);
			System.out.println(result);
		}
	}
	
}
