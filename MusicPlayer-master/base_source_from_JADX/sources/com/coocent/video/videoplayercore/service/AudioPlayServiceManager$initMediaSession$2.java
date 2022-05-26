package com.coocent.video.videoplayercore.service;

import android.content.Context;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.support.p001v4.media.session.PlaybackStateCompat;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import p369i.p387z.p389d.C8594l;

/* compiled from: AudioPlayServiceManager.kt */
public final class AudioPlayServiceManager$initMediaSession$2 extends MediaControllerCompat.C0034a {
    final /* synthetic */ AudioPlayServiceManager this$0;

    AudioPlayServiceManager$initMediaSession$2(AudioPlayServiceManager audioPlayServiceManager) {
        this.this$0 = audioPlayServiceManager;
    }

    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        MediaSessionCompat mediaSession;
        super.onMetadataChanged(mediaMetadataCompat);
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        AudioPlayService access$getContext$p = this.this$0.context;
        if (access$getContext$p != null) {
            Context applicationContext = access$getContext$p.getApplicationContext();
            C8594l.m46770d(applicationContext, "context.applicationContext");
            PlayerHelper instance = companion.getInstance(applicationContext);
            AudioPlayServiceManager audioPlayServiceManager = this.this$0;
            if (instance.isAudioPlay() && (mediaSession = audioPlayServiceManager.getMediaSession()) != null) {
                AudioPlayService access$getContext$p2 = audioPlayServiceManager.context;
                if (access$getContext$p2 != null) {
                    access$getContext$p2.startForeground(NotificationHelper.NOTIFICATION_ID, NotificationHelper.Companion.get().getNotification(mediaSession, instance.isPlaying()));
                } else {
                    C8594l.m46783q("context");
                    throw null;
                }
            }
        } else {
            C8594l.m46783q("context");
            throw null;
        }
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        MediaSessionCompat mediaSession;
        super.onPlaybackStateChanged(playbackStateCompat);
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        AudioPlayService access$getContext$p = this.this$0.context;
        if (access$getContext$p != null) {
            Context applicationContext = access$getContext$p.getApplicationContext();
            C8594l.m46770d(applicationContext, "context.applicationContext");
            PlayerHelper instance = companion.getInstance(applicationContext);
            AudioPlayServiceManager audioPlayServiceManager = this.this$0;
            if (instance.isAudioPlay() && (mediaSession = audioPlayServiceManager.getMediaSession()) != null) {
                AudioPlayService access$getContext$p2 = audioPlayServiceManager.context;
                if (access$getContext$p2 != null) {
                    access$getContext$p2.startForeground(NotificationHelper.NOTIFICATION_ID, NotificationHelper.Companion.get().getNotification(mediaSession, instance.isPlaying()));
                } else {
                    C8594l.m46783q("context");
                    throw null;
                }
            }
        } else {
            C8594l.m46783q("context");
            throw null;
        }
    }
}
