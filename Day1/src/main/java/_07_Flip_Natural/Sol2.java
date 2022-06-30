package _07_Flip_Natural;

public class Sol2 implements Question7{

    @Override
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        return sb.append(n)
              .reverse()
              .chars()
              .map(Character::getNumericValue)
              .toArray();
    }
}

