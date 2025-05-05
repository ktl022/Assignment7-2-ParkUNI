
public class WordFrequencyAnalyzer {
	import java.io.*;
	import java.nio.file.*;
	import java.util.*;

	public class WordFrequencyAnalyzer {
	    public static void main(String[] args) throws IOException {
	        List<String> words = new ArrayList<>();

	        String content = Files.readString(Path.of("768008-0.txt"));
	        content = content.replaceAll("[.,!?]", "").toLowerCase();
	        String[] tokens = content.split("\\s+");

	        words.addAll(Arrays.asList(tokens));
	        System.out.println("Total words: " + words.size());
	    }
	}
}
	long startTime = System.nanoTime();

	Map<String, Integer> treeMap = new TreeMap<>();
	for (String word : words) {
    treeMap.put(word, treeMap.getOrDefault(word, 0) + 1);
}

	List<Map.Entry<String, Integer>> filtered = new ArrayList<>();
	for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
		if (entry.getKey().length() > 6) {
        filtered.add(entry);
    }
}