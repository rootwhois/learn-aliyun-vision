package cn.alibaba.demo;

public class config {
	private String accessKeyId = "LTAI4GBiPfZdtZNA5r1srQJi";
	private String accessSecret = "8dcw6BWf2PskDCv7laO46uoavSYAoO";
	public String getAccessKeyId() {
		return accessKeyId;
	}
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}
	public String getAccessSecret() {
		return accessSecret;
	}
	public void setAccessSecret(String accessSecret) {
		this.accessSecret = accessSecret;
	}
	public config() {
		super();
		// TODO Auto-generated constructor stub
	}
	public config(String accessKeyId, String accessSecret) {
		super();
		this.accessKeyId = accessKeyId;
		this.accessSecret = accessSecret;
	}
	@Override
	public String toString() {
		return "Config [accessKeyId=" + accessKeyId + ", accessSecret=" + accessSecret + "]";
	}
	
	

}
