package com.codhack.DependencyInjection.Controllers;

import com.codhack.DependencyInjection.services.OpenClosedNewSPaperService;

public class NewsControllerOCP {
    private OpenClosedNewSPaperService openClosedNewSPaperService;

    public void setOpenClosedNewSPaperService(OpenClosedNewSPaperService openClosedNewSPaperService){
        this.openClosedNewSPaperService =openClosedNewSPaperService;
    }

    public String getNews(){
        return openClosedNewSPaperService.getNewsPaper();
    }
}
