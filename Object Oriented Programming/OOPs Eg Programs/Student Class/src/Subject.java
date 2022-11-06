public class Subject {

    private String subID;
    private String subName;
    private int maxMarks;
    private int marksObtain;

    public String getSubID() {
        return subID;
    }

    public String getSubName() {
        return subName;
    }

    int getMaxMarks() {
        return maxMarks;
    }

    void setMaxMarks(int m) {
        this.maxMarks = m;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    public Subject(String subID, String subName, int maxMarks) {
        this.subID = subID;
        this.subName = subName;
        this.setMaxMarks(maxMarks);
    }

    public Subject(String subID, String subName) {
        this.subID = subID;
        this.subName = subName;
    }

    public Subject(String subID, String subName, int maxMarks, int marksObtain) {
        this.subID = subID;
        this.subName = subName;
        this.setMarksObtain(maxMarks);
        this.setMarksObtain(marksObtain);
    }

    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name : "+subName+"\n MarksObtained : "+marksObtain;
    }
}