package QuestionA;

import java.util.Date;
import java.util.UUID;

public interface iPersonReadWrite {
	
	public void setPersonID(UUID id);
	
	public void setDate(Date date);
	
	public void setFirstName(String firstName);

	public void setMiddleName(String middleName);

	public void setLastName(String lastName);

	public void setAddress(String address);

	public void setPhone(String phone);

	public void setEmail(String email);

	

}
