import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.add(8);
        maxHeap.add(6);
        maxHeap.add(7);
        maxHeap.add(2);
        maxHeap.add(5);
        maxHeap.add(4);
        System.out.println(maxHeap.cache);

        System.out.println(maxHeap.pop());
        System.out.println("after pop(): " + maxHeap.cache);
    }

    private List<Integer> cache;

    public MaxHeap() {
        this.cache = new ArrayList();
        cache.add(0);
    }

    private void add(int num) {
        // 1st. 일단 집어넣고..
        cache.add(num);

        int numIdx = cache.size() - 1;
        // 2nd. 부모 노드가 있는가? && 부모 노드보다 더 큰가?
        while (numIdx > 1 && cache.get(numIdx / 2) < cache.get(numIdx)) {
            swap(numIdx / 2, numIdx);
            numIdx /= 2;
        }
    }

    public int pop() {
        int rootNum = cache.get(1);
        cache.set(1, cache.get(cache.size() - 1));
        cache.remove(cache.size() - 1);

        int currentIdx = 1;
        while (currentIdx < (cache.size() - 1) / 2) {
            int leftChildIdx = currentIdx * 2;
            int rightChildIdx = currentIdx * 2 + 1;
            int maxIdx = currentIdx;

            if (leftChildIdx <= cache.size() - 1 && cache.get(leftChildIdx) > cache.get(maxIdx)) {
                maxIdx = leftChildIdx;
            }
            if (rightChildIdx <= cache.size() - 1 && cache.get(rightChildIdx) > cache.get(maxIdx)) {
                maxIdx = rightChildIdx;
            }
            if (maxIdx == currentIdx) {
                break;
            }
            swap(currentIdx, maxIdx);
        }
        return rootNum;
    }

    private void swap(int index1, int index2) {
        int temp = cache.get(index1);
        cache.set(index1, cache.get(index2));
        cache.set(index2, temp);
    }
}
