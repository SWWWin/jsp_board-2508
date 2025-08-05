package com.ll;

public class Calc {

    public static int run(String expression) {
        String[] tokens = expression.split(" ");
        int answer = Integer.parseInt(tokens[0]);
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                answer += Integer.parseInt(tokens[i + 1]);
            }


            else if(tokens[i].equals("-")){
                answer -= Integer.parseInt(tokens[i + 1]);
            }

            else if(tokens[i].equals("*")){
                answer *= Integer.parseInt(tokens[i + 1]);
            }
        }

        return answer;
    }
}
