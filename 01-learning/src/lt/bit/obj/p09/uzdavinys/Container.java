package lt.bit.obj.p09.uzdavinys;

class Container implements IContainer {

    private Color[] colors = new Color[6];

    @Override
    public void add(Color c) {
        for (int i = 0; i < colors.length; i++)
            if (colors[i] == null) {
                colors[i] = c;
                break;
            }
    }

    @Override
    public int size() {
        int length = 0;
        for (Color c : colors) {
            if (c != null) {
                length++;
            }
        }
        return length;
    }

    @Override
    public Color get(int index) {
        return colors[index];
    }
}
