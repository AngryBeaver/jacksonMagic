package com.angryBeaver.jackson.controller;

import com.angryBeaver.jackson.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @RequestMapping(value = "/optional", method = RequestMethod.POST)
    public OptionalExample get(@RequestBody OptionalExample optionalExample) {
        return optionalExample;
    }

    @RequestMapping(value = "/optional/isPresent", method = RequestMethod.POST)
    public boolean isSet(@RequestBody OptionalExample optionalExample) {
        return optionalExample.getSubTitle().isPresent();
    }

    @RequestMapping(value = "/optional2", method = RequestMethod.POST)
    public OptionalExample2 get2(@RequestBody OptionalExample2 optionalExample) {
        return optionalExample;
    }

    @RequestMapping(value = "/optional2/isPresent", method = RequestMethod.POST)
    public boolean isSet2(@RequestBody OptionalExample2 optionalExample) {
        return optionalExample.getSubTitle().isPresent();
    }

    @RequestMapping(value = "/iDontCareAboutBuilder", method = RequestMethod.POST)
    public IDontCareAboutBuilderPatterns get2(@RequestBody IDontCareAboutBuilderPatterns idontCare) {
        return idontCare;
    }

    @RequestMapping(value = "/hiddenPropertiesOutput", method = RequestMethod.POST)
    public HiddenPropertiesOutput get() {
        HiddenPropertiesOutput ouput = new HiddenPropertiesOutput();
        ouput.setTitle("Hallo");
        ouput.setSubTitle("Welt");
        return ouput;
    }

    @RequestMapping(value = "/hiddenPropertiesOutput/subTitle", method = RequestMethod.POST)
    public String get2() {
        HiddenPropertiesOutput ouput = new HiddenPropertiesOutput();
        ouput.setTitle("Hallo");
        ouput.setSubTitle("Welt");
        return ouput.getSubTitle();
    }

    @RequestMapping(value = "/hiddenPropertiesInput", method = RequestMethod.POST)
    public String get(@RequestBody HiddenPropertiesInput hiddenporperties) {
        return hiddenporperties.getTitle()+":"+hiddenporperties.getSubTitle();
    }

    @RequestMapping(value = "/hiddenPropertiesInAndOutput", method = RequestMethod.POST)
    public HiddenPropertiesInAndOutput get(@RequestBody HiddenPropertiesInAndOutput hiddenporperties) {
        return hiddenporperties;
    }

    @RequestMapping(value = "/hiddenPropertiesInAndOutput/title", method = RequestMethod.POST)
    public String get2(@RequestBody HiddenPropertiesInAndOutput hiddenporperties) {
        return hiddenporperties.getTitle();
    }

    @RequestMapping(value = "/hiddenPropertiesInAndOutput2", method = RequestMethod.POST)
    public HiddenPropertiesInAndOutput2 get(@RequestBody HiddenPropertiesInAndOutput2 hiddenporperties) {
        return hiddenporperties;
    }

    @RequestMapping(value = "/hiddenPropertiesInAndOutput2/title", method = RequestMethod.POST)
    public String get2(@RequestBody HiddenPropertiesInAndOutput2 hiddenporperties) {
        return hiddenporperties.getTitle();
    }

    @RequestMapping(value = "/hiddenPropertiesInAndOutput3", method = RequestMethod.POST)
    public HiddenPropertiesInAndOutput3 get(@RequestBody HiddenPropertiesInAndOutput3 hiddenporperties) {
        return hiddenporperties;
    }

    @RequestMapping(value = "/hiddenPropertiesInAndOutput3/title", method = RequestMethod.POST)
    public String get2(@RequestBody HiddenPropertiesInAndOutput3 hiddenporperties) {
        return hiddenporperties.getTitle();
    }

    @RequestMapping(value = "/magicProperties", method = RequestMethod.POST)
    public MagicProperties get(@RequestBody MagicProperties magicProperties) {
        return magicProperties;
    }

}
