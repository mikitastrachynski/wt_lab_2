package by.tc.task01.entity;

public class OvenInfo extends Appliance{
	private int powerConsumption;
	private int weight;
	private int capacity;
	private int depth;
	private float height;
	private float width;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    private int getPowerConsumption(){
        return powerConsumption;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    private int getWeight(){
        return weight;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    private int getCapacity(){
        return capacity;
    }

    public void setDepth(int depth){
        this.depth = depth;
    }

    private int getDepth(){
        return depth;
    }

    public void setHeight(float height){
        this.height = height;
    }

    private float getHeight(){
        return height;
    }

    public void setWidth(float width){
        this.width = width;
    }

    private float getWidth(){
        return width;
    }

    @Override
    public String toString() {
        return super.toString() + ", PowerConsumption: " + getPowerConsumption() + ", Weight: " + getWeight() + ", Capacity: " +
                getCapacity() + ", Depth: " + getDepth() + ", Height: " + getHeight() + ", Width: " + getWidth();
    }
}