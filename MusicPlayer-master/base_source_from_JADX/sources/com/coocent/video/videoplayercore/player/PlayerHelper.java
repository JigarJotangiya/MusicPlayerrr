package com.coocent.video.videoplayercore.player;

import android.content.Context;
import android.media.AudioManager;
import android.media.audiofx.BassBoost;
import android.media.audiofx.Equalizer;
import android.media.audiofx.PresetReverb;
import android.media.audiofx.Virtualizer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.media.AudioAttributesCompat;
import com.coocent.video.videoplayercore.C2520R;
import com.coocent.video.videoplayercore.ConsantsKt;
import com.coocent.video.videoplayercore.utils.RandRomUitls;
import com.coocent.videostore.p067po.Video;
import com.p256kk.taurus.playerbase.p257a.C6604c;
import com.p256kk.taurus.playerbase.p257a.C6607f;
import com.p256kk.taurus.playerbase.p258b.C6615b;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p260d.C6637d;
import com.p256kk.taurus.playerbase.p260d.C6638e;
import com.p256kk.taurus.playerbase.p263g.C6665g;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p263g.C6673k;
import com.p256kk.taurus.playerbase.p263g.C6675m;
import com.p256kk.taurus.playerbase.p268l.C6700a;
import com.p256kk.taurus.playerbase.render.C6722a;
import com.p256kk.taurus.playerbase.render.C6723b;
import com.p256kk.taurus.playerbase.widget.C6734a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8906s0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.p397f3.C8731d;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* compiled from: PlayerHelper.kt */
public final class PlayerHelper {
    public static final Companion Companion = new Companion((C8589g) null);
    private static String TAG = "PlayerHelper";
    /* access modifiers changed from: private */
    public static volatile PlayerHelper instance;
    private int isAppType;
    private boolean isAudioPlay;
    private boolean isMusicPlaying = true;
    private boolean isMute;
    private boolean isNetworkStream;
    private boolean isRestoreWindow;
    private boolean isShowAudioBtn = true;
    private boolean isShowPlayListBtn = true;
    private boolean isShowWindowBtn = true;
    private boolean isWindows;
    /* access modifiers changed from: private */
    public final Context mApplicationContext;
    private C6722a mAspectRatio = C6722a.AspectRatio_FIT_PARENT;
    private AudioFocusWrapper mAudioFocusWrapper;
    private AudioManager mAudioManager;
    private BassBoost mBassBoost;
    private final List<C6618a> mDataSourceList = new ArrayList();
    private boolean mEqEnable;
    private Equalizer mEqualizer;
    private FloatWindow mFloatWindow;
    private final AudioManager.OnAudioFocusChangeListener mOnAudioFocusListener = new C2536a(this);
    private int mPlayMode;
    private int mPlayPosition;
    private PresetReverb mPresetReverb;
    private C6607f mRelationAssist;
    private int mSleepMode;
    private long mSleepTime;
    private float mSpeed = 1.0f;
    private final List<Video> mVideoList = new ArrayList();
    private Virtualizer mVirtualizer;
    private int mVolume;

    /* compiled from: PlayerHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8589g gVar) {
            this();
        }

        public final synchronized PlayerHelper getInstance(Context context) {
            PlayerHelper access$getInstance$cp;
            C8594l.m46771e(context, "context");
            if (PlayerHelper.instance == null) {
                synchronized (PlayerHelper.class) {
                    if (PlayerHelper.instance == null) {
                        Companion companion = PlayerHelper.Companion;
                        PlayerHelper.instance = new PlayerHelper(context);
                    }
                    C8457t tVar = C8457t.f34900a;
                }
            }
            access$getInstance$cp = PlayerHelper.instance;
            C8594l.m46769c(access$getInstance$cp);
            return access$getInstance$cp;
        }
    }

    public PlayerHelper(Context context) {
        C8594l.m46771e(context, "mApplicationContext");
        this.mApplicationContext = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: deleteVideoList$lambda-26  reason: not valid java name */
    public static final void m50314deleteVideoList$lambda26(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        playerHelper.play(true);
    }

    public static /* synthetic */ Object getLastPlayVideoId$default(PlayerHelper playerHelper, boolean z, C8508d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return playerHelper.getLastPlayVideoId(z, dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: mOnAudioFocusListener$lambda-22  reason: not valid java name */
    public static final void m50315mOnAudioFocusListener$lambda22(PlayerHelper playerHelper, int i) {
        C8594l.m46771e(playerHelper, "this$0");
        if (i != -2) {
            if (i == -1) {
                if (playerHelper.isInPlaybackState()) {
                    playerHelper.pause();
                }
                playerHelper.abandonAudioFocus();
            } else if (i == 1) {
                int streamVolume = playerHelper.getStreamVolume(3);
                playerHelper.mVolume = streamVolume;
                playerHelper.setStreamVolume(3, streamVolume, 0);
            }
        } else if (playerHelper.mVolume > 1) {
            playerHelper.setStreamVolume(3, 1, 0);
        }
    }

    public static /* synthetic */ void play$default(PlayerHelper playerHelper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        playerHelper.play(z);
    }

    public static /* synthetic */ void playNext$default(PlayerHelper playerHelper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        playerHelper.playNext(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: playNext$lambda-6  reason: not valid java name */
    public static final void m50316playNext$lambda6(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    /* access modifiers changed from: private */
    /* renamed from: playPrevious$lambda-5  reason: not valid java name */
    public static final void m50317playPrevious$lambda5(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    /* access modifiers changed from: private */
    /* renamed from: removeVideoToStart$lambda-16  reason: not valid java name */
    public static final void m50318removeVideoToStart$lambda16(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        C6607f fVar = playerHelper.mRelationAssist;
        if (fVar != null) {
            fVar.mo25841f(playerHelper.getPlayDataSource());
        }
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    /* access modifiers changed from: private */
    /* renamed from: removeVideoToStart$lambda-18  reason: not valid java name */
    public static final void m50319removeVideoToStart$lambda18(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        C6607f fVar = playerHelper.mRelationAssist;
        if (fVar != null) {
            fVar.mo25841f(playerHelper.getPlayDataSource());
        }
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    private final void saveLastPlaybackTime(Video video, long j) {
        C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new PlayerHelper$saveLastPlaybackTime$1(this, video, j, (C8508d<? super PlayerHelper$saveLastPlaybackTime$1>) null), 2, (Object) null);
    }

    public static /* synthetic */ void savePlayTimeMs$default(PlayerHelper playerHelper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        playerHelper.savePlayTimeMs(z);
    }

    private final void savePlayingVideoIdAndPath(Video video) {
        C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new PlayerHelper$savePlayingVideoIdAndPath$1(this, video, (C8508d<? super PlayerHelper$savePlayingVideoIdAndPath$1>) null), 2, (Object) null);
    }

    public static /* synthetic */ void starPlayOnPosition$default(PlayerHelper playerHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        playerHelper.starPlayOnPosition(i, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: starPlayOnPosition$lambda-4  reason: not valid java name */
    public static final void m50320starPlayOnPosition$lambda4(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    /* access modifiers changed from: private */
    /* renamed from: start$lambda-15  reason: not valid java name */
    public static final void m50321start$lambda15(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        C6607f fVar = playerHelper.mRelationAssist;
        if (fVar != null) {
            fVar.mo25841f(playerHelper.getPlayDataSource());
        }
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    public static /* synthetic */ void startPlay$default(PlayerHelper playerHelper, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        playerHelper.startPlay(collection, i, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: startPlay$lambda-1  reason: not valid java name */
    public static final void m50322startPlay$lambda1(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    /* access modifiers changed from: private */
    /* renamed from: startPlay$lambda-2  reason: not valid java name */
    public static final void m50323startPlay$lambda2(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    /* access modifiers changed from: private */
    /* renamed from: startPlayOnVideo$lambda-3  reason: not valid java name */
    public static final void m50324startPlayOnVideo$lambda3(PlayerHelper playerHelper) {
        C8594l.m46771e(playerHelper, "this$0");
        playerHelper.play(true);
        playerHelper.updateDataSource();
    }

    private final void updateDataSource() {
        C6607f fVar;
        C6668j C;
        C6665g a;
        if (this.mDataSourceList.size() != 0 && this.mDataSourceList.size() > this.mPlayPosition && (fVar = this.mRelationAssist) != null && (C = fVar.mo25862C()) != null && (a = C.mo26005a()) != null) {
            a.mo26002i(ConsantsKt.KEY_DATA_SOURCE, this.mDataSourceList.get(this.mPlayPosition));
        }
    }

    public final void abandonAudioFocus() {
        AudioFocusWrapper audioFocusWrapper = this.mAudioFocusWrapper;
        if (audioFocusWrapper != null) {
            audioFocusWrapper.abandonAudioFocus();
        }
    }

    public final void attachToContainer(ViewGroup viewGroup) {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25876t(viewGroup, false);
        }
    }

    public final Integer audioSessionId() {
        C6607f fVar = this.mRelationAssist;
        if (fVar == null) {
            return null;
        }
        return Integer.valueOf(fVar.mo25878z());
    }

    public final void closeWindow() {
        FloatWindow floatWindow = this.mFloatWindow;
        if (floatWindow != null) {
            floatWindow.close();
        }
        this.mFloatWindow = null;
    }

    public final int currentPosition() {
        C6607f fVar = this.mRelationAssist;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo25860A();
    }

    public final boolean deleteVideoList(List<Video> list) {
        Video video;
        C8594l.m46771e(list, "deleteList");
        if (!isAudioPlay() && !isWindows()) {
            return false;
        }
        Iterator<Video> it = list.iterator();
        int i = -1;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Video next = it.next();
            if (getVideo() != null) {
                long l = next.mo10553l();
                Video video2 = getVideo();
                if (video2 == null || l != video2.mo10553l()) {
                    z = false;
                }
                if (z) {
                    i = this.mPlayPosition;
                }
            }
        }
        if (i == this.mPlayPosition && (video = getVideo()) != null) {
            Boolean m = video.mo10554m();
            C8594l.m46770d(m, "it.isPrivateVideo");
            savePlayingVideoIdAndPath(m.booleanValue());
        }
        if (this.mVideoList.isEmpty() || i >= this.mVideoList.size() || this.mDataSourceList.isEmpty() || i >= this.mDataSourceList.size()) {
            return false;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                int size2 = this.mVideoList.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (list.get(size).mo10553l() == this.mVideoList.get(size2).mo10553l()) {
                            int i4 = this.mPlayPosition;
                            if (size2 < i4) {
                                this.mPlayPosition = i4 - 1;
                            }
                            this.mVideoList.remove(size2);
                            this.mDataSourceList.remove(size2);
                        }
                        if (i3 < 0) {
                            break;
                        }
                        size2 = i3;
                    }
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
        }
        saveVideoInfo();
        this.mSpeed = 1.0f;
        if (i == this.mPlayPosition) {
            stop();
            C6607f fVar = this.mRelationAssist;
            if (fVar != null) {
                fVar.mo25841f(getPlayDataSource());
            }
            new Handler(Looper.getMainLooper()).post(new C2538c(this));
            updateDataSource();
        }
        if (i == this.mPlayPosition) {
            return true;
        }
        return false;
    }

    public final int duration() {
        C6607f fVar = this.mRelationAssist;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo25861B();
    }

    public final C6722a getAspectRatio() {
        return this.mAspectRatio;
    }

    public final AudioFocusWrapper getAudioFocusWrapper() {
        return this.mAudioFocusWrapper;
    }

    public final AudioManager getAudioManager() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            return audioManager;
        }
        C8594l.m46783q("mAudioManager");
        throw null;
    }

    public final List<C6618a> getDataSources() {
        return this.mDataSourceList;
    }

    public final boolean getEqEnable() {
        return this.mEqEnable;
    }

    public final int getFloatWindowWidth() {
        FloatWindow floatWindow = this.mFloatWindow;
        if (floatWindow == null) {
            return 0;
        }
        return floatWindow.getWidth();
    }

    public final Object getLastPlayVideoId(boolean z, C8508d<? super Long> dVar) {
        return C8731d.m47259d(new PlayerHelper$getLastPlayVideoId$$inlined$map$1(PlayerHelperKt.getDataStore(this.mApplicationContext).mo13321b(), z), dVar);
    }

    public final Object getLastPlayVideoPath(C8508d<? super String> dVar) {
        return C8731d.m47259d(new PlayerHelper$getLastPlayVideoPath$$inlined$map$1(PlayerHelperKt.getDataStore(this.mApplicationContext).mo13321b()), dVar);
    }

    public final C6618a getPlayDataSource() {
        int i = this.mPlayPosition;
        if (i < 0 || i >= this.mDataSourceList.size()) {
            return null;
        }
        return this.mDataSourceList.get(this.mPlayPosition);
    }

    public final int getPlayMode() {
        return this.mPlayMode;
    }

    public final int getPlayPosition() {
        return this.mPlayPosition;
    }

    public final C6668j getReceiverGroup() {
        C6607f fVar = this.mRelationAssist;
        if (fVar == null) {
            return null;
        }
        return fVar.mo25862C();
    }

    public final C6607f getRelationAssist() {
        return this.mRelationAssist;
    }

    public final int getSleepMode() {
        return this.mSleepMode;
    }

    public final long getSleepTime() {
        return this.mSleepTime;
    }

    public final float getSpeed() {
        return this.mSpeed;
    }

    public final int getState() {
        C6607f fVar = this.mRelationAssist;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo25864E();
    }

    public final int getStreamVolume(int i) {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        C8594l.m46783q("mAudioManager");
        throw null;
    }

    public final Video getVideo() {
        int i;
        if (this.mVideoList.size() == 0 || this.mVideoList.size() <= (i = this.mPlayPosition)) {
            return null;
        }
        return this.mVideoList.get(i);
    }

    public final List<Video> getVideoList() {
        if (!isNetworkStream()) {
            return this.mVideoList;
        }
        ArrayList<Video> arrayList = new ArrayList<>();
        arrayList.addAll(this.mVideoList);
        for (Video video : arrayList) {
            video.mo10519F(video.mo10565w());
            video.mo10536Z(video.mo10567x());
            video.mo10520G((long) duration());
        }
        return arrayList;
    }

    public final int getVolume() {
        return this.mVolume;
    }

    public final void initAudioFocusWrapper(Context context) {
        C8594l.m46771e(context, "context");
        if (this.mAudioFocusWrapper == null) {
            AudioAttributesCompat.C0724a aVar = new AudioAttributesCompat.C0724a();
            aVar.mo4278b(2);
            aVar.mo4280d(1);
            AudioAttributesCompat a = aVar.mo4277a();
            Object systemService = context.getSystemService("audio");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.mAudioManager = (AudioManager) systemService;
            C8594l.m46770d(a, "audioAttributes");
            AudioManager audioManager = this.mAudioManager;
            if (audioManager != null) {
                this.mAudioFocusWrapper = new AudioFocusWrapper(a, audioManager, this.mOnAudioFocusListener);
            } else {
                C8594l.m46783q("mAudioManager");
                throw null;
            }
        }
    }

    public final void initFloatWindow(Context context, View view, C6700a aVar) {
        if (this.mFloatWindow == null) {
            synchronized (FloatWindow.class) {
                if (this.mFloatWindow == null) {
                    this.mFloatWindow = new FloatWindow(context, view, aVar);
                }
                C8457t tVar = C8457t.f34900a;
            }
        }
    }

    public final C6607f initRelationAssist(Context context) {
        C6734a F;
        C8594l.m46771e(context, "context");
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25877w();
        }
        C6615b.m38166i(100);
        C6607f fVar2 = new C6607f(context);
        this.mRelationAssist = fVar2;
        if (!(fVar2 == null || (F = fVar2.mo25865F()) == null)) {
            F.setBackgroundColor(-16777216);
        }
        return this.mRelationAssist;
    }

    public final int isAppType() {
        return this.isAppType;
    }

    public final boolean isAudioPlay() {
        return this.isAudioPlay;
    }

    public final boolean isInPlaybackState() {
        C6607f fVar = this.mRelationAssist;
        if (fVar == null) {
            return false;
        }
        return fVar.mo25839d();
    }

    public final boolean isMusicPlaying() {
        return this.isMusicPlaying;
    }

    public final boolean isMute() {
        return this.isMute;
    }

    public final boolean isNetworkStream() {
        return this.isNetworkStream;
    }

    public final boolean isPlaying() {
        C6607f fVar = this.mRelationAssist;
        if (fVar == null) {
            return false;
        }
        return fVar.mo25866H();
    }

    public final void isRestore(boolean z) {
        this.isRestoreWindow = z;
    }

    public final boolean isShowPlayListBtn() {
        return this.isShowPlayListBtn;
    }

    public final boolean isWindowShow() {
        FloatWindow floatWindow = this.mFloatWindow;
        if (floatWindow != null) {
            C8594l.m46769c(floatWindow);
            if (floatWindow.isWindowShow()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isWindows() {
        return this.isWindows;
    }

    public final void pause() {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25835Q();
        }
    }

    public final void play(boolean z) {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25867N(z);
        }
    }

    public final void playNext(boolean z) {
        if (!this.mDataSourceList.isEmpty() && getPlayDataSource() != null) {
            if (this.mPlayMode == 1 || this.mPlayPosition < this.mDataSourceList.size() - 1) {
                savePlayTimeMs(this.mVideoList.get(this.mPlayPosition), z);
                int i = this.mPlayMode;
                if (i != 1) {
                    if (i != 3) {
                        this.mPlayPosition++;
                    } else {
                        this.mPlayPosition = RandRomUitls.INSTANCE.getRandRomNum(this.mDataSourceList.size() - 1);
                    }
                } else if (this.mPlayPosition >= this.mDataSourceList.size() - 1) {
                    this.mPlayPosition = 0;
                } else {
                    this.mPlayPosition++;
                }
                this.mSpeed = 1.0f;
                stop();
                C6607f fVar = this.mRelationAssist;
                if (fVar != null) {
                    fVar.mo25841f(getPlayDataSource());
                }
                saveVideoInfo();
                new Handler(Looper.getMainLooper()).post(new C2546k(this));
                return;
            }
            Toast.makeText(this.mApplicationContext, C2520R.string.coocent_video_no_next_video, 0).show();
        }
    }

    public final void playPrevious() {
        if (!this.mDataSourceList.isEmpty() && getPlayDataSource() != null) {
            int i = this.mPlayMode;
            if (i == 3 || i == 1 || (this.mPlayPosition != 0 && this.mDataSourceList.size() > 1)) {
                savePlayTimeMs(this.mVideoList.get(this.mPlayPosition), false);
                int i2 = this.mPlayMode;
                if (i2 != 1) {
                    if (i2 != 3) {
                        this.mPlayPosition--;
                    } else {
                        this.mPlayPosition = RandRomUitls.INSTANCE.getRandRomNum(this.mDataSourceList.size() - 1);
                    }
                } else if (this.mDataSourceList.size() <= 1) {
                    this.mPlayPosition = 0;
                } else {
                    int i3 = this.mPlayPosition;
                    if (i3 == 0) {
                        this.mPlayPosition = this.mDataSourceList.size() - 1;
                    } else {
                        this.mPlayPosition = i3 - 1;
                    }
                }
                this.mSpeed = 1.0f;
                stop();
                C6607f fVar = this.mRelationAssist;
                if (fVar != null) {
                    fVar.mo25841f(getPlayDataSource());
                }
                saveVideoInfo();
                new Handler(Looper.getMainLooper()).post(new C2544i(this));
                return;
            }
            Toast.makeText(this.mApplicationContext, C2520R.string.coocent_video_no_previous_video, 0).show();
        }
    }

    public final void rePlay(int i) {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25840e(i);
        }
    }

    public final void reVideoTitle(Video video, String str) {
        C8594l.m46771e(video, "reVideo");
        C8594l.m46771e(str, "title");
        int size = this.mVideoList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (video.mo10553l() == this.mVideoList.get(i).mo10553l()) {
                    this.mVideoList.get(i).mo10538a0(str);
                    this.mVideoList.get(i).mo10519F(str + '.' + video.mo10548h());
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        for (C6618a next : this.mDataSourceList) {
            if (C8594l.m46767a(video.mo10565w(), next.getTitle())) {
                next.setTitle(str);
            }
        }
        if (isWindows()) {
            updateDataSource();
        }
    }

    public final void release() {
        this.mVideoList.clear();
        this.mDataSourceList.clear();
        releaseEq();
        instance = null;
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25877w();
        }
        C6607f fVar2 = this.mRelationAssist;
        if (fVar2 != null) {
            fVar2.mo25872U((C6638e) null);
        }
        C6607f fVar3 = this.mRelationAssist;
        if (fVar3 != null) {
            fVar3.mo25873V((C6673k) null);
        }
        C6607f fVar4 = this.mRelationAssist;
        if (fVar4 != null) {
            fVar4.mo25869R((C6604c) null);
        }
        this.mRelationAssist = null;
    }

    public final void releaseBassBoost() {
        BassBoost bassBoost = this.mBassBoost;
        if (bassBoost != null) {
            bassBoost.setEnabled(false);
            bassBoost.release();
            this.mBassBoost = null;
        }
    }

    public final void releaseEq() {
        try {
            releaseEqualizer();
            releasePresetReverb();
            releaseBassBoost();
            releaseVirtualizer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void releaseEqualizer() {
        Equalizer equalizer = this.mEqualizer;
        if (equalizer != null) {
            equalizer.setEnabled(false);
            equalizer.release();
            this.mEqualizer = null;
        }
    }

    public final void releasePresetReverb() {
        PresetReverb presetReverb = this.mPresetReverb;
        if (presetReverb != null) {
            presetReverb.setEnabled(false);
            presetReverb.release();
            this.mPresetReverb = null;
        }
    }

    public final void releaseVirtualizer() {
        Virtualizer virtualizer = this.mVirtualizer;
        if (virtualizer != null) {
            virtualizer.setEnabled(false);
            virtualizer.release();
            this.mVirtualizer = null;
        }
    }

    public final void removeVideo(Video video) {
        C8594l.m46771e(video, "video");
        removeVideo(this.mVideoList.indexOf(video));
    }

    public final void removeVideoToStart(int i, int i2) {
        if (i == i2 && getPlayDataSource() != null) {
            this.mSpeed = 1.0f;
            if (!getDataSources().isEmpty()) {
                new Handler(Looper.getMainLooper()).post(new C2542g(this));
            }
        }
    }

    public final C6723b render() {
        C6607f fVar = this.mRelationAssist;
        C8594l.m46769c(fVar);
        C6723b D = fVar.mo25863D();
        C8594l.m46770d(D, "mRelationAssist!!.render");
        return D;
    }

    public final void requestAudioFocus() {
        AudioFocusWrapper audioFocusWrapper = this.mAudioFocusWrapper;
        if (audioFocusWrapper != null) {
            audioFocusWrapper.requestAudioFocus();
        }
    }

    public final void reset() {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25836a();
        }
    }

    public final void resume() {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25837b();
        }
    }

    public final void savePlayTimeMs(boolean z) {
        if (this.mPlayPosition < this.mVideoList.size() && (!this.mVideoList.isEmpty())) {
            savePlayTimeMs(this.mVideoList.get(this.mPlayPosition), z);
        }
    }

    public final void saveVideoInfo() {
        if (this.mPlayPosition < this.mVideoList.size() && (!this.mVideoList.isEmpty())) {
            saveLastPlaybackTime(this.mVideoList.get(this.mPlayPosition), System.currentTimeMillis());
            savePlayingVideoIdAndPath(this.mVideoList.get(this.mPlayPosition));
        }
    }

    public final void seekTo(int i) {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25838c(i);
        }
    }

    public final void setAspectRatio(C6722a aVar) {
        C8594l.m46771e(aVar, "ratio");
        this.mAspectRatio = aVar;
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25868P(aVar);
        }
    }

    public final void setBassBoostEnable(boolean z) {
        BassBoost bassBoost = this.mBassBoost;
        if (bassBoost != null && bassBoost != null) {
            bassBoost.setEnabled(z);
        }
    }

    public final void setDataSource(C6618a aVar) {
        C8594l.m46771e(aVar, "mDataSource");
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25841f(aVar);
        }
    }

    public final void setDataSourceList(C6618a aVar) {
        C8594l.m46771e(aVar, "dataSource");
        this.mDataSourceList.clear();
        this.mDataSourceList.add(aVar);
    }

    public final void setDragEnable(boolean z) {
        FloatWindow floatWindow = this.mFloatWindow;
        if (floatWindow != null) {
            floatWindow.setDragEnable(z);
        }
    }

    public final void setEqEnable(boolean z, int i, String str, int i2, int i3, int i4) {
        C8594l.m46771e(str, "equalizerValue");
        if (this.mEqEnable != z) {
            if (z) {
                releaseEq();
                String[] split = TextUtils.split(str, ", ");
                C8594l.m46770d(split, "split(equalizerValue, \", \")");
                int length = split.length;
                for (int i5 = 0; i5 < length; i5++) {
                    String str2 = split[i5];
                    C8594l.m46770d(str2, "value");
                    updateEqualizer(i, (short) i5, (short) (Integer.parseInt(str2) * 100));
                }
                updatePresetReverb(i, (short) i2);
                updateBassBoost(i, (short) i3);
                updateVirtualizer(i, (short) i4);
            } else {
                setEqualizerEnable(false);
                setVirtualizerEnable(false);
                setBassBoostEnable(false);
                setPresetReverbEnable(false);
            }
            this.mEqEnable = z;
        }
    }

    public final void setEqualizerEnable(boolean z) {
        Equalizer equalizer = this.mEqualizer;
        if (equalizer != null && equalizer != null) {
            equalizer.setEnabled(z);
        }
    }

    public final void setEventAssistHandler(C6604c cVar) {
        C8594l.m46771e(cVar, "onEventAssistHandler");
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25869R(cVar);
        }
    }

    public final void setFloatingWindow(FloatWindow floatWindow) {
        C8594l.m46771e(floatWindow, "mFloatingWindow");
        this.mFloatWindow = floatWindow;
    }

    public final void setLooping(boolean z) {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25870S(z);
        }
    }

    public final void setOnErrorEventListener(C6637d dVar) {
        C8594l.m46771e(dVar, "onErrorEventListener");
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25871T(dVar);
        }
    }

    public final void setOnPlayerEventListener(C6638e eVar) {
        C8594l.m46771e(eVar, "onPlayerEventListener");
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25872U(eVar);
        }
    }

    public final void setOnReceiverEventListener(C6673k kVar) {
        C8594l.m46771e(kVar, "mOnReceiverEventListener");
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25873V(kVar);
        }
    }

    public final void setPlayMode(int i) {
        this.mPlayMode = i;
    }

    public final void setPlayPosition(int i) {
        this.mPlayPosition = i;
    }

    public final void setPresetReverbEnable(boolean z) {
        PresetReverb presetReverb = this.mPresetReverb;
        if (presetReverb != null && presetReverb != null) {
            presetReverb.setEnabled(z);
        }
    }

    public final void setReceiverGroup(C6675m mVar) {
        C8594l.m46771e(mVar, "mReceiverGroup");
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25874W(mVar);
        }
    }

    public final void setSleepMode(int i) {
        this.mSleepMode = i;
    }

    public final void setSleepTime(long j) {
        this.mSleepTime = j;
    }

    public final void setSpeed(float f) {
        C6607f fVar;
        this.mSpeed = f;
        if (Build.VERSION.SDK_INT >= 23 && (fVar = this.mRelationAssist) != null) {
            fVar.mo25875X(f);
        }
    }

    public final void setStreamVolume(int i, int i2, int i3) {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            audioManager.setStreamVolume(i, i2, i3);
        } else {
            C8594l.m46783q("mAudioManager");
            throw null;
        }
    }

    public final void setVideoList(List<? extends Video> list) {
        C8594l.m46771e(list, "videoList");
        this.mVideoList.clear();
        this.mVideoList.addAll(list);
        this.mDataSourceList.clear();
        for (Video next : this.mVideoList) {
            C6618a aVar = new C6618a();
            aVar.setUri(Uri.parse(next.mo10567x()));
            aVar.setTitle(next.mo10565w());
            aVar.setStartPos((int) next.mo10559r());
            this.mDataSourceList.add(aVar);
        }
    }

    public final void setVirtualizerEnable(boolean z) {
        Virtualizer virtualizer = this.mVirtualizer;
        if (virtualizer != null && virtualizer != null) {
            virtualizer.setEnabled(z);
        }
    }

    public final void setVolume(int i) {
        this.mVolume = i;
    }

    public final void setWindows(boolean z) {
        this.isWindows = z;
    }

    public final boolean showAudioBtn() {
        return this.isShowAudioBtn;
    }

    public final void showFloatWindow() {
        FloatWindow floatWindow = this.mFloatWindow;
        if (floatWindow != null) {
            floatWindow.show();
        }
    }

    public final boolean showWindowBtn() {
        return this.isShowWindowBtn;
    }

    public final void starPlayOnPosition(int i, boolean z) {
        if (getPlayDataSource() != null && !this.mDataSourceList.isEmpty() && !this.mVideoList.isEmpty() && i >= 0 && i < this.mDataSourceList.size()) {
            savePlayTimeMs(this.mVideoList.get(this.mPlayPosition), z);
            this.mSpeed = 1.0f;
            this.mPlayPosition = i;
            C6607f fVar = this.mRelationAssist;
            if (fVar != null) {
                fVar.mo25841f(getPlayDataSource());
            }
            saveVideoInfo();
            new Handler(Looper.getMainLooper()).post(new C2539d(this));
        }
    }

    public final void start() {
        if (getPlayDataSource() != null) {
            this.mSpeed = 1.0f;
            if (!getDataSources().isEmpty()) {
                stop();
                new Handler(Looper.getMainLooper()).postDelayed(new C2541f(this), 200);
            }
        }
    }

    public final void startPlay(Collection<? extends Video> collection, int i, boolean z) {
        C6607f fVar;
        C8594l.m46771e(collection, "videoList");
        List list = (List) collection;
        if (!this.mDataSourceList.isEmpty() && getPlayDataSource() != null) {
            Uri parse = Uri.parse(((Video) list.get(i)).mo10567x());
            C6618a playDataSource = getPlayDataSource();
            if (!C8594l.m46767a(parse, playDataSource == null ? null : playDataSource.getUri()) || z) {
                this.mSpeed = 1.0f;
                savePlayTimeMs(this.mVideoList.get(this.mPlayPosition), false);
                setVideoList(list);
                this.mPlayPosition = i;
                C6607f fVar2 = this.mRelationAssist;
                if (fVar2 != null) {
                    fVar2.mo25841f(getPlayDataSource());
                }
                saveVideoInfo();
                new Handler(Looper.getMainLooper()).post(new C2545j(this));
            } else if (!isPlaying() && (fVar = this.mRelationAssist) != null) {
                fVar.mo25837b();
            }
        }
    }

    public final void startPlayOnVideo(Video video) {
        int indexOf;
        C8594l.m46771e(video, "video");
        if (!this.mDataSourceList.isEmpty() && !this.mVideoList.isEmpty() && (indexOf = this.mVideoList.indexOf(video)) != -1) {
            savePlayTimeMs(this.mVideoList.get(this.mPlayPosition), false);
            this.mSpeed = 1.0f;
            this.mPlayPosition = indexOf;
            C6607f fVar = this.mRelationAssist;
            if (fVar != null) {
                fVar.mo25841f(getPlayDataSource());
            }
            saveVideoInfo();
            new Handler(Looper.getMainLooper()).post(new C2537b(this));
        }
    }

    public final void stop() {
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.stop();
        }
    }

    public final void updateBassBoost(int i, short s) {
        try {
            if (this.mBassBoost == null) {
                this.mBassBoost = new BassBoost(0, i);
            }
            BassBoost bassBoost = this.mBassBoost;
            if (bassBoost != null) {
                bassBoost.setStrength(s);
            }
            BassBoost bassBoost2 = this.mBassBoost;
            if (bassBoost2 != null) {
                bassBoost2.setEnabled(true);
            }
        } catch (Exception e) {
            releaseBassBoost();
            e.printStackTrace();
        }
    }

    public final void updateEqualizer(int i, short s, short s2) {
        try {
            if (this.mEqualizer == null) {
                this.mEqualizer = new Equalizer(0, i);
            }
            Equalizer equalizer = this.mEqualizer;
            if (equalizer != null) {
                equalizer.setBandLevel(s, s2);
            }
            Equalizer equalizer2 = this.mEqualizer;
            if (equalizer2 != null) {
                equalizer2.setEnabled(true);
            }
        } catch (Exception e) {
            releaseEqualizer();
            e.printStackTrace();
        }
    }

    public final void updateIsEncrypted(Video video) {
        C8594l.m46771e(video, "video");
        C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new PlayerHelper$updateIsEncrypted$1(video, this, (C8508d<? super PlayerHelper$updateIsEncrypted$1>) null), 2, (Object) null);
    }

    public final void updateLastPlaybackTime(Video video, long j) {
        C8594l.m46771e(video, "video");
        C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new PlayerHelper$updateLastPlaybackTime$1(this, video, j, (C8508d<? super PlayerHelper$updateLastPlaybackTime$1>) null), 2, (Object) null);
    }

    public final void updatePresetReverb(int i, short s) {
        try {
            if (this.mPresetReverb == null) {
                this.mPresetReverb = new PresetReverb(0, i);
            }
            PresetReverb presetReverb = this.mPresetReverb;
            if (presetReverb != null) {
                presetReverb.setPreset(s);
            }
            PresetReverb presetReverb2 = this.mPresetReverb;
            if (presetReverb2 != null) {
                presetReverb2.setEnabled(true);
            }
        } catch (Exception e) {
            releasePresetReverb();
            e.printStackTrace();
        }
    }

    public final void updateVirtualizer(int i, short s) {
        try {
            if (this.mVirtualizer == null) {
                this.mVirtualizer = new Virtualizer(0, i);
            }
            Virtualizer virtualizer = this.mVirtualizer;
            C8594l.m46769c(virtualizer);
            virtualizer.setStrength(s);
            Virtualizer virtualizer2 = this.mVirtualizer;
            C8594l.m46769c(virtualizer2);
            virtualizer2.setEnabled(true);
        } catch (Exception e) {
            releaseVirtualizer();
            e.printStackTrace();
        }
    }

    public final void updateWindowViewLayoutSize(int i, int i2) {
        FloatWindow floatWindow = this.mFloatWindow;
        if (floatWindow != null) {
            floatWindow.updateWindowViewLayoutSize(i, i2);
        }
    }

    public static /* synthetic */ void savePlayTimeMs$default(PlayerHelper playerHelper, Video video, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        playerHelper.savePlayTimeMs(video, z);
    }

    public static /* synthetic */ void startPlay$default(PlayerHelper playerHelper, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        playerHelper.startPlay(z);
    }

    public final void isAppType(int i) {
        this.isAppType = i;
    }

    public final void isAudioPlay(boolean z) {
        this.isAudioPlay = z;
    }

    public final void isMusicPlaying(boolean z) {
        this.isMusicPlaying = z;
    }

    public final void isMute(boolean z) {
        this.isMute = z;
    }

    public final void isNetworkStream(boolean z) {
        this.isNetworkStream = z;
    }

    public final boolean isRestore() {
        return this.isRestoreWindow;
    }

    public final void isShowPlayListBtn(boolean z) {
        this.isShowPlayListBtn = z;
    }

    public final void savePlayingVideoIdAndPath(boolean z) {
        C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new PlayerHelper$savePlayingVideoIdAndPath$2(this, z, (C8508d<? super PlayerHelper$savePlayingVideoIdAndPath$2>) null), 2, (Object) null);
    }

    public final void showAudioBtn(boolean z) {
        this.isShowAudioBtn = z;
    }

    public final void showWindowBtn(boolean z) {
        this.isShowWindowBtn = z;
    }

    public final void removeVideo(int i) {
        int i2 = this.mPlayMode;
        if (i2 == 0) {
            int i3 = this.mPlayPosition;
            if (i == i3) {
                if (i == this.mVideoList.size() - 1) {
                    this.mVideoList.remove(i);
                    this.mDataSourceList.remove(i);
                    this.mPlayPosition = 0;
                    return;
                }
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
            } else if (i < i3) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
                this.mPlayPosition--;
            } else if (i > i3) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
            }
        } else if (i2 == 1) {
            int i4 = this.mPlayPosition;
            if (i == i4) {
                if (i == this.mVideoList.size() - 1) {
                    this.mVideoList.remove(i);
                    this.mDataSourceList.remove(i);
                    this.mPlayPosition = 0;
                    return;
                }
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
            } else if (i < i4) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
                this.mPlayPosition--;
            } else if (i > i4) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
            }
        } else if (i2 == 2) {
            int i5 = this.mPlayPosition;
            if (i == i5) {
                if (i == this.mVideoList.size() - 1) {
                    this.mVideoList.remove(i);
                    this.mDataSourceList.remove(i);
                    this.mPlayPosition = 0;
                    return;
                }
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
            } else if (i < i5) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
                this.mPlayPosition--;
            } else if (i > i5) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
            }
        } else if (i2 == 3) {
            int i6 = this.mPlayPosition;
            if (i == i6) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
                this.mPlayPosition = RandRomUitls.INSTANCE.getRandRomNum(this.mVideoList.size() - 1);
            } else if (i < i6) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
                int i7 = this.mPlayPosition;
                this.mPlayPosition = i7 - 1;
                this.mPlayPosition = i7;
            } else if (i > i6) {
                this.mVideoList.remove(i);
                this.mDataSourceList.remove(i);
            }
        }
    }

    public final void savePlayTimeMs(Video video, boolean z) {
        long j;
        C8594l.m46771e(video, "video");
        if (this.mPlayPosition < this.mDataSourceList.size() && (!this.mDataSourceList.isEmpty())) {
            if (z) {
                j = 0;
            } else {
                j = (long) currentPosition();
            }
            long j2 = j;
            this.mDataSourceList.get(this.mPlayPosition).setStartPos((int) j2);
            C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new PlayerHelper$savePlayTimeMs$1(this, video, j2, (C8508d<? super PlayerHelper$savePlayTimeMs$1>) null), 2, (Object) null);
        }
    }

    public final void removeVideoToStart(Video video, List<Video> list) {
        C8594l.m46771e(list, "removeVideos");
        boolean z = false;
        for (Video next : list) {
            if (video != null && video.mo10553l() == next.mo10553l()) {
                z = true;
            }
        }
        if (z && getPlayDataSource() != null) {
            this.mSpeed = 1.0f;
            if (!getDataSources().isEmpty()) {
                new Handler(Looper.getMainLooper()).post(new C2540e(this));
            }
        }
    }

    public final void startPlay(C6618a aVar) {
        C8594l.m46771e(aVar, "dataSource");
        this.mPlayPosition = 0;
        C6607f fVar = this.mRelationAssist;
        if (fVar != null) {
            fVar.mo25841f(aVar);
        }
        this.mSpeed = 1.0f;
        new Handler(Looper.getMainLooper()).post(new C2543h(this));
    }

    public final void startPlay(boolean z) {
        if (!this.mDataSourceList.isEmpty() && !this.mVideoList.isEmpty()) {
            this.mSpeed = 1.0f;
            C6607f fVar = this.mRelationAssist;
            if (fVar != null) {
                fVar.mo25841f(getPlayDataSource());
            }
            C6607f fVar2 = this.mRelationAssist;
            if (fVar2 != null) {
                fVar2.mo25867N(z);
            }
            updateDataSource();
        }
    }
}
