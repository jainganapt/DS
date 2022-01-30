package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MolecularWeight {

	public static void main(String[] args) {

		// symbol table whose key = element symbol and value = molecular weight
		Map<String, Integer> element = new HashMap<String, Integer>();

		// read in elements symbols and their atomic weights

		element.put("C", 12);
		element.put("O", 16);
		element.put("H", 1);

		// read in chemical formulas from stdin, and print out molecular weight

		Scanner s1 = new Scanner(System.in);
		while (s1.hasNextLine()) {
			double total = 0.0;
			String line = s1.nextLine();
			String[] fields = line.split("\\."); // period is a special regexp char
			for (int i = 0; i < fields.length; i++) {

				// parse Si5 into element and number of atoms
				int j;
				for (j = 0; j < fields[i].length(); j++) {
					if (Character.isDigit(fields[i].charAt(j)))
						break;
				}
				String symbol = fields[i].substring(0, j);
				double weight = element.get(symbol);

				// add weight to running total
				String atoms = fields[i].substring(j, fields[i].length());
				if (atoms.length() == 0)
					total += weight;
				else
					total += Integer.parseInt(atoms) * weight;
			}

			System.out.println("Molecular weight of %s = %f\n" + line + total);
		}

	}
}
