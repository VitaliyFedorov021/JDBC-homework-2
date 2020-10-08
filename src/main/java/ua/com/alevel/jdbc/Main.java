package ua.com.alevel.jdbc;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        OfficeDao dao = new OfficeDaoImpl();
        int id = Integer.parseInt(Input.input("Enter the id of office to delete"));
        dao.deleteById(id);
        List<OfficeEntity> offices = dao.getAllOffices();
        for (OfficeEntity currentOffice:
                offices) {
            System.out.println(currentOffice.toString());
        }
    }
}
