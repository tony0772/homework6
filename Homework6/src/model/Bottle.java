package model;

public class Bottle {
    private Integer totalCapacity;
    private Integer availableLiquid;
    private Boolean open;

    public Bottle(Integer totalCapacity, Integer availableLiquid, Boolean open){
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public Integer getAvailableLiquid() {
        return availableLiquid;
    }

    public Boolean getOpen() {
        return open;
    }

    public Boolean hasMoreLiquid(){
        return availableLiquid > 0;
    }

    public Integer getEmptyCapacity(){
        return totalCapacity - availableLiquid;
    }

    public String isOpened(){
        if (open = true){
            return "Bottle is opened";
        }else {
            return "Bottle is already oppened";
        }
    }

    public String isClosed(){
        if (open = false){
            return "Bottle is closed";
        }else {
            return "Bottle is already closed";
        }
    }

    public String drink(Integer amount){
        if (open = true){
            if (amount <= availableLiquid){
                availableLiquid -= amount;
                return "You have drunk " + amount + " ml of liquid";
            }else {
                return "Not enough liquid in the bottle to drink that much";
            }
        }else {
            return "Cannot drink from a closed bottle. Please open the bottle first";
        }
    }
}
