import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a hash map of vehicles with the key being the model and the value being the brand. 
        HashMap<String, String> vehicles = new HashMap<String, String>();
        vehicles.put("Fiesta", "Ford");
        vehicles.put("Focus", "Ford");
        vehicles.put("Mustang", "Ford");
        vehicles.put("Fusion", "Ford");
        vehicles.put("Civic", "Honda");
        vehicles.put("Accord", "Honda");
        vehicles.put("CR-V", "Honda");
        vehicles.put("Civic Type R", "Honda");
        vehicles.put("Pilot", "Honda");
        vehicles.put("Fit", "Hyundai");
        vehicles.put("Elantra", "Hyundai");
        vehicles.put("Sonata", "Hyundai");
        vehicles.put("Santa Fe", "Hyundai");
        vehicles.put("Tucson", "Hyundai");
        vehicles.put("C-Max", "Tesla");
        vehicles.put("Model S", "Tesla");
        vehicles.put("Model X", "Tesla");
        vehicles.put("Model 3", "Tesla");
        vehicles.put("Model Y", "Tesla");
        vehicles.put("Model 3", "Tesla");

        // get user input for model
        System.out.println("Enter a model: ");
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();


        // check if model is in hash map
        if (vehicles.containsKey(model)) {
            System.out.println("Oh, you're looking for a " + model + "?\nOur " + vehicles.get(model) + " selection is right over here" );
        } else {
            System.out.println("Sorry, we don't have a " + model + ".");
        }

        scanner.close();
    }
}
