package _23_caesar_cipher;

public class Sol1 implements Question24 {

    @Override
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' ') {
                sb.append(ch);
                continue;
            }
            if(ch>='a' && ch<='z'){ //소문자
                if(ch+n>'z'){ // 더한 수가 z를 넘어가면
                    sb.append((char) (ch - 26 + n));
                } else {
                    sb.append((char) (ch + n));
                }
            } else if(ch>='A' && ch<='Z') { //대문자
                if(ch+n>'Z'){
                    sb.append((char) (ch - 26 + n));
                } else {
                    sb.append((char) (ch + n));
                }
            }
        }
        return sb.toString();
    }
}
