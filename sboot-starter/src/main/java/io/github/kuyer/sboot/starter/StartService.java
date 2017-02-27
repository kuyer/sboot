package io.github.kuyer.sboot.starter;

public class StartService {
	
	private StartConfig startConfig;
	
	public StartService() {}
	
	public StartService(StartConfig startConfig) {
		this.startConfig = startConfig;
	}

	public String getName() {
		return startConfig.getName();
	}
	
	public String getDescribe() {
		return startConfig.getDescribe();
	}

}
