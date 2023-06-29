// constructer getter and setter
public class Dog {
    String naame;
    String color;
    String breed;
    int age;
    public Dog(String naame, String color, String breed, int age) {
        this.naame = naame;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public String getNaame() {
        return naame;
    }
    public void setNaame(String naame) {
        this.naame = naame;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dog [age=" + age + ", breed=" + breed + ", color=" + color + ", naame=" + naame + "]";
    }
public static void main(String[] args) {
  Dog tuffy=new Dog("Trikali", "black", "papillon", 8); 
  System.out.println(tuffy.toString());  
}
}
