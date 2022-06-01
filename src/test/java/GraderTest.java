import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void sixtyNineShouldReturnD(){
        Grader grader=new Grader();
        assertEquals('D',grader.determineLetterGrade(69));
    }

    @Test
    void fortyNineShouldReturnD(){
        Grader grader=new Grader();
        assertEquals('F',grader.determineLetterGrade(49));
    }

    @Test
    void ninetyOneShouldReturnA(){
        Grader grader=new Grader();
        assertEquals('A',grader.determineLetterGrade(91));
    }

    @Test
    void ninetyShouldReturnA(){
        Grader grader=new Grader();
        assertEquals('A',grader.determineLetterGrade(90));
    }

    @Test
    void negativeOneShouldReturnIllegalException(){
        Grader grader=new Grader();

        assertThrows(IllegalArgumentException.class,
                () -> grader.determineLetterGrade(-50)
                );
    }

}