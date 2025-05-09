package Num_01;
class PublicUniversity extends University {
    private int numberOfHalls;
    private boolean politicsAllowed;

    public PublicUniversity(String name, String address, int numberOfDepartments, int dateEstablished, int numberOfHalls, boolean politicsAllowed) {
        super(name, address, dateEstablished, numberOfDepartments);
        this.numberOfHalls = numberOfHalls;
        this.politicsAllowed = politicsAllowed;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public boolean isPoliticsAllowed() {
        return politicsAllowed;
    }

    @Override
    public String toString() {
        return "Public " + super.toString() + ", Halls: " + numberOfHalls + ", Politics Allowed: " + politicsAllowed;
    }
}