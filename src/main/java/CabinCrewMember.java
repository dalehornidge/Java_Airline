public class CabinCrewMember {

    private String name;
    private CabinCrewRanks cabinCrewRanks;


    public CabinCrewMember(String name, CabinCrewRanks cabinCrewRanks){
        this.name = name;
        this.cabinCrewRanks = cabinCrewRanks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CabinCrewRanks getCabinCrewRanks() {
        return cabinCrewRanks;
    }

    public void setCabinCrewRanks(CabinCrewRanks cabinCrewRanks) {
        this.cabinCrewRanks = cabinCrewRanks;
    }





}
