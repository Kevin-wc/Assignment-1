
public class Main {

    public static void commonSub(String text1, String text2) {
        char[] t1Array = text1.toCharArray();
        char[] t2Array = text2.toCharArray();
        char[] subsequence = new char[10];
        int subsequenceCounter = 0;

        for (int i = 0; i < t1Array.length && i < t2Array.length; i++) {
            if (t1Array[i] == t2Array[i]) {
                subsequence[i] = t1Array[i];
                subsequenceCounter = subsequenceCounter + 1;
            }

        }
        System.out.println(subsequence);
        System.out.println(subsequenceCounter);

    }

    public static void notFibbonacci(int target){
        long num1 = 0;
        long num2 = 1;

        for (int i = 0; i < target; i++) {

            System.out.println(num1 + " ");

            long num3 = (3 * num2) + (2 * num1);
            num1 = num2;
            num2 = num3;



        }
    }

    public static void whereInSequence(int target){
         int[] notFibonnacci = {0, 1,3, 11, 39, 139, 495, 1763, 6279, 22363};

        for(int i = 0; i < notFibonnacci.length; i++ ){
            if(target == notFibonnacci[i]){
                System.out.println("The number " + target + " is the " + (i+1) + " number in the NotFibonacci sequence");
            } else if ( target < notFibonnacci[i]) {
                System.out.println(i+1);
                break;
            }   else if (target != notFibonnacci[9]){
                System.out.println("The number " + target + " is the " + (10) + " number in the NotFibonacci sequence");
                break;
            }


        }
    }

    public static void removeElement(int[] nums, int val){
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {

        System.out.println("Output 1:");
        commonSub("abc", "abc");

        System.out.println("Output 2:");
        commonSub("almanacs", "albatross");

        System.out.println("Output 3:");
        commonSub("almanac","ferris");

        System.out.println("NotFibbonacci Sequence:");
        notFibbonacci(10);

        System.out.println("Where in sequence: ");
        whereInSequence(22365);

        System.out.println("Remove Element: ");
        int[] nums1 = {0,1,2,2,3,0,4,2};
        removeElement(nums1,2);

    }
}
