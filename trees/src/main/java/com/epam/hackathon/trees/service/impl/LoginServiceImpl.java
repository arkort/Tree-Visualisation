package com.epam.hackathon.trees.service.impl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		String name = authentication.getName();
		String password = authentication.getCredentials().toString();
		boolean flag = false;
		try {
			flag = getEmployeeFromWho(name, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag) {
			List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
			grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
			Authentication auth = new UsernamePasswordAuthenticationToken(name,
					password, grantedAuths);
			return auth;
		} else {
			return null;
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
	
	private boolean getEmployeeFromWho(String username, String password) throws Exception {
		
		String loginUrl = "https://who.epam.com/rest/login";
		URL obj = new URL(loginUrl);
		HttpsURLConnection connectToLogin = (HttpsURLConnection) obj.openConnection();
		
		String query = "username="+username +"&password="+password;

		connectToLogin.setRequestMethod("POST");
		connectToLogin.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connectToLogin.setDoOutput(true);
		
		DataOutputStream wr = new DataOutputStream(connectToLogin.getOutputStream());
		wr.writeBytes(query);
		wr.flush();
		wr.close();
		
		int loginRespCode = connectToLogin.getResponseCode();
		String setCookie = connectToLogin.getHeaderField("set-cookie");
		connectToLogin.disconnect();
		
		if (loginRespCode == HttpsURLConnection.HTTP_OK) {
			String searchUserUrl = "https://who.epam.com/employee/search?query="+username+"&pageNumber=0&pageSize=1";
			URL newURL = new URL(searchUserUrl);
			HttpsURLConnection connnectToSearch = (HttpsURLConnection) newURL.openConnection();
			connnectToSearch.setRequestMethod("GET");
			connnectToSearch.setRequestProperty("Content-Type", "application/json");
			connnectToSearch.setRequestProperty("cookie", setCookie);
			BufferedReader in = new BufferedReader(new InputStreamReader(connnectToSearch.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
			connnectToSearch.disconnect();
			return true;
		}else {
			System.out.println("Credential are wrong!");
			return false;
		}
		
	}
	

}
