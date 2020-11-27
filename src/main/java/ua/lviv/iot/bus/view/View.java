package ua.lviv.iot.bus.view;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import ua.lviv.iot.bus.controller.BusController;
import ua.lviv.iot.bus.controller.BusModelController;
import ua.lviv.iot.bus.controller.DistanceBetweenStopsController;
import ua.lviv.iot.bus.controller.DriverController;
import ua.lviv.iot.bus.controller.ProducerController;
import ua.lviv.iot.bus.controller.RouteController;
import ua.lviv.iot.bus.controller.StopController;
import ua.lviv.iot.bus.model.entity.Bus;
import ua.lviv.iot.bus.model.entity.BusModel;
import ua.lviv.iot.bus.model.entity.DistanceBetweenStops;
import ua.lviv.iot.bus.model.entity.Driver;
import ua.lviv.iot.bus.model.entity.Producer;
import ua.lviv.iot.bus.model.entity.Route;
import ua.lviv.iot.bus.model.entity.Stop;

public class View {
  private final StopController stopController = new StopController();
  private final BusController busController = new BusController();
  private final ProducerController producerController = new ProducerController();
  private final DriverController driverController = new DriverController();
  private final BusModelController busModelController = new BusModelController();
  private final DistanceBetweenStopsController distanceBetweenStopsController = new DistanceBetweenStopsController();
  private final RouteController routeController = new RouteController();

  private Map<String, String> menu;
  private Map<String, Printable> methodsMenu;
  private static final Scanner INPUT = new Scanner(System.in);

  public View() {
    menu = new LinkedHashMap<>();
    methodsMenu = new LinkedHashMap<>();

    menu.put("Q", "Q - exit program");
    menu.put("S", "S - show menu");

    menu.put("1", "\n1 - Get all buses");
    menu.put("2", "2 - Get bus by ID");
    menu.put("3", "3 - Create bus");
    menu.put("4", "4 - Delete bus");
    menu.put("5", "5 - Update bus\n");

    menu.put("6", "6 - Get all producers");
    menu.put("7", "7 - Get producer by ID");
    menu.put("8", "8 - Create producer");
    menu.put("9", "9 - Delete producer");
    menu.put("10", "10 - Update producer\n");

    menu.put("11", "11 - Get all drivers");
    menu.put("12", "12 - Get driver by ID");
    menu.put("13", "13 - Create driver");
    menu.put("14", "14 - Delete driver");
    menu.put("15", "15 - Update driver\n");

    menu.put("16", "16 - Get all bus models");
    menu.put("17", "17 - Get bus model by ID");
    menu.put("18", "18 - Create bus model");
    menu.put("19", "19 - Delete bus model");
    menu.put("20", "20 - Update bus model\n");

    menu.put("21", "21 - Get all distances between stops");
    menu.put("22", "22 - Get distance between stops by ID");
    menu.put("23", "23 - Create distance between stops");
    menu.put("24", "24 - Delete distance between stops");
    menu.put("25", "25 - Update distance between stops\n");

    menu.put("26", "26 - Get all routes");
    menu.put("27", "27 - Get route by ID");
    menu.put("28", "28 - Create route");
    menu.put("29", "29 - Delete route");
    menu.put("30", "30 - Update route\n");

    menu.put("31", "31 - Get all stops");
    menu.put("32", "32 - Get stop by ID");
    menu.put("33", "33 - Create stop");
    menu.put("34", "34 - Delete stop");
    menu.put("35", "35 - Update stop\n");
    
    methodsMenu.put("S", this::showMenu);

    methodsMenu.put("1", this::getAllBuses);
    methodsMenu.put("2", this::getBusByID);
    methodsMenu.put("3", this::createBus);
    methodsMenu.put("4", this::deleteBus);
    methodsMenu.put("5", this::updateBus);

    methodsMenu.put("6", this::getAllProducers);
    methodsMenu.put("7", this::getProducerByID);
    methodsMenu.put("8", this::createProducer);
    methodsMenu.put("9", this::deleteProducer);
    methodsMenu.put("10", this::updateProducer);

    methodsMenu.put("11", this::getAllDrivers);
    methodsMenu.put("12", this::getDriverByID);
    methodsMenu.put("13", this::createDriver);
    methodsMenu.put("14", this::deleteDriver);
    methodsMenu.put("15", this::updateDriver);

    methodsMenu.put("16", this::getAllBusModels);
    methodsMenu.put("17", this::getBusModelByID);
    methodsMenu.put("18", this::createBusModel);
    methodsMenu.put("19", this::deleteBusModel);
    methodsMenu.put("20", this::updateBusModel);

    methodsMenu.put("21", this::getAllDistances);
    methodsMenu.put("22", this::getDistanceByID);
    methodsMenu.put("23", this::createDistance);
    methodsMenu.put("24", this::deleteDistance);
    methodsMenu.put("25", this::updateDistance);

    methodsMenu.put("26", this::getAllRoutes);
    methodsMenu.put("27", this::getRouteByID);
    methodsMenu.put("28", this::createRoute);
    methodsMenu.put("29", this::deleteRoute);
    methodsMenu.put("30", this::updateRoute);

    methodsMenu.put("31", this::getAllStops);
    methodsMenu.put("32", this::getStopByID);
    methodsMenu.put("33", this::createStop);
    methodsMenu.put("34", this::deleteStop);
    methodsMenu.put("35", this::updateStop);
  }

  private final void getAllBuses() throws SQLException {
    System.out.println("\nBuses:\n");
    System.out.println(busController.getAll());
  }

  private final void getBusByID() throws SQLException {
    System.out.println("Type ID:");
    int id = INPUT.nextInt();
    System.out.println("\nBus: ");
    System.out.println(busController.getBy(id));
  }

  private final void createBus() throws SQLException {
    System.out.println("Type driver id:");
    int driverId = INPUT.nextInt();
    System.out.println("Type route id:");
    int routeId = INPUT.nextInt();
    System.out.println("Type bus model id:");
    int busModelId = INPUT.nextInt();
    System.out.println("Type age in years:");
    int age = INPUT.nextInt();
    System.out.println("Type mileage:");
    int mileage = INPUT.nextInt();
    System.out.println(busController.create(new Bus(driverId, routeId, busModelId, age, mileage)));
  }

  private final void deleteBus() throws SQLException {
    System.out.println("Type id of an object you want to delete: ");
    int id = INPUT.nextInt();
    System.out.println(busController.delete(id));
  }

  private final void updateBus() throws SQLException {
    System.out.println("Type id of an object to edit");
    int id = INPUT.nextInt();
    System.out.println("Type driver id:");
    int driverId = INPUT.nextInt();
    System.out.println("Type route id:");
    int routeId = INPUT.nextInt();
    System.out.println("Type bus model id:");
    int busModelId = INPUT.nextInt();
    System.out.println("Type age in years:");
    int age = INPUT.nextInt();
    System.out.println("Type mileage:");
    int mileage = INPUT.nextInt();
    Bus entity = new Bus(id, driverId, routeId, busModelId, age, mileage);
    System.out.println(busController.update(entity));
  }

  private final void getAllProducers() throws SQLException {
    System.out.println("\nProducers:\n");
    System.out.println(producerController.getAll());
  }

  private final void getProducerByID() throws SQLException {
    System.out.println("Type ID:");
    int id = INPUT.nextInt();
    System.out.println("\nProducer: ");
    System.out.println(producerController.getBy(id));
  }

  private final void createProducer() throws SQLException {
    System.out.println("Type name:");
    String producerName = INPUT.next();
    System.out.println(producerController.create(new Producer(producerName)));
  }

  private final void deleteProducer() throws SQLException {
    System.out.println("Type id of an object you want to delete: ");
    int id = INPUT.nextInt();
    System.out.println(producerController.delete(id));
  }

  private final void updateProducer() throws SQLException {
    System.out.println("Type id of an object to edit");
    int id = INPUT.nextInt();
    System.out.println("Type name:");
    String producerName = INPUT.next();
    Producer entity = new Producer(id, producerName);
    System.out.println(producerController.update(entity));
  }

  private final void getAllDrivers() throws SQLException {
    System.out.println("\nDrivers:\n");
    System.out.println(driverController.getAll());
  }

  private final void getDriverByID() throws SQLException {
    System.out.println("Type ID:");
    int id = INPUT.nextInt();
    System.out.println("\nDriver: ");
    System.out.println(driverController.getBy(id));
  }

  private final void createDriver() throws SQLException {
    System.out.println("Type name:");
    String name = INPUT.next();
    System.out.println("Type surname:");
    String surname = INPUT.next();
    System.out.println(driverController.create(new Driver(name, surname)));
  }

  private final void deleteDriver() throws SQLException {
    System.out.println("Type id of an object you want to delete: ");
    int id = INPUT.nextInt();
    System.out.println(driverController.delete(id));
  }

  private final void updateDriver() throws SQLException {
    System.out.println("Type id of an object to edit");
    int id = INPUT.nextInt();
    System.out.println("Type name:");
    String name = INPUT.next();
    System.out.println("Type surname:");
    String surname = INPUT.next();
    Driver entity = new Driver(id, name, surname);
    System.out.println(driverController.update(entity));
  }

  private final void getAllBusModels() throws SQLException {
    System.out.println("\nBuses:\n");
    System.out.println(busModelController.getAll());
  }

  private final void getBusModelByID() throws SQLException {
    System.out.println("Type ID:");
    int id = INPUT.nextInt();
    System.out.println("\nBus models: ");
    System.out.println(busModelController.getBy(id));
  }

  private final void createBusModel() throws SQLException {
    System.out.println("Type producer id:");
    int producerId = INPUT.nextInt();
    System.out.println("Type color:");
    String color = INPUT.next();
    System.out.println("Type capacity:");
    int capacity = INPUT.nextInt();
    System.out.println("Type model name:");
    String modelName = INPUT.next();
    System.out.println(busModelController.create(new BusModel(producerId, color, capacity, modelName)));
  }

  private final void deleteBusModel() throws SQLException {
    System.out.println("Type id of an object you want to delete: ");
    int id = INPUT.nextInt();
    System.out.println(busModelController.delete(id));
  }

  private final void updateBusModel() throws SQLException {
    System.out.println("Type id of an object to edit");
    int id = INPUT.nextInt();
    System.out.println("Type producer id:");
    int producerId = INPUT.nextInt();
    System.out.println("Type color:");
    String color = INPUT.next();
    System.out.println("Type capacity:");
    int capacity = INPUT.nextInt();
    System.out.println("Type model name:");
    String modelName = INPUT.next();
    BusModel entity = new BusModel(id, producerId, color, capacity, modelName);
    System.out.println(busModelController.update(entity));
  }

  private final void getAllDistances() throws SQLException {
    System.out.println("\nDistances:\n");
    System.out.println(distanceBetweenStopsController.getAll());
  }

  private final void getDistanceByID() throws SQLException {
    System.out.println("Type ID:");
    int id = INPUT.nextInt();
    System.out.println("\nDistance: ");
    System.out.println(distanceBetweenStopsController.getBy(id));
  }

  private final void createDistance() throws SQLException {
    System.out.println("Type first stop id:");
    int startId = INPUT.nextInt();
    System.out.println("Type finish stop id:");
    int finishId = INPUT.nextInt();
    System.out.println("Type distance in metres:");
    int distance=INPUT.nextInt();
    System.out.println(distanceBetweenStopsController.create(new DistanceBetweenStops(startId, finishId, distance)));
  }

  private final void deleteDistance() throws SQLException {
    System.out.println("Type id of an object you want to delete: ");
    int id = INPUT.nextInt();
    System.out.println(distanceBetweenStopsController.delete(id));
  }

  private final void updateDistance() throws SQLException{
    System.out.println("Type id of an object to edit");
    int id =INPUT.nextInt();
    System.out.println("Type first stop id:");
    int startId = INPUT.nextInt();
    System.out.println("Type finish stop id:");
    int finishId = INPUT.nextInt();
    System.out.println("Type distance in metres:");
    int distance=INPUT.nextInt();
    DistanceBetweenStops entity=new DistanceBetweenStops(id,startId,finishId,distance);
    System.out.println(distanceBetweenStopsController.update(entity));
  }

  private final void getAllRoutes() throws SQLException {
    System.out.println("\nRoutes:\n");
    System.out.println(routeController.getAll());
  }

  private final void getRouteByID() throws SQLException {
    System.out.println("Type ID:");
    int id = INPUT.nextInt();
    System.out.println("\nRoute: ");
    System.out.println(routeController.getBy(id));
  }

  private final void createRoute() throws SQLException {
    System.out.println("Type starting address:");
    String startingAddress = INPUT.next();
    System.out.println("Type destination address:");
    String destinationAddress = INPUT.next();
    System.out.println("Type route number:");
    String routeNumber = INPUT.next();
    System.out.println(routeController.create(new Route(startingAddress, destinationAddress, routeNumber)));
  }

  private final void deleteRoute() throws SQLException {
    System.out.println("Type id of an object you want to delete: ");
    int id = INPUT.nextInt();
    System.out.println(routeController.delete(id));
  }

  private final void updateRoute() throws SQLException {
    System.out.println("Type id of an object to edit");
    int id = INPUT.nextInt();
    System.out.println("Type starting address:");
    String startingAddress = INPUT.next();
    System.out.println("Type destination address:");
    String destinationAddress = INPUT.next();
    System.out.println("Type route number:");
    String routeNumber = INPUT.next();
    Route entity = new Route(id, startingAddress, destinationAddress, routeNumber);
    System.out.println(routeController.update(entity));
  }
  private final void getAllStops() throws SQLException {
    System.out.println("\nStops:\n");
    System.out.println(stopController.getAll());
  }

  private final void getStopByID() throws SQLException {
    System.out.println("Type ID:");
    int id = INPUT.nextInt();
    System.out.println("\nStop: ");
    System.out.println(stopController.getBy(id));
  }

  private final void createStop() throws SQLException {
    System.out.println("Type address:");
    String address = INPUT.next();
    System.out.println(stopController.create(new Stop(address)));
  }

  private final void deleteStop() throws SQLException {
    System.out.println("Type id of an object you want to delete: ");
    int id = INPUT.nextInt();
    System.out.println(stopController.delete(id));
  }

  private final void updateStop() throws SQLException {
    System.out.println("Type id of an object to edit");
    int id = INPUT.nextInt();
    System.out.println("Type address:");
    String address = INPUT.next();
    Stop entity = new Stop(id, address);
    System.out.println(stopController.update(entity));
  }
  private void showMenu() {
    System.out.println("\nMENU:");
    for (String str : menu.values()) {
        System.out.println(str);
    }
}

private void showMainMenu() {
    System.out.println(menu.get("S"));
    System.out.println(menu.get("Q"));
    System.out.println("Select menu option.");
}

public void show() {
    String keyMenu;
    showMainMenu();
    do {
        keyMenu = INPUT.next().toUpperCase();
        try {
          if(keyMenu==null) {
            return;
          }
            methodsMenu.get(keyMenu).print();
        } catch (Exception ignored) {
        }

    } while (!keyMenu.equals("Q"));
}
}
