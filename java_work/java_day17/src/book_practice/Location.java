package book_practice;

public class Location {
	private String city;
	private int longitude; // 위도
	private int latitude; // 경도
	public Location() {}
	
	public Location(String city, int longitude, int latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return city + "\t" + longitude + "\t" + latitude;
	}
	
	
}