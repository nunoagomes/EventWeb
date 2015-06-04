package eventapp.beans;

import eventapp.OrganizationUser;
import eventapp.RegularUser;
import eventapp.User;

public interface UserManagementLocal {
    public OrganizationUser insertOrganizationUser(String occupation, 
            long phoneNumber, String organizationName, String organizationNIF,
            String email, String password) throws Exception;
    
    public RegularUser insertRegularUser(String firstName, 
            String lastName, String email, String password) throws Exception;
    
    public User signIn(String email, String password) throws Exception;
    
}
