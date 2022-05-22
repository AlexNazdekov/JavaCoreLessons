package JavaCoreLesson1;

//Добавить класс Team, который будет содержать:
//название команды;
//массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//метод для вывода информации о членах команды, прошедших дистанцию;
//метод вывода информации обо всех членах команды.

public class Team {
    public String name;
    static Member[] members;
    boolean done;

    public Team(String name, Member[] members) {
        this.name = name;
        this.members = members;
        this.done = false;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void showResults() {
        if (done) {
            System.out.println("Полоса пройдена!");
        } else {
            System.out.println("Слив засчитан");
            for (int i = 0; i < 4; i++) {
                System.out.println(members[i].name + " " + members[i].done);
            }
        }
    }
}







