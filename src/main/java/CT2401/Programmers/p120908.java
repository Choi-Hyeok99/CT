package CT2401.Programmers;

class p120908 {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean result = str1.contains(str2);
        return result ? 1 : 2;
    }
}