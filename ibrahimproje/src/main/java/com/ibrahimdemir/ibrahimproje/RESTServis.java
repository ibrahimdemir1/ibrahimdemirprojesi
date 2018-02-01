package com.ibrahimdemir.ibrahimproje;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author ibrahim
 *
 */
public class RESTServis {
	private static final List<haber>haberler=new ArrayList<haber>();
	@RequestMapping("/haber/olustur")
	/**
	 * 
	 * @param karakter
	 * @return yenihaber
	 */
	public haber haberOlustur(String karakter) {
		haber yenihaber=new haber(karakter);
		haberler.add(yenihaber);
		return yenihaber;
	}
	/**
	 * 
	 * @return haberler
	 */
	@RequestMapping("/haber/listele")
		public List<haber> haberListele(){
			return haberler;
		}
}
