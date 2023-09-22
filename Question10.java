//Write a Program to design a student class representing student roll no. 
// and a test class (derived class of student) representing the scores of 
// the student in various subjects and sports class representing the score 
// in sports. The sports and test class should be inherited by a result class 
// having the functionality to add the scores and display the final result for a student.

class Student {
    private int rollNo;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    private int[] testScores;

    public Test(int rollNo, int[] testScores) {
        super(rollNo);
        this.testScores = testScores;
    }

    public int[] getTestScores() {
        return testScores;
    }
}

class Sports extends Student {
    private int sportsScore;

    public Sports(int rollNo, int sportsScore) {
        super(rollNo);
        this.sportsScore = sportsScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

class Result extends Test {
    private Sports sports;

    public Result(int rollNo, int[] testScores, Sports sports) {
        super(rollNo, testScores);
        this.sports = sports;
    }

    public int calculateTotalScore() {
        int totalTestScore = 0;
        for (int score : getTestScores()) {
            totalTestScore += score;
        }
        int totalSportsScore = sports.getSportsScore();
        return totalTestScore + totalSportsScore;
    }

    public void displayResult() {
        System.out.println("Roll Number: " + getRollNo());
        System.out.println("Total Test Scores: " + calculateTotalScore());
    }
}

public class Question10 {
    public static void main(String[] args) {
        int[] testScores = { 90, 95, 98, 92 };
        Sports sports = new Sports(40012, 95);
        Result result = new Result(40012, testScores, sports);

        result.displayResult();
    }
}
