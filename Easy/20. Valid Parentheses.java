class Solution {
    public static boolean isValid(String s) {
        if(s.length() %2 != 0 ){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if (stack.isEmpty())
               return false;

            else if ( c == ')' && stack.peek() == '(' && !stack.isEmpty() ){
                stack.pop();
            }
            else if ( c == '}' && stack.peek() == '{' && !stack.isEmpty() ){
                stack.pop();
            }
            else if ( c == ']' && stack.peek() == '[' && !stack.isEmpty() ){
                stack.pop();
            }
            else{
                return false;
            }

        }
        return stack.isEmpty();

    }
}