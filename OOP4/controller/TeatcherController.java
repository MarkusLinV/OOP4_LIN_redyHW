package controller;

import java.util.List;

import model.Student;
import model.Teatcher;
import model.Teatchers;
import model.User;
import view.TeacherView;
import view.UserView;

public class TeatcherController{

    private UserView<Teatcher> view = new TeacherView();

    public Teatcher createTeatcher(String name, String last) {
        int id = Teatchers.teatchers.size() + 1;
        Teatcher teatcher = new Teatcher(id, name, last);
        Teatchers.teatchers.add(teatcher);
        return teatcher;
    }

    public void redactTeatcher(int id, String name, String last) {
        Teatcher teatcher = Teatchers.teatchers.remove(id - 1);
        teatcher.setName(name);
        teatcher.setLastName(last);
        Teatchers.teatchers.add(id - 1, teatcher);
    }

    public void sendOnConsole(List<Teatcher> teatchers) {
        view.sendOnConsole(teatchers);
    }


}
