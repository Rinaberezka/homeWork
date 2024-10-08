package model.human;

import java.io.Serializable;
import java.util.List;

public interface TreeNode<T> extends Serializable {
    void setId(long id);
    long getId();
    T getFather();
    T getMother();
    boolean addChild(T human);
    boolean addParent(T human);
    String getName();
//    LocalDate getBirthDate();
//    LocalDate getDethDate();
    List<T> getParents();
    List<T>getChildren();
    int getAge();


}
