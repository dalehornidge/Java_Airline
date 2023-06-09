public enum PlaneType {

    BOEING747(150, 800),
    BOEING545(120, 750),
    AIRBUS700(180, 850),
    AIRBUS(190, 850);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
