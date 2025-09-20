
class main {
 public static void main(String[] args) {
  Shape circle = new Circle(5);
  Shape rectangle = new Rectangle(4, 6);

  circle.display(); // inherited concrete method
  System.out.println("Circle area: " + circle.area());

  rectangle.display();
  System.out.println("Rectangle area: " + rectangle.area());
 }

}