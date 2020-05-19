package cn.alibaba.demo;


import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ocr.model.v20191230.RecognizeDriverLicenseRequest;
import com.aliyuncs.ocr.model.v20191230.RecognizeDriverLicenseResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardRequest;
import com.aliyuncs.ocr.model.v20191230.RecognizeIdentityCardResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeLicensePlateRequest;
import com.aliyuncs.ocr.model.v20191230.RecognizeLicensePlateResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;

public class getInfo {
	

	config config = new config();

	public String getAllInfo(String IDcardUrl,String LicensePlateUrl,String DriverLicenseUrl) {
		return getIDInfo(IDcardUrl)+getLicensePlateInfo(LicensePlateUrl)+getDriverLicenseInfo(DriverLicenseUrl);
		
	}
	
	private String getIDInfo(String url) {
		String info = "";
		DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", config.getAccessKeyId(),config.getAccessSecret());
		IAcsClient client = new DefaultAcsClient(profile);

		RecognizeIdentityCardRequest request = new RecognizeIdentityCardRequest();
		request.setImageURL(url);
		request.setSide("face");

		try {
			RecognizeIdentityCardResponse response = client.getAcsResponse(request);
			String json = new Gson().toJson(response);
			System.out.println(json);
			info = json;
			
		} catch (ServerException e) {
			e.printStackTrace();
		} catch (ClientException e) {
			System.out.println("ErrCode:" + e.getErrCode());
			System.out.println("ErrMsg:" + e.getErrMsg());
			System.out.println("RequestId:" + e.getRequestId());
			info = e.getErrCode()+e.getErrMsg()+e.getRequestId();
		}
		return info;
	}
	
	 private String getLicensePlateInfo(String url) {
	    	String info = "";
			config config = new config();

			DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", config.getAccessKeyId(),config.getAccessSecret());
	        IAcsClient client = new DefaultAcsClient(profile);

	        RecognizeLicensePlateRequest request = new RecognizeLicensePlateRequest();
	        request.setImageURL(url);

	        try {
	            RecognizeLicensePlateResponse response = client.getAcsResponse(request);
	            String json = new Gson().toJson(response);
				System.out.println(json);
				info = json;

	        } catch (ServerException e) {
	            e.printStackTrace();
	        } catch (ClientException e) {
	            System.out.println("ErrCode:" + e.getErrCode());
	            System.out.println("ErrMsg:" + e.getErrMsg());
	            System.out.println("RequestId:" + e.getRequestId());
				info = e.getErrCode()+e.getErrMsg()+e.getRequestId();

	        }
			return info;

	    }
	 
	 private String getDriverLicenseInfo(String url) {
	    	String info = "";
			config config = new config();

			DefaultProfile profile = DefaultProfile.getProfile("cn-shanghai", config.getAccessKeyId(),config.getAccessSecret());
	        IAcsClient client = new DefaultAcsClient(profile);

	        RecognizeDriverLicenseRequest request = new RecognizeDriverLicenseRequest();
	        request.setSide("https://viapi-demo.oss-cn-shanghai.aliyuncs.com/viapi-demo/images/DetectImageElements/xxx.png	");

	        try {
	            RecognizeDriverLicenseResponse response = client.getAcsResponse(request);
	            String json = new Gson().toJson(response);
				System.out.println(json);
				info = json;
	        } catch (ServerException e) {
	            e.printStackTrace();
	        } catch (ClientException e) {
	            System.out.println("ErrCode:" + e.getErrCode());
	            System.out.println("ErrMsg:" + e.getErrMsg());
	            System.out.println("RequestId:" + e.getRequestId());
				info = e.getErrCode()+e.getErrMsg()+e.getRequestId();

	        }
	        return info;
	    }

}
