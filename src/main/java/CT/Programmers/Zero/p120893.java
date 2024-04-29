package CT.Programmers.Zero;

class p120893 {
    public String solution(String my_string) {

        StringBuilder answer = new StringBuilder();

        for(char ch : my_string.toCharArray()){
            if(Character.isUpperCase(ch)){
                answer.append(Character.toLowerCase(ch));
            } else if(Character.isLowerCase(ch)){
                answer.append(Character.toUpperCase(ch));
            } else {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}
