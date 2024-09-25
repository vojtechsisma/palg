
public class Array {
    int[] data;
    int elems;

    public Array(int size) {
        this.data = new int[size];
        this.elems = 0;
    }

    public void add(int value) {
        if (data.length == elems) {
            grow();
        }
        data[elems] = value;
        elems++;
    }

    public void add(int value, int pos) {
        if (data.length == elems) {
            grow();
        }
        for (int i = elems; i > pos; i--) {
            data[i] = data[i - 1];
        }
        data[pos] = value;
        elems++;
    }

    private void grow() {
        int[] newData = new int[elems * 2];
        System.arraycopy(data, 0, newData, 0, elems);
        this.data = newData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elems; i++) {
            sb.append(data[i] + ", ");
        }
        return sb.toString();
    }
}
