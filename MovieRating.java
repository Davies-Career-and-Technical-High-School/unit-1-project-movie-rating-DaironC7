import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter the movie name");
        String movie = scan.nextLine();

        System.out.println(" ");
        
        System.out.println("Please enter the running time in minutes.");
        double runtime = scan.nextDouble();

        System.out.println(" ");

        System.out.println("Please enter the ratings from the movie review website.");
        double web1 = scan.nextDouble();
        double web2 = scan.nextDouble();
        double web3 = scan.nextDouble();

        System.out.println(" ");

        System.out.println("Please enter rating from the focus group.");
        double foc1 = scan.nextDouble(); 
        double foc2 = scan.nextDouble();

        System.out.println(" ");

        System.out.println("Please enter the average movie critic rating.");
        double crit = scan.nextDouble();

        System.out.println(" ");

        System.out.println("Title: " + movie);



        double runtime2 = runtime / 60;
        double runtime3 = (int)(runtime2);

        double mins = (runtime2 - runtime3) * 60; 

        int min = (int)(mins);
        int hour = (int)(runtime2);

        System.out.println("Running time: " + hour + "h" + min);


        double webavg = (web1 + web2 + web3) / 3 ;
        System.out.println("Average website rating: " + webavg);


        double focavg = (foc1 + foc2) / 2;
        System.out.println("Average focus group rating: " + focavg);

        System.out.println("Average movie critic rating: " + crit);

        double wweb = webavg * 0.2 ;
        double wfoc = focavg * 0.3 ;
        double wcrit = crit * 0.5 ;

        int ovravg = (int)((wweb + wfoc + wcrit) + 0.5);

        System.out.println("Overall movie rating: " + ovravg);

    }
}