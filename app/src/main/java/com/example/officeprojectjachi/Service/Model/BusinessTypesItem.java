package com.example.officeprojectjachi.Service.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BusinessTypesItem{

	@SerializedName("createdAt")
	private String createdAt;

	@SerializedName("updatedBy")
	private UpdatedBy updatedBy;

	@SerializedName("createdBy")
	private CreatedBy createdBy;

	@SerializedName("name")
	private String name;

	@SerializedName("serviceTypes")
	private List<ServiceTypesItem> serviceTypes;

	@SerializedName("id")
	private String id;

	@SerializedName("value")
	private String value;

	@SerializedName("status")
	private Object status;

	@SerializedName("updatedAt")
	private Object updatedAt;

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setUpdatedBy(UpdatedBy updatedBy){
		this.updatedBy = updatedBy;
	}

	public UpdatedBy getUpdatedBy(){
		return updatedBy;
	}

	public void setCreatedBy(CreatedBy createdBy){
		this.createdBy = createdBy;
	}

	public CreatedBy getCreatedBy(){
		return createdBy;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setServiceTypes(List<ServiceTypesItem> serviceTypes){
		this.serviceTypes = serviceTypes;
	}

	public List<ServiceTypesItem> getServiceTypes(){
		return serviceTypes;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setStatus(Object status){
		this.status = status;
	}

	public Object getStatus(){
		return status;
	}

	public void setUpdatedAt(Object updatedAt){
		this.updatedAt = updatedAt;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}
}