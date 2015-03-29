package demo;

import org.apache.log4j.Logger;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class Example {

    @RequestMapping("/aa")
    String home() {
    	Logger logger = Logger.getLogger(Example.class);
    	Exception e = new IllegalArgumentException();
    	logger.info("sssssssssssssssss\nfasdfasdfasdfasdf",e);
        return "Hello World!";
    }

}