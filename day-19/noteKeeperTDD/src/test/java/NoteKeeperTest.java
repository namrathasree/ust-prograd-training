import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NoteKeeperTest {
    NoteKeeper noteKeeper = new NoteKeeper();
    @Order(1)
    @Test
    public void addingTaskToTODOList(){
        noteKeeper.addTaskToList("Have Lunch");
        noteKeeper.addTaskToList("Send an email");
        noteKeeper.addTaskToList("Read a Book");
        noteKeeper.addTaskToList("Attend Training");
        ArrayList<String> actualList = noteKeeper.getMyTODOList();
        ArrayList<String> expectedList=new ArrayList(Arrays.asList("Have Lunch","Send an email","Read a Book","Attend Training"));
        assertEquals(expectedList,actualList);
    }
    @Order(2)
    @Test
    public void removingTaskFromTODOList(){

        ArrayList<String> answer = noteKeeper.removeTaskFromList("Have Lunch");
        ArrayList<String> expectedAnswer=new ArrayList(Arrays.asList("Send an email","Read a Book","Attend Training"));
        assertEquals(answer,expectedAnswer);
    }
    @Order(3)
    @Test
    public void bringBackTheRemovedTask(){
        ArrayList<String> answer = noteKeeper.bringBackTheRemovedTask();
        ArrayList<String> expectedAnswer=new ArrayList(Arrays.asList("Send an email","Read a Book","Attend Training","Have Lunch"));
        assertEquals(answer,expectedAnswer);
    }

    @Order(4)
    @Test
    public void toggleCheckedAndUnchecked(){
//        System.out.println(noteKeeper.tempList);
        ArrayList<String> answer=noteKeeper.toggle();
        ArrayList<String> expectedAnswer=new ArrayList(Arrays.asList("Send an email  -- Not Completed", "Read a Book  -- Not Completed", "Attend Training  -- Not Completed"));
        assertEquals(expectedAnswer,answer);
    }
}

// 1. As a note keeper I want to add items to my todo list.
// 2. As a note keeper I want to remove items from my todo list.
// 3. As a note keeper, I want to be able to bring back the removed items. (un remove)
// 4. As a note keeper, I want to toggle between completed and not completed.
