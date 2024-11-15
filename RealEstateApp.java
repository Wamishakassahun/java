import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Property {
    private String address;
    private String type; // e.g., House, Apartment, Commercial
    private double price;

    public Property(String address, String type, double price) {
        this.address = address;
        this.type = type;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

class RealEstateApp {
    private List<Property> properties;

    public RealEstateApp() {
        properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        properties.add(property);
        System.out.println("Property added successfully!");
    }

    public void viewProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
        } else {
            for (Property property : properties) {
                System.out.println(property);
            }
        }
    }

    public void searchProperties(String type) {
        boolean found = false;
        for (Property property : properties) {
            if (property.getType().equalsIgnoreCase(type)) {
                System.out.println(property);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No properties found for type: " + type);
        }
    }

    public static void main(String[] args) {
        RealEstateApp app = new RealEstateApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nReal Estate Management Application");
            System.out.println("1. Add Property");
            System.out.println("2. View Properties");
            System.out.println("3. Search Properties by Type");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter property type: ");
                    String type = scanner.nextLine();

                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Property property = new Property(address, type, price);
                    app.addProperty(property);
                    break;

                case 2:
                    app.viewProperties();
                    break;

                case 3:
                    System.out.print("Enter property type to search: ");
                    String searchType = scanner.nextLine();
                    app.searchProperties(searchType);
                    break;

                case 4:
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        
        scanner.close();
    }
}