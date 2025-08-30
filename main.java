class main {
 public static void main(String[] args) {
  byte a = 29;
  byte t = -10;
  // 1 byte
  // Size: -128 to 127

  // error: incompatible types: possible lossy conversion from int to byte
  byte c = 129;
  byte d = -129;

  System.out.println("Age: " + a);
  System.out.println("Temperature: " + t);
 }
}