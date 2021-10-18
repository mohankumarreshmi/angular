package com.testing;


import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
public class sendsms {

	public static String main(String[] args) {
		try {
			// Construct data
			String apiKey = "apikey=" + URLEncoder.encode("ejgFBjMup24yGueL5Zyb", "UTF-8");
			String message = "&message=" + URLEncoder.encode("SERVICE FOLDER", "UTF-8");
			String sender = "&sender=" + URLEncoder.encode("SERFLD", "UTF-8");
			String numbers = "&numbers=" + URLEncoder.encode("7676398833", "UTF-8");
			String type = "&type=" + URLEncoder.encode("txt", "UTF-8");
			String tid = "&tid=" + URLEncoder.encode("1207162106736609745", "UTF-8");
			// Send data
			String data = "https://smshorizon.co.in/api/sendsms.php?user=aswath&" + apiKey + numbers + message + sender+ type +tid;
			URL url = new URL(data);
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);
			
			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			String sResult="";
			while ((line = rd.readLine()) != null) {
			// Process line...
				sResult=sResult+line+" ";
			}
			rd.close();
			
			return sResult;
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}

	}

}
