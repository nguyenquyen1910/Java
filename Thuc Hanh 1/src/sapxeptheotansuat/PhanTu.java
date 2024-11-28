package sapxeptheotansuat;

public class PhanTu implements Comparable<PhanTu> {
    public int value, firstIndex, count;

    public PhanTu(int value, int firstIndex, int count) {
        this.value = value;
        this.firstIndex = firstIndex;
        this.count = count;
    }

    @Override
    public int compareTo(PhanTu o) {
        if (this.count == o.count) {
            return this.firstIndex - o.firstIndex;
        }
        return -(this.count - o.count);
    }
}
