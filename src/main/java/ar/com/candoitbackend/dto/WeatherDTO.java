package ar.com.candoitbackend.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable{
	

	private static final long serialVersionUID = -3706234499356542711L;
	private Double humidity;
	private Double pressure;
	private Double visibility;
	private Double wind_speed;
	private String description;
	private Long temp;
	public Double getHumidity() {
		return humidity;
	}
	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}
	public Double getPressure() {
		return pressure;
	}
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}
	public Double getVisibility() {
		return visibility;
	}
	public void setVisibility(Double visibility) {
		this.visibility = visibility;
	}
	public Double getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(Double wind_speed) {
		this.wind_speed = wind_speed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getTemp() {
		return temp;
	}
	public void setTemp(Long temp) {
		this.temp = temp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((humidity == null) ? 0 : humidity.hashCode());
		result = prime * result + ((pressure == null) ? 0 : pressure.hashCode());
		result = prime * result + ((temp == null) ? 0 : temp.hashCode());
		result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
		result = prime * result + ((wind_speed == null) ? 0 : wind_speed.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherDTO other = (WeatherDTO) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (humidity == null) {
			if (other.humidity != null)
				return false;
		} else if (!humidity.equals(other.humidity))
			return false;
		if (pressure == null) {
			if (other.pressure != null)
				return false;
		} else if (!pressure.equals(other.pressure))
			return false;
		if (temp == null) {
			if (other.temp != null)
				return false;
		} else if (!temp.equals(other.temp))
			return false;
		if (visibility == null) {
			if (other.visibility != null)
				return false;
		} else if (!visibility.equals(other.visibility))
			return false;
		if (wind_speed == null) {
			if (other.wind_speed != null)
				return false;
		} else if (!wind_speed.equals(other.wind_speed))
			return false;
		return true;
	}

}