public class Dog extends Animal {
 public Dog(String name) {
  super(name);
 }

 // 3. Polymorphism (Overriding)
 @Override
 public void makeSound() {
  System.out.println(getName() + " says: Woof woof!");
 }
}
