package frameworktest.service;

import frameworktest.model.Review;
import frameworktest.model.User;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ReviewCreator {
    public  static Review createEmptyReview(){
        return  new Review("","","");
    }
}
