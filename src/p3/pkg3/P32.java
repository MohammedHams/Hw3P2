/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3.pkg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Marshal
 */
public class P32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
Map<Character, Integer> characters = new TreeMap<Character, Integer>();
Scanner scanner = null;

try {
scanner = new Scanner(new File("D:\\it2\\java3Hw2"),"utf-8");

while (scanner.hasNext()) {
char[] line = scanner.nextLine().toLowerCase().toCharArray();

for (Character character : line) {
if (Character.isLetter(character)){
if (characters.containsKey(character)) {
characters.put(character, characters.get(character) + 1);
} else {
characters.put(character, 1);
}
}
}
}
} finally {
if (scanner != null){
scanner.close();
}
}

if (!characters.isEmpty()){
for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
}