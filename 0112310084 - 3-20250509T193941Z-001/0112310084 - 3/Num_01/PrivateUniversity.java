package Num_01;

class PrivateUniversity extends University {
    private boolean ugcApproved;
    private int numberOfTrusteeMember;

    public PrivateUniversity(String name, String address, int numberOfDepartments, int dateEstablished, boolean ugcApproved, int numberOfTrusteeMember) {
        super(name, address, dateEstablished, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        this.numberOfTrusteeMember = numberOfTrusteeMember;
    }

    public boolean isUgcApproved() {
        return ugcApproved;
    }

    public int getNumberOfTrusteeMember() {
        return numberOfTrusteeMember;
    }

    @Override
    public String toString() {
        return "Private " + super.toString() + ", UGC Approved: " + ugcApproved + ", Trustee Members: " + numberOfTrusteeMember;
    }
}
