package pl.designs.proxy;

import java.util.List;

public class YoutubeThirdParty implements ThirdPartyYoutubeLib{

    @Override
    public List<YoutubeVideo> listVidoes() {
        YoutubeVideo video = new YoutubeVideo();
        video.setVideoId("asd");
        return List.of(video);
    }

    @Override
    public YoutubeVideo getVideoInfo(String id) {
        YoutubeVideo video = null;

        for(YoutubeVideo asd : listVidoes()){
            if(asd.getVideoId().equals(id)){
                video = asd;
            }
        }

        return video;
    }

    @Override
    public void downloadVideo(String id) {
        YoutubeVideo video = null;
        for(YoutubeVideo asd : listVidoes()){
            if(asd.getVideoId().equals(id)){
                video = asd;
            }
        }
    }
}
