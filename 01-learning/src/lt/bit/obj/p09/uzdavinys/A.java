package lt.bit.obj.p09.uzdavinys;

class A implements Color {
    private int color;

    public A(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }
}
