package area;

public class AreaOfCircle {

         private double radius;
         private double area;
         private double circumference;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
      public void getResult(){
    area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
          System.out.println("\n Area of a Circle = " +area);
          System.out.println("\n Circumference of a Circle = " + circumference);
    }


    }


