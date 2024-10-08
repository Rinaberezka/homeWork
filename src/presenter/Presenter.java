package presenter;

import model.service.Service;
import model.human.Human;
import model.human.Gender;
import view.ConsoleUI;
import view.View;

import java.security.Provider;
import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service = new Service();

    public Presenter(View view){
        this.view = view;

    }


    public void sortByAge() {
        service.sortByAge();
        getHumanListInfo();
    }

    public void sortByName() {
        service.sortByName();
        getHumanListInfo();
    }
    public void addParentToHuman(long childId, Human parent) {
        service.addParentToHuman(childId, parent);
        getHumanListInfo();
    }




    public void getHumanListInfo() {
        service.getHumanInfo();
        view.printAnswer(toString());
    }


    public void addHuman(Human human) {
        service.addOrUpdateHuman(human);
        getHumanListInfo();
    }

    public void save() {
        service.save();
        getHumanListInfo();
    }

    public Service getService() {
        return service;
    }

    public void load() {
        service.load();
        getHumanListInfo();
    }

    public void addHuman(String name, Gender gender, LocalDate birthDate, LocalDate deathDate) {
        service.addOrUpdateHuman(new Human());
        getHumanListInfo();
    }
}



