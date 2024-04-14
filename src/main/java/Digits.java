import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    digitList = new ArrayList <Integer>();
	    if(num == 0){
		digitList.add(0);    
	    }
	    while(num != 0){
		digitList.add(0, num%10);
		num = num/10;    
	    }
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int = 0; i < digitList.size() - 1; i++){
			if(digitList.get(i+1) <= digitList.get(i)){
				return false;
			}
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
