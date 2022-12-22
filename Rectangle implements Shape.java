public interface Shape {
  void get();
  void display();
}

public class Rectangle implements Shape {
  // instance variables for the rectangle
  private int length;
  private int width;
  
  // constructor for the rectangle
  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }
  
  @Override
  public void get() {
    // code to get the dimensions of the rectangle
  }
  
  @Override
  public void display() {
    // code to display the rectangle
  }
}

public class Square implements Shape {
  // instance variable for the square
  private int sideLength;
  
  // constructor for the square
  public Square(int sideLength) {
    this.sideLength = sideLength;
  }
  
  @Override
  public void get() {
    // code to get the dimensions of the square
  }
  
  @Override
  public void display() {
    // code to display the square
  }
}
public class Main {
  public static void main(String[] args) {
    Shape rect = new Rectangle(10, 20);
    Shape square = new Square(15);
    
    rect.get();
    rect.display();
    
    square.get();
    square.display();
  }
}

