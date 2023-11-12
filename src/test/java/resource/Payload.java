package resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Payload {
	
	
	public static List<Map<String, Object>> payload_dict() {
		
		
		List<Map<String, Object>> listOfDictionaries = new ArrayList<>();

        // Create and add dictionaries to the list
        Map<String, Object> dictionary1 = new HashMap<>();
        dictionary1.put("name", "Bob");
        dictionary1.put("age", 20);
        dictionary1.put("gender", "male");
        listOfDictionaries.add(dictionary1);

        Map<String, Object> dictionary2 = new HashMap<>();
        dictionary2.put("name", "George");
        dictionary2.put("age", 42);
        dictionary2.put("gender", "male");
        listOfDictionaries.add(dictionary2);
        
        Map<String, Object> dictionary3 = new HashMap<>();
        dictionary3.put("name", "Sara");
        dictionary3.put("age", 42);
        dictionary3.put("gender", "female");
        listOfDictionaries.add(dictionary3);
        
        Map<String, Object> dictionary4 = new HashMap<>();
        dictionary4.put("name", "Conor");
        dictionary4.put("age", 40);
        dictionary4.put("gender", "male");
        listOfDictionaries.add(dictionary4);
        
        Map<String, Object> dictionary5 = new HashMap<>();
        dictionary5.put("name", "Jenifer");
        dictionary5.put("age", 42);
        dictionary5.put("gender", "female");
        listOfDictionaries.add(dictionary5);
		
        
        
        return listOfDictionaries;
		
	}

}
