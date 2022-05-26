package com.coocent.videoplayer;

import android.app.Application;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.IBinder;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import androidx.core.app.C0466a;
import androidx.core.content.C0506a;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import com.coocent.video.videoplayercore.ConsantsKt;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.video.videoplayercore.utils.RomUtils;
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.coocent.videoplayer.p060r.C2720j;
import com.coocent.videoplayer.p061s.C2724d;
import com.coocent.videoplayer.p062t.p063a.C2729d;
import com.coocent.videoplayer.p062t.p063a.C2734e;
import com.coocent.videoplayer.p062t.p063a.C2736f;
import com.coocent.videoplayer.p062t.p063a.C2737g;
import com.coocent.videoplayer.p062t.p065c.C2755i;
import com.coocent.videoplayer.p062t.p065c.C2763j;
import com.coocent.videoplayer.p062t.p065c.C2768k;
import com.coocent.videostore.p067po.Video;
import com.p256kk.taurus.playerbase.p257a.C6604c;
import com.p256kk.taurus.playerbase.p258b.C6616c;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p260d.C6638e;
import com.p256kk.taurus.playerbase.p263g.C6665g;
import com.p256kk.taurus.playerbase.p263g.C6673k;
import com.p256kk.taurus.playerbase.p263g.C6675m;
import com.p256kk.taurus.playerbase.p268l.C6700a;
import com.p256kk.taurus.playerbase.render.C6722a;
import com.un4seen.bass.BASS;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.C8912t1;
import p159f.p166c.p176c.C4326a;
import p159f.p166c.p210i.p211a.p212f.C4588a;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8605w;

/* compiled from: VideoPlayerActivity.kt */
public final class VideoPlayerActivity extends AppCompatActivity implements C2755i.C2757b, C2763j.C2765b, C2768k.C2770b {

    /* renamed from: Z */
    public static final C2684a f9179Z = new C2684a((C8589g) null);

    /* renamed from: A */
    private C2697g f9180A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public PlayerHelper f9181B;

    /* renamed from: C */
    private SharedPreferences f9182C;

    /* renamed from: D */
    private C4613a f9183D;

    /* renamed from: E */
    private C8665a2 f9184E;

    /* renamed from: F */
    private CountDownTimer f9185F;

    /* renamed from: G */
    private long f9186G;

    /* renamed from: H */
    private int f9187H;

    /* renamed from: I */
    private boolean f9188I;

    /* renamed from: J */
    private boolean f9189J;

    /* renamed from: K */
    private FrameLayout f9190K;

    /* renamed from: L */
    private int f9191L;

    /* renamed from: M */
    private int f9192M;

    /* renamed from: N */
    private int f9193N;

    /* renamed from: O */
    private int f9194O;

    /* renamed from: P */
    private C6700a f9195P;

    /* renamed from: Q */
    private C2720j f9196Q;

    /* renamed from: R */
    private FrameLayout f9197R;

    /* renamed from: S */
    private boolean f9198S;

    /* renamed from: T */
    private C6675m f9199T;

    /* renamed from: U */
    private C2768k f9200U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public AudioPlayService f9201V;

    /* renamed from: W */
    private ServiceConnection f9202W;

    /* renamed from: X */
    private C6638e f9203X;

    /* renamed from: Y */
    private final C6673k f9204Y;

    /* renamed from: z */
    private C4815n f9205z;

    /* renamed from: com.coocent.videoplayer.VideoPlayerActivity$a */
    /* compiled from: VideoPlayerActivity.kt */
    public static final class C2684a {
        private C2684a() {
        }

        public /* synthetic */ C2684a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo10202a(Context context, VideoConfigBean videoConfigBean) {
            C8594l.m46771e(context, "context");
            C8594l.m46771e(videoConfigBean, "build");
            PlayerHelper.Companion companion = PlayerHelper.Companion;
            Context applicationContext = context.getApplicationContext();
            C8594l.m46770d(applicationContext, "context.applicationContext");
            PlayerHelper instance = companion.getInstance(applicationContext);
            instance.isNetworkStream(videoConfigBean.mo10217g());
            instance.showAudioBtn(videoConfigBean.mo10218h());
            instance.showWindowBtn(videoConfigBean.mo10220j());
            instance.isMusicPlaying(videoConfigBean.mo10216f());
            instance.isAppType(videoConfigBean.mo10215e());
            instance.isShowPlayListBtn(videoConfigBean.mo10219i());
            if (instance.isWindows()) {
                PlayerHelper.startPlay$default(instance, videoConfigBean.mo10211a(), videoConfigBean.mo10212b(), false, 4, (Object) null);
            } else if (instance.isAudioPlay()) {
                context.sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_EXIT()));
                PlayerHelper.startPlay$default(instance, videoConfigBean.mo10211a(), videoConfigBean.mo10212b(), false, 4, (Object) null);
                Intent intent = new Intent(context.getApplicationContext(), VideoPlayerActivity.class);
                intent.addFlags(268435456);
                context.startActivity(intent);
            } else {
                instance.setVideoList(videoConfigBean.mo10211a());
                instance.setPlayPosition(videoConfigBean.mo10212b());
                instance.initRelationAssist(context);
                if (videoConfigBean.mo10215e() != 1 || !(context instanceof AppCompatActivity)) {
                    context.startActivity(new Intent(context, VideoPlayerActivity.class));
                    return;
                }
                instance.setLooping(true);
                instance.setPlayMode(2);
                ((AppCompatActivity) context).startActivityForResult(new Intent(context, VideoPlayerActivity.class), ConsantsKt.MUSIC_SEND_INTENT_CODE);
            }
        }
    }

    /* renamed from: com.coocent.videoplayer.VideoPlayerActivity$b */
    /* compiled from: VideoPlayerActivity.kt */
    public static final class C2685b implements ServiceConnection {

        /* renamed from: g */
        final /* synthetic */ VideoPlayerActivity f9206g;

        C2685b(VideoPlayerActivity videoPlayerActivity) {
            this.f9206g = videoPlayerActivity;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Objects.requireNonNull(iBinder, "null cannot be cast to non-null type com.coocent.video.videoplayercore.service.AudioPlayService.AudioBinder");
            this.f9206g.f9201V = ((AudioPlayService.AudioBinder) iBinder).getService();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f9206g.f9201V = null;
        }
    }

    /* renamed from: com.coocent.videoplayer.VideoPlayerActivity$c */
    /* compiled from: VideoPlayerActivity.kt */
    public static final class C2686c extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ VideoPlayerActivity f9207a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2686c(VideoPlayerActivity videoPlayerActivity, long j) {
            super(j, 1000);
            this.f9207a = videoPlayerActivity;
        }

        public void onFinish() {
            PlayerHelper e2 = this.f9207a.f9181B;
            if (e2 != null) {
                e2.saveVideoInfo();
                this.f9207a.m12204l2();
                return;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }

        public void onTick(long j) {
            PlayerHelper e2 = this.f9207a.f9181B;
            if (e2 != null) {
                e2.setSleepTime(j);
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
    }

    @C8533f(mo30599c = "com.coocent.videoplayer.VideoPlayerActivity$takeScreenShot$1$1", mo30600f = "VideoPlayerActivity.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videoplayer.VideoPlayerActivity$d */
    /* compiled from: VideoPlayerActivity.kt */
    static final class C2687d extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        int label;
        final /* synthetic */ VideoPlayerActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2687d(VideoPlayerActivity videoPlayerActivity, Bitmap bitmap, C8508d<? super C2687d> dVar) {
            super(2, dVar);
            this.this$0 = videoPlayerActivity;
            this.$bitmap = bitmap;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2687d(this.this$0, this.$bitmap, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2687d) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                this.this$0.m12218z2(this.$bitmap);
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C8533f(mo30599c = "com.coocent.videoplayer.VideoPlayerActivity$takeScreenShot$2", mo30600f = "VideoPlayerActivity.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videoplayer.VideoPlayerActivity$e */
    /* compiled from: VideoPlayerActivity.kt */
    static final class C2688e extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ VideoPlayerActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2688e(VideoPlayerActivity videoPlayerActivity, C8508d<? super C2688e> dVar) {
            super(2, dVar);
            this.this$0 = videoPlayerActivity;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2688e(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2688e) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                VideoPlayerActivity videoPlayerActivity = this.this$0;
                PlayerHelper e2 = videoPlayerActivity.f9181B;
                if (e2 != null) {
                    videoPlayerActivity.m12218z2(((TextureView) e2.render()).getBitmap());
                    return C8457t.f34900a;
                }
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public VideoPlayerActivity() {
        C4616c a = C4615b.m20080a();
        this.f9183D = a == null ? null : a.mo15370a();
        this.f9186G = -1;
        this.f9199T = new C6675m();
        this.f9202W = new C2685b(this);
        this.f9203X = new C2694d(this);
        this.f9204Y = new C2693c(this);
    }

    /* renamed from: A2 */
    private final void m12188A2() {
        C4613a aVar = this.f9183D;
        boolean z = false;
        if (aVar != null && aVar.mo15357c() == 1) {
            z = true;
        }
        if (z) {
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper != null) {
                Video video = playerHelper.getVideo();
                if (video != null) {
                    PlayerHelper playerHelper2 = this.f9181B;
                    if (playerHelper2 != null) {
                        video.mo10531U((long) playerHelper2.currentPosition());
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                }
                Intent intent = new Intent();
                intent.putExtra(ConsantsKt.MUSIC_SEND_INTENT_NAME, video);
                PlayerHelper playerHelper3 = this.f9181B;
                if (playerHelper3 != null) {
                    intent.putExtra(ConsantsKt.MUSIC_SEND_INTENT_NAME_IS_PLAYING, playerHelper3.isPlaying());
                    setResult(-1, intent);
                    return;
                }
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    /* renamed from: B2 */
    private final void m12189B2() {
        boolean z = true;
        boolean z2 = TextUtils.equals(getIntent().getAction(), "android.intent.action.VIEW") && getIntent().getData() != null;
        this.f9198S = z2;
        if (z2) {
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper != null) {
                playerHelper.initRelationAssist(this);
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
        this.f9199T.mo26014g("controller_cover", new C2729d(this));
        this.f9199T.mo26014g("gesture_cover", new C2734e(this));
        this.f9199T.mo26014g("loading_cover", new C2736f(this));
        C6665g a = this.f9199T.mo26005a();
        PlayerHelper playerHelper2 = this.f9181B;
        if (playerHelper2 != null) {
            if (playerHelper2.getVolume() > 0) {
                z = false;
            }
            a.mo26001h("mute", z);
            this.f9199T.mo26005a().mo26001h("show_forward_rewind", this.f9198S);
            C6665g a2 = this.f9199T.mo26005a();
            PlayerHelper playerHelper3 = this.f9181B;
            if (playerHelper3 != null) {
                a2.mo26001h("playing", playerHelper3.isPlaying());
                this.f9199T.mo26005a().mo26001h("move_screen", false);
                PlayerHelper playerHelper4 = this.f9181B;
                if (playerHelper4 != null) {
                    C6618a playDataSource = playerHelper4.getPlayDataSource();
                    if (playDataSource != null) {
                        this.f9199T.mo26005a().mo26002i(ConsantsKt.KEY_DATA_SOURCE, playDataSource);
                    }
                    C6665g a3 = this.f9199T.mo26005a();
                    PlayerHelper playerHelper5 = this.f9181B;
                    if (playerHelper5 != null) {
                        a3.mo26001h("show_window", playerHelper5.showWindowBtn());
                        C6665g a4 = this.f9199T.mo26005a();
                        PlayerHelper playerHelper6 = this.f9181B;
                        if (playerHelper6 != null) {
                            a4.mo26001h("show_audio", playerHelper6.showAudioBtn());
                            C6665g a5 = this.f9199T.mo26005a();
                            PlayerHelper playerHelper7 = this.f9181B;
                            if (playerHelper7 != null) {
                                a5.mo26001h("show_play_list", playerHelper7.isShowPlayListBtn());
                                PlayerHelper playerHelper8 = this.f9181B;
                                if (playerHelper8 != null) {
                                    playerHelper8.setReceiverGroup(this.f9199T);
                                    PlayerHelper playerHelper9 = this.f9181B;
                                    if (playerHelper9 != null) {
                                        playerHelper9.setOnPlayerEventListener(this.f9203X);
                                        PlayerHelper playerHelper10 = this.f9181B;
                                        if (playerHelper10 != null) {
                                            playerHelper10.setOnReceiverEventListener(this.f9204Y);
                                            PlayerHelper playerHelper11 = this.f9181B;
                                            if (playerHelper11 != null) {
                                                playerHelper11.setEventAssistHandler(new C6604c());
                                            } else {
                                                C8594l.m46783q("mPlayerHelper");
                                                throw null;
                                            }
                                        } else {
                                            C8594l.m46783q("mPlayerHelper");
                                            throw null;
                                        }
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            } else {
                                C8594l.m46783q("mPlayerHelper");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
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

    /* renamed from: C2 */
    private final void m12190C2(boolean z) {
        if (!z) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                WindowInsetsController windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
                if (windowInsetsController != null) {
                    windowInsetsController.hide(WindowInsets.Type.systemBars());
                    return;
                }
                return;
            }
            getWindow().getDecorView().setSystemUiVisibility(i >= 19 ? 5894 : 1282);
        } else if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController2 = getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController2 != null) {
                windowInsetsController2.show(WindowInsets.Type.systemBars());
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1792);
        }
    }

    /* renamed from: D2 */
    private final void m12191D2() {
        if (!this.f9198S) {
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (playerHelper.isInPlaybackState()) {
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    playerHelper2.attachToContainer(this.f9197R);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else {
                PlayerHelper playerHelper3 = this.f9181B;
                if (playerHelper3 != null) {
                    playerHelper3.attachToContainer(this.f9197R);
                    PlayerHelper playerHelper4 = this.f9181B;
                    if (playerHelper4 != null) {
                        playerHelper4.start();
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
        } else if (C2724d.m12316a(this)) {
            Uri data = getIntent().getData();
            if (data != null) {
                C4815n nVar = this.f9205z;
                if (nVar != null) {
                    nVar.mo15562z(data);
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            }
        } else {
            C0466a.m2986m(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 1111);
        }
    }

    /* renamed from: E2 */
    private final void m12192E2() {
        Application application = getApplication();
        C8594l.m46770d(application, "application");
        C0696m0 a = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4814m(application)).mo4262a(C4815n.class);
        C8594l.m46770d(a, "ViewModelProvider(\n     …oreViewModel::class.java)");
        C4815n nVar = (C4815n) a;
        this.f9205z = nVar;
        if (nVar != null) {
            nVar.mo15559w().mo4149h(this, new C2695e(this));
        } else {
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m12193F2(VideoPlayerActivity videoPlayerActivity, Video video) {
        C8594l.m46771e(videoPlayerActivity, "this$0");
        videoPlayerActivity.f9199T.mo26005a().mo26001h("show_play_list", false);
        if (video == null) {
            PlayerHelper playerHelper = videoPlayerActivity.f9181B;
            if (playerHelper == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (playerHelper.isInPlaybackState()) {
                PlayerHelper playerHelper2 = videoPlayerActivity.f9181B;
                if (playerHelper2 != null) {
                    if (!playerHelper2.isWindows()) {
                        PlayerHelper playerHelper3 = videoPlayerActivity.f9181B;
                        if (playerHelper3 != null) {
                            playerHelper3.attachToContainer(videoPlayerActivity.f9197R);
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    }
                    C6618a aVar = new C6618a();
                    Uri data = videoPlayerActivity.getIntent().getData();
                    C8594l.m46769c(data);
                    aVar.setUri(data);
                    PlayerHelper playerHelper4 = videoPlayerActivity.f9181B;
                    if (playerHelper4 != null) {
                        playerHelper4.setDataSourceList(aVar);
                        PlayerHelper playerHelper5 = videoPlayerActivity.f9181B;
                        if (playerHelper5 != null) {
                            playerHelper5.startPlay(aVar);
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else {
                PlayerHelper playerHelper6 = videoPlayerActivity.f9181B;
                if (playerHelper6 != null) {
                    if (!playerHelper6.isWindows()) {
                        PlayerHelper playerHelper7 = videoPlayerActivity.f9181B;
                        if (playerHelper7 != null) {
                            playerHelper7.attachToContainer(videoPlayerActivity.f9197R);
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    }
                    C6618a aVar2 = new C6618a();
                    Uri data2 = videoPlayerActivity.getIntent().getData();
                    C8594l.m46769c(data2);
                    aVar2.setUri(data2);
                    PlayerHelper playerHelper8 = videoPlayerActivity.f9181B;
                    if (playerHelper8 != null) {
                        playerHelper8.setDataSourceList(aVar2);
                        PlayerHelper playerHelper9 = videoPlayerActivity.f9181B;
                        if (playerHelper9 != null) {
                            playerHelper9.startPlay(aVar2);
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
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
        } else {
            PlayerHelper playerHelper10 = videoPlayerActivity.f9181B;
            if (playerHelper10 != null) {
                playerHelper10.setVideoList(C8481k.m46661b(video));
                PlayerHelper playerHelper11 = videoPlayerActivity.f9181B;
                if (playerHelper11 == null) {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                } else if (playerHelper11.isInPlaybackState()) {
                    PlayerHelper playerHelper12 = videoPlayerActivity.f9181B;
                    if (playerHelper12 != null) {
                        if (!playerHelper12.isWindows()) {
                            PlayerHelper playerHelper13 = videoPlayerActivity.f9181B;
                            if (playerHelper13 != null) {
                                playerHelper13.attachToContainer(videoPlayerActivity.f9197R);
                            } else {
                                C8594l.m46783q("mPlayerHelper");
                                throw null;
                            }
                        }
                        PlayerHelper playerHelper14 = videoPlayerActivity.f9181B;
                        if (playerHelper14 != null) {
                            C6618a playDataSource = playerHelper14.getPlayDataSource();
                            if (playDataSource != null) {
                                PlayerHelper playerHelper15 = videoPlayerActivity.f9181B;
                                if (playerHelper15 != null) {
                                    playerHelper15.startPlay(playDataSource);
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
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
                } else {
                    PlayerHelper playerHelper16 = videoPlayerActivity.f9181B;
                    if (playerHelper16 != null) {
                        if (!playerHelper16.isWindows()) {
                            PlayerHelper playerHelper17 = videoPlayerActivity.f9181B;
                            if (playerHelper17 != null) {
                                playerHelper17.attachToContainer(videoPlayerActivity.f9197R);
                            } else {
                                C8594l.m46783q("mPlayerHelper");
                                throw null;
                            }
                        }
                        PlayerHelper playerHelper18 = videoPlayerActivity.f9181B;
                        if (playerHelper18 != null) {
                            C6618a playDataSource2 = playerHelper18.getPlayDataSource();
                            if (playDataSource2 != null) {
                                PlayerHelper playerHelper19 = videoPlayerActivity.f9181B;
                                if (playerHelper19 != null) {
                                    playerHelper19.startPlay(playDataSource2);
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
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
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
    }

    /* renamed from: G2 */
    private final void m12194G2() {
        if (System.currentTimeMillis() - this.f9186G < 500) {
            this.f9186G = System.currentTimeMillis();
            return;
        }
        Toast.makeText(this, C2708o.video_screen_shots_now, 0).show();
        if (Build.VERSION.SDK_INT >= 24) {
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (playerHelper.render() instanceof SurfaceView) {
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    SurfaceView surfaceView = (SurfaceView) playerHelper2.render();
                    Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    PixelCopy.request(surfaceView, createBitmap, new C2696f(this, createBitmap), surfaceView.getHandler());
                    return;
                }
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
        this.f9184E = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47303c(), (C8910t0) null, new C2688e(this, (C8508d<? super C2688e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m12195H2(VideoPlayerActivity videoPlayerActivity, Bitmap bitmap, int i) {
        C8594l.m46771e(videoPlayerActivity, "this$0");
        if (i == 0) {
            videoPlayerActivity.f9184E = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47303c(), (C8910t0) null, new C2687d(videoPlayerActivity, bitmap, (C8508d<? super C2687d>) null), 2, (Object) null);
        } else {
            Toast.makeText(videoPlayerActivity, videoPlayerActivity.getString(C2708o.video_screen_shots_fail), 0).show();
        }
    }

    /* renamed from: I2 */
    private final void m12196I2() {
        if (!C4326a.m18907f().mo14749c(this)) {
            C4613a aVar = this.f9183D;
            if (aVar != null) {
                Application application = getApplication();
                C8594l.m46770d(application, "application");
                aVar.mo15355a(application);
            }
            C4326a.m18907f().mo14748b(this, C2709p.VideoTheme_SettingWindowsDialog_Dark);
            return;
        }
        m12205m2();
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            playerHelper.saveVideoInfo();
            finish();
            return;
        }
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    /* renamed from: i2 */
    private final void m12201i2() {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            PlayerHelper.savePlayTimeMs$default(playerHelper, false, 1, (Object) null);
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                playerHelper2.saveVideoInfo();
                PlayerHelper playerHelper3 = this.f9181B;
                if (playerHelper3 != null) {
                    if (!playerHelper3.isAudioPlay()) {
                        PlayerHelper playerHelper4 = this.f9181B;
                        if (playerHelper4 == null) {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        } else if (!playerHelper4.isWindows()) {
                            C4613a aVar = this.f9183D;
                            if (aVar != null) {
                                aVar.mo15368n(this);
                            }
                            getWindow().clearFlags(128);
                        }
                    }
                    finish();
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

    /* renamed from: j2 */
    private final void m12202j2() {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper == null) {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        } else if (playerHelper.isAudioPlay()) {
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                playerHelper2.isAudioPlay(false);
                sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_EXIT()));
                PlayerHelper playerHelper3 = this.f9181B;
                if (playerHelper3 != null) {
                    playerHelper3.saveVideoInfo();
                    PlayerHelper playerHelper4 = this.f9181B;
                    if (playerHelper4 != null) {
                        PlayerHelper.savePlayTimeMs$default(playerHelper4, false, 1, (Object) null);
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
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
    }

    /* renamed from: k2 */
    private final void m12203k2() {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper == null) {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        } else if (playerHelper.isWindows()) {
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                playerHelper2.setWindows(false);
                C4613a aVar = this.f9183D;
                if (aVar != null) {
                    Application application = getApplication();
                    C8594l.m46770d(application, "application");
                    aVar.mo15364j(application, true);
                }
                PlayerHelper playerHelper3 = this.f9181B;
                if (playerHelper3 != null) {
                    playerHelper3.closeWindow();
                    PlayerHelper playerHelper4 = this.f9181B;
                    if (playerHelper4 != null) {
                        playerHelper4.saveVideoInfo();
                        PlayerHelper playerHelper5 = this.f9181B;
                        if (playerHelper5 != null) {
                            PlayerHelper.savePlayTimeMs$default(playerHelper5, false, 1, (Object) null);
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
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
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m12204l2() {
        m12217y2();
        m12203k2();
        m12202j2();
        m12201i2();
    }

    /* renamed from: m2 */
    private final void m12205m2() {
        getWindow().addFlags(128);
        if (getResources().getConfiguration().orientation == 1) {
            this.f9191L = getResources().getDisplayMetrics().widthPixels;
            this.f9192M = getResources().getDisplayMetrics().heightPixels;
        } else {
            this.f9191L = getResources().getDisplayMetrics().heightPixels;
            this.f9192M = getResources().getDisplayMetrics().widthPixels;
        }
        int i = (int) (((float) this.f9191L) * 0.8f);
        int i2 = (i * 9) / 16;
        int c = C8392f.m46452c(i2, this.f9192M);
        int i3 = (this.f9191L - i) >> 1;
        int i4 = (this.f9192M - c) >> 1;
        int i5 = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        FrameLayout frameLayout = new FrameLayout(this);
        this.f9190K = frameLayout;
        frameLayout.setKeepScreenOn(true);
        C6700a aVar = new C6700a();
        aVar.mo26071l(i5);
        aVar.mo26072m(i3);
        aVar.mo26073n(i4);
        aVar.mo26070k(i);
        aVar.mo26069j(i2);
        this.f9195P = aVar;
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            playerHelper.initFloatWindow(getApplicationContext(), this.f9190K, this.f9195P);
            this.f9199T.mo26017k("controller_cover");
            this.f9199T.mo26017k("gesture_cover");
            this.f9199T.mo26014g("window_controller_cover", new C2737g(this));
            C6665g a = this.f9199T.mo26005a();
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                a.mo26001h("playing", playerHelper2.isPlaying());
                this.f9199T.mo26005a().mo26001h("move_screen", true);
                PlayerHelper playerHelper3 = this.f9181B;
                if (playerHelper3 != null) {
                    playerHelper3.showFloatWindow();
                    PlayerHelper playerHelper4 = this.f9181B;
                    if (playerHelper4 != null) {
                        playerHelper4.attachToContainer(this.f9190K);
                        PlayerHelper playerHelper5 = this.f9181B;
                        if (playerHelper5 != null) {
                            playerHelper5.setWindows(true);
                            C4613a aVar2 = this.f9183D;
                            if (aVar2 != null) {
                                Application application = getApplication();
                                C8594l.m46770d(application, "application");
                                aVar2.mo15364j(application, false);
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
        C8594l.m46783q("mPlayerHelper");
        throw null;
    }

    /* renamed from: n2 */
    private final void m12206n2() {
        C2720j jVar = this.f9196Q;
        if (jVar != null) {
            this.f9197R = jVar.f9365b;
            PlayerHelper.Companion companion = PlayerHelper.Companion;
            Application application = getApplication();
            C8594l.m46770d(application, "application");
            this.f9181B = companion.getInstance(application);
            SharedPreferences sharedPreferences = getSharedPreferences("video_eq_config", 0);
            C8594l.m46770d(sharedPreferences, "getSharedPreferences(SP_…ME, Context.MODE_PRIVATE)");
            this.f9182C = sharedPreferences;
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper != null) {
                playerHelper.initAudioFocusWrapper(this);
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 == null) {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                } else if (playerHelper2 != null) {
                    playerHelper2.setVolume(playerHelper2.getStreamVolume(3));
                    this.f9180A = new C2697g(this);
                    m12192E2();
                    m12189B2();
                    m12191D2();
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m12213u2(VideoPlayerActivity videoPlayerActivity, int i, Bundle bundle) {
        C8594l.m46771e(videoPlayerActivity, "this$0");
        if (i == -99018) {
            SharedPreferences sharedPreferences = videoPlayerActivity.f9182C;
            if (sharedPreferences != null) {
                videoPlayerActivity.mo10195b0(sharedPreferences.getBoolean("video_eq_enabled", false));
            } else {
                C8594l.m46783q("mSharedPreferences");
                throw null;
            }
        } else if (i != -99016) {
            switch (i) {
                case -99006:
                    PlayerHelper playerHelper = videoPlayerActivity.f9181B;
                    if (playerHelper != null) {
                        playerHelper.requestAudioFocus();
                        return;
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                case -99005:
                    PlayerHelper playerHelper2 = videoPlayerActivity.f9181B;
                    if (playerHelper2 != null) {
                        playerHelper2.abandonAudioFocus();
                        return;
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                case -99004:
                    PlayerHelper playerHelper3 = videoPlayerActivity.f9181B;
                    if (playerHelper3 != null) {
                        if (playerHelper3.isAudioPlay() && videoPlayerActivity.f9201V != null) {
                            videoPlayerActivity.sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_UPDATE_STATUS()));
                        }
                        PlayerHelper playerHelper4 = videoPlayerActivity.f9181B;
                        if (playerHelper4 != null) {
                            playerHelper4.requestAudioFocus();
                            PlayerHelper playerHelper5 = videoPlayerActivity.f9181B;
                            if (playerHelper5 == null) {
                                C8594l.m46783q("mPlayerHelper");
                                throw null;
                            } else if (playerHelper5.isAppType() == 1) {
                                PlayerHelper playerHelper6 = videoPlayerActivity.f9181B;
                                if (playerHelper6 == null) {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                } else if (playerHelper6.isMusicPlaying()) {
                                    PlayerHelper playerHelper7 = videoPlayerActivity.f9181B;
                                    if (playerHelper7 != null) {
                                        playerHelper7.resume();
                                        return;
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                } else {
                                    PlayerHelper playerHelper8 = videoPlayerActivity.f9181B;
                                    if (playerHelper8 != null) {
                                        playerHelper8.pause();
                                        return;
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                }
                            } else {
                                return;
                            }
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                default:
                    return;
            }
        } else {
            PlayerHelper playerHelper9 = videoPlayerActivity.f9181B;
            if (playerHelper9 != null) {
                int playMode = playerHelper9.getPlayMode();
                if (playMode == 0) {
                    PlayerHelper playerHelper10 = videoPlayerActivity.f9181B;
                    if (playerHelper10 != null) {
                        if (!playerHelper10.getDataSources().isEmpty()) {
                            PlayerHelper playerHelper11 = videoPlayerActivity.f9181B;
                            if (playerHelper11 != null) {
                                int playPosition = playerHelper11.getPlayPosition();
                                PlayerHelper playerHelper12 = videoPlayerActivity.f9181B;
                                if (playerHelper12 == null) {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                } else if (playPosition != playerHelper12.getDataSources().size() - 1) {
                                    PlayerHelper playerHelper13 = videoPlayerActivity.f9181B;
                                    if (playerHelper13 != null) {
                                        playerHelper13.playNext(true);
                                        C2768k kVar = videoPlayerActivity.f9200U;
                                        if (kVar != null) {
                                            PlayerHelper playerHelper14 = videoPlayerActivity.f9181B;
                                            if (playerHelper14 != null) {
                                                kVar.mo10346k3(playerHelper14.getPlayPosition());
                                                return;
                                            } else {
                                                C8594l.m46783q("mPlayerHelper");
                                                throw null;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                }
                            } else {
                                C8594l.m46783q("mPlayerHelper");
                                throw null;
                            }
                        }
                        PlayerHelper playerHelper15 = videoPlayerActivity.f9181B;
                        if (playerHelper15 != null) {
                            playerHelper15.savePlayTimeMs(true);
                            PlayerHelper playerHelper16 = videoPlayerActivity.f9181B;
                            if (playerHelper16 != null) {
                                Video video = playerHelper16.getVideo();
                                if (video != null) {
                                    PlayerHelper playerHelper17 = videoPlayerActivity.f9181B;
                                    if (playerHelper17 != null) {
                                        Boolean m = video.mo10554m();
                                        C8594l.m46770d(m, "it.isPrivateVideo");
                                        playerHelper17.savePlayingVideoIdAndPath(m.booleanValue());
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                }
                                videoPlayerActivity.m12204l2();
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
                } else if (playMode == 1) {
                    PlayerHelper playerHelper18 = videoPlayerActivity.f9181B;
                    if (playerHelper18 != null) {
                        int playPosition2 = playerHelper18.getPlayPosition();
                        PlayerHelper playerHelper19 = videoPlayerActivity.f9181B;
                        if (playerHelper19 != null) {
                            if (playPosition2 == playerHelper19.getDataSources().size() - 1) {
                                PlayerHelper playerHelper20 = videoPlayerActivity.f9181B;
                                if (playerHelper20 != null) {
                                    playerHelper20.starPlayOnPosition(0, true);
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            } else {
                                PlayerHelper playerHelper21 = videoPlayerActivity.f9181B;
                                if (playerHelper21 != null) {
                                    playerHelper21.playNext(true);
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            }
                            C2768k kVar2 = videoPlayerActivity.f9200U;
                            if (kVar2 != null) {
                                PlayerHelper playerHelper22 = videoPlayerActivity.f9181B;
                                if (playerHelper22 != null) {
                                    kVar2.mo10346k3(playerHelper22.getPlayPosition());
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
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
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m12214v2(VideoPlayerActivity videoPlayerActivity, int i, Bundle bundle) {
        int i2;
        C8594l.m46771e(videoPlayerActivity, "this$0");
        if (i == 1001) {
            videoPlayerActivity.onBackPressed();
        } else if (i == 1050) {
            PlayerHelper playerHelper = videoPlayerActivity.f9181B;
            if (playerHelper != null) {
                playerHelper.stop();
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        } else if (i != 1008) {
            if (i != 1009) {
                switch (i) {
                    case 1003:
                        C2768k.C2769a aVar = C2768k.f9469t0;
                        C2697g gVar = videoPlayerActivity.f9180A;
                        if (gVar != null) {
                            C2768k b = aVar.mo10348b(!gVar.mo10243g());
                            videoPlayerActivity.f9200U = b;
                            if (b != null) {
                                b.mo3841h3(videoPlayerActivity.mo3730H1(), aVar.mo10347a());
                                C8457t tVar = C8457t.f34900a;
                                return;
                            }
                            return;
                        }
                        C8594l.m46783q("mOrientationHelper");
                        throw null;
                    case 1004:
                        C2763j.C2764a aVar2 = C2763j.f9461t0;
                        C2697g gVar2 = videoPlayerActivity.f9180A;
                        if (gVar2 != null) {
                            aVar2.mo10345b(!gVar2.mo10243g()).mo3841h3(videoPlayerActivity.mo3730H1(), aVar2.mo10344a());
                            return;
                        } else {
                            C8594l.m46783q("mOrientationHelper");
                            throw null;
                        }
                    case 1005:
                        videoPlayerActivity.m12194G2();
                        return;
                    case 1006:
                        if (bundle != null) {
                            boolean z = bundle.getBoolean("mute");
                            if (z) {
                                PlayerHelper playerHelper2 = videoPlayerActivity.f9181B;
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
                                PlayerHelper playerHelper3 = videoPlayerActivity.f9181B;
                                if (playerHelper3 == null) {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                } else if (playerHelper3.getVolume() <= 0) {
                                    PlayerHelper playerHelper4 = videoPlayerActivity.f9181B;
                                    if (playerHelper4 != null) {
                                        playerHelper4.setVolume(1);
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                }
                            }
                            PlayerHelper playerHelper5 = videoPlayerActivity.f9181B;
                            if (playerHelper5 != null) {
                                if (z) {
                                    i2 = 0;
                                } else if (playerHelper5 != null) {
                                    i2 = playerHelper5.getVolume();
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                                playerHelper5.setStreamVolume(3, i2, 0);
                                C8457t tVar2 = C8457t.f34900a;
                                return;
                            }
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                        return;
                    default:
                        switch (i) {
                            case 1011:
                                PlayerHelper playerHelper6 = videoPlayerActivity.f9181B;
                                if (playerHelper6 != null) {
                                    playerHelper6.playPrevious();
                                    return;
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            case 1012:
                                PlayerHelper playerHelper7 = videoPlayerActivity.f9181B;
                                if (playerHelper7 != null) {
                                    PlayerHelper.playNext$default(playerHelper7, false, 1, (Object) null);
                                    return;
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            case 1013:
                                PlayerHelper playerHelper8 = videoPlayerActivity.f9181B;
                                if (playerHelper8 == null) {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                } else if (playerHelper8 != null) {
                                    playerHelper8.seekTo(playerHelper8.currentPosition() - 5000);
                                    return;
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            case 1014:
                                PlayerHelper playerHelper9 = videoPlayerActivity.f9181B;
                                if (playerHelper9 == null) {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                } else if (playerHelper9 != null) {
                                    playerHelper9.seekTo(playerHelper9.currentPosition() + 5000);
                                    return;
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            case 1015:
                                if (bundle != null) {
                                    int i3 = bundle.getInt("int_data", 0);
                                    videoPlayerActivity.f9187H = i3;
                                    if (i3 == 1) {
                                        C2697g gVar3 = videoPlayerActivity.f9180A;
                                        if (gVar3 != null) {
                                            gVar3.mo10244h(false);
                                            C2697g gVar4 = videoPlayerActivity.f9180A;
                                            if (gVar4 != null) {
                                                gVar4.mo10240d();
                                                videoPlayerActivity.setRequestedOrientation(0);
                                                Toast.makeText(videoPlayerActivity, C2708o.video_landscape_locked, 0).show();
                                                C8457t tVar3 = C8457t.f34900a;
                                            } else {
                                                C8594l.m46783q("mOrientationHelper");
                                                throw null;
                                            }
                                        } else {
                                            C8594l.m46783q("mOrientationHelper");
                                            throw null;
                                        }
                                    } else if (i3 != 2) {
                                        C2697g gVar5 = videoPlayerActivity.f9180A;
                                        if (gVar5 != null) {
                                            gVar5.mo10241e();
                                            Toast.makeText(videoPlayerActivity, C2708o.coocent_video_orientation_auto, 0).show();
                                            C8457t tVar4 = C8457t.f34900a;
                                        } else {
                                            C8594l.m46783q("mOrientationHelper");
                                            throw null;
                                        }
                                    } else {
                                        C2697g gVar6 = videoPlayerActivity.f9180A;
                                        if (gVar6 != null) {
                                            gVar6.mo10244h(true);
                                            C2697g gVar7 = videoPlayerActivity.f9180A;
                                            if (gVar7 != null) {
                                                gVar7.mo10240d();
                                                videoPlayerActivity.setRequestedOrientation(1);
                                                Toast.makeText(videoPlayerActivity, C2708o.video_portrait_locked, 0).show();
                                                C8457t tVar5 = C8457t.f34900a;
                                            } else {
                                                C8594l.m46783q("mOrientationHelper");
                                                throw null;
                                            }
                                        } else {
                                            C8594l.m46783q("mOrientationHelper");
                                            throw null;
                                        }
                                    }
                                    C8457t tVar6 = C8457t.f34900a;
                                    return;
                                }
                                return;
                            case 1016:
                                if (bundle != null) {
                                    videoPlayerActivity.m12190C2(bundle.getBoolean("bool_data"));
                                    C8457t tVar7 = C8457t.f34900a;
                                    return;
                                }
                                return;
                            case 1017:
                                videoPlayerActivity.m12196I2();
                                return;
                            case 1018:
                                PlayerHelper playerHelper10 = videoPlayerActivity.f9181B;
                                if (playerHelper10 == null) {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                } else if (playerHelper10.isWindowShow()) {
                                    PlayerHelper playerHelper11 = videoPlayerActivity.f9181B;
                                    if (playerHelper11 != null) {
                                        playerHelper11.setDragEnable(false);
                                        if (bundle != null) {
                                            int i4 = bundle.getInt("resize_x");
                                            PlayerHelper playerHelper12 = videoPlayerActivity.f9181B;
                                            if (playerHelper12 != null) {
                                                int c = C8392f.m46452c(playerHelper12.getFloatWindowWidth() + i4, videoPlayerActivity.f9191L);
                                                int c2 = C8392f.m46452c((c * 9) / 16, videoPlayerActivity.f9192M);
                                                videoPlayerActivity.f9193N = videoPlayerActivity.getResources().getDimensionPixelOffset(C2704k.window_min_width);
                                                int dimensionPixelOffset = videoPlayerActivity.getResources().getDimensionPixelOffset(C2704k.window_min_height);
                                                videoPlayerActivity.f9194O = dimensionPixelOffset;
                                                int i5 = videoPlayerActivity.f9193N;
                                                if (c < i5) {
                                                    c = i5;
                                                }
                                                if (c2 < dimensionPixelOffset) {
                                                    c2 = dimensionPixelOffset;
                                                }
                                                PlayerHelper playerHelper13 = videoPlayerActivity.f9181B;
                                                if (playerHelper13 != null) {
                                                    playerHelper13.updateWindowViewLayoutSize(c, c2);
                                                    return;
                                                } else {
                                                    C8594l.m46783q("mPlayerHelper");
                                                    throw null;
                                                }
                                            } else {
                                                C8594l.m46783q("mPlayerHelper");
                                                throw null;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                } else {
                                    return;
                                }
                            case 1019:
                                PlayerHelper playerHelper14 = videoPlayerActivity.f9181B;
                                if (playerHelper14 == null) {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                } else if (playerHelper14.isWindowShow()) {
                                    PlayerHelper playerHelper15 = videoPlayerActivity.f9181B;
                                    if (playerHelper15 != null) {
                                        playerHelper15.setDragEnable(true);
                                        return;
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                } else {
                                    return;
                                }
                            case 1020:
                                Intent intent = new Intent(videoPlayerActivity.getApplicationContext(), VideoPlayerActivity.class);
                                intent.addFlags(268435456);
                                Intent intent2 = new Intent();
                                intent2.setAction(C8594l.m46777k(videoPlayerActivity.getPackageName(), ".video.list"));
                                intent2.addFlags(268435456);
                                Intent intent3 = new Intent();
                                intent3.setAction(C8594l.m46777k(videoPlayerActivity.getPackageName(), ".video.main"));
                                intent3.addFlags(268435456);
                                try {
                                    PendingIntent.getActivities(videoPlayerActivity.getApplicationContext(), 0, new Intent[]{intent3, intent2, intent}, 134217728).send();
                                } catch (PendingIntent.CanceledException e) {
                                    e.printStackTrace();
                                    try {
                                        videoPlayerActivity.startActivities(new Intent[]{intent3, intent2, intent});
                                    } catch (ActivityNotFoundException unused) {
                                        videoPlayerActivity.startActivities(new Intent[]{intent});
                                    }
                                }
                                PlayerHelper playerHelper16 = videoPlayerActivity.f9181B;
                                if (playerHelper16 != null) {
                                    playerHelper16.isRestore(true);
                                    return;
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
                                }
                            case 1021:
                                videoPlayerActivity.m12203k2();
                                videoPlayerActivity.m12217y2();
                                videoPlayerActivity.finish();
                                return;
                            default:
                                return;
                        }
                }
            } else {
                C2755i.C2756a aVar3 = C2755i.f9440v0;
                C2697g gVar8 = videoPlayerActivity.f9180A;
                if (gVar8 != null) {
                    aVar3.mo10330b(!gVar8.mo10243g()).mo3841h3(videoPlayerActivity.mo3730H1(), aVar3.mo10329a());
                } else {
                    C8594l.m46783q("mOrientationHelper");
                    throw null;
                }
            }
        } else if (bundle != null) {
            boolean z2 = bundle.getBoolean("bool_data");
            videoPlayerActivity.f9188I = z2;
            videoPlayerActivity.m12190C2(!z2);
            if (videoPlayerActivity.f9188I) {
                C2697g gVar9 = videoPlayerActivity.f9180A;
                if (gVar9 != null) {
                    gVar9.mo10240d();
                } else {
                    C8594l.m46783q("mOrientationHelper");
                    throw null;
                }
            } else if (videoPlayerActivity.f9187H == 0) {
                C2697g gVar10 = videoPlayerActivity.f9180A;
                if (gVar10 != null) {
                    gVar10.mo10241e();
                } else {
                    C8594l.m46783q("mOrientationHelper");
                    throw null;
                }
            }
            C8457t tVar8 = C8457t.f34900a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m12215w2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m12216x2(VideoPlayerActivity videoPlayerActivity, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(videoPlayerActivity, "this$0");
        dialogInterface.dismiss();
        RomUtils.INSTANCE.requestBGPermissions(videoPlayerActivity);
    }

    /* renamed from: y2 */
    private final void m12217y2() {
        CountDownTimer countDownTimer = this.f9185F;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C2697g gVar = this.f9180A;
        if (gVar != null) {
            gVar.mo10240d();
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper != null) {
                playerHelper.release();
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        } else {
            C8594l.m46783q("mOrientationHelper");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public final void m12218z2(Bitmap bitmap) {
        if (bitmap == null) {
            Toast.makeText(this, getString(C2708o.video_screen_shots_fail), 0).show();
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!Environment.isExternalStorageLegacy()) {
                    ContentValues contentValues = new ContentValues();
                    String k = C8594l.m46777k("IMG_", Long.valueOf(System.currentTimeMillis()));
                    String k2 = C8594l.m46777k(Environment.DIRECTORY_PICTURES, "/Screenshots");
                    String str = k2 + '/' + k + ".jpeg";
                    contentValues.put("_display_name", C8594l.m46777k(k, ".jpeg"));
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("relative_path", k2);
                    Uri insert = getApplicationContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (insert != null) {
                        OutputStream openOutputStream = getApplicationContext().getContentResolver().openOutputStream(insert);
                        if (openOutputStream != null) {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
                            openOutputStream.flush();
                            openOutputStream.close();
                            C8605w wVar = C8605w.f34938a;
                            String string = getString(C2708o.video_screen_shots_successful);
                            C8594l.m46770d(string, "getString(R.string.video_screen_shots_successful)");
                            String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
                            C8594l.m46770d(format, "java.lang.String.format(format, *args)");
                            Toast.makeText(this, format, 0).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath();
            StringBuilder sb = new StringBuilder();
            sb.append(path);
            String str2 = File.separator;
            sb.append(str2);
            sb.append("Screenshots");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            String str3 = file.getPath() + str2 + "IMG_" + System.currentTimeMillis() + ".jpeg";
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str3));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            MediaScannerConnection.scanFile(getApplicationContext(), new String[]{str3}, (String[]) null, (MediaScannerConnection.OnScanCompletedListener) null);
            C8605w wVar2 = C8605w.f34938a;
            String string2 = getString(C2708o.video_screen_shots_successful);
            C8594l.m46770d(string2, "getString(R.string.video_screen_shots_successful)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
            C8594l.m46770d(format2, "java.lang.String.format(format, *args)");
            Toast.makeText(this, format2, 0).show();
        } catch (Exception e) {
            Toast.makeText(this, getString(C2708o.video_screen_shots_fail), 0).show();
            e.printStackTrace();
        }
    }

    /* renamed from: B */
    public void mo10190B(short s) {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            Integer audioSessionId = playerHelper.audioSessionId();
            if (audioSessionId != null) {
                int intValue = audioSessionId.intValue();
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    playerHelper2.updatePresetReverb(intValue, s);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    /* renamed from: K */
    public void mo10191K(short s) {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            Integer audioSessionId = playerHelper.audioSessionId();
            if (audioSessionId != null) {
                int intValue = audioSessionId.intValue();
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    playerHelper2.updateBassBoost(intValue, s);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    /* renamed from: R0 */
    public void mo10192R0(int i) {
        if (i < 0) {
        }
    }

    /* renamed from: V0 */
    public void mo10193V0(int i) {
        C4613a aVar;
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            playerHelper.saveVideoInfo();
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                if ((!playerHelper2.getVideoList().isEmpty()) && i >= 0) {
                    PlayerHelper playerHelper3 = this.f9181B;
                    if (playerHelper3 == null) {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    } else if (i < playerHelper3.getVideoList().size() && (aVar = this.f9183D) != null) {
                        Context applicationContext = getApplicationContext();
                        C8594l.m46770d(applicationContext, "applicationContext");
                        PlayerHelper playerHelper4 = this.f9181B;
                        if (playerHelper4 != null) {
                            aVar.mo15369o(applicationContext, playerHelper4.getVideoList().get(i));
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    }
                }
                PlayerHelper playerHelper5 = this.f9181B;
                if (playerHelper5 != null) {
                    PlayerHelper.starPlayOnPosition$default(playerHelper5, i, false, 2, (Object) null);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
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

    /* renamed from: X0 */
    public void mo10194X0(float f) {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            playerHelper.setSpeed(f);
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    /* renamed from: b0 */
    public void mo10195b0(boolean z) {
        String str;
        SharedPreferences sharedPreferences = this.f9182C;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("video_preset_value", "3, 0, 0, 0, 3");
            if (TextUtils.isEmpty(string)) {
                str = "3, 0, 0, 0, 3";
            } else {
                str = string;
            }
            SharedPreferences sharedPreferences2 = this.f9182C;
            if (sharedPreferences2 != null) {
                int i = sharedPreferences2.getInt("video_bass_boost_value", BASS.BASS_ERROR_JAVA_CLASS);
                SharedPreferences sharedPreferences3 = this.f9182C;
                if (sharedPreferences3 != null) {
                    int i2 = sharedPreferences3.getInt("video_virtualizer_value", BASS.BASS_ERROR_JAVA_CLASS);
                    SharedPreferences sharedPreferences4 = this.f9182C;
                    if (sharedPreferences4 != null) {
                        int i3 = sharedPreferences4.getInt("video_reverb_value", 0);
                        PlayerHelper playerHelper = this.f9181B;
                        if (playerHelper != null) {
                            Integer audioSessionId = playerHelper.audioSessionId();
                            if (audioSessionId != null) {
                                int intValue = audioSessionId.intValue();
                                PlayerHelper playerHelper2 = this.f9181B;
                                if (playerHelper2 != null) {
                                    C8594l.m46769c(str);
                                    playerHelper2.setEqEnable(z, intValue, str, i3, i, i2);
                                    return;
                                }
                                C8594l.m46783q("mPlayerHelper");
                                throw null;
                            }
                            return;
                        }
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                    C8594l.m46783q("mSharedPreferences");
                    throw null;
                }
                C8594l.m46783q("mSharedPreferences");
                throw null;
            }
            C8594l.m46783q("mSharedPreferences");
            throw null;
        }
        C8594l.m46783q("mSharedPreferences");
        throw null;
    }

    /* renamed from: c1 */
    public void mo10196c1(short s, short s2) {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            Integer audioSessionId = playerHelper.audioSessionId();
            if (audioSessionId != null) {
                int intValue = audioSessionId.intValue();
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    playerHelper2.updateEqualizer(intValue, s, s2);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    /* renamed from: i0 */
    public void mo10197i0() {
        C4613a aVar;
        if (C4588a.m20009b(this) || C4588a.m20012e(this)) {
            C4613a aVar2 = this.f9183D;
            if (aVar2 != null && aVar2.mo15357c() == 1) {
                PlayerHelper playerHelper = this.f9181B;
                if (playerHelper != null) {
                    Video video = playerHelper.getVideo();
                    if (!(video == null || (aVar = this.f9183D) == null)) {
                        VideoConfigBean.C2691a aVar3 = new VideoConfigBean.C2691a();
                        PlayerHelper playerHelper2 = this.f9181B;
                        if (playerHelper2 != null) {
                            aVar3.mo10231i(playerHelper2.getPlayPosition());
                            aVar3.mo10230h(video);
                            PlayerHelper playerHelper3 = this.f9181B;
                            if (playerHelper3 != null) {
                                aVar3.mo10232j(playerHelper3.currentPosition());
                                PlayerHelper playerHelper4 = this.f9181B;
                                if (playerHelper4 != null) {
                                    int sleepMode = playerHelper4.getSleepMode();
                                    PlayerHelper playerHelper5 = this.f9181B;
                                    if (playerHelper5 != null) {
                                        aVar3.mo10227e(sleepMode, playerHelper5.getSleepTime());
                                        PlayerHelper playerHelper6 = this.f9181B;
                                        if (playerHelper6 != null) {
                                            aVar3.mo10229g(playerHelper6.getVideoList());
                                            PlayerHelper playerHelper7 = this.f9181B;
                                            if (playerHelper7 != null) {
                                                aVar3.mo10228f(playerHelper7.getSpeed());
                                                PlayerHelper playerHelper8 = this.f9181B;
                                                if (playerHelper8 != null) {
                                                    aVar3.mo10224b(playerHelper8.isAudioPlay());
                                                    aVar.mo15358d(this, aVar3.mo10223a());
                                                } else {
                                                    C8594l.m46783q("mPlayerHelper");
                                                    throw null;
                                                }
                                            } else {
                                                C8594l.m46783q("mPlayerHelper");
                                                throw null;
                                            }
                                        } else {
                                            C8594l.m46783q("mPlayerHelper");
                                            throw null;
                                        }
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                } else {
                                    C8594l.m46783q("mPlayerHelper");
                                    throw null;
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
                    m12217y2();
                    finish();
                    return;
                }
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
            C4613a aVar4 = this.f9183D;
            if (!(aVar4 != null && aVar4.mo15357c() == 0)) {
                return;
            }
            if (!RomUtils.INSTANCE.isBackgroundStartAllowed(this)) {
                C0133c.C0134a aVar5 = new C0133c.C0134a(this, C2709p.VideoTheme_Dialog_Dark);
                aVar5.mo644o(C2708o.video_audio);
                aVar5.mo636g(C2708o.video_audio_play_requestPermissions_tips);
                aVar5.mo633d(true);
                aVar5.mo639j(getString(17039360), C2690b.f9209g);
                aVar5.mo642m(getString(17039370), new C2689a(this));
                C0133c a = aVar5.mo630a();
                C8594l.m46770d(a, "Builder(this, R.style.Vi…               }.create()");
                a.show();
                Button e = a.mo624e(-1);
                if (e != null) {
                    e.setTextColor(C0506a.m3150b(this, C2703j.videoColorAccent));
                }
                Button e2 = a.mo624e(-2);
                if (e2 != null) {
                    e2.setTextColor(C0506a.m3150b(this, C2703j.videoTextColorPrimary_dark));
                    return;
                }
                return;
            }
            PlayerHelper playerHelper9 = this.f9181B;
            if (playerHelper9 != null) {
                playerHelper9.isAudioPlay(true);
                PlayerHelper playerHelper10 = this.f9181B;
                if (playerHelper10 != null) {
                    playerHelper10.attachToContainer((ViewGroup) null);
                    PlayerHelper playerHelper11 = this.f9181B;
                    if (playerHelper11 != null) {
                        PlayerHelper.savePlayTimeMs$default(playerHelper11, false, 1, (Object) null);
                        PlayerHelper playerHelper12 = this.f9181B;
                        if (playerHelper12 != null) {
                            playerHelper12.saveVideoInfo();
                            this.f9199T.mo26017k("controller_cover");
                            this.f9199T.mo26017k("gesture_cover");
                            Intent intent = new Intent(this, AudioPlayService.class);
                            intent.setAction(AudioPlayService.Companion.getNOTIFICATION_UPDATE_STATUS());
                            C0506a.m3157i(this, intent);
                            finish();
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
        C4588a.m20010c(this);
    }

    /* renamed from: k0 */
    public void mo10198k0(int i) {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            playerHelper.setLooping(i == 2);
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                playerHelper2.setPlayMode(i);
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    /* renamed from: n0 */
    public void mo10199n0(int i, long j) {
        String str;
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            playerHelper.setSleepMode(i);
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                playerHelper2.setSleepTime(j);
                CountDownTimer countDownTimer = this.f9185F;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                if (j > 0) {
                    if (j < 60000) {
                        str = (j / ((long) 1000)) + " second";
                    } else {
                        str = ((j / ((long) 60)) / ((long) 1000)) + " minutes";
                    }
                    C8605w wVar = C8605w.f34938a;
                    Locale locale = Locale.US;
                    String string = getString(C2708o.video_sleep_hint);
                    C8594l.m46770d(string, "getString(R.string.video_sleep_hint)");
                    String format = String.format(locale, string, Arrays.copyOf(new Object[]{str}, 1));
                    C8594l.m46770d(format, "java.lang.String.format(locale, format, *args)");
                    Toast.makeText(this, format, 0).show();
                    C2686c cVar = new C2686c(this, j);
                    cVar.start();
                    C8457t tVar = C8457t.f34900a;
                    this.f9185F = cVar;
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.f9188I) {
            Toast.makeText(this, C2708o.video_unlock, 0).show();
            return;
        }
        m12188A2();
        super.onBackPressed();
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            PlayerHelper.savePlayTimeMs$default(playerHelper, false, 1, (Object) null);
            PlayerHelper playerHelper2 = this.f9181B;
            if (playerHelper2 != null) {
                playerHelper2.saveVideoInfo();
                C4613a aVar = this.f9183D;
                if (aVar != null) {
                    aVar.mo15368n(this);
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.setDecorFitsSystemWindows(false);
            window.setStatusBarColor(1677721600);
            window.setNavigationBarColor(1677721600);
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
            }
        } else if (i >= 21) {
            window.getDecorView().setSystemUiVisibility(5888);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1677721600);
            window.setNavigationBarColor(1677721600);
        }
        if (i >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            if (i >= 29) {
                window.setStatusBarContrastEnforced(false);
                window.setNavigationBarContrastEnforced(false);
            }
        }
        C6616c.m38167a(getApplicationContext());
        C2720j d = C2720j.m12308d(getLayoutInflater());
        C8594l.m46770d(d, "inflate(layoutInflater)");
        this.f9196Q = d;
        if (d != null) {
            setContentView((View) d.mo7577a());
            m12206n2();
            bindService(new Intent(this, AudioPlayService.class), this.f9202W, 1);
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (playerHelper.isRestore()) {
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    playerHelper2.setWindows(false);
                    C4613a aVar = this.f9183D;
                    if (aVar != null) {
                        Application application = getApplication();
                        C8594l.m46770d(application, "application");
                        aVar.mo15364j(application, true);
                    }
                    C4613a aVar2 = this.f9183D;
                    if (aVar2 != null) {
                        Application application2 = getApplication();
                        C8594l.m46770d(application2, "application");
                        aVar2.mo15355a(application2);
                    }
                    PlayerHelper playerHelper3 = this.f9181B;
                    if (playerHelper3 == null) {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    } else if (playerHelper3.isWindowShow()) {
                        PlayerHelper playerHelper4 = this.f9181B;
                        if (playerHelper4 != null) {
                            playerHelper4.closeWindow();
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f9201V != null) {
            unbindService(this.f9202W);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = false;
        if (i == 24) {
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (playerHelper != null) {
                playerHelper.setVolume(playerHelper.getStreamVolume(3));
                C6665g a = this.f9199T.mo26005a();
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    if (playerHelper2.getVolume() < 0) {
                        z = true;
                    }
                    a.mo26001h("mute", z);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        } else if (i == 25) {
            PlayerHelper playerHelper3 = this.f9181B;
            if (playerHelper3 == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (playerHelper3 != null) {
                playerHelper3.setVolume(playerHelper3.getStreamVolume(3));
                C6665g a2 = this.f9199T.mo26005a();
                PlayerHelper playerHelper4 = this.f9181B;
                if (playerHelper4 != null) {
                    if (playerHelper4.getVolume() <= 1) {
                        z = true;
                    }
                    a2.mo26001h("mute", z);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper == null) {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            } else if (!playerHelper.isWindows()) {
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 == null) {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                } else if (!playerHelper2.isAudioPlay()) {
                    PlayerHelper playerHelper3 = this.f9181B;
                    if (playerHelper3 != null) {
                        playerHelper3.saveVideoInfo();
                        m12217y2();
                        return;
                    }
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
        } else {
            PlayerHelper playerHelper4 = this.f9181B;
            if (playerHelper4 != null) {
                this.f9189J = playerHelper4.isPlaying();
                PlayerHelper playerHelper5 = this.f9181B;
                if (playerHelper5 == null) {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                } else if (!playerHelper5.isWindows()) {
                    PlayerHelper playerHelper6 = this.f9181B;
                    if (playerHelper6 == null) {
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    } else if (!playerHelper6.isAudioPlay()) {
                        PlayerHelper playerHelper7 = this.f9181B;
                        if (playerHelper7 != null) {
                            playerHelper7.pause();
                        } else {
                            C8594l.m46783q("mPlayerHelper");
                            throw null;
                        }
                    }
                }
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C8594l.m46771e(strArr, "permissions");
        C8594l.m46771e(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1111) {
            return;
        }
        if (C2724d.m12316a(this)) {
            Uri data = getIntent().getData();
            if (data != null) {
                C4815n nVar = this.f9205z;
                if (nVar != null) {
                    nVar.mo15562z(data);
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            }
        } else {
            Toast.makeText(this, C2708o.coocent_video_external_storage_access, 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        if (!this.f9188I) {
            C2697g gVar = this.f9180A;
            if (gVar == null) {
                C8594l.m46783q("mOrientationHelper");
                throw null;
            } else if (gVar.mo10242f()) {
                C2697g gVar2 = this.f9180A;
                if (gVar2 != null) {
                    gVar2.mo10241e();
                } else {
                    C8594l.m46783q("mOrientationHelper");
                    throw null;
                }
            }
        }
        if (this.f9189J) {
            PlayerHelper playerHelper = this.f9181B;
            if (playerHelper != null) {
                playerHelper.resume();
            } else {
                C8594l.m46783q("mPlayerHelper");
                throw null;
            }
        }
    }

    /* renamed from: w0 */
    public void mo10200w0(C6722a aVar) {
        C8594l.m46771e(aVar, "ratio");
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            playerHelper.setAspectRatio(aVar);
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }

    /* renamed from: y0 */
    public void mo10201y0(short s) {
        PlayerHelper playerHelper = this.f9181B;
        if (playerHelper != null) {
            Integer audioSessionId = playerHelper.audioSessionId();
            if (audioSessionId != null) {
                int intValue = audioSessionId.intValue();
                PlayerHelper playerHelper2 = this.f9181B;
                if (playerHelper2 != null) {
                    playerHelper2.updateVirtualizer(intValue, s);
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            }
        } else {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        }
    }
}
