package Utils;

import java.sql.Connection;

public interface IDAOFactory {
    Connection getConnection();
}
