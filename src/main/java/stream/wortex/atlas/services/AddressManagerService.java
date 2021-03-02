package stream.wortex.atlas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stream.wortex.atlas.config.Config;
import stream.wortex.atlas.models.Address;
import stream.wortex.atlas.repositories.AddressRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressManagerService {

    @Autowired
    private Config config;

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddresses() {

        List<Address> list = new ArrayList<>();

        addressRepository.findAll().iterator().forEachRemaining(list::add);

        return list;

    }


}
