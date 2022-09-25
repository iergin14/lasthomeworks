package ch10.part1;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<AbstractStudent> {

	@Override
	public int compare(AbstractStudent s1, AbstractStudent s2) {

		return s1.getName().compareTo(s2.getName());
	}

}