package eu.toop.node.service;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.toop.node.consumer.ConsumerService;
import eu.toop.node.model.DataSet;

@Service
public class ChambreOfCommerceConsumerService implements ConsumerService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ChambreOfCommerceConsumerService.class);

	@Autowired
	private CountrySpecificProviderService service;
	
	@Autowired
	private Map<String, String> providerServices;
	
	@Override
	public DataSet provide(String country, String companyCode) {
		LOGGER.info("Getting dataset from ProviderService with URL {} for companyCode {}.", country, companyCode);
		String url = providerServices.get(country);
		try {
			return service.getDataSet(url, companyCode);
		} catch (IOException e) {
			LOGGER.error("Unable to get dataset from ProviderService with URL {} for companyCode {}.", country, companyCode, e);
			return null;
		}
	}

}
