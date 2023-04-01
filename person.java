public class person {
    public static void main(String args[]) {
        Human p1= new Human();
        p1.age=12;
        p1.name="singh";
        //System.out.println(p1.age+" "+p1.name+" ");

        p1.walk(10);
        Human p2= new Human();
        p2.age=29;
        p2.name="Pragya";
        //System.out.println(p2.age+" "+p2.name+" ");

        p2.eat();

    }
    }
    class Human {
        int age;
        String name;
        double salary;
        void walk() {
            System.out.println(name+ " is walking");
        }
        void eat() {
            System.out.println(name+" is eating");
        }
        void walk(int steps)
        {
            System.out.println(name+ " walked " + steps +" steps ");
        }
    }

