package com.example.officeprojectjachi.Service.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Responmodel {

	@SerializedName("last")
	private boolean last;

	@SerializedName("numberOfElements")
	private Object numberOfElements;

	@SerializedName("totalPages")
	private int totalPages;

	@SerializedName("currentPageNumber")
	private int currentPageNumber;

	@SerializedName("message")
	private String message;

	@SerializedName("businessTypes")
	private List<BusinessTypesItem> businessTypes;

	@SerializedName("first")
	private boolean first;

	@SerializedName("statusCode")
	private int statusCode;

	@SerializedName("totalElements")
	private int totalElements;

	public void setLast(boolean last){
		this.last = last;
	}

	public boolean isLast(){
		return last;
	}

	public void setNumberOfElements(Object numberOfElements){
		this.numberOfElements = numberOfElements;
	}

	public Object getNumberOfElements(){
		return numberOfElements;
	}

	public void setTotalPages(int totalPages){
		this.totalPages = totalPages;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public void setCurrentPageNumber(int currentPageNumber){
		this.currentPageNumber = currentPageNumber;
	}

	public int getCurrentPageNumber(){
		return currentPageNumber;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setBusinessTypes(List<BusinessTypesItem> businessTypes){
		this.businessTypes = businessTypes;
	}

	public List<BusinessTypesItem> getBusinessTypes(){
		return businessTypes;
	}

	public void setFirst(boolean first){
		this.first = first;
	}

	public boolean isFirst(){
		return first;
	}

	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	public int getStatusCode(){
		return statusCode;
	}

	public void setTotalElements(int totalElements){
		this.totalElements = totalElements;
	}

	public int getTotalElements(){
		return totalElements;
	}
}