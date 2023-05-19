public class Pilot {

    String name;
    CabinCrewRanks cabinCrewRanks;
    String pilotLicenceNumber;

    public Pilot(String name, CabinCrewRanks cabinCrewRanks, String pilotLicenseNumber){
        this.name = name;
        this.cabinCrewRanks = cabinCrewRanks;
        this.pilotLicenceNumber = pilotLicenseNumber;
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

    public String getPilotLicenceNumber() {
        return pilotLicenceNumber;
    }

    public void setPilotLicenceNumber(String pilotLicenceNumber) {
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String pilotIsFlying(){
        return "We're in the air!";
    }
}
