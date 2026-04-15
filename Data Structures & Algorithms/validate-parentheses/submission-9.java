class Solution {
    public boolean isValid(String s) {

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();


        for(int i=0; i<charArr.length; i++){
           
            if(!stack.isEmpty() && charArr[i] == '}' && stack.peek() == '{'){
                stack.pop();
            } else
            if(!stack.isEmpty() && charArr[i] == ']' && stack.peek() == '['){
                stack.pop();
            } else 
            if(!stack.isEmpty() && charArr[i] == ')' && stack.peek() == '('){
                stack.pop();
            } else {
                stack.push(charArr[i]);
            }
        }

        return stack.isEmpty();
        
    }
}
