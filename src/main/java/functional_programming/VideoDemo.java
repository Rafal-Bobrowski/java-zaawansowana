package functional_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class VideoDemo {
    public static void main(String[] args) {

        Video video = new Video("G0T1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("G0T2", "got2.com", VideoType.EPISODE);
        Video video2 = new Video("G0T3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("G0T4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("G0T5", "got5.com", VideoType.CLIP);
        Video videoS = new Video("G0Tб", "gotб.com", VideoType.EPISODE);

        Episode episode = new Episode("got1", 1, Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1, Arrays.asList(video4, videoS));

        Season season = new Season("G0TS1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("G0TS1", 2, List.of(episode2));

        List<Season> seasons = Arrays.asList(season, season1);

        List<Episode> allEpisodes = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .toList();
        List<Video> allVideos = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .toList();
        List<String> allSeasonsNames = seasons.stream()
                .map(s -> s.seasonName)
                .toList();
        List<Integer> allSeasonsNumbers = seasons.stream()
                .map(s -> s.seasonNumber)
                .toList();
        List<String> allEpisodesNames = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeName)
                .toList();
        List<Integer> allEpisodesNumbers = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .map(e -> e.episodeNumber)
                .toList();
        List<String> allVideosNames = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.title)
                .toList();
        List<String> allVideosUrls = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .map(v -> v.url)
                .toList();
        List<Episode> allEpisodesFromEvenSeasons = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .toList();
        List<Video> allVideosFromEvenSeasons = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .toList();
        List<Video> allVideosFromEvenSeasonsAndEvenEpisodes = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .toList();
        List<Video> allClipVideoFromOddSeasonsAndEvenEpisodes = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 1)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 0)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.CLIP)
                .toList();
        List<Video> allPreviewVideoFromEvenSeasonsAndOddEpisodes = seasons.stream()
                .filter(s -> s.seasonNumber % 2 == 0)
                .flatMap(s -> s.episodes.stream())
                .filter(e -> e.episodeNumber % 2 == 1)
                .flatMap(e -> e.videos.stream())
                .filter(v -> v.videoType == VideoType.PREVIEW)
                .toList();
    }
}
