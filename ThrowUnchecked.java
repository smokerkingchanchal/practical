// example of throw unchecked exception---- runtime
  public class ThrowUnchecked {
public static void eligible(int age) { // to cheak whether person is eligible or not
   if(age<18) {
     // throw arithmetic exception if person age is <18
 thow new ArithmeticException("u are not eligible for vote");
   }
 else {
     System.out.println("person eligible for votee");
 }}
  public static void main(String[] args0 {
   eligible(12);
         System.out.println("done");
 }}