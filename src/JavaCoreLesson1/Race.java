package JavaCoreLesson1;

public class Race {
    public static void main(String[] args) {

        Member member1 = new Member("Jack", 120,10);
        Member member2 = new Member("Pit", 100,50);
        Member member3 = new Member("Mike", 100, 10);
        Member member4 = new Member("Alice", 70,20);

        Member[] members = {member1, member2, member3, member4};

        Team team = new Team("AllStars", members ); // Создаем команду
        Course c = new Course(70, 10 ); // Создаем полосу препятствий
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
