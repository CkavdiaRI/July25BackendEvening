package IntroToOOP;

public class EntranceExam {
    public int examID;
    public String examName;

// Parameterized constructor (EntranceExam(int, String)) lets you build an EntranceExam from scratch, specifying its ID and name.
    EntranceExam(int examID,String examName){
        this.examID = examID;
        this.examName = examName;
    }
//Copy constructor (EntranceExam(EntranceExam)) lets you duplicate an existing EntranceExam in one step, without having to manually write:
//new EntranceExam(other.examID, other.examName);
    EntranceExam(EntranceExam other){
        examID = other.examID;;
        examName = other.examName;

    }
}
