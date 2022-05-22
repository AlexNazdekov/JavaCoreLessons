package JavaCoreLesson1;

// Добавить класс Course (полоса препятствий), в котором будут находиться:
//массив препятствий;
//метод, который будет просить команду пройти всю полосу.

public class Course {
    public int length;
    public int riverWide;

    public Course(int length, int riverWide) {
        this.length = length;
        this.riverWide = riverWide;

    }
    void doIt(Team team) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if ((team.members[i].run >= length) & (team.members[i].swim >= riverWide)) {
                count += 1;
                team.members[i].done = true;
            }
        }
        if (count == 4) team.done = true;
    }
}

