import java.util.ArrayList;
public class NoteKeeper {
    static ArrayList<String> todoList = new ArrayList<>();
    static ArrayList<String> tempList = new ArrayList<>();
    ArrayList<String> task=new ArrayList<>();

    public void addTaskToList(String task) {
        todoList.add(task);
    }
    public ArrayList<String> getMyTODOList() {
        return todoList;
    }
    public ArrayList removeTaskFromList(String task) {
        tempList.add(task);
        todoList.remove(task);
        return todoList;
    }
    public ArrayList bringBackTheRemovedTask() {
        todoList.addAll(tempList);
        return todoList;
    }
    public ArrayList<String> toggle() {
        for(int j=0;j<tempList.size();j++){
            for (int i = 0; i < todoList.size(); i++) {
                if (tempList.get(j).equals(todoList.get(i))) {
                    todoList.remove(i);
                }
            }
        }
        for(int k=0;k<todoList.size();k++)
        {
            task.add(todoList.get(k)+"  -- Not Completed");
        }
       return task;
    }
}