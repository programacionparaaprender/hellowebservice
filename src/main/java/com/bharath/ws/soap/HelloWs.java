package com.bharath.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cavanosa.virtual.entity.Tio;
import com.cavanosa.virtual.service.TioService;
import com.programacionparaaprender.utils.XMLTransformer;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWs {

	@Autowired
    TioService tioService;
	
	@WebMethod
	public String hello2() {
		List<Tio> list = tioService.findAll();
		//XMLTransformer transformer=XMLTransformer.getInstance();
        //String str=transformer.toXMLString(list);
		//return str;
		return list.toString();
	}
	
	@WebMethod
	public String hello() {
		return "Hello2";
	}

}
