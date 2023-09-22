package domain.model;

public class Rect extends Square{
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
