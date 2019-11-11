package com.bims.sb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/priceservice")
public class SBController {

	@RequestMapping("/quote")
	public Price getMsg() {
		return new Price("Quote from price Service", 555000);
	}

}
