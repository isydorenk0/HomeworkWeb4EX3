import WebService.CarShowDAO;

public class Main {
    public static void main(String[] args) {
        CarShowDAO carShow = new CarShowDAO();
        System.out.println(carShow.getAllMarks());
        System.out.println(carShow.getAllCars());
        System.out.println(carShow.getAllClients());
    }
}
