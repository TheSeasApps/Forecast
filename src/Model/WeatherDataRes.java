/**
 * 
 */
/**
 * @author Sagar
 *
 */
package Model;

public class WeatherDataRes {
	private String region_code, weather_param, year, key, value;

	public WeatherDataRes(String region_code, String weather_param,
			String year, String key, String value) {
		this.region_code = region_code;
		this.weather_param = weather_param;
		this.year = year;
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWeather_param() {
		return weather_param;
	}

	public void setWeather_param(String weather_param) {
		this.weather_param = weather_param;
	}

	public String getRegion_code() {
		return region_code;
	}

	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


}