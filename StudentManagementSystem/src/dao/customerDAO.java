package dao;

import java.util.List;
import dto.customerDTO;

public interface customerDAO {
	
void add(customerDTO c);

List<customerDTO> getallcustomer();
List<customerDTO> searchbyname(String name);
List<customerDTO> searchbyid(int id);

void update(customerDTO c);
int count();

void delete(int id);
void congra(int id);
}
