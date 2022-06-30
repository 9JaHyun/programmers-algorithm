package _01_2016;

class Sol2_V2 {
    private static final String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    public static void main(String[] args) {
        Sol2_V2 question = new Sol2_V2();
        int month = 5;
        int day = 24;
        String answer = question.calcDayOfWeek(question.calcDays(month) + day);
        System.out.println(answer);
    }

    // 해당 달의 최대 일 계산
    private int dayCalculator(int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29;
            default -> throw new IllegalArgumentException("잘못된 월 입력입니다.");
        };
    }

    private int calcDays(int month) {
        int monthDays = 0;
        for (int i = 1; i < month; i++) {
            monthDays += dayCalculator(i);
        }
        return monthDays;
    }

    private String calcDayOfWeek(int days) {
        return this.dayOfWeek[(days % 7)];
    }
}
