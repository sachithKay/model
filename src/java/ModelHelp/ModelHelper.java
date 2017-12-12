/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelHelp;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Skane
 */
public class ModelHelper {
    
 Session session = null;
 
    public  ModelHelper()
    {
        
this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    
            

     }
    
    public User getUser(String email)
    {
         List<User> user = null;    
    try
    {
   
    org.hibernate.Transaction tx = session.beginTransaction();
    Query query = session.createQuery("From User as user Where user.email='"+email+"'");
    user =(List<User>) query.list();
    
    
    }
    
    catch(Exception e)
    {
    e.printStackTrace();
    }
   
    
    return user.get(0);
    }
    
    
    
}
