import java.lang. *;
import java.util.*;

class SimpleInterest {
        public double getsI(double p, double r, double t) {
            return (p*r*t) / 100;
        }
}

class CompoundInterest {
        public double getCI(double p, double r, double t, double n) {
            return p * Math.pow(1 + (r/n), n*t);
        }
}

class Finalvalue {
        public double getValue(double p, double r, double t) {
            return p * (1+r) * t;
        }
}


public class Investment {
     public static double finalValue(double p, double r, double t){
          return p * (1 + r) * t;
        }
     public static void main(String[] args){

      SimpleInterest si = new SimpleInterest();
      System.out.println("Simple Interest: " + si.getsI(Double.parseDouble(args[0]), Double.parseDouble(args[1]),
      Double.parseDouble(args[2]))); //Calculation Of Simple Interest.



      CompoundInterest ci = new CompoundInterest();
      System.out.println("Compound Interest: " + ci.getCI(Double.parseDouble(args[0]), Double.parseDouble(args[1]),
      Double.parseDouble(args[2]), Double.parseDouble(args[3]))); //Calculation Of Compound Interest.



      System.out.println("Final value using function: " + finalValue(Double.parseDouble(args[0]), Double.parseDouble(args[1]),
      Double.parseDouble(args[2]))); //Final Value


      Finalvalue fv = new Finalvalue();
      System.out.println("Final value using class: " + fv.getValue(Double.parseDouble(args[0]), Double.parseDouble(args[1]),
      Double.parseDouble(args[2]))); //using Class.
    }
}
