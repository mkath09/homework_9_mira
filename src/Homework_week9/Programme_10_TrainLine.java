package Homework_week9;

import java.util.Scanner;

/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name
 */
public class Programme_10_TrainLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" bakerloo\n central\n jubilee\n metropolitan\n district\n northern");
        System.out.println("----------------------");
        System.out.println("Please enter train name form above list: ");
        String city = scanner.nextLine();

        Programme_10_TrainLine cityName = new Programme_10_TrainLine();
        cityName.stationName(city);
        scanner.close();

    }

    public void stationName(String city) {
        //using switch method
        switch (city) {
            case "bakerloo":
                System.out.println("Harrow, Elephant&Castle, Stonebridge Park, Queens Park");
                break;
            case "central":
                System.out.println("Epping, West Ruislip, Hainault, Loughton  ");
                break;
            case "jubilee":
                System.out.println("Stanmore, Stratford, WembleyPark, Wilesden green ");
                break;
            case "metropolitan":
                System.out.println("Aldgate, Baker Street,Watford, Chesham");
                break;
            case "District":
                System.out.println("Richmond. Barking, Upminster, ");
                break;
            case "northern":
                System.out.println("Edgware, Morden, Finchley, Golders green");
                break;
            default:
                System.out.println("Please enter correct train name:");
        }

    }


}




















