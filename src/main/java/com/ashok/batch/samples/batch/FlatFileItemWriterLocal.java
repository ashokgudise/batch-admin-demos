package com.ashok.batch.samples.batch;

import com.ashok.batch.samples.Person;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by ashokgudise on 12/5/15.
 */
public class FlatFileItemWriterLocal implements ItemWriter<Person> {
    public void write(List<? extends Person> list) throws Exception {

        for(Person person: list){
            System.out.println("Processor -> "
                    + "\n name:      "+ person.getName()
                    +" \n age:       "+ person.getAge()
                    +" \n phone:     "+ person.getPhone()
                    +" \n contry:    "+ person.getCountry());
        }

    }
}
