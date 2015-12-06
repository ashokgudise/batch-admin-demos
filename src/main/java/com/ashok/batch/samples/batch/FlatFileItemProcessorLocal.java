package com.ashok.batch.samples.batch;

import com.ashok.batch.samples.Person;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by ashokgudise on 12/5/15.
 */
public class FlatFileItemProcessorLocal implements ItemProcessor<Person, Person> {

    public Person process(Person o) throws Exception {

        System.out.println("Processor -> "
                        + "\n name:      "+ o.getName()
                        +" \n age:       "+o.getAge()
                        +" \n phone:     "+o.getPhone()
                        +" \n contry:    "+o.getCountry());
        return o;
    }
}
