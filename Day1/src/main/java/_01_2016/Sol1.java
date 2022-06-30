package _01_2016;

class Sol1 {

    public static void main(String[] args) {
        Sol1 question = new Sol1();
        System.out.println(question.getAnswer(5, 24));
    }

    public String getAnswer(int a, int b) {
        if (a > 12 || a < 1){
            throw new IllegalArgumentException("월은 1~12 사이에 있어야 합니다.");
        }

        final String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        final int[] daysOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (b > daysOfMonth[a-1] || b < 1){
            throw new IllegalArgumentException("해당 월에 없는 일입니다.");
        }

        int days = 0;
        for (int i = 0; i < a - 1; i++) {
            days += daysOfMonth[i];
        }
        days += b;
        return dayOfWeek[days % 7];
    }
}
