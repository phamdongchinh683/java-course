
class main {
 public static void main(String[] args) {
  Animal animal = new Animal("Buddy");
  animal.makeSound();
  
  // Polymorphism in action
  Animal dog = new Dog("panda");
  dog.makeSound();
 }

}