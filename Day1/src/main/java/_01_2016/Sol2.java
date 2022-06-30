package _01_2016;

class Sol2 {
    private static final String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    public static void main(String[] args) {
        Sol2 question = new Sol2();
        String answer = question.getAnswer(5, 24);
        System.out.println(answer);
    }

    private String getAnswer(int a, int b) {
        int MAX_DAY = 0;
        for (int i = 1; i < a; i++) {
            MAX_DAY += switch (i) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> throw new IllegalArgumentException("잘못된 월 입력입니다.");
            };
        }

        return dayOfWeek[(MAX_DAY + b) % 7];
    }

}
