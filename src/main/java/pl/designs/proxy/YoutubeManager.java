package pl.designs.proxy;

import java.util.List;

public class YoutubeManager {

    protected ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    public YoutubeVideo renderVideoPage(String id){
        System.out.println("Rendering video");
        return service.getVideoInfo(id);

    }

    public List<YoutubeVideo> renderVideosPanel(){
        System.out.println("Rendering videos");
        return service.listVidoes();
    }

    public void reactOnUserInput(){
        System.out.println("Downloading video");
        renderVideosPanel();
    }
}
