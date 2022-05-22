package JavaCoreLesson1;

public class Member {
        public String name;
        public int run; // сколько всего км может пробежать
        public int swim; // сколько всего км может проплыть
        public boolean done;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Member(String name, int run, int swim) {
            this.name = name;
            this.run = run;
            this.swim = swim;
            this.done = false;
        }
    }


