class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a=num.pop();
                int b=num.pop();
                num.push(a+b);
            }else if(tokens[i].equals("-")){
                int a=num.pop();
                int b=num.pop();
                num.push(b-a);
            }else if(tokens[i].equals("*")){
                int a=num.pop();
                int b=num.pop();
                num.push(a*b);
            }else if(tokens[i].equals("/")){
                int a=num.pop();
                int b=num.pop();
                num.push(b/a);
            }else{
                num.push(Integer.parseInt(tokens[i]));
            }
        }
            return num.peek();
    }
}