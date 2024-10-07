import concessionaire.Car;
import concessionaire.Motorbike;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***  Lista de vehículos ***");
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        List<Motorbike> motorbikeList = new ArrayList<>();

        int choice = 0;
        int innerChoice = 0;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Añadir vehículos");
            System.out.println("2. Mostrar vehículos");
            System.out.println("3. Salir");
            try {
                choice = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Opción no válida");
            }
            if (choice == 1){
                System.out.println("1. Añadir coche");
                System.out.println("2. Añadir moto");
                try {
                    innerChoice = scanner.nextInt();
                } catch (Exception e){
                    System.out.println("Opción no válida");
                }
                String[] fields = new String[5];
                if (innerChoice == 1) {
                    addCar(carList);
                } else if (innerChoice == 2) {
                    addMotorbike(motorbikeList);
                } else {
                    System.out.println("Alguno de los datos introducidos no es correcto");
                }
            }
            else if (choice == 2){
                System.out.println("1. Mostrar todos");
                System.out.println("2. Mostrar por tipo de vehículo");
                System.out.println("3. Mostrar por marca");

                try {
                    innerChoice = scanner.nextInt();
                } catch (Exception e){
                    System.out.println("Opción no válida");
                }
                if (innerChoice == 1){
                    carList.forEach(car -> System.out.println(car.getBrand() + ", " + car.getModel() + ", " + car.getYear() + ", " + car.getNumberOfDoors() + ", " + car.getConvertible()));
                    motorbikeList.forEach(motorbike -> System.out.println((motorbike.getBrand() + ", " + motorbike.getModel() + ", " + motorbike.getYear() + ", " + motorbike.getEngineDisplacement() + ", " + motorbike.getHasSidecar())));
                }
                else if (innerChoice == 2){
                    System.out.println("1. Coches");
                    System.out.println("2. Motos");
                    try {
                        innerChoice = scanner.nextInt();
                    } catch (Exception e){
                        System.out.println("Opción no válida");
                    }
                    if (innerChoice == 1){
                        carList.forEach(car -> System.out.println(car.getBrand() + ", " + car.getModel() + ", " + car.getYear() + ", " + car.getNumberOfDoors() + ", " + car.getConvertible()));
                    }
                    else if (innerChoice == 2){
                        motorbikeList.forEach(motorbike -> System.out.println((motorbike.getBrand() + ", " + motorbike.getModel() + ", " + motorbike.getYear() + ", " + motorbike.getEngineDisplacement() + ", " + motorbike.getHasSidecar())));
                    }
                    else {
                        System.out.println("Opción no válida");
                    }
                }
                else if (innerChoice == 3){
                    showByBrand(carList, motorbikeList);
                }
                else {
                    System.out.println("Opción no válida");
                }
            } else {
                System.out.println("Fin del programa. Adiós");
            }
        } while (choice != 3);
        scanner.close();
    }

    private static void showByBrand(List<Car> carList, List<Motorbike> motorbikeList) {
        Scanner sc = new Scanner(System.in);
        String brand = "";
        try {
            brand = sc.nextLine().trim();
        } catch (Exception e){
            System.out.println("Opción no válida");
        }
        String finalBrand = brand;
        carList.stream().filter(car -> car.getBrand().equals(finalBrand)).forEach(car -> System.out.println(car.getBrand() + "," + car.getModel() + ", " + car.getYear() + ", " + car.getNumberOfDoors() + ", " + car.getConvertible()));
        motorbikeList.stream().filter(motorbike-> motorbike.getBrand().equals(finalBrand)).forEach(motorbike -> System.out.println((motorbike.getBrand() + ", " + motorbike.getModel() + ", " + motorbike.getYear() + ", " + motorbike.getEngineDisplacement() + ", " + motorbike.getHasSidecar())));
    }

    private static void addMotorbike(List<Motorbike> motorbikeList) {
        Scanner sc = new Scanner(System.in);
        String[] fields;
        System.out.println("Añadir Moto (brand, model, year, engineDisplacement, hasSidecar)");
        try {
            fields = sc.nextLine().split(",");
            motorbikeList.add(new Motorbike(fields[0], fields[1], Integer.valueOf(fields[2].trim()), Integer.valueOf(fields[3].trim()), Boolean.valueOf(fields[4].trim())));
        } catch (Exception e) {
            System.out.println("Alguno de los datos introducidos no es correcto");
        }
    }

    private static void addCar(List<Car> carList) {
        Scanner sc = new Scanner(System.in);
        String[] fields;
        System.out.println("Añadir coche (brand, model, year, numberOfDoors, isConvertible)");
        try {
            fields = sc.nextLine().split(",");
            carList.add(new Car(fields[0], fields[1], Integer.valueOf(fields[2].trim()), Integer.valueOf(fields[3].trim()), Boolean.valueOf(fields[4].trim())));
        } catch (Exception e) {
            System.out.println("Alguno de los datos introducidos no es correcto");
        }
    }
}