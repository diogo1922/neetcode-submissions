class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if ( c == '(') { 
                stack.push(')');
            }
            else if ( c == '{'){
                stack.push('}');
            }
            else if( c == '['){
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();





        // Stack<Character> stack = new Stack<>();
        // Map<Character, Character> closeToOpen = new HashMap<>();
        // closeToOpen.put(')', '(');
        // closeToOpen.put('}', '{');
        // closeToOpen.put(']', '[');

        // for (char c : s.toCharArray()){
        //     if (closeToOpen.containsKey(c)){
        //         if(!stack.isEmpty() && stack.peek() == closeToOpen.get(c)){
        //             stack.pop();
        //         } else{ 
        //             return false;
        //         }
        //     } else{
        //         stack.push(c);
        //     }

        // }
        // return stack.isEmpty();
    }
}











     

