package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Utils {

	private static Random rng = new Random();

	static public <T> T extraire(List<T> list) { // @to do extraire with iterator
		int rand = rng.nextInt(list.size());
		return list.remove(rand);
	}

	static public <T> List<T> melanger(List<T> list) {
		List<T> listRetour = new ArrayList<>();

		while (!list.isEmpty()) {
			listRetour.add(extraire(list));
		}
		return listRetour;
	}

	static public <T> boolean verifierMelange(List<T> list1, List<T> list2) {
		if (list1.size() != list2.size())
			return false;
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

	static private <T> boolean hasElements(List<T> list, T cur, int indice) {
		for (ListIterator<T> iterator2 = list.listIterator(indice); iterator2.hasNext();) {
			T t = (T) iterator2.next();
			if (t.equals(cur)) {
				return true;
			}
		}
		return false;
	}

	static public <T> boolean verifierRassemblement(List<T> list) {
		T p = list.get(0);
		T c;
		for (Iterator<T> iterator = list.iterator(); iterator.hasNext();) {
			c = (T) iterator.next();
			if (!c.equals(p)) {
				if (hasElements(list, p, list.indexOf(p))) {
					return false;

				}
			}
			p = c;
		}

		return true;
	}

}
