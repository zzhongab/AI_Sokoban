import java.util.Comparator;

/**
 * 
 */

/**
 * @author wgf2104
 *
 */
public class ManhDist implements Comparator<State> {

	@Override
	public int compare(State o1, State o2) {
		if(o1.manhDist() == o2.manhDist())
			return 0;
		return (o1.manhDist() < o2.manhDist() ? -1 : 1);
	}

}
