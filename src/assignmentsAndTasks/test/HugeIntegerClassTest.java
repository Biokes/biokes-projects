
package assignmentsAndTasks.test;

import assignmentsAndTasks.src.assignmentsAndTasks.chapter15.HugeInteger;
import org.junit.jupiter.api.Test;

import static assignmentsAndTasks.src.assignmentsAndTasks.chapter15.Files.countParagraphs;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HugeIntegerClassTest {
    @Test
    public void addHugeInteger(){
        HugeInteger number = new HugeInteger();
    }
    @Test
    public void countParagraphsTest(){
        assertEquals(3,countParagraphs("C:\\Users\\DELL\\IdeaProjects\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\chapter15\\jargons"));

    }
}