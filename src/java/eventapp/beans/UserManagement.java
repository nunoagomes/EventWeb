package eventapp.beans;

import eventapp.DAOFactory;
import eventapp.OrganizationUser;
import eventapp.RegularUser;
import eventapp.User;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.internal.SQLQueryImpl;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author emanuel.braga
 * @author anr
 */
@Stateless
public class UserManagement implements UserManagementLocal {

    private final static String SALT = "$2a$10$LkXF6bfgPVudV3JXsrkNvO";
    
    @Override
    public OrganizationUser insertOrganizationUser(String occupation,
            long phoneNumber, String organizationName, String organizationNIF,
            String email, String password) throws Exception {

        OrganizationUser _organizationUser = DAOFactory.getDAOFactory().getOrganizationUserDAO().createOrganizationUser();
        copyToOrganizationUser(_organizationUser, occupation, phoneNumber, organizationName, organizationNIF, email, password);
        if (eventapp.DAOFactory.getDAOFactory().getOrganizationUserDAO().save(_organizationUser)) {
            return _organizationUser;
        } else {
            return null;
        }
    }

    @Override
    public RegularUser insertRegularUser(String firstName, String lastName,
            String email, String password) throws Exception {
        
        RegularUser _regularUser = DAOFactory.getDAOFactory().getRegularUserDAO().createRegularUser();
        copyToRegularUser(_regularUser, firstName, lastName, email, password);
        if (eventapp.DAOFactory.getDAOFactory().getRegularUserDAO().save(_regularUser)) {
            return _regularUser;
        } else {
            return null;
        }
    }
    
    @Override
    public User signIn(String email, String password) throws Exception {
        User _inputUser = DAOFactory.getDAOFactory().getUserDAO().createUser();
        copyToUser(_inputUser, email, password);
        String query = "User.email = '" + _inputUser.getEmail() + "' and User.password = '" + _inputUser.getPassword() + "'"; 
        User _dbUser = eventapp.DAOFactory.getDAOFactory().getUserDAO().loadUserByQuery(query, null);
        if (_dbUser != null) {
            return _dbUser;
        } else {
            return null;
        }
    }
    
    private void copyToUser(eventapp.User _user,  String email, String password) {
        _user.setEmail(email);
        _user.setPassword(BCrypt.hashpw(password, SALT));
    }

    private void copyToOrganizationUser(eventapp.OrganizationUser _organizationUser,
            String occupation, long phoneNumber, String organizationName, 
            String organizationNIF, String email, String password) {
        copyToUser(_organizationUser, email, password);
        _organizationUser.setOccupation(occupation);
        _organizationUser.setPhoneNumber(phoneNumber);
        _organizationUser.setOrganizationName(organizationName);
        _organizationUser.setOrganizationNIF(organizationNIF);
    }

    private void copyToRegularUser(eventapp.RegularUser _regularUser, 
            String firstName, String lastName, String email, String password) {
        copyToUser(_regularUser, email, password);
        _regularUser.setFirstName(firstName);
        _regularUser.setLastName(lastName);
    }

}
