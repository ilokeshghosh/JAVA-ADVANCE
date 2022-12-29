package CollectionFrameWork.MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String ,Integer> number = new TreeMap<>();

        //Putting values
        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        number.put("four",4);
        number.put("five",5);

        //Printing map as string
        System.out.println(number);

        number.remove("three");
        //checking whether specific key is there or not
        if(!number.containsKey("three")){
            number.put("three",399);
        }

        //checking whether specific key is there or not
        number.putIfAbsent("three",768);


        //Iterating map using for loop
        for(Map.Entry<String,Integer> e: number.entrySet()){
            System.out.println(e);

            //Printing key  only
            System.out.println(e.getKey());

            //Printing values  only
            System.out.println(e.getValue());
        }

        //Printing keys  only using for loop
        for(String key:number.keySet()){
            System.out.println(key);
        }

        //Printing values  only using for loop
        for(Integer value:number.values()){
            System.out.println(value);
        }




        //Check whether specific value is present or not
        System.out.println(number.containsValue(3));

        //Check whether map is empty or not
        System.out.println(number.isEmpty());
    }
}
