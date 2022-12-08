public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for (int start = 1; start < 6; start++) {
            System.out.println(start);
        }


        //a for loop that prints the integer powers of two up to 100
        //can you have an infinite for loop?
        for (int start2 = 1; start2 <= 100; start *= 2){
        System.out.println(start2 +" ");
    }

        //write a for loop that counts by 4s from 5 up to 50
        for(int start3 = 5; start3 <= 50; start3 += 4){
            System.out.print(start3 + " ");
        }


        //write a for loop that sums the numbers from 1 to 10
        for(int sum = 1; sum <= 11; sum += sum)  {
            System.out.println(sum);

        }


        /*int total = 0;

        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////

        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }
        System.out.println("Finished!");

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }
        */


        System.out.println("Finished!");



    }
}
