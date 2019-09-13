package ar.com.candoitbackend.dto;

import java.io.Serializable;

public class ClimaDTO implements Serializable{
	

	private static final long serialVersionUID = -764706071930475955L;
	private Double dist;
	private Double lid;
	private Double fid;
	private Integer int_number;
	private String name;
	private String province;
	private String lat;
	private String lon;
	private String zoom;
	private Double updated;
	private String tipoClima;
	private WeatherDTO weather;
	

	public Double getDist() {
		return dist;
	}
	public void setDist(Double dist) {
		this.dist = dist;
	}
	public Double getLid() {
		return lid;
	}
	public void setLid(Double lid) {
		this.lid = lid;
	}
	public Double getFid() {
		return fid;
	}
	public void setFid(Double fid) {
		this.fid = fid;
	}
	public Integer getInt_number() {
		return int_number;
	}
	public void setInt_number(Integer int_number) {
		this.int_number = int_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getZoom() {
		return zoom;
	}
	public void setZoom(String zoom) {
		this.zoom = zoom;
	}
	public Double getUpdated() {
		return updated;
	}
	public void setUpdated(Double updated) {
		this.updated = updated;
	}
	public WeatherDTO getWeather() {
		return weather;
	}
	public void setWeather(WeatherDTO weather) {
		this.weather = weather;
	}
	public String getTipoClima() {
		return tipoClima;
	}
	public void setTipoClima(String tipoClima) {
		this.tipoClima = tipoClima;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dist == null) ? 0 : dist.hashCode());
		result = prime * result + ((fid == null) ? 0 : fid.hashCode());
		result = prime * result + ((int_number == null) ? 0 : int_number.hashCode());
		result = prime * result + ((lat == null) ? 0 : lat.hashCode());
		result = prime * result + ((lid == null) ? 0 : lid.hashCode());
		result = prime * result + ((lon == null) ? 0 : lon.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((tipoClima == null) ? 0 : tipoClima.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		result = prime * result + ((weather == null) ? 0 : weather.hashCode());
		result = prime * result + ((zoom == null) ? 0 : zoom.hashCode());
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
		ClimaDTO other = (ClimaDTO) obj;
		if (dist == null) {
			if (other.dist != null)
				return false;
		} else if (!dist.equals(other.dist))
			return false;
		if (fid == null) {
			if (other.fid != null)
				return false;
		} else if (!fid.equals(other.fid))
			return false;
		if (int_number == null) {
			if (other.int_number != null)
				return false;
		} else if (!int_number.equals(other.int_number))
			return false;
		if (lat == null) {
			if (other.lat != null)
				return false;
		} else if (!lat.equals(other.lat))
			return false;
		if (lid == null) {
			if (other.lid != null)
				return false;
		} else if (!lid.equals(other.lid))
			return false;
		if (lon == null) {
			if (other.lon != null)
				return false;
		} else if (!lon.equals(other.lon))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (tipoClima == null) {
			if (other.tipoClima != null)
				return false;
		} else if (!tipoClima.equals(other.tipoClima))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		if (weather == null) {
			if (other.weather != null)
				return false;
		} else if (!weather.equals(other.weather))
			return false;
		if (zoom == null) {
			if (other.zoom != null)
				return false;
		} else if (!zoom.equals(other.zoom))
			return false;
		return true;
	}

}