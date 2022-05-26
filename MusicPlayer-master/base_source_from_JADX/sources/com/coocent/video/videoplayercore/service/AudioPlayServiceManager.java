package com.coocent.video.videoplayercore.service;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.MediaControllerCompat;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.media.session.MediaButtonReceiver;
import com.bumptech.glide.C1719b;
import com.coocent.video.videoplayercore.C2520R;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.videostore.p067po.Video;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* compiled from: AudioPlayServiceManager.kt */
public final class AudioPlayServiceManager {
    public static final Companion Companion = new Companion((C8589g) null);
    private String TAG = "MediaBrowserServiceManager";
    /* access modifiers changed from: private */
    public AudioPlayService context;
    /* access modifiers changed from: private */
    public IAudioBlue mIAudioBlue;
    /* access modifiers changed from: private */
    public MediaSessionCompat mMediaSession;

    /* compiled from: AudioPlayServiceManager.kt */
    public static final class Companion {

        /* compiled from: AudioPlayServiceManager.kt */
        private static final class SingletonHolder {
            public static final SingletonHolder INSTANCE = new SingletonHolder();
            private static final AudioPlayServiceManager instance = new AudioPlayServiceManager();

            private SingletonHolder() {
            }

            public final AudioPlayServiceManager getInstance() {
                return instance;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C8589g gVar) {
            this();
        }

        public final AudioPlayServiceManager get() {
            return SingletonHolder.INSTANCE.getInstance();
        }
    }

    public static final AudioPlayServiceManager get() {
        return Companion.get();
    }

    private final void removeIAudioBlue() {
        this.mIAudioBlue = null;
    }

    public final MediaSessionCompat getMediaSession() {
        return this.mMediaSession;
    }

    public final void initMediaSession(AudioPlayService audioPlayService, IAudioBlue iAudioBlue) {
        MediaControllerCompat c;
        C8594l.m46771e(audioPlayService, "service");
        this.context = audioPlayService;
        this.mIAudioBlue = iAudioBlue;
        AudioPlayService audioPlayService2 = this.context;
        if (audioPlayService2 != null) {
            ComponentName componentName = new ComponentName(audioPlayService2.getPackageName(), MediaButtonReceiver.class.getName());
            AudioPlayService audioPlayService3 = this.context;
            if (audioPlayService3 != null) {
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(audioPlayService3.getApplicationContext(), AudioPlayService.Companion.getTAG(), componentName, (PendingIntent) null);
                this.mMediaSession = mediaSessionCompat;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.mo163h(true);
                }
                MediaSessionCompat mediaSessionCompat2 = this.mMediaSession;
                if (mediaSessionCompat2 != null) {
                    mediaSessionCompat2.mo164i(new AudioPlayServiceManager$initMediaSession$1(this));
                }
                MediaSessionCompat mediaSessionCompat3 = this.mMediaSession;
                if (mediaSessionCompat3 != null && (c = mediaSessionCompat3.mo159c()) != null) {
                    c.mo113c(new AudioPlayServiceManager$initMediaSession$2(this));
                    return;
                }
                return;
            }
            C8594l.m46783q("context");
            throw null;
        }
        C8594l.m46783q("context");
        throw null;
    }

    public final void releaseMediaSession() {
        MediaSessionCompat mediaSessionCompat = this.mMediaSession;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.mo163h(false);
        }
        MediaSessionCompat mediaSessionCompat2 = this.mMediaSession;
        if (mediaSessionCompat2 != null) {
            mediaSessionCompat2.mo162g();
        }
        this.mMediaSession = null;
        removeIAudioBlue();
    }

    public final void setMediaSession(String str, Video video) {
        C8594l.m46771e(str, "playTime");
        C8594l.m46771e(video, "video");
        MediaMetadataCompat.C0031b bVar = new MediaMetadataCompat.C0031b();
        bVar.mo103d("android.media.metadata.MEDIA_ID", String.valueOf(video.mo10553l()));
        bVar.mo103d("android.media.metadata.TITLE", video.mo10565w());
        bVar.mo103d("android.media.metadata.DISPLAY_TITLE", video.mo10565w());
        bVar.mo103d("ISENCRYPTED", String.valueOf(video.mo10554m()));
        String format = new SimpleDateFormat(video.mo10547g() >= 3600000 ? "HH:mm:ss" : "mm:ss", Locale.US).format(new Date(video.mo10547g()));
        bVar.mo103d("android.media.metadata.DISPLAY_DESCRIPTION", str + '/' + format);
        bVar.mo102c("android.media.metadata.DURATION", video.mo10547g());
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        AudioPlayService audioPlayService = this.context;
        if (audioPlayService != null) {
            Context applicationContext = audioPlayService.getApplicationContext();
            C8594l.m46770d(applicationContext, "context.applicationContext");
            if (companion.getInstance(applicationContext).isNetworkStream()) {
                AudioPlayService audioPlayService2 = this.context;
                if (audioPlayService2 != null) {
                    bVar.mo101b("android.media.metadata.ALBUM_ART", BitmapFactory.decodeResource(audioPlayService2.getResources(), C2520R.C2522drawable.video_ic_play_arrow_black_24dp));
                    MediaSessionCompat mediaSessionCompat = this.mMediaSession;
                    if (mediaSessionCompat != null) {
                        mediaSessionCompat.mo167l(bVar.mo100a());
                        return;
                    }
                    return;
                }
                C8594l.m46783q("context");
                throw null;
            }
            String j = video.mo10551j();
            if (j != null) {
                bVar.mo103d("android.media.metadata.ALBUM", new File(j).getName());
            }
            if (TextUtils.isEmpty(video.mo10564v()) || !new File(video.mo10564v()).exists()) {
                AudioPlayService audioPlayService3 = this.context;
                if (audioPlayService3 != null) {
                    bVar.mo101b("android.media.metadata.ALBUM_ART", BitmapFactory.decodeResource(audioPlayService3.getResources(), C2520R.C2522drawable.video_ic_play_arrow_black_24dp));
                    MediaSessionCompat mediaSessionCompat2 = this.mMediaSession;
                    if (mediaSessionCompat2 != null) {
                        mediaSessionCompat2.mo167l(bVar.mo100a());
                        return;
                    }
                    return;
                }
                C8594l.m46783q("context");
                throw null;
            }
            AudioPlayService audioPlayService4 = this.context;
            if (audioPlayService4 != null) {
                bVar.mo101b("android.media.metadata.ALBUM_ART", BitmapFactory.decodeResource(audioPlayService4.getResources(), C2520R.C2522drawable.video_ic_play_arrow_black_24dp));
                AudioPlayService audioPlayService5 = this.context;
                if (audioPlayService5 != null) {
                    C1719b.m8597t(audioPlayService5).mo7651h().mo7633F0(video.mo10564v()).mo7629B0(new AudioPlayServiceManager$setMediaSession$2(bVar, this)).mo7634I0();
                } else {
                    C8594l.m46783q("context");
                    throw null;
                }
            } else {
                C8594l.m46783q("context");
                throw null;
            }
        } else {
            C8594l.m46783q("context");
            throw null;
        }
    }
}
