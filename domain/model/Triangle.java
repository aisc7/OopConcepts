package domain.model;

public class Triangle extends Shape {
    private int sideSize = 0;
    private int sideSize2 = 0;
    private int sideSize3 = 0;

    @Override
    public int getarea() {
        return (int) getarea();
    }

    public void setSideSize(int sideSize) {
        if (sideSize >= 0) {
            this.sideSize = sideSize;
        }
    }

    public void setSideSize2(int sideSize2) {
        if (sideSize2 >= 0) {
            this.sideSize2 = sideSize2;
        }
    }

    public void setSideSize3(int sideSize3) {
        if (sideSize3 >= 0) {
            this.sideSize3 = sideSize3;
        }
    }

    public int getSideSize() {
        return this.sideSize;
    }

    public int getSideSize2() {
        return this.sideSize2;
    }

    public int getSideSize3() {
        return this.sideSize3;
    }
}