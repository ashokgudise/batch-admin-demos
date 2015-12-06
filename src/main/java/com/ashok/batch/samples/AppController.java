package com.ashok.batch.samples;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ashokgudise on 12/5/15.
 */
@Controller
public class AppController {

    /**
     * Redirect the url /batch to /batch/ for the Spring Batch Admin to pick it up.
     *
     * @return redirect to /batch/
     */
    @RequestMapping(value = "/batch", method = RequestMethod.GET)
    public String redirectBatchToBatchSlash()
    {
        System.out.println("Ashok Gudise");
        return "redirect:/batch/";
    }

}
