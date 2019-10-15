

public class InsuredPackage extends Package
{
   int ounces;
   String method;
   double cost;
   double cost2;
   public InsuredPackage(int ounces, String method) {
       super(ounces, method);
       cost2 = cost + 1.50;
    }
}
