import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {
  private static ArrayList<Task> instances = new ArrayList<Task>();

  private String mDescription;
  private boolean mCompleted;
  private LocalDateTime mCreatedAt;
  private int mId;

  public Task(String description) {
    mDescription = description;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getDescription() {
    return mDescription;
  }

  public void completeTask(){
    mCompleted = true;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static ArrayList<Task> all() {
    return instances ;
  }

  public int getId(){
    return mId;
  }

  public static Task find(int id){
    try{
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e){
      return null;
    }
  }

  public static void clear() {

    //METHOD BELOW IS A BUILT IN METHOD
    instances.clear();
  }

}
