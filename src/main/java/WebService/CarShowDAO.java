package WebService;

import Entity.Car;
import Entity.Client;
import Utils.DAOFactory;

import javax.jws.WebService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "WebService/ICarShowDAO.java")
public class CarShowDAO implements ICarShowDAO{
    private final Connection connection;
    private final String FETCHALLMARKS = "select mark from marks";
    private final String FETCHALLCARS = "select c.*, m.mark from cars c inner join marks m" +
            " on c.mark_id = m.id";
    private final String FETCHALLCLIENTS = "select * from clients";

    public CarShowDAO() {
        this.connection = DAOFactory.getInstance().getConnection();
    }

    @Override
    public List<String> getAllMarks() {
        List<String> allMarks = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(FETCHALLMARKS)) {
            while (resultSet.next()) {
                String mark = resultSet.getString("mark");
                allMarks.add(mark);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allMarks;
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(FETCHALLCARS)) {
            while (resultSet.next()) {
                Car car = new Car(resultSet.getInt("id"), resultSet.getInt("mark_id"),
                        resultSet.getString("model"),resultSet.getInt("price"),
                        resultSet.getString("mark"));
                carList.add(car);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return carList;
    }

    @Override
    public List<Client> getAllClients() {
        List<Client> clientList = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(FETCHALLCLIENTS)) {
            while (resultSet.next()) {
                Client client = new Client(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getInt("age"),resultSet.getString("phone"));
                clientList.add(client);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return clientList;
    }

}
