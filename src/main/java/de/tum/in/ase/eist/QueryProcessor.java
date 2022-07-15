package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "alissa";
        } else if(query.contains("plus")) {
            String[] arr = query.toString().split("\\s+");
            return String.valueOf(Integer.parseInt(arr[2])+ Integer.parseInt(arr [4]));
        } else if(query.contains("number is the largest")) {
            String[] arr = query.toString().split(":");
            String[] num = arr[1].split(", ");
            int biggest = Integer.parseInt(arr[0]);
            for(int i = 1; i < num.length - 1; i++) {
                if(biggest < Integer.parseInt(arr[i])) {
                    biggest = Integer.parseInt(arr[i]);
                }
            }
            return String.valueOf(biggest);
        }
        else {
            return "";
        }
    }
}
