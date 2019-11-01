package com.lst.eurekaprovider.util;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * �������봦��
 * 
 */
public class EncodingFiter implements Filter {

	private String encoding = "UTF-8";// Ĭ���ַ���

	public EncodingFiter() {
		super();
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		// ���Ĵ������ŵ� chain.doFilter(request, response)����ǰ��
		res.setContentType("text/html;charset=" + this.encoding);
		if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding(this.encoding);
		} else {
			Map map = req.getParameterMap();// �������в�����=����ֵ(����)��Map����
			Set set = map.keySet();// ȡ�����в�����
			Iterator it = set.iterator();
			while (it.hasNext()) {
				String name = (String) it.next();
				String[] values = (String[]) map.get(name);// ȡ������ֵ[ע������ֵΪһ������]
				for (int i = 0; i < values.length; i++) {
					values[i] = new String(values[i].getBytes("ISO-8859-1"),
							this.encoding);
				}
			}
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		String s = filterConfig.getInitParameter("encoding");// ��ȡweb.xml�ļ������õ��ַ���
		if (null != s && !s.trim().equals("")) {
			this.encoding = s.trim();
		}
	}

}
