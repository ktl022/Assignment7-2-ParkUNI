
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
