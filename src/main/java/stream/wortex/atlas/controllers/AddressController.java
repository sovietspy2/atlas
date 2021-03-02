package stream.wortex.atlas.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import stream.wortex.atlas.models.Address;
import stream.wortex.atlas.services.AddressManagerService;

import java.util.List;

@Controller
public class AddressController {

    private static final Logger logger = LogManager.getLogger(AddressController.class);

    @Autowired
    private AddressManagerService addressManagerService;

    @RequestMapping(value = "/addresses", method = RequestMethod.GET)
    @ResponseBody
    private List<Address> getAddresses() {

        logger.info("api accessed");
        return addressManagerService.getAddresses();
    }

}
