abstract class Base{
    Base(){
        System.out.println("base constructer called");
    }
    abstract void fun1();
    final void func2(){
        System.out.println("Methods cannot be overroden");
    }
}
class Demo extends Base{
    Demo(){
        System.out.println("demo constructer called ");
    }
    void fun1(){
        System.out.println("function1 called");
    }
}

public class AbstraxtClass {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.fun1();
    }
    
}
