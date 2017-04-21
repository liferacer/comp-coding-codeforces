import java.util.Arrays;
import java.util.Scanner;

public class taxi {
    public static void main (String[] args)
    {
        int noOfGroups,noOfCars = 0,no=0;
        int noOfOne=0 ,noOfTwo = 0 ,noOfThree = 0 ,noOfFour = 0;
        Scanner sc = new Scanner(System.in);
        noOfGroups = sc.nextInt();

        for(int iterator = 0 ; iterator < noOfGroups; iterator++)
        {
            no = sc.nextInt();

            switch (no)
            {
                case 1 : noOfOne++;
                    break;
                case 2: noOfTwo++;
                    break;
                case 3: noOfThree++;
                    break;
                case 4:noOfFour++;
                    break;
            }

        }

        noOfCars += noOfFour;
        if(noOfOne > noOfThree)
        {
            noOfOne -= noOfThree;
        }
        else
        {
            noOfOne=0;
        }
        noOfCars += noOfThree;
        noOfCars += noOfTwo/2;
        noOfTwo = noOfTwo%2;

        if(noOfOne > noOfTwo)
        {
            noOfCars += noOfTwo;
            noOfOne -= noOfTwo*2;
            noOfCars += noOfOne/4;
            if(noOfOne%4 > 0)
                noOfCars += 1;
        }
        else
        {
            noOfCars += noOfTwo;
        }
        System.out.println(noOfCars);
    }

}
