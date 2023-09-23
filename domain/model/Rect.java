package domain.model;

public class Rect extends Square{
    @Override
    public int getarea() {
        return getWidth()*getHeight();
    }
    private int Height=0;
   // override 
    public int getHeight() {
        return Height;
    }
    public void setHeight(int newHeight) {
        if (newHeight >=0) {
            Height=newHeight;
        }
    }
    
}
