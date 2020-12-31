package pl.designs.proxy;

import java.util.List;

public interface ThirdPartyYoutubeLib {


    List<YoutubeVideo> listVidoes();
    YoutubeVideo getVideoInfo(String id);
    void downloadVideo(String id);
}
