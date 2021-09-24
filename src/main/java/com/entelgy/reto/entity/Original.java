package com.entelgy.reto.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Original {

	private Integer page;
	
	@JsonProperty("per_page")
	private Integer perPage;
	
	private Integer total;
	
	@JsonProperty("total_pages")
	private Integer totalPages;
	
	private List<OriginalData> data;
	
	public Integer getPage() {
		return page;
	}
	
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getPerPage() {
		return perPage;
	}
	
	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public Integer getTotalPages() {
		return totalPages;
	}
	
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	
	public List<OriginalData> getData() {
		return data;
	}
	
	public void setData(List<OriginalData> data) {
		this.data = data;
	}
}
