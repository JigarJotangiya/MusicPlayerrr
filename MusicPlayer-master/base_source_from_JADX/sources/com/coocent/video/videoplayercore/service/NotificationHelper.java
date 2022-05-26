package com.coocent.video.videoplayercore.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.p001v4.media.session.MediaSessionCompat;
import androidx.core.app.C0492j;
import com.coocent.video.videoplayercore.service.IAudioPlay;
import com.coocent.videoplayer.p061s.C2721a;
import com.coocent.videostore.p067po.Video;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: NotificationHelper.kt */
public final class NotificationHelper implements IAudioPlay {
    public static final Companion Companion = new Companion((C8589g) null);
    public static final int NOTIFICATION_ID = -16772352;
    private final String TAG = "NotificationHelper";
    private AudioPlayService mAudioPlayService;
    private C0492j mNotificationManagerCompat;

    /* compiled from: NotificationHelper.kt */
    public static final class Companion {

        /* compiled from: NotificationHelper.kt */
        private static final class SingletonHolder {
            public static final SingletonHolder INSTANCE = new SingletonHolder();
            private static final NotificationHelper instance = new NotificationHelper();

            private SingletonHolder() {
            }

            public final NotificationHelper getInstance() {
                return instance;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C8589g gVar) {
            this();
        }

        public final NotificationHelper get() {
            return SingletonHolder.INSTANCE.getInstance();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r2 = r2.mo112b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.app.Notification createNotification(android.support.p001v4.media.session.MediaSessionCompat r8, boolean r9) {
        /*
            r7 = this;
            com.coocent.video.videoplayercore.service.AudioPlayService r0 = r7.mAudioPlayService
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r7.createNotificationChannel()
            android.support.v4.media.session.MediaControllerCompat r2 = r8.mo159c()
            if (r2 != 0) goto L_0x0011
        L_0x000f:
            r2 = r1
            goto L_0x001e
        L_0x0011:
            android.support.v4.media.MediaMetadataCompat r2 = r2.mo112b()
            if (r2 != 0) goto L_0x0018
            goto L_0x000f
        L_0x0018:
            java.lang.String r3 = "android.media.metadata.DISPLAY_TITLE"
            java.lang.String r2 = r2.mo94h(r3)
        L_0x001e:
            android.support.v4.media.session.MediaControllerCompat r3 = r8.mo159c()
            if (r3 != 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            android.support.v4.media.MediaMetadataCompat r3 = r3.mo112b()
            if (r3 != 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            java.lang.String r1 = "android.media.metadata.ALBUM_ART"
            android.graphics.Bitmap r1 = r3.mo89d(r1)
        L_0x0032:
            androidx.core.app.g$d r3 = new androidx.core.app.g$d
            java.lang.String r4 = "-16772352"
            r3.<init>(r0, r4)
            r4 = 1
            r3.mo3187A(r4)
            int r5 = com.coocent.video.videoplayercore.C2520R.C2522drawable.ic_small_icon
            r3.mo3209x(r5)
            r3.mo3204s(r1)
            int r1 = com.coocent.video.videoplayercore.C2520R.C2521color.videoColorAccent
            int r1 = androidx.core.content.C0506a.m3150b(r0, r1)
            r3.mo3198l(r1)
            r3.mo3201o(r2)
            androidx.media.j.a r1 = new androidx.media.j.a
            r1.<init>()
            r2 = 3
            int[] r2 = new int[r2]
            r2 = {0, 1, 2} // fill-array
            r1.mo4398u(r2)
            android.support.v4.media.session.MediaSessionCompat$Token r8 = r8.mo160d()
            r1.mo4397t(r8)
            r1.mo4399v(r4)
            r5 = 1
            android.app.PendingIntent r8 = androidx.media.session.MediaButtonReceiver.m4443a(r0, r5)
            r1.mo4396s(r8)
            r3.mo3210y(r1)
            r3.mo3207v(r4)
            r3.mo3206u(r4)
            com.coocent.video.videoplayercore.service.AudioPlayService$Companion r8 = com.coocent.video.videoplayercore.service.AudioPlayService.Companion
            java.lang.String r1 = r8.getNOTIFICATION_CLICK()
            android.app.PendingIntent r1 = r7.getReceiverPendingIntent(r0, r1, r4)
            r3.mo3199m(r1)
            java.lang.String r1 = "Builder(context, NOTIFIC…      )\n                )"
            p369i.p387z.p389d.C8594l.m46770d(r3, r1)
            int r1 = com.coocent.video.videoplayercore.C2520R.C2522drawable.video_ic_skip_previous_black_24dp
            java.lang.String r2 = r8.getNOTIFICATION_PREV()
            android.app.PendingIntent r2 = r7.getReceiverPendingIntent(r0, r2, r4)
            java.lang.String r5 = "Previous"
            r3.mo3189a(r1, r5, r2)
            if (r9 == 0) goto L_0x00ae
            int r9 = com.coocent.video.videoplayercore.C2520R.C2522drawable.video_ic_pause_black_24dp
            java.lang.String r1 = r8.getNOTIFICATION_PAUSE()
            android.app.PendingIntent r1 = r7.getReceiverPendingIntent(r0, r1, r4)
            java.lang.String r2 = "Pause"
            r3.mo3189a(r9, r2, r1)
            goto L_0x00bd
        L_0x00ae:
            int r9 = com.coocent.video.videoplayercore.C2520R.C2522drawable.video_ic_play_arrow_black_24dp
            java.lang.String r1 = r8.getNOTIFICATION_RESUME()
            android.app.PendingIntent r1 = r7.getReceiverPendingIntent(r0, r1, r4)
            java.lang.String r2 = "Play"
            r3.mo3189a(r9, r2, r1)
        L_0x00bd:
            int r9 = com.coocent.video.videoplayercore.C2520R.C2522drawable.video_ic_skip_next_black_24dp
            java.lang.String r8 = r8.getNOTIFICATION_NEXT()
            android.app.PendingIntent r8 = r7.getReceiverPendingIntent(r0, r8, r4)
            java.lang.String r0 = "Next"
            r3.mo3189a(r9, r0, r8)
            android.app.Notification r8 = r3.mo3191c()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.service.NotificationHelper.createNotification(android.support.v4.media.session.MediaSessionCompat, boolean):android.app.Notification");
    }

    private final void createNotificationChannel() {
        AudioPlayService audioPlayService;
        if (Build.VERSION.SDK_INT >= 26 && (audioPlayService = this.mAudioPlayService) != null) {
            NotificationChannel notificationChannel = new NotificationChannel("-16772352", C2721a.m12312a(audioPlayService), 3);
            notificationChannel.setDescription(BuildConfig.FLAVOR);
            C0492j jVar = this.mNotificationManagerCompat;
            if (jVar != null) {
                jVar.mo3224e(notificationChannel);
            }
        }
    }

    public static final NotificationHelper get() {
        return Companion.get();
    }

    private final PendingIntent getReceiverPendingIntent(Context context, String str, int i) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, new Intent(str), 134217728);
        C8594l.m46770d(broadcast, "getBroadcast(context, co…tent.FLAG_UPDATE_CURRENT)");
        return broadcast;
    }

    private final void initNotification() {
        AudioPlayService audioPlayService = this.mAudioPlayService;
        if (audioPlayService != null) {
            this.mNotificationManagerCompat = C0492j.m3089f(audioPlayService);
        }
    }

    public final void cancelAll() {
        C0492j jVar = this.mNotificationManagerCompat;
        if (jVar != null) {
            jVar.mo3223d();
        }
    }

    public final void cancelNotification(int i) {
        C0492j jVar = this.mNotificationManagerCompat;
        if (jVar != null) {
            jVar.mo3221b(i);
        }
    }

    public final Notification getNotification(MediaSessionCompat mediaSessionCompat, boolean z) {
        C8594l.m46771e(mediaSessionCompat, "mediaSessionCompat");
        return createNotification(mediaSessionCompat, z);
    }

    public final void init(AudioPlayService audioPlayService) {
        this.mAudioPlayService = audioPlayService;
        initNotification();
    }

    public final void notifyNotification(int i, MediaSessionCompat mediaSessionCompat, boolean z) {
        C0492j jVar;
        C8594l.m46771e(mediaSessionCompat, "session");
        Notification createNotification = createNotification(mediaSessionCompat, z);
        if (createNotification != null && (jVar = this.mNotificationManagerCompat) != null) {
            jVar.mo3225h(i, createNotification);
        }
    }

    public void onAudioPlay(String str, String str2, int i, long j) {
        IAudioPlay.DefaultImpls.onAudioPlay(this, str, str2, i, j);
    }

    public void onAudioPlayExit() {
        IAudioPlay.DefaultImpls.onAudioPlayExit(this);
    }

    public void onAudioPlayNext(String str, String str2, int i, long j) {
        IAudioPlay.DefaultImpls.onAudioPlayNext(this, str, str2, i, j);
    }

    public void onAudioPlayPrevious(String str, String str2, int i, long j) {
        IAudioPlay.DefaultImpls.onAudioPlayPrevious(this, str, str2, i, j);
    }

    public void onAudioPlayTime(String str, int i, long j) {
        IAudioPlay.DefaultImpls.onAudioPlayTime(this, str, i, j);
    }

    public void onAudioReTitle(Video video, String str) {
        IAudioPlay.DefaultImpls.onAudioReTitle(this, video, str);
    }

    public void onAudioSwitchMode(int i) {
        IAudioPlay.DefaultImpls.onAudioSwitchMode(this, i);
    }

    public void onClickNotification() {
        IAudioPlay.DefaultImpls.onClickNotification(this);
    }

    public void onClickPosition(int i) {
        IAudioPlay.DefaultImpls.onClickPosition(this, i);
    }

    public void onPauseOrResume(boolean z) {
        IAudioPlay.DefaultImpls.onPauseOrResume(this, z);
    }

    public void onRemoveVideoPosition(Video video, int i) {
        IAudioPlay.DefaultImpls.onRemoveVideoPosition(this, video, i);
    }
}
