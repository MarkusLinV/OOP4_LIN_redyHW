import controller.StudentController;
import controller.TeatcherController;
import model.Student;
import model.Teatchers;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {

        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));

        new TeatcherController().createTeatcher("Эдард", "Старк");
        new TeatcherController().createTeatcher("Тайвен", "Ланистер");
        new TeatcherController().sendOnConsole(Teatchers.teatchers);
        new TeatcherController().redactTeatcher(2, "Тирион", "Ланистер");
        new TeatcherController().sendOnConsole(Teatchers.teatchers);
    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}