package com.aquib.app.dto;

public class HotDateBean {
	/**
	 * 
	 */
	public HotDateBean() {
		super();
	}

	private int hotDateId;
	private String hotelId;
	private String fromDate;
	private String toDate;
	private String description;
	private String status;

	/**
	 * @return the hotDateId
	 */
	public int getHotDateId() {
		return hotDateId;
	}

	/**
	 * @param hotDateId
	 *            the hotDateId to set
	 */
	public void setHotDateId(int hotDateId) {
		this.hotDateId = hotDateId;
	}

	/**
	 * @return the hotelId
	 */
	public String getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId
	 *            the hotelId to set
	 */
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the fromDate
	 */
	public String getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate
	 *            the fromDate to set
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public String getToDate() {
		return toDate;
	}

	/**
	 * @param toDate
	 *            the toDate to set
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public HotDateBean(int hotDateId, String hotelId, String fromDate, String toDate, String description,
			String status) {
		this.hotDateId = hotDateId;
		this.hotelId = hotelId;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.description = description;
		this.status = status;
	}

}
