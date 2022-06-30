package _03_WaterMelon;


public class StringTest {

    public static void main(String[] args) {
        String str = "수박수박";
        String another = str + "수박";
        String theOther = str + "수박";

        System.out.println(another == theOther);
    }
}
