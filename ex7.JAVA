public class ex6
 {
 public static void main(string []args)
   {
     Scanner in = newscanner(system.in);
     system.out.println("input no :");
     int num1 =in.nextInt();

     for (int i=0;i<10; i++)
        {
         system.out.println(num1 + "x" + (i+1) + "=" + (num1 * (i+1)));
        }
   }
 }