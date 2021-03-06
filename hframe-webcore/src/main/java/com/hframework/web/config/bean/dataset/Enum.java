package com.hframework.web.config.bean.dataset;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * generated by hframework on 2016.
 */@XStreamAlias("enum")
public class Enum   {

	@XStreamAsAttribute
    @XStreamAlias("value")
	private String value;
	@XStreamAsAttribute
    @XStreamAlias("name")
	private String name;

    public Enum() {
    }
   
 	 	 
     public String getValue(){
     	return value;
     }

     public void setValue(String value){
     	this.value = value;
     }
	 	 	 
     public String getName(){
     	return name;
     }

     public void setName(String name){
     	this.name = name;
     }
	 
}
