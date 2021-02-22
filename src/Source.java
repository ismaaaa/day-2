public class Source {


    public static void main(String[] args)
    {
       int[] ages = new int[3];

        ages[0] = 24;
        ages[1] = 29;
        ages[2] = 21;


        int[] girlsAges = new int[5];

        girlsAges[0] = 10;
        girlsAges[1] = 12;
        girlsAges[2] = 14;
        girlsAges[3] = 16;
        girlsAges[4] = 18;

        double girlsAVg = calculateAverageAge(girlsAges);
        System.out.println(girlsAVg);

       double answer =  calculateAverageAge(ages);

        System.out.println(answer);



    }


    public static double calculateAverageAge(int studentsAges[])
    {
        double sum = 0.0;
        double average;

        for (int i = 0; i < studentsAges.length ; i++) {
            sum = sum + studentsAges[i];
        }


        average = sum / studentsAges.length;

        return average;
    }


}
