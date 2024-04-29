package CT.Programmers.Zero;

class p120851 {
    public int solution(String my_string) {
        int answer = 0 ;

        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);

            if(Character.isDigit(ch)){
                answer += Character.getNumericValue(ch);
            }
        }

        return answer;
    }
}
/*
class p120851 {
    public int solution(String myString) {
        return myString.chars()
        .mapToObj(i -> (char) i)
        .filter(Character::isDigit)
        .map(String::valueOf)
        .mapToInt(Integer::valueOf)
        .sum();
    }
}

 */