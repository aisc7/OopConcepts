package domain.model;

public abstract class Elipse extends Circle{
    @Override
    public int getarea() {
        return (int) getArea();
    }
private int raidus2=0;
public int getRadius2() {
    return raidus2;
    
    }
} 
