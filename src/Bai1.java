public class Bai1 {
    static public class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }

    static public class Student extends Person {
        private final int id;
        private final double avgScore;

        public Student(String name, int age, int id, double avgScore) {
            super(name, age);
            this.id = id;
            this.avgScore = avgScore;
        }

        @Override
        public String toString() {
            return String.format(
                    "Id : %d\nName : %s\nAge : %d\nAvg score : %f\n",this.id, this.name, this.age,this.avgScore);
        }
    }

    public static void main(String[] args) {
        Person student = new Student("nguyen van a",18,1,8.5);
        System.out.println(student.toString());
    }
}
