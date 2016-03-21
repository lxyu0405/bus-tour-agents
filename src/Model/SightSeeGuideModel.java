package Model;

public class SightSeeGuideModel {

	private String tour_code;
	private String guide_no;
	private String guide_name;
	
	public SightSeeGuideModel(String tour_code, String guide_no, String guide_name) {
		super();
		this.tour_code = tour_code;
		this.guide_no = guide_no;
		this.guide_name = guide_name;
	}
	
	public String getTour_code() {
		return tour_code;
	}
	public void setTour_code(String tour_code) {
		this.tour_code = tour_code;
	}
	public String getGuide_no() {
		return guide_no;
	}
	public void setGuide_no(String guide_no) {
		this.guide_no = guide_no;
	}
	public String getGuide_name() {
		return guide_name;
	}
	public void setGuide_name(String guide_name) {
		this.guide_name = guide_name;
	}

	@Override
	public String toString() {
		return "SightSeeGuideModel [tour_code=" + tour_code + ", guide_no=" + guide_no + ", guide_name=" + guide_name
				+ "]";
	}
}
