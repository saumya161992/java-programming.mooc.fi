
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum =0;int count=0;
        int sumpass = 0;
        int countpass = 0;
        double passavg = 0;
        int cnt=0;
        ArrayList<Integer> star = new ArrayList();
        System.out.println("Enter point totals, -1 stops:");
        while(number != -1){
            number = Integer.valueOf(scanner.nextLine());
            if(number < 0 || number > 100){
                cnt++;
                continue;
            }else{
                sum = sum +number;
                if(number >= 50){
                    sumpass = sumpass + number;
                    countpass++;
                    passavg = 1.0 * sumpass/countpass;
                }
                count++;
            }
            if(number < 50){
                star.add(0);
            }else if(number >=50 && number <60){
                star.add(1);
            }else if(number >=60 && number < 70){
                star.add(2);
            }else if(number >=70 && number < 80){
                star.add(3);
            }else if(number >=80 && number < 90){
                star.add(4);
            }else if(number >=90 && number <=100){
                star.add(5);
            }    
        }
        double avg = 1.0 *(sum)/count;
        //if(avg >=45.5 && avg <= 50.0){
           //avg =  Math.ceil(avg);
        System.out.println("Point average (all): " + avg );
        //if(avg >=45.5 && avg <= 50.0){
          // avg =  Math.ceil(avg);}
        if(passavg >=50.0){
            System.out.println("Point average (passing):" + passavg); 
            //System.out.println(">>>>" + countpass + ">>>>>>" + countpass+ ">>>>"+ ">>>>>>" + count + 1.0 *countpass/count );
            System.out.println("Pass percentagejjjj: " + 100.0 *1.0*(countpass)/count);
        }else {
            System.out.println("Point average (passing):" + "-" );
            System.out.println(">>>>" + countpass + ">>>>>>" + count + ">>>>" + cnt);
            System.out.println("Pass percentage: " + 100.0 * (countpass/(count+cnt)));
        }
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int[] stararray = new int[6];
        for(int i = 0 ;i < star.size();i++){
            if(star.get(i) == 0){
                stararray[0]++;
            }else if(star.get(i) == 1){
                stararray[1]++;
            }else if(star.get(i) == 2){
                stararray[2]++;
            }else if(star.get(i) == 3){
                stararray[3]++;
            }else if(star.get(i) == 4){
                stararray[4]++;
            }else if(star.get(i) == 5){
                stararray[5]++;
            }
                
        }
        System.out.println("Grade distribution:");
        for(int i = 5; i>-1; i--){
            int val = stararray[i];
            //System.out.println("val is " + val);
                System.out.print(i + ":" );
            for(int j = 0 ;j< val ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
