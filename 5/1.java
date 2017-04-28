import java.io.IOException;
import backtype.hadoop.pail.Pail;

public class PailMove {
	public staticvoid mergeData(String masterDir, String updateDir) throws IO Exception {
		Pail target = new Pail(masterDir);
		Pail source = new Pail(updateDir);
		target.absorb(source);
		target.consolidate();
	}
}
