package com.provivi.likun.controller;


import com.provivi.likun.entity.FirstName;
import com.provivi.likun.entity.LastName;
import com.provivi.likun.entity.MiddleName;
import com.provivi.likun.service.FirstNameService;
import com.provivi.likun.service.LastNameService;
import com.provivi.likun.service.MiddleNameService;
import com.provivi.likun.util.CustomResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    FirstNameService firstNameService;

    @Autowired
    MiddleNameService middleNameService;

    @Autowired
    LastNameService lastNameService;

    /**
     * Randomly get one record of first name from database
     * @return CustomResponseBody
     */
    @RequestMapping(value = "firstName", method = RequestMethod.GET)
    public CustomResponseBody getAFirstName() {
        try {
            logger.info("Reaching GET /user/firstName");
            FirstName obj = firstNameService.getOneFirstName();
            return CustomResponseBody.success(obj);
        } catch (Exception e) {
            return CustomResponseBody.error(e.getMessage());
        }
    }

    /**
     * Randomly get one record of first name from database
     * @return CustomResponseBody
     */
    @RequestMapping(value = "middleName", method = RequestMethod.GET)
    public CustomResponseBody getAMiddleName() {
        try {
            logger.info("Reaching GET /user/middleName");
            MiddleName obj = middleNameService.getOneMiddleName();
            return CustomResponseBody.success(obj);
        } catch (Exception e) {
            return CustomResponseBody.error(e.getMessage());
        }
    }

    /**
     * Randomly get one record of first name from database
     * @return CustomResponseBody
     */
    @RequestMapping(value = "lastName", method = RequestMethod.GET)
    public CustomResponseBody getALastName() {
        try {
            logger.info("Reaching GET /user/lastName");
            LastName obj = lastNameService.getOneLastName();
            return CustomResponseBody.success(obj);
        } catch (Exception e) {
            return CustomResponseBody.error(e.getMessage());
        }
    }
}
