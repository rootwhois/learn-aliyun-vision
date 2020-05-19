package cn.alibaba.demo;

public class runMe {
	public static void main(String[] args) {
		String IDcardUrl = "https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/tiankong/7%E8%BA%AB%E4%BB%BD%E8%AF%81%E5%8E%9F%E5%9B%BE%20%281%29.jpeg";
		String LicensePlateUrl = "https://test-aiecs.oss-cn-shanghai.aliyuncs.com/20200513110741.jpg";
		String DriverLicenseUrl = "";
		
		String info =  new getInfo().getAllInfo(IDcardUrl, LicensePlateUrl, DriverLicenseUrl);
		System.out.println(info);
	}

}
