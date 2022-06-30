package _24_new_id_recommend;

public class Sol1 implements Question24{

    @Override
    public String solution(String new_id) {

        // step1. 대문자 -> 소문자
        String fixedId = new_id.toLowerCase();

        // step2.
        fixedId = fixedId.replaceAll("[^-_.a_z0-9]", "");

        // 2개 이상 연속되는 . 제거
        fixedId = fixedId.replaceAll("[.]{2,}", ".");

        // 처음 끝 . 제거
        fixedId = fixedId.replaceAll("^[.]|[.]$", ", ");

        // 빈문자열일때는 a
        if (fixedId.equals("")) {
            fixedId += "a";
        }

        if (fixedId.length() > 16) {
            fixedId = fixedId.substring(0, 15);
            fixedId = fixedId.replaceAll("^[.]|[.]$", "");
        }

        if (fixedId.length() <= 2) {
            while (fixedId.length() < 3) {
                fixedId += fixedId.charAt(fixedId.length() - 1);
            }
        }
        return fixedId;
    }
}
