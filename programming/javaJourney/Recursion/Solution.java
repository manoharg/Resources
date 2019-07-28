import java.lang.*;
public class Solution
{
	static String alphabet ="ABCDEFGHIJKLMNOPQRSTUVXYZ";

public static void recur(int digits[], int ind, String word)
{
	if(ind==digits.length)
	{
		System.out.println(word);
		return;
	}
	int sum=0;
	for(int i=ind;i<=Math.min(ind+1, digits.length-1);i++)
	{
		sum= sum*10+ digits[i];
		if(sum>0&&sum<=26)
			recur(digits, i+1, word+ alphabet.charAt(sum-1));
	}

}

	public static void main(String[] args) {
	
	int digits[]={1,2,2};
	recur(digits, 0, "");	
	}
}