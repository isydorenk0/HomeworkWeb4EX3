package WebService;

import Entity.Car;
import Entity.Client;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ICarShowDAO {
    @WebMethod
    List<String> getAllMarks();

    @WebMethod
    List<Car> getAllCars();

    @WebMethod
    List<Client> getAllClients();

}
