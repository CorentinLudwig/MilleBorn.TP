package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Utils {

	private static Random rng = new Random();

	static public <T> T extraire(List<T> list) { // @to do extraire with iterator
		int rand = rng.nextInt(list.size());
		return list.get(rand);
	}

	static public <T> List<T> melange(List<T> list) {
		List<T> listRetour = new ArrayList<>();

		while (!list.isEmpty()) {
			listRetour.add(extraire(list));
		}
		return listRetour;
	}

	static public <T> boolean verifierMelange(List<T> list1, List<T> list2) {

		for (T t : list1) {
			if (Collections.frequency(list1, t) != Collections.frequency(list2, t)) {
				return false;
			}

		}
		return true;
	}

	static public <T> List<T> rassembler(List<T> list) {
		List<T> listRetour = new ArrayList<>();

		for (T t : list) {
			if (!listRetour.contains(t)) {
				for (int i = 0; i < Collections.frequency(list, t); i++) {
					listRetour.add(t);
				}

			}

		}
		return listRetour;
	}
	
	static public <T> boolean verifierRassemblement(List<T> list) {
		
	}
}
