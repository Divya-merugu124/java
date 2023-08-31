package oops;

	class polymorphism  {
		  public void area() {
		    System.out.println("The formula for area of ");
		  }
		}
		class Triangle extends polymorphism {
		  public void area() {
		    System.out.println("Triangle is ½ * base * height ");
		  }
		}
		class Circle extends polymorphism{
		  public void area() {
		    System.out.println("Circle is 3.14 * radius * radius ");
		  }
		}
		class Main {
		  public static void main(String[] args) {
			  polymorphism myShape = new polymorphism();  // Create a Shapes object
			  polymorphism myTriangle = new Triangle();  // Create a Triangle object
			  polymorphism myCircle = new Circle();  // Create a Circle object
		    myShape.area();
		    myTriangle.area();
		    myShape.area();
		    myCircle.area();
		  }
		}

