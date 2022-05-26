package com.coocent.video.videoplayercore.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.coocent.video.videoplayercore.C2520R;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.video.videoplayercore.receiver.BlueNotificationReceiver;
import com.coocent.video.videoplayercore.receiver.NotificationReceiver;
import com.coocent.video.videoplayercore.service.IAudioBlue;
import com.coocent.video.videoplayercore.utils.TimeUtilsKt;
import com.coocent.videostore.p067po.Video;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p369i.C8457t;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8605w;

/* compiled from: AudioPlayService.kt */
public final class AudioPlayService extends Service implements IAudioBlue {
    public static final Companion Companion = new Companion((C8589g) null);
    public static final String KEY_RENAME = "rename";
    public static final String KEY_RENAME_VIDEO = "rename_video";
    /* access modifiers changed from: private */
    public static String NOTIFICATION_CLICK;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_CLICK_PLAY;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_EXIT;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_NEXT;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_PAUSE;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_PREV;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_RELEASE;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_RENAME;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_RESUME;
    /* access modifiers changed from: private */
    public static String NOTIFICATION_UPDATE_STATUS;
    /* access modifiers changed from: private */
    public static String TAG = "AudioPlayService";
    /* access modifiers changed from: private */
    public static int UPDATE_PLAY_CLICK_PLAY = 1;
    /* access modifiers changed from: private */
    public static int UPDATE_PLAY_PROGRESS_SHOW;
    /* access modifiers changed from: private */
    public static AudioPlayService instance;
    /* access modifiers changed from: private */
    public AudioPlayHandler mAudioPlayHandler;
    /* access modifiers changed from: private */
    public AudioPlayServiceManager mAudioPlayServiceManager;
    /* access modifiers changed from: private */
    public AudioProgress mAudioProgress;
    private BlueNotificationReceiver mBlueNotificationReceiver;
    private CountDownTimer mCountDownTimer;
    /* access modifiers changed from: private */
    public IAudioPlay mIAudioPlay;
    private NotificationReceiver mNotificationReceiver;
    /* access modifiers changed from: private */
    public PlayerHelper mPlayerHelper;

    /* compiled from: AudioPlayService.kt */
    public final class AudioBinder extends Binder {
        final /* synthetic */ AudioPlayService this$0;

        public AudioBinder(AudioPlayService audioPlayService) {
            C8594l.m46771e(audioPlayService, "this$0");
            this.this$0 = audioPlayService;
        }

        public final AudioPlayService getService() {
            return this.this$0;
        }
    }

    /* compiled from: AudioPlayService.kt */
    private static final class AudioPlayHandler extends Handler {
        private final WeakReference<AudioPlayService> mContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AudioPlayHandler(AudioPlayService audioPlayService) {
            super(Looper.getMainLooper());
            C8594l.m46771e(audioPlayService, "context");
            this.mContext = new WeakReference<>(audioPlayService);
        }

        public void handleMessage(Message message) {
            AudioPlayService audioPlayService;
            C8594l.m46771e(message, "msg");
            super.handleMessage(message);
            if (this.mContext.get() != null) {
                int i = message.what;
                Companion companion = AudioPlayService.Companion;
                if (i != companion.getUPDATE_PLAY_PROGRESS_SHOW() && i == companion.getUPDATE_PLAY_CLICK_PLAY() && (audioPlayService = (AudioPlayService) this.mContext.get()) != null) {
                    PlayerHelper.Companion companion2 = PlayerHelper.Companion;
                    Context applicationContext = audioPlayService.getApplicationContext();
                    C8594l.m46770d(applicationContext, "it.applicationContext");
                    PlayerHelper.startPlay$default(companion2.getInstance(applicationContext), false, 1, (Object) null);
                }
            }
        }
    }

    /* compiled from: AudioPlayService.kt */
    private static final class AudioProgress implements Runnable {
        private final WeakReference<AudioPlayService> weakReference;

        public AudioProgress(AudioPlayService audioPlayService) {
            C8594l.m46771e(audioPlayService, "service");
            this.weakReference = new WeakReference<>(audioPlayService);
        }

        public void run() {
            AudioProgress access$getMAudioProgress$p;
            IAudioPlay access$getMIAudioPlay$p;
            AudioPlayService audioPlayService = (AudioPlayService) this.weakReference.get();
            if (audioPlayService != null && (access$getMAudioProgress$p = audioPlayService.mAudioProgress) != null) {
                AudioPlayHandler access$getMAudioPlayHandler$p = audioPlayService.mAudioPlayHandler;
                if (access$getMAudioPlayHandler$p != null) {
                    access$getMAudioPlayHandler$p.removeCallbacks(access$getMAudioProgress$p);
                }
                AudioPlayHandler access$getMAudioPlayHandler$p2 = audioPlayService.mAudioPlayHandler;
                if (access$getMAudioPlayHandler$p2 != null) {
                    access$getMAudioPlayHandler$p2.postDelayed(access$getMAudioProgress$p, 1000);
                }
                if (!(audioPlayService.mAudioPlayServiceManager == null || (access$getMIAudioPlay$p = audioPlayService.mIAudioPlay) == null)) {
                    access$getMIAudioPlay$p.onAudioPlayTime(audioPlayService.playingTime(), audioPlayService.playingCurrent(), audioPlayService.duration());
                }
                IAudioPlay access$getMIAudioPlay$p2 = audioPlayService.mIAudioPlay;
                if (access$getMIAudioPlay$p2 != null) {
                    access$getMIAudioPlay$p2.onPauseOrResume(!audioPlayService.isPlaying());
                }
                audioPlayService.updatePlayBackState();
            }
        }
    }

    /* compiled from: AudioPlayService.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8589g gVar) {
            this();
        }

        public final synchronized AudioPlayService getInstance() {
            return AudioPlayService.instance;
        }

        public final String getNOTIFICATION_CLICK() {
            return AudioPlayService.NOTIFICATION_CLICK;
        }

        public final String getNOTIFICATION_CLICK_PLAY() {
            return AudioPlayService.NOTIFICATION_CLICK_PLAY;
        }

        public final String getNOTIFICATION_EXIT() {
            return AudioPlayService.NOTIFICATION_EXIT;
        }

        public final String getNOTIFICATION_NEXT() {
            return AudioPlayService.NOTIFICATION_NEXT;
        }

        public final String getNOTIFICATION_PAUSE() {
            return AudioPlayService.NOTIFICATION_PAUSE;
        }

        public final String getNOTIFICATION_PREV() {
            return AudioPlayService.NOTIFICATION_PREV;
        }

        public final String getNOTIFICATION_RELEASE() {
            return AudioPlayService.NOTIFICATION_RELEASE;
        }

        public final String getNOTIFICATION_RENAME() {
            return AudioPlayService.NOTIFICATION_RENAME;
        }

        public final String getNOTIFICATION_RESUME() {
            return AudioPlayService.NOTIFICATION_RESUME;
        }

        public final String getNOTIFICATION_UPDATE_STATUS() {
            return AudioPlayService.NOTIFICATION_UPDATE_STATUS;
        }

        public final String getTAG() {
            return AudioPlayService.TAG;
        }

        public final int getUPDATE_PLAY_CLICK_PLAY() {
            return AudioPlayService.UPDATE_PLAY_CLICK_PLAY;
        }

        public final int getUPDATE_PLAY_PROGRESS_SHOW() {
            return AudioPlayService.UPDATE_PLAY_PROGRESS_SHOW;
        }

        public final void setNOTIFICATION_CLICK(String str) {
            AudioPlayService.NOTIFICATION_CLICK = str;
        }

        public final void setNOTIFICATION_CLICK_PLAY(String str) {
            AudioPlayService.NOTIFICATION_CLICK_PLAY = str;
        }

        public final void setNOTIFICATION_EXIT(String str) {
            AudioPlayService.NOTIFICATION_EXIT = str;
        }

        public final void setNOTIFICATION_NEXT(String str) {
            AudioPlayService.NOTIFICATION_NEXT = str;
        }

        public final void setNOTIFICATION_PAUSE(String str) {
            AudioPlayService.NOTIFICATION_PAUSE = str;
        }

        public final void setNOTIFICATION_PREV(String str) {
            AudioPlayService.NOTIFICATION_PREV = str;
        }

        public final void setNOTIFICATION_RELEASE(String str) {
            AudioPlayService.NOTIFICATION_RELEASE = str;
        }

        public final void setNOTIFICATION_RENAME(String str) {
            AudioPlayService.NOTIFICATION_RENAME = str;
        }

        public final void setNOTIFICATION_RESUME(String str) {
            AudioPlayService.NOTIFICATION_RESUME = str;
        }

        public final void setNOTIFICATION_UPDATE_STATUS(String str) {
            AudioPlayService.NOTIFICATION_UPDATE_STATUS = str;
        }

        public final void setTAG(String str) {
            C8594l.m46771e(str, "<set-?>");
            AudioPlayService.TAG = str;
        }

        public final void setUPDATE_PLAY_CLICK_PLAY(int i) {
            AudioPlayService.UPDATE_PLAY_CLICK_PLAY = i;
        }

        public final void setUPDATE_PLAY_PROGRESS_SHOW(int i) {
            AudioPlayService.UPDATE_PLAY_PROGRESS_SHOW = i;
        }
    }

    private final void finishService() {
        stopForeground(true);
        stopSelf();
    }

    private final void initAudioFocusWrapper() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.initAudioFocusWrapper(this);
            PlayerHelper playerHelper2 = this.mPlayerHelper;
            if (playerHelper2 == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (playerHelper2 != null) {
                playerHelper2.setVolume(playerHelper2.getStreamVolume(3));
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    private final void initBluetoothState() {
    }

    private final void onAudioSleep() {
        String str;
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.getSleepMode();
            PlayerHelper playerHelper2 = this.mPlayerHelper;
            if (playerHelper2 != null) {
                long sleepTime = playerHelper2.getSleepTime();
                CountDownTimer countDownTimer = this.mCountDownTimer;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                if (sleepTime > 0) {
                    if (sleepTime < 60000) {
                        str = (sleepTime / ((long) 1000)) + " second";
                    } else {
                        str = ((sleepTime / ((long) 60)) / ((long) 1000)) + " minutes";
                    }
                    C8605w wVar = C8605w.f34938a;
                    Locale locale = Locale.US;
                    String string = getString(C2520R.string.video_sleep_hint);
                    C8594l.m46770d(string, "getString(R.string.video_sleep_hint)");
                    String format = String.format(locale, string, Arrays.copyOf(new Object[]{str}, 1));
                    C8594l.m46770d(format, "java.lang.String.format(locale, format, *args)");
                    Toast.makeText(this, format, 0).show();
                    AudioPlayService$onAudioSleep$1 audioPlayService$onAudioSleep$1 = new AudioPlayService$onAudioSleep$1(this, sleepTime);
                    audioPlayService$onAudioSleep$1.start();
                    C8457t tVar = C8457t.f34900a;
                    this.mCountDownTimer = audioPlayService$onAudioSleep$1;
                    return;
                }
                return;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    private final void registerReceiver() {
        NOTIFICATION_RESUME = C8594l.m46777k(getPackageName(), ".VIDEO_RESUME");
        NOTIFICATION_PAUSE = C8594l.m46777k(getPackageName(), ".VIDEO_PAUSE");
        NOTIFICATION_NEXT = C8594l.m46777k(getPackageName(), ".VIDEO_NEXT");
        NOTIFICATION_PREV = C8594l.m46777k(getPackageName(), ".VIDEO_PREV");
        NOTIFICATION_EXIT = C8594l.m46777k(getPackageName(), ".VIDEO_EXIT");
        NOTIFICATION_RELEASE = C8594l.m46777k(getPackageName(), ".VIDEO_RELEASE");
        NOTIFICATION_RENAME = C8594l.m46777k(getPackageName(), ".VIDEO_RENAME");
        NOTIFICATION_CLICK = C8594l.m46777k(getPackageName(), ".VIDEO_NOTIFICATION_CLICK");
        NOTIFICATION_UPDATE_STATUS = C8594l.m46777k(getPackageName(), ".VIDEO_UPDATE_STATUS");
        NOTIFICATION_CLICK_PLAY = C8594l.m46777k(getPackageName(), ".NOTIFICATION_PLAY");
        this.mNotificationReceiver = new NotificationReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(NOTIFICATION_RESUME);
        intentFilter.addAction(NOTIFICATION_PAUSE);
        intentFilter.addAction(NOTIFICATION_NEXT);
        intentFilter.addAction(NOTIFICATION_PREV);
        intentFilter.addAction(NOTIFICATION_EXIT);
        intentFilter.addAction(NOTIFICATION_CLICK);
        intentFilter.addAction(NOTIFICATION_RELEASE);
        intentFilter.addAction(NOTIFICATION_RENAME);
        intentFilter.addAction(NOTIFICATION_UPDATE_STATUS);
        intentFilter.addAction(NOTIFICATION_CLICK_PLAY);
        registerReceiver(this.mNotificationReceiver, intentFilter);
        this.mBlueNotificationReceiver = new BlueNotificationReceiver();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(NOTIFICATION_RESUME);
        intentFilter2.addAction(NOTIFICATION_PAUSE);
        intentFilter2.addAction(NOTIFICATION_NEXT);
        intentFilter2.addAction(NOTIFICATION_PREV);
        registerReceiver(this.mBlueNotificationReceiver, intentFilter2);
    }

    private final void removeHandler() {
        AudioPlayHandler audioPlayHandler;
        AudioPlayHandler audioPlayHandler2 = this.mAudioPlayHandler;
        if (audioPlayHandler2 != null) {
            audioPlayHandler2.removeMessages(UPDATE_PLAY_CLICK_PLAY);
        }
        AudioPlayHandler audioPlayHandler3 = this.mAudioPlayHandler;
        if (audioPlayHandler3 != null) {
            audioPlayHandler3.removeMessages(UPDATE_PLAY_PROGRESS_SHOW);
        }
        AudioPlayHandler audioPlayHandler4 = this.mAudioPlayHandler;
        if (audioPlayHandler4 != null) {
            audioPlayHandler4.removeCallbacksAndMessages(this);
        }
        AudioProgress audioProgress = this.mAudioProgress;
        if (!(audioProgress == null || (audioPlayHandler = this.mAudioPlayHandler) == null)) {
            audioPlayHandler.removeCallbacks(audioProgress);
        }
        this.mAudioProgress = null;
        this.mAudioPlayHandler = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0 != 6) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updatePlayBackState() {
        /*
            r8 = this;
            com.coocent.video.videoplayercore.player.PlayerHelper r0 = r8.mPlayerHelper
            r1 = 0
            java.lang.String r2 = "mPlayerHelper"
            if (r0 == 0) goto L_0x006c
            int r0 = r0.getState()
            r3 = -2
            r4 = 1
            r5 = 0
            r6 = 2
            if (r0 == r3) goto L_0x002f
            r3 = -1
            if (r0 == r3) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            if (r0 == r4) goto L_0x002e
            if (r0 == r6) goto L_0x002e
            r3 = 3
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 == r3) goto L_0x0024
            r3 = 6
            if (r0 == r3) goto L_0x002e
            goto L_0x002f
        L_0x0024:
            r5 = 1
            goto L_0x002f
        L_0x0026:
            boolean r0 = r8.isPlaying()
            if (r0 == 0) goto L_0x002e
            r5 = 3
            goto L_0x002f
        L_0x002e:
            r5 = 2
        L_0x002f:
            android.support.v4.media.session.PlaybackStateCompat$b r0 = new android.support.v4.media.session.PlaybackStateCompat$b
            r0.<init>()
            r6 = 567(0x237, double:2.8E-321)
            r0.mo362b(r6)
            com.coocent.video.videoplayercore.player.PlayerHelper r3 = r8.mPlayerHelper
            if (r3 == 0) goto L_0x0068
            int r3 = r3.currentPosition()
            long r6 = (long) r3
            com.coocent.video.videoplayercore.player.PlayerHelper r3 = r8.mPlayerHelper
            if (r3 == 0) goto L_0x0064
            float r1 = r3.getSpeed()
            r0.mo363c(r5, r6, r1)
            com.coocent.video.videoplayercore.service.AudioPlayServiceManager r1 = r8.mAudioPlayServiceManager
            if (r1 != 0) goto L_0x0052
            goto L_0x0063
        L_0x0052:
            android.support.v4.media.session.MediaSessionCompat r1 = r1.getMediaSession()
            if (r1 != 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            r1.mo163h(r4)
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.mo361a()
            r1.mo168m(r0)
        L_0x0063:
            return
        L_0x0064:
            p369i.p387z.p389d.C8594l.m46783q(r2)
            throw r1
        L_0x0068:
            p369i.p387z.p389d.C8594l.m46783q(r2)
            throw r1
        L_0x006c:
            p369i.p387z.p389d.C8594l.m46783q(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.service.AudioPlayService.updatePlayBackState():void");
    }

    private final void updatePlayProgressShow() {
        AudioPlayHandler audioPlayHandler = this.mAudioPlayHandler;
        if (audioPlayHandler != null) {
            audioPlayHandler.sendEmptyMessageDelayed(UPDATE_PLAY_PROGRESS_SHOW, 1000);
        }
    }

    public final void addAudioPlayCallBack(IAudioPlay iAudioPlay) {
        C8594l.m46771e(iAudioPlay, "callback");
        this.mIAudioPlay = iAudioPlay;
    }

    public final long duration() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return (long) playerHelper.duration();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final IAudioPlay getAudioPlayCallBack() {
        return this.mIAudioPlay;
    }

    public final int getPlayMode() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return playerHelper.getPlayMode();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final boolean isAudioPlay() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return playerHelper.isAudioPlay();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final boolean isPlaying() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return playerHelper.isPlaying();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final void onAudioPlay() {
        Video playingVideo = playingVideo();
        if (playingVideo != null) {
            PlayerHelper playerHelper = this.mPlayerHelper;
            if (playerHelper != null) {
                playerHelper.requestAudioFocus();
                AudioPlayServiceManager audioPlayServiceManager = this.mAudioPlayServiceManager;
                if (audioPlayServiceManager != null) {
                    audioPlayServiceManager.setMediaSession(playingTime(), playingVideo);
                }
                IAudioPlay iAudioPlay = this.mIAudioPlay;
                if (iAudioPlay != null) {
                    String w = playingVideo.mo10565w();
                    C8594l.m46770d(w, "playingVideo.title");
                    String v = playingVideo.mo10564v();
                    C8594l.m46770d(v, "playingVideo.thumbnail");
                    iAudioPlay.onAudioPlay(w, v, playingCurrent(), playingVideo.mo10547g());
                }
                IAudioPlay iAudioPlay2 = this.mIAudioPlay;
                if (iAudioPlay2 != null) {
                    iAudioPlay2.onPauseOrResume(!isPlaying());
                }
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
        updatePlayBackState();
        AudioProgress audioProgress = this.mAudioProgress;
        if (audioProgress != null) {
            AudioPlayHandler audioPlayHandler = this.mAudioPlayHandler;
            if (audioPlayHandler != null) {
                audioPlayHandler.removeCallbacks(audioProgress);
            }
            AudioPlayHandler audioPlayHandler2 = this.mAudioPlayHandler;
            if (audioPlayHandler2 != null) {
                audioPlayHandler2.post(audioProgress);
            }
        }
    }

    public final void onAudioPlayExit() {
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        IAudioPlay iAudioPlay = this.mIAudioPlay;
        if (iAudioPlay != null) {
            iAudioPlay.onAudioPlayExit();
        }
        finishService();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r0 != 3) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAudioPlayNext() {
        /*
            r13 = this;
            com.coocent.video.videoplayercore.player.PlayerHelper r0 = r13.mPlayerHelper
            java.lang.String r1 = "mPlayerHelper"
            r2 = 0
            if (r0 == 0) goto L_0x010e
            r0.requestAudioFocus()
            com.coocent.video.videoplayercore.player.PlayerHelper r0 = r13.mPlayerHelper
            if (r0 == 0) goto L_0x010a
            int r0 = r0.getPlayMode()
            java.lang.String r3 = "playingVideo.thumbnail"
            java.lang.String r4 = "playingVideo.title"
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0080
            r7 = 2
            if (r0 == r6) goto L_0x0024
            if (r0 == r7) goto L_0x0080
            r7 = 3
            if (r0 == r7) goto L_0x0080
            goto L_0x00ac
        L_0x0024:
            com.coocent.video.videoplayercore.player.PlayerHelper r0 = r13.mPlayerHelper
            if (r0 == 0) goto L_0x007c
            int r0 = r0.getPlayPosition()
            com.coocent.video.videoplayercore.player.PlayerHelper r8 = r13.mPlayerHelper
            if (r8 == 0) goto L_0x0078
            java.util.List r8 = r8.getDataSources()
            int r8 = r8.size()
            int r8 = r8 - r6
            if (r0 != r8) goto L_0x0047
            com.coocent.video.videoplayercore.player.PlayerHelper r0 = r13.mPlayerHelper
            if (r0 == 0) goto L_0x0043
            com.coocent.video.videoplayercore.player.PlayerHelper.starPlayOnPosition$default(r0, r5, r5, r7, r2)
            goto L_0x00ac
        L_0x0043:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x0047:
            com.coocent.video.videoplayercore.player.PlayerHelper r0 = r13.mPlayerHelper
            if (r0 == 0) goto L_0x0074
            com.coocent.video.videoplayercore.player.PlayerHelper.playNext$default(r0, r5, r6, r2)
            com.coocent.videostore.po.Video r0 = r13.playingVideo()
            if (r0 != 0) goto L_0x0055
            goto L_0x00ac
        L_0x0055:
            com.coocent.video.videoplayercore.service.IAudioPlay r7 = r13.mIAudioPlay
            if (r7 != 0) goto L_0x005a
            goto L_0x00ac
        L_0x005a:
            java.lang.String r8 = r0.mo10565w()
            p369i.p387z.p389d.C8594l.m46770d(r8, r4)
            java.lang.String r9 = r0.mo10564v()
            p369i.p387z.p389d.C8594l.m46770d(r9, r3)
            int r10 = r13.playingCurrent()
            long r11 = r0.mo10547g()
            r7.onAudioPlayNext(r8, r9, r10, r11)
            goto L_0x00ac
        L_0x0074:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x0078:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x007c:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x0080:
            com.coocent.video.videoplayercore.player.PlayerHelper r0 = r13.mPlayerHelper
            if (r0 == 0) goto L_0x0106
            com.coocent.video.videoplayercore.player.PlayerHelper.playNext$default(r0, r5, r6, r2)
            com.coocent.videostore.po.Video r0 = r13.playingVideo()
            if (r0 != 0) goto L_0x008e
            goto L_0x00ac
        L_0x008e:
            com.coocent.video.videoplayercore.service.IAudioPlay r7 = r13.mIAudioPlay
            if (r7 != 0) goto L_0x0093
            goto L_0x00ac
        L_0x0093:
            java.lang.String r8 = r0.mo10565w()
            p369i.p387z.p389d.C8594l.m46770d(r8, r4)
            java.lang.String r9 = r0.mo10564v()
            p369i.p387z.p389d.C8594l.m46770d(r9, r3)
            int r10 = r13.playingCurrent()
            long r11 = r0.mo10547g()
            r7.onAudioPlayNext(r8, r9, r10, r11)
        L_0x00ac:
            java.lang.String r0 = TAG
            com.coocent.video.videoplayercore.player.PlayerHelper r3 = r13.mPlayerHelper
            if (r3 == 0) goto L_0x0102
            int r3 = r3.currentPosition()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "updatePlayBackState: currentPosition="
            java.lang.String r3 = p369i.p387z.p389d.C8594l.m46777k(r4, r3)
            android.util.Log.e(r0, r3)
            java.lang.String r0 = TAG
            com.coocent.video.videoplayercore.player.PlayerHelper r3 = r13.mPlayerHelper
            if (r3 == 0) goto L_0x00fe
            int r1 = r3.duration()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "updatePlayBackState: duration="
            java.lang.String r1 = p369i.p387z.p389d.C8594l.m46777k(r2, r1)
            android.util.Log.e(r0, r1)
            com.coocent.videostore.po.Video r0 = r13.playingVideo()
            if (r0 != 0) goto L_0x00e1
            goto L_0x00ed
        L_0x00e1:
            com.coocent.video.videoplayercore.service.AudioPlayServiceManager r1 = r13.mAudioPlayServiceManager
            if (r1 != 0) goto L_0x00e6
            goto L_0x00ed
        L_0x00e6:
            java.lang.String r2 = r13.playingTime()
            r1.setMediaSession(r2, r0)
        L_0x00ed:
            r13.updatePlayBackState()
            com.coocent.video.videoplayercore.service.IAudioPlay r0 = r13.mIAudioPlay
            if (r0 != 0) goto L_0x00f5
            goto L_0x00fd
        L_0x00f5:
            boolean r1 = r13.isPlaying()
            r1 = r1 ^ r6
            r0.onPauseOrResume(r1)
        L_0x00fd:
            return
        L_0x00fe:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x0102:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x0106:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x010a:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        L_0x010e:
            p369i.p387z.p389d.C8594l.m46783q(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.service.AudioPlayService.onAudioPlayNext():void");
    }

    public final void onAudioPlayPrevious() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.playPrevious();
            Video playingVideo = playingVideo();
            if (playingVideo != null) {
                PlayerHelper playerHelper2 = this.mPlayerHelper;
                if (playerHelper2 != null) {
                    playerHelper2.requestAudioFocus();
                    AudioPlayServiceManager audioPlayServiceManager = this.mAudioPlayServiceManager;
                    if (audioPlayServiceManager != null) {
                        audioPlayServiceManager.setMediaSession(playingTime(), playingVideo);
                    }
                    IAudioPlay iAudioPlay = this.mIAudioPlay;
                    if (iAudioPlay != null) {
                        String w = playingVideo.mo10565w();
                        C8594l.m46770d(w, "playingVideo.title");
                        String v = playingVideo.mo10564v();
                        C8594l.m46770d(v, "playingVideo.thumbnail");
                        iAudioPlay.onAudioPlayPrevious(w, v, playingCurrent(), playingVideo.mo10547g());
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
            updatePlayBackState();
            IAudioPlay iAudioPlay2 = this.mIAudioPlay;
            if (iAudioPlay2 != null) {
                iAudioPlay2.onPauseOrResume(!isPlaying());
                return;
            }
            return;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final void onAudioReTitle(Video video, String str) {
        AudioPlayServiceManager audioPlayServiceManager;
        if (video != null && str != null) {
            PlayerHelper playerHelper = this.mPlayerHelper;
            if (playerHelper != null) {
                playerHelper.reVideoTitle(video, str);
                Video playingVideo = playingVideo();
                if (!(playingVideo == null || (audioPlayServiceManager = this.mAudioPlayServiceManager) == null)) {
                    audioPlayServiceManager.setMediaSession(playingTime(), playingVideo);
                }
                IAudioPlay iAudioPlay = this.mIAudioPlay;
                if (iAudioPlay != null) {
                    iAudioPlay.onAudioReTitle(video, str);
                    return;
                }
                return;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    public final void onAudioRelease() {
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        IAudioPlay iAudioPlay = this.mIAudioPlay;
        if (iAudioPlay != null) {
            iAudioPlay.onAudioPlayExit();
        }
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            PlayerHelper.savePlayTimeMs$default(playerHelper, false, 1, (Object) null);
            PlayerHelper playerHelper2 = this.mPlayerHelper;
            if (playerHelper2 != null) {
                playerHelper2.release();
                finishService();
                return;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final void onAudioSwitchMode() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            int playMode = playerHelper.getPlayMode();
            int i = 3;
            boolean z = false;
            if (playMode == 0) {
                i = 1;
            } else if (playMode == 1) {
                i = 2;
            } else if (playMode != 2) {
                i = 0;
            }
            PlayerHelper playerHelper2 = this.mPlayerHelper;
            if (playerHelper2 != null) {
                if (i == 2) {
                    z = true;
                }
                playerHelper2.setLooping(z);
                PlayerHelper playerHelper3 = this.mPlayerHelper;
                if (playerHelper3 != null) {
                    playerHelper3.setPlayMode(i);
                    IAudioPlay iAudioPlay = this.mIAudioPlay;
                    if (iAudioPlay != null) {
                        iAudioPlay.onAudioSwitchMode(i);
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public IBinder onBind(Intent intent) {
        return new AudioBinder(this);
    }

    public void onBlueNext() {
        IAudioBlue.DefaultImpls.onBlueNext(this);
        onAudioPlayNext();
    }

    public void onBluePause() {
        IAudioBlue.DefaultImpls.onBluePause(this);
        onPauseOrResume(true);
    }

    public void onBluePlay() {
        IAudioBlue.DefaultImpls.onBluePlay(this);
        onPauseOrResume(false);
    }

    public void onBluePrevious() {
        IAudioBlue.DefaultImpls.onBluePrevious(this);
        onAudioPlayPrevious();
    }

    public final void onClickNotification() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.abandonAudioFocus();
            IAudioPlay iAudioPlay = this.mIAudioPlay;
            if (iAudioPlay != null) {
                iAudioPlay.onClickNotification();
                return;
            }
            return;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final void onClickPlay() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.requestAudioFocus();
            AudioPlayHandler audioPlayHandler = this.mAudioPlayHandler;
            if (audioPlayHandler != null) {
                audioPlayHandler.removeMessages(UPDATE_PLAY_CLICK_PLAY);
            }
            AudioPlayHandler audioPlayHandler2 = this.mAudioPlayHandler;
            if (audioPlayHandler2 != null) {
                audioPlayHandler2.sendEmptyMessage(UPDATE_PLAY_CLICK_PLAY);
            }
            Video playingVideo = playingVideo();
            if (playingVideo != null) {
                AudioPlayServiceManager audioPlayServiceManager = this.mAudioPlayServiceManager;
                if (audioPlayServiceManager != null) {
                    audioPlayServiceManager.setMediaSession(playingTime(), playingVideo);
                }
                IAudioPlay iAudioPlay = this.mIAudioPlay;
                if (iAudioPlay != null) {
                    String w = playingVideo.mo10565w();
                    C8594l.m46770d(w, "playingVideo.title");
                    String v = playingVideo.mo10564v();
                    C8594l.m46770d(v, "playingVideo.thumbnail");
                    iAudioPlay.onAudioPlay(w, v, playingCurrent(), playingVideo.mo10547g());
                }
                IAudioPlay iAudioPlay2 = this.mIAudioPlay;
                if (iAudioPlay2 != null) {
                    iAudioPlay2.onPauseOrResume(!isPlaying());
                }
            }
            updatePlayBackState();
            AudioProgress audioProgress = this.mAudioProgress;
            if (audioProgress != null) {
                AudioPlayHandler audioPlayHandler3 = this.mAudioPlayHandler;
                if (audioPlayHandler3 != null) {
                    audioPlayHandler3.removeCallbacks(audioProgress);
                }
                AudioPlayHandler audioPlayHandler4 = this.mAudioPlayHandler;
                if (audioPlayHandler4 != null) {
                    audioPlayHandler4.post(audioProgress);
                    return;
                }
                return;
            }
            return;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final void onClickPosition(Video video, int i) {
        C8594l.m46771e(video, "video");
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.requestAudioFocus();
            PlayerHelper playerHelper2 = this.mPlayerHelper;
            if (playerHelper2 != null) {
                playerHelper2.startPlayOnVideo(video);
                AudioPlayServiceManager audioPlayServiceManager = this.mAudioPlayServiceManager;
                if (audioPlayServiceManager != null) {
                    audioPlayServiceManager.setMediaSession(playingTime(), video);
                }
                updatePlayBackState();
                IAudioPlay iAudioPlay = this.mIAudioPlay;
                if (iAudioPlay != null) {
                    iAudioPlay.onClickPosition(i);
                }
                IAudioPlay iAudioPlay2 = this.mIAudioPlay;
                if (iAudioPlay2 != null) {
                    iAudioPlay2.onPauseOrResume(!isPlaying());
                    return;
                }
                return;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public void onCreate() {
        super.onCreate();
        instance = this;
        registerReceiver();
        NotificationHelper.Companion.get().init(this);
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        Context applicationContext = getApplicationContext();
        C8594l.m46770d(applicationContext, "this.applicationContext");
        this.mPlayerHelper = companion.getInstance(applicationContext);
        AudioPlayServiceManager audioPlayServiceManager = AudioPlayServiceManager.Companion.get();
        this.mAudioPlayServiceManager = audioPlayServiceManager;
        if (audioPlayServiceManager != null) {
            audioPlayServiceManager.initMediaSession(this, this);
        }
        this.mAudioPlayHandler = new AudioPlayHandler(this);
        this.mAudioProgress = new AudioProgress(this);
        initBluetoothState();
    }

    public void onDestroy() {
        super.onDestroy();
        NotificationHelper.Companion.get().cancelNotification(NotificationHelper.NOTIFICATION_ID);
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.isAudioPlay(false);
            instance = null;
            removeHandler();
            AudioPlayServiceManager audioPlayServiceManager = this.mAudioPlayServiceManager;
            if (audioPlayServiceManager != null) {
                audioPlayServiceManager.releaseMediaSession();
            }
            unregisterReceiver(this.mNotificationReceiver);
            unregisterReceiver(this.mBlueNotificationReceiver);
            removeAudioPlayCallBack();
            finishService();
            return;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final void onPauseOrResume(boolean z) {
        AudioPlayHandler audioPlayHandler;
        if (z) {
            stopForeground(false);
            PlayerHelper playerHelper = this.mPlayerHelper;
            if (playerHelper != null) {
                playerHelper.pause();
                AudioProgress audioProgress = this.mAudioProgress;
                if (!(audioProgress == null || (audioPlayHandler = this.mAudioPlayHandler) == null)) {
                    audioPlayHandler.removeCallbacks(audioProgress);
                }
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        } else {
            PlayerHelper playerHelper2 = this.mPlayerHelper;
            if (playerHelper2 != null) {
                playerHelper2.requestAudioFocus();
                PlayerHelper playerHelper3 = this.mPlayerHelper;
                if (playerHelper3 != null) {
                    playerHelper3.resume();
                    AudioProgress audioProgress2 = this.mAudioProgress;
                    if (audioProgress2 != null) {
                        AudioPlayHandler audioPlayHandler2 = this.mAudioPlayHandler;
                        if (audioPlayHandler2 != null) {
                            audioPlayHandler2.removeCallbacks(audioProgress2);
                        }
                        AudioPlayHandler audioPlayHandler3 = this.mAudioPlayHandler;
                        if (audioPlayHandler3 != null) {
                            audioPlayHandler3.post(audioProgress2);
                        }
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
        updatePlayBackState();
        IAudioPlay iAudioPlay = this.mIAudioPlay;
        if (iAudioPlay != null) {
            iAudioPlay.onPauseOrResume(z);
        }
    }

    public final void onRemoveVideoPosition(Video video, int i) {
        C8594l.m46771e(video, "removeVideo");
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            playerHelper.requestAudioFocus();
            Video playingVideo = playingVideo();
            PlayerHelper playerHelper2 = this.mPlayerHelper;
            if (playerHelper2 != null) {
                boolean z = false;
                PlayerHelper.savePlayTimeMs$default(playerHelper2, false, 1, (Object) null);
                PlayerHelper playerHelper3 = this.mPlayerHelper;
                if (playerHelper3 != null) {
                    playerHelper3.saveVideoInfo();
                    PlayerHelper playerHelper4 = this.mPlayerHelper;
                    if (playerHelper4 != null) {
                        playerHelper4.removeVideo(video);
                        if (playingVideo != null && playingVideo.mo10553l() == video.mo10553l()) {
                            z = true;
                        }
                        if (z) {
                            if (playingVideos().size() == 0) {
                                onAudioRelease();
                            } else {
                                PlayerHelper playerHelper5 = this.mPlayerHelper;
                                if (playerHelper5 != null) {
                                    playerHelper5.start();
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            }
                        }
                        updatePlayBackState();
                        IAudioPlay iAudioPlay = this.mIAudioPlay;
                        if (iAudioPlay != null) {
                            iAudioPlay.onRemoveVideoPosition(video, i);
                            return;
                        }
                        return;
                    }
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !C8594l.m46767a(intent.getAction(), NOTIFICATION_UPDATE_STATUS)) {
            return 2;
        }
        onAudioPlay();
        onAudioSleep();
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public final int playingCurrent() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return playerHelper.currentPosition();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final int playingPosition() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return playerHelper.getPlayPosition();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final String playingTime() {
        String timeFormat = TimeUtilsKt.getTimeFormat(duration());
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return TimeUtilsKt.formatTime((long) playerHelper.currentPosition(), timeFormat);
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final Video playingVideo() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return playerHelper.getVideo();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final List<Video> playingVideos() {
        PlayerHelper playerHelper = this.mPlayerHelper;
        if (playerHelper != null) {
            return playerHelper.getVideoList();
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    public final void removeAudioPlayCallBack() {
        this.mIAudioPlay = null;
    }
}
