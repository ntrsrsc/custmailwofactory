/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author Reo
 */
public class CustomerFactory {
    public static Customer createCustomer(String type){
        /*if (type.equals("Regular")) 
            return new RegularCustomer();
	else if (type.equals("Mountain"))
            return new MountainCustomer();
        else if (type.equals("Delinquent"))
            return new DelinquentCustomer();*/
        switch (type) {
            case "Regular":
                return new RegularCustomer();
            case "Mountain":
                return new MountainCustomer();
            case "Delinquent":
                return new DelinquentCustomer();
        }
	return null;
    }
}
