import java.util.Scanner;
class Quadratic{
void check(){
float d;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the values for a,b,c:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a==0){
System.out.println("Invalid Equation");
}
else{
d=(b*b-4*a*c)/(2*a);
if(d==0){
System.out.println("The roots are real and equal:");
double r1=(-b)/(2*a);
System.out.println("The root is:"+r1);
}
else if(d>0){
System.out.println("The roots are real and distinct:");
double r1=(-b+Math.sqrt(d))/(2*a);
double r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("The roots are:"+r1+" "+r2);
}
else{
System.out.println("The roots are Imaginary");
double r1=(-b/(2*a));
double r2=(Math.sqrt(-d))/(2*a);
System.out.println("The roots are:/n");
System.out.println(r1+"+"+r2+"i");
System.out.println(r1+"-"+r2+"i");
}
}
}
}
class CheckQuadratic{
public static void main(String[] args){
Quadratic q1=new Quadratic();
q1.check();
}
}



