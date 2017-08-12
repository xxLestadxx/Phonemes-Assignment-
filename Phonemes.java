
public class Phonemes {

	private double start = 0;
	private double end = 0;
	private String phoneme;

	public Phonemes(double start, double end, String phoneme) {
		this.start = start;
		this.end = end;
		this.phoneme = phoneme;
	}

	public double getStart() {
		return start;
	}

	public double getEnd() {
		return end;
	}

	public String getPhoneme() {
		return phoneme;
	}
	
	public String toString()
	{
	   return String.format("%.2f, %.2f, %s",start, end, phoneme);
	}

}
