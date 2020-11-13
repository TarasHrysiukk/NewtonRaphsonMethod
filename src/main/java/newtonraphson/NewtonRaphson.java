package newtonraphson;

import java.util.Scanner;



public class NewtonRaphson {
    public static void main(String[] args) {
        double x0,root,givenError,error;
        boolean flag=true;
        int i=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for x0 : ");
        x0 = sc.nextDouble();

        givenError=x0;

        while(flag){
            root = x0 - (F(x0)/Fprime_X(x0));
            error = Math.abs((root-x0)/root)*100;

            System.out.println("Iteration : "+ i++);
            System.out.println("Root:"+root);
            System.out.println("Error:"+error);
            x0 = root;

            if(givenError>error)
            {
                flag=false;
            }
        }
    }

    public static double F(double x){
        return (1+x)-(2.5*(Math.pow(x,2)))+(0.25*Math.pow(x,2))     ;
    }


    public static double Fprime_X(double x){
        return Math.pow(x,3)-5*x+1;
    }


}
