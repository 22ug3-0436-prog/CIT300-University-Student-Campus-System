import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Graph campusGraph = new Graph();

        while (true) {

            System.out.println("\n===== CAMPUS ROUTE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Campus Location");
            System.out.println("2. Remove Campus Location");
            System.out.println("3. Add Campus Connection/Road");
            System.out.println("4. Remove Campus Connection/Road");
            System.out.println("5. Display Campus Connections");
            System.out.println("6. Display Campus Locations");
            System.out.println("7. Traverse Campus Locations using BFS");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();

            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter campus location: ");
                    String location = scanner.nextLine();

                    campusGraph.addLocation(location);
                    break;

                case 2:
                    System.out.print("Enter location to remove: ");
                    String removeLocation = scanner.nextLine();

                    campusGraph.removeLocation(removeLocation);
                    break;

                case 3:
                    System.out.print("Enter source location: ");
                    String source = scanner.nextLine();

                    System.out.print("Enter destination location: ");
                    String destination = scanner.nextLine();

                    campusGraph.addConnection(source, destination);
                    break;

                case 4:
                    System.out.print("Enter source location: ");
                    String removeSource = scanner.nextLine();

                    System.out.print("Enter destination location: ");
                    String removeDestination = scanner.nextLine();

                    campusGraph.removeConnection(
                            removeSource,
                            removeDestination
                    );
                    break;

                case 5:
                    campusGraph.displayConnections();
                    break;

                case 6:
                    campusGraph.displayLocations();
                    break;

                case 7:
                    System.out.print("Enter starting location for BFS: ");
                    String startLocation = scanner.nextLine();

                    campusGraph.bfs(startLocation);
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println(
                            "Invalid choice. Please select 1-8."
                    );
            }
        }
    }
}