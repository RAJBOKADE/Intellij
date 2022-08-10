package com.crossasyst.lombok;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import lombok.extern.log4j.Log4j2;

@Log4j2
//when we say @Log4j2 log variable is automatically available to us.
// (Always give it above class, it is class level annotation).
public class Demo {

    //public static final Logger LOG = LogManager.getLogger(Demo.class);
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("Raj");
        p.setLastName("Bokade");
        log.info(p.getFirstName());
        log.info(p.getLastName());

    }

}
