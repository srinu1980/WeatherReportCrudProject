package com.hcl.domain;

import javax.persistence.*;

@Entity
@Table(name = "weather_report")
public class WeatherReport {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator="ID")
    @SequenceGenerator(sequenceName="ID",allocationSize=1,name="ID")
	private Long id;
	@Column(name = "city")
	private String city;
	@Column(name = "min_temperature")
	private Double minTemperature;
	@Column(name = "max_temperature")
	private Double maxTemperature;
	
	public WeatherReport() {}

	public WeatherReport(Long id, String city, Double minTemperature, Double maxTemperature) {
		super();
		this.id = id;
		this.city = city;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getMinTemperature() {
		return minTemperature;
	}

	public void setMinTemperature(Double minTemperature) {
		this.minTemperature = minTemperature;
	}

	public Double getMaxTemperature() {
		return maxTemperature;
	}

	public void setMaxTemperature(Double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	
}