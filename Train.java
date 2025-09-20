public class Train implements Vehicle {
 @Override
 public void start() {
  System.out.print("Train started");
 }

 @Override
 public void stop() {
  System.out.println("Car stopped");
 }

 @Override
 public void running() {
  System.out.print("Train running");
 }
}
