// https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/
class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens==null||tokens.length==0)
            return 0;
       int ans;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {


        	if(isnum(tokens[i]))
        	{
        		st.push(Integer.valueOf(tokens[i]));
        		//System.out.println(st.peek());
        	}else
        	{

        		int one= st.peek();
        		st.pop();
        		int two= st.peek();
        		st.pop();
        		if(tokens[i].equals("+"))
        			st.push(one+two);
        		else if(tokens[i].equals("-"))
        			st.push(two-one);
        			else if(tokens[i].equals("*"))
        			st.push(one*two);
        			else if(tokens[i].equals("/"))
        			st.push(two/one);
        		else
        		{

  //  System.out.println("not Math");

        		}
        	//	System.out.println("Else"+st.peek());
        	}
        }
        return st.peek();
    
    }
    public  boolean isnum(String s)
    {
    	try
    	{
    		Integer.valueOf(s);
    		return true;
    	}catch(Exception e)
    	{
        		//System.out.println("Exception");
    		return false;
    	}
    }

}