
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
	  filtered.sort((a, b) -> b.getValue().compareTo(a.getValue())); // 
      System.out.println("Top 5 from TreeMap:");
      for (int i = 0; i < 5; i++) {
          System.out.println(filtered.get(i).getKey() + ": " + filtered.get(i).getValue());
      }

      long endTime=System.nanoTime();
      System.out.println("TreeMap Time: " + (endTime - startTime) / 1_000_000 + " ms");
      
     startTime=System.nanoTime()
    		 Map<String, Integer> hashMap=new HashMap<>();
     for(String word:words) {
    	 hashMap.put(word, hashMap.getOrDefault(word,0)+1);
     }
     
     filtered=new ArrayList<>();
     for(Map.Entry<String, Integer>entry: hashMap.entrySet()) {
    	 if(entry.getKey().length()>6) {
    		 filtered.add(entry);
    		 
    	 }     
  }
    filtered.sort((a, b) -> b.getValue().compareTo(a.getValue())); // descending
        System.out.println("Top 5 from HashMap:");
        for (int i = 0; i < 5; i++) {
            System.out.println(filtered.get(i).getKey() + ": " + filtered.get(i).getValue());
        }

        endTime = System.nanoTime();
        System.out.println("HashMap Time: " + (endTime - startTime) / 1_000_000 + " ms");  		  
    		      