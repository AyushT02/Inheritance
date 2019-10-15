

public class Package
{
  int ounces;
  String method;
  double cost;
    public Package(int ounces, String method) {
        this.ounces = ounces;
        this.method = method;
  }
    public void calculateCost() {
        if(ounces >= 1 && ounces <= 8 && method == "Air") {
            cost = 2.00;
        }
        if(ounces >= 1 && ounces <= 8 && method == "Truck") {
            cost = 1.50;
        }
        if(ounces >= 1 && ounces <= 8 && method == "Mail") {
            cost = 0.50;
        }
        if(ounces >= 9 && ounces <= 16 && method == "Air") {
            cost = 3.00;
        }
        if(ounces >= 9 && ounces <= 16 && method == "Truck") {
            cost = 2.35;
        }
        if(ounces >= 9 && ounces <= 16 && method == "Mail") {
            cost = 1.50;
        }
        if(ounces >= 17 && method == "Air") {
            cost = 4.50;
        }
        if(ounces >= 17 && method == "Truck") {
            cost = 3.25;
        }
        if(ounces >= 17 && method == "Mail") {
            cost = 2.15;
        }
  }
    public void display() {
        System.out.println(ounces);
        System.out.println(cost);
  }
}
