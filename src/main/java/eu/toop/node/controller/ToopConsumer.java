package eu.toop.node.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eu.toop.node.consumer.ConsumerService;
import eu.toop.node.model.DataSet;

@RestController
public class ToopConsumer {

	@Autowired
	private ConsumerService consumerService;
	
	@RequestMapping("/consumer/provide")
    public DataSet provide(@RequestParam(value="country") String country, @RequestParam(value="id") String id) {
        return consumerService.provide(country, id);
    }
	
}
