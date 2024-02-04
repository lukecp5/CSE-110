class Circle {
  public static void main(String[] args) {
      // Constants 
      final double PI = 3.1415;
      final double RADIUS = 10.25;
      
      // Top Section
      System.out.println("Properties of a Circle");
      System.out.println("Radius             : 10.25");
      System.out.println("Diameter           : " + RADIUS * 2);
      System.out.println("Circumference      : " + PI * (RADIUS * 2));
      System.out.println("Area               : " + PI * (RADIUS * RADIUS));
      System.out.println("Area of Semicircle : " + (PI * (RADIUS * RADIUS)) / 2);
      
      // 2nd Section
      System.out.print("\n");
      System.out.println("Properties \"Rounded\" Down");
      System.out.println("Radius             : 10");
      System.out.println("Diameter           : " + (int)(RADIUS * 2));
      System.out.println("Circumference      : " + (int)(PI * (RADIUS * 2)));
      System.out.println("Area               : " + (int)(PI * (RADIUS * RADIUS)));
      System.out.println("Area of Semicircle : " + (int)((PI * (RADIUS * RADIUS)) / 2));
  }
}
