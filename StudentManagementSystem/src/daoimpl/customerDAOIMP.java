package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import dao.customerDAO;
import dto.customerDTO;

public class customerDAOIMP implements customerDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet res = null;

    public void add(customerDTO s) {

        con = ConnectionFactory.getConnection();

        String q = "insert into customer (`cid`,`cname`,`cemail`,`phone`,`age`,`gender`) value(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(q);

            ps.setInt(1, s.getCid());
            ps.setString(2, s.getCname());
            ps.setString(3, s.getCemail());
            ps.setString(4, s.getPhone());
            ps.setString(5, s.getAge());
            ps.setString(6, s.getGender());

            boolean res = ps.execute();

            if (res != false) {
                System.out.println("inserted succesfully:");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<customerDTO> getallcustomer() {

        List<customerDTO> l = new ArrayList<customerDTO>();

        String q = "select * from customer";

        try (
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet res = ps.executeQuery()
        ) {

            while (res.next()) {

                customerDTO c = new customerDTO(
                    res.getInt("cid"),
                    res.getString("cname"),
                    res.getString("cemail"),
                    res.getString("phone"),
                    res.getString("age"),
                    res.getString("gender")
                );

                l.add(c);
                return l;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return l;
    }

    public List<customerDTO> searchbyname(String name) {

        List<customerDTO> l = new ArrayList<customerDTO>();

        con = ConnectionFactory.getConnection();

        String q = "select * from customer where cname like ?";

        if (con == null) {
            System.out.println("no data i database");
        }

        try {

            ps = con.prepareStatement(q);
            ps.setString(1, "%" + name + "%");

            res = ps.executeQuery();

            while (res.next()) {

                customerDTO c = new customerDTO(
                    res.getInt(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6)
                );

                l.add(c);
                return l;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return l;
    }

    @Override
    public List<customerDTO> searchbyid(int id) {

        List<customerDTO> l = new ArrayList<customerDTO>();

        con = ConnectionFactory.getConnection();

        String q = "select * from customer where cid = ?";

        try {

            ps = con.prepareStatement(q);
            ps.setInt(1, id);

            res = ps.executeQuery();

            while (res.next()) {

                customerDTO c = new customerDTO(
                    res.getInt(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4),
                    res.getString(5),
                    res.getString(6)
                );

                l.add(c);
                return l;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return l;
    }

    @Override
    public void delete(int id) {

        con = ConnectionFactory.getConnection();

        String q = "delete from customer where cid=?";

        try {

            ps = con.prepareStatement(q);
            ps.setInt(1, id);
            ps.execute();

            System.out.println("delet");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(customerDTO a) {

        con = ConnectionFactory.getConnection();

        String q = "update from customer set cname=?,cemail=?,phone=?,age=?,gender=? where cid=?";

        try {

            ps = con.prepareStatement(q);

            ps.setString(1, a.getCname());
            ps.setString(2, a.getCemail());
            ps.setString(3, a.getPhone());
            ps.setString(4, a.getAge());
            ps.setString(5, a.getGender());
            ps.setInt(6, a.getCid());

            ps.execute();

            System.out.println("update done");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int count() {

        con = ConnectionFactory.getConnection();

        String q = "select count(*) from customer";

        try {

            ps = con.prepareStatement(q);

            res = ps.executeQuery();

            while (res.next()) {
                return res.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public void congra(int id) {

        con = ConnectionFactory.getConnection();

        if (id / 10 == 0) {
            System.out.println("you get offer of 10%");
        }
        else if (id / 20 == 0) {
            System.out.println("you get 15% offer on the product");
        }
        else if (id / 30 == 0) {
            System.out.println("you get 20% offer on the product");
        }
        else if (id / 40 == 0) {
            System.out.println("you get 25% offer on the product");
        }
        else if (id / 50 == 0) {
            System.out.println("you get 30% offer on the product");
        }
        else if (id / 60 == 0) {
            System.out.println("you get 35% offer on the product");
        }
        else if (id / 70 == 0) {
            System.out.println("you get 40% offer on the product");
        }
        else if (id / 80 == 0) {
            System.out.println("you get 45% offer on the product");
        }
        else if (id / 90 == 0) {
            System.out.println("you get 47% offer on the product");
        }
        else if (id / 100 == 0) {
            System.out.println("you get 50% offer on the product");
        }
        else {
            System.out.println("THANK YOU FOR CREATING A ID IN OUR COMPANY:");
        }
    }
}