package utility;

import model.User;

/**Create an interface EligibilityInterface in the utility package*
2.*Create a method in interface - boolean checkUser (User user)*
3.*Create a method in interface - boolean checkQuizAnswer (String points)*
*/
public interface EligibilityInterface{
	  boolean checkUser (User user);
	  boolean checkQuizAnswer (String points);
}
