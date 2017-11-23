import java.util.Comparator;

/**
 * 
 */

/**
 * @author wgf2104
 *
 */
public class OpenGoals implements Comparator<State> {

	@Override
	public int compare(State o1, State o2) {
		if(o1.openGoals() == o2.openGoals())
			return 0;
		return (o1.openGoals() < o2.openGoals() ? -1 : 1);
	}

}
