package io.github.kuyer.sboot.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kuyer.sboot.starter.StartService;

@Service
public class TxService {
	
	@Autowired
	private StartService startService;
	
	public void start() {
		System.out.println(startService.getName() + " - " + startService.getDescribe());
	}

}
