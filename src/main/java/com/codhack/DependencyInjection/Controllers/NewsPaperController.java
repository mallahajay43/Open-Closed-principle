package com.codhack.DependencyInjection.Controllers;

import com.codhack.DependencyInjection.services.NewsPaper;
import org.springframework.stereotype.Controller;


public class NewsPaperController {
    private  NewsPaper newsPaper;

    public void setNewsPaper(NewsPaper newsPaper){
        this.newsPaper=newsPaper;
    }

    public String getNews(){
        return newsPaper.getNewsPaper();
    }
}
