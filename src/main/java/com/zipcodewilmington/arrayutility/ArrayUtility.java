package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<obj> {
    ArrayList<obj> myList;
    Map<obj,Integer> myMap;

    public ArrayUtility(obj[] inputArray)
    {
        myList = new ArrayList<>();
        myMap = new HashMap<>();

        for(obj o : inputArray)
        {
            myList.add(o);
            if (myMap.containsKey(o))
            {
                myMap.put(o, myMap.get(o) + 1);
            }
            else
            {
                myMap.put(o, 1);
            }
        }
    }

    public Integer countDuplicatesInMerge(obj[] arrayToMerge, obj valueToEvaluate)
    {
        ArrayUtility<obj> tempArray = new ArrayUtility<>(arrayToMerge);
        return this.myMap.get(valueToEvaluate) + tempArray.getNumberOfOccurrences(valueToEvaluate);
    }

    public Integer getNumberOfOccurrences(obj valueToEvaluate)
    {
        if(myMap.containsKey(valueToEvaluate))
        {
            return myMap.get(valueToEvaluate);
        }
        else
        {
            return 0;
        }
    }

    public obj getMostCommonFromMerge(obj[] arrayToMerge)
    {
        return null;
    }

    public obj[] removeValue(obj valueToRemove)
    {
        return null;

    }

}
