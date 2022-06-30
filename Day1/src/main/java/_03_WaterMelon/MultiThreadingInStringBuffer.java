package _03_WaterMelon;

public class MultiThreadingInStringBuffer {

    public static void main(String[] args) throws InterruptedException {
        builderTest();
//        System.out.println();
//        bufferTest();
    }

    private static void builderTest() throws InterruptedException {
        StringBuilder builder = new StringBuilder();
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                builder.append("수").append("박").append(",");
            }
        });
        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                builder.append("딸").append("기").append(",");
            }
        });
        Thread th3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                builder.append("키").append("위").append(",");
            }
        });
        Thread th4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                builder.append("사").append("과");
            }
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        th1.join();
        th2.join();
        th3.join();
        th4.join();

        System.out.println(builder);
    }

    private static void bufferTest() throws InterruptedException {
        StringBuffer buffer = new StringBuffer();
        Thread buffer1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                buffer.append("수");
                buffer.append("박");
            }
        });
        Thread buffer2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                buffer.append("딸");
                buffer.append("기");
            }
        });
        Thread buffer3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                buffer.append("키");
                buffer.append("위");
            }
        });
        Thread buffer4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                buffer.append("사");
                buffer.append("과");
            }
        });

        buffer1.start();
        buffer2.start();
        buffer3.start();
        buffer4.start();

        buffer1.join();
        buffer2.join();
        buffer3.join();
        buffer4.join();

        System.out.println(buffer);
    }
}
