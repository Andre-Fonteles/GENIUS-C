package fr.imag.steamer.geniusc.matchinghelper;

import java.util.List;

public interface MatchingAlgorithm <Item1, Item2> {

	public List<Item2> generateList(Item1 item1, List<Item2> availableItens2, List<Item2> trainingSet);

}
