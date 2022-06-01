public class Grader {

    public char determineLetterGrade(int gradeNumber) {
        if (gradeNumber < 0) {
            throw new IllegalArgumentException("Number grade can't be lower than 0");
        }
        if (gradeNumber < 60) {
            return 'F';
        }
        if (gradeNumber < 70) {
            return 'D';
        }
        if (gradeNumber < 80) {
            return 'C';
        }
        if (gradeNumber < 90) {
            return 'B';
        } else {
            return 'A';
        }

    }

}
