interface Animal {
   void shout();

    }

interface Action extends Animal{    //接口的方式   implements实现
    void eat();
        }
//abstract  class Action  {     //抽象类的方式  extends继承
//    public abstract void eat();
//}


class Dog implements Action{
            @Override
            public void shout() {
                System.out.println("汪汪汪");
            }

            @Override
            public void eat() {
                System.out.println("吃骨头");
            }

}
class Cat implements Action{
    @Override
    public void shout() {
        System.out.println("喵喵瞄");
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

}
public class Main {
    public static void animalShout(Animal an) {
        an.shout();
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Dog();
        System.out.println(a1.equals(a2));
        System.out.println(a1.toString().equals(a2.toString()));
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        String a4="haha";
        String a3="haha";
        System.out.println(a3.equals(a4));
    }
}


