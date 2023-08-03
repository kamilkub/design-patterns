package pl.designs.structural.proxy;

import java.util.List;

public class CachedYoutube implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib service;
    private List<YoutubeVideo> cachedVideos;
    public boolean needReload;
    private YoutubeVideo singleVideo;

    public CachedYoutube(ThirdPartyYoutubeLib service) {
        this.service = service;
    }


    @Override
    public List<YoutubeVideo> listVidoes() {
        if(cachedVideos == null || needReload){
            cachedVideos = service.listVidoes();
        }
        return cachedVideos;
    }

    @Override
    public YoutubeVideo getVideoInfo(String id) {
        if(singleVideo == null || needReload){
            singleVideo = service.getVideoInfo(id);
        }
        return singleVideo;
    }

    @Override
    public void downloadVideo(String id) {
        service.downloadVideo(id);
    }
}
