public class MaxIntegers {

    public static void main(String[] args) {
        int num1 = 3, num2 = 3, num3 = 3;
        int max = 0;
       
        if (num1 > num2 && num1 > num3) {
            max = num1; 
        }
       
        if (num2 > num1 && num2 > num3) {
            max = num2; 
        }
       
        if (num3 > num1 && num3 > num2) {
               max = num3;
        }
     

        System.out.println(" The max of 3 numbers is " + max);
    }

}
