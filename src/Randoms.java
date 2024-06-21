import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            // Возвращаем true, чтобы итератор был бесконечным
            return true;
        }

        @Override
        public Integer next() {
            // Генерируем случайное число в диапазоне [min, max]
            return random.nextInt((max - min) + 1) + min;
        }
    }
}