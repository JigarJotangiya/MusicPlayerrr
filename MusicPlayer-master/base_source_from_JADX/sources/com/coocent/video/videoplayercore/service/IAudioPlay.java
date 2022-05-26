package com.coocent.video.videoplayercore.service;

import com.coocent.videostore.p067po.Video;
import p369i.p387z.p389d.C8594l;

/* compiled from: IAudioPlay.kt */
public interface IAudioPlay {

    /* compiled from: IAudioPlay.kt */
    public static final class DefaultImpls {
        public static void onAudioPlay(IAudioPlay iAudioPlay, String str, String str2, int i, long j) {
            C8594l.m46771e(iAudioPlay, "this");
            C8594l.m46771e(str, "title");
            C8594l.m46771e(str2, "thumbnail");
        }

        public static void onAudioPlayExit(IAudioPlay iAudioPlay) {
            C8594l.m46771e(iAudioPlay, "this");
        }

        public static void onAudioPlayNext(IAudioPlay iAudioPlay, String str, String str2, int i, long j) {
            C8594l.m46771e(iAudioPlay, "this");
            C8594l.m46771e(str, "title");
            C8594l.m46771e(str2, "thumbnail");
        }

        public static void onAudioPlayPrevious(IAudioPlay iAudioPlay, String str, String str2, int i, long j) {
            C8594l.m46771e(iAudioPlay, "this");
            C8594l.m46771e(str, "title");
            C8594l.m46771e(str2, "thumbnail");
        }

        public static void onAudioPlayTime(IAudioPlay iAudioPlay, String str, int i, long j) {
            C8594l.m46771e(iAudioPlay, "this");
            C8594l.m46771e(str, "playTime");
        }

        public static void onAudioReTitle(IAudioPlay iAudioPlay, Video video, String str) {
            C8594l.m46771e(iAudioPlay, "this");
            C8594l.m46771e(video, "reVideo");
            C8594l.m46771e(str, "title");
        }

        public static void onAudioSwitchMode(IAudioPlay iAudioPlay, int i) {
            C8594l.m46771e(iAudioPlay, "this");
        }

        public static void onClickNotification(IAudioPlay iAudioPlay) {
            C8594l.m46771e(iAudioPlay, "this");
        }

        public static void onClickPosition(IAudioPlay iAudioPlay, int i) {
            C8594l.m46771e(iAudioPlay, "this");
        }

        public static void onPauseOrResume(IAudioPlay iAudioPlay, boolean z) {
            C8594l.m46771e(iAudioPlay, "this");
        }

        public static void onRemoveVideoPosition(IAudioPlay iAudioPlay, Video video, int i) {
            C8594l.m46771e(iAudioPlay, "this");
            C8594l.m46771e(video, "removeVideo");
        }
    }

    void onAudioPlay(String str, String str2, int i, long j);

    void onAudioPlayExit();

    void onAudioPlayNext(String str, String str2, int i, long j);

    void onAudioPlayPrevious(String str, String str2, int i, long j);

    void onAudioPlayTime(String str, int i, long j);

    void onAudioReTitle(Video video, String str);

    void onAudioSwitchMode(int i);

    void onClickNotification();

    void onClickPosition(int i);

    void onPauseOrResume(boolean z);

    void onRemoveVideoPosition(Video video, int i);
}
