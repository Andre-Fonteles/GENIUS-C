package fr.imag.steamer.geniusc.matchinghelper;

import java.util.List;

public interface MatchingAlgorithm <Item1, Item2> {

	public List<Item1> generateList(List<Item1> items1, Item2 item2);

}
