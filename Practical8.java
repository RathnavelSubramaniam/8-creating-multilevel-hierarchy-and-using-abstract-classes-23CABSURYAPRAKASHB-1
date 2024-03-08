// Animal.java
abstract class Animal {
    protected String species;
    protected int age;
    public Animal(String species, int age)
    {
        this.species=species;
        this.age=age;
    }
     abstract  public void sound();
     @Override
    public String toString()
    {
        return "Species: "+species+", Age: "+age;
    }
    @Override
    public boolean equals(Object obj)
    {
      if(this==obj)return true;
      if(obj==null||getClass()!=obj.getClass())return false;
      Animal otherAnimal=(Animal) obj;
      return species.equals(otherAnimal.species)&& age==otherAnimal.age;
    }

}

// Mammal.java
class Mammal extends Animal {
    private String habitat;
    public Mammal(String species, int age, String habitat)
    {
        super(species, age);
        this.habitat=habitat;
    }
    public void sound()
        {
            System.out.println("mammals sound");
        }
    

// Additional attributes and methods
}

// Bird.java
 class Bird extends Animal {
    private String featherColor;
    public Bird(String species, int age, String featherColor){
        super(species, age);
        this.featherColor=featherColor;
    }
    public void sound()
    {
        System.out.println("bird sound");
    }

}

// Parrot.java
 class Parrot extends Bird {
    private boolean canSpeak;
    public Parrot(String species, int age, String featherColor,boolean canSpeak){
        super(species,age,featherColor);
        this.canSpeak=canSpeak;
    }
    public void sound()
    {
        if(canSpeak){
        System.out.println("Parrot speaking");
    }
    else{
        System.out.println("Parrot sound");
    }
    }
// Additional characteristics specific to Parrot
}
// Main.java
public class Practical8 {
public static void main(String[] args) {
    Mammal lion=new Mammal("Lion",5,"Grassland");
    Bird eagle=new Bird("Eagle",3,"Brown");
    Parrot talkingParrot=new Parrot("Talking Parrot",2,"Green",true);
   System.out.println(lion);
   System.out.println(eagle);
   System.out.println(talkingParrot);
   System.out.println("Are lion and eagle equal? "+lion.equals(eagle));
   System.out.println("Are lion and line equal? "+lion.equals(new Mammal("Lion",5,"Grassland")));
}
}
