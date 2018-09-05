package com.mystudy.net2_url;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Ex1 {

	public static void main(String[] args) throws MalformedURLException {
		//new URL(String protocol, String host, int port, String file)
		//protocol : ��űԾ�
		URL url = new URL("http", "java.sun.com", 8080, "aaa/bbb/index.jsp?name=aaa&value=1234");
		
		//��������://ȣ��Ʈ(����):��Ʈ/���(path)?����(query)
		url = new URL("https://map.naver.com/local/siteview.nhn?code=1540600356&_ts=1535936787315");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		int defaultPort = url.getDefaultPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		
		System.out.println("��������(protocol) :" + protocol);
		System.out.println("ȣ��Ʈ(host) : " + host);
		System.out.println("��Ʈ��ȣ(port) : " + port);
		System.out.println("����Ʈ��Ʈ(defaultPort) : " + defaultPort);
		System.out.println("��� -�н�(path) : " + path);
		System.out.println("����-����(query) : " + query);
		System.out.println("����(reference) : " + ref);
		
	}

}
