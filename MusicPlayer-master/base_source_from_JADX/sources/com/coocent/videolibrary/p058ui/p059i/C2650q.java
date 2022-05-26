package com.coocent.videolibrary.p058ui.p059i;

import android.app.Application;
import android.app.PendingIntent;
import android.app.RecoverableSecurityException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.C0084b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import androidx.appcompat.widget.C0315v;
import androidx.core.content.C0506a;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0684j;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0718v;
import androidx.lifecycle.C0719w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.video.videoplayercore.ConsantsKt;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.video.videoplayercore.player.PlayerHelperKt;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.videolibrary.p058ui.C2557e;
import com.coocent.videolibrary.p058ui.C2592f;
import com.coocent.videolibrary.p058ui.C2625g;
import com.coocent.videolibrary.p058ui.C2627h;
import com.coocent.videolibrary.p058ui.encrypted.C2576n;
import com.coocent.videolibrary.p058ui.encrypted.EncryptActivity;
import com.coocent.videolibrary.p058ui.p059i.C2643p;
import com.coocent.videolibrary.p058ui.search.SearchActivity;
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.coocent.videostore.p067po.Video;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8864k;
import kotlinx.coroutines.C8874l2;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.p397f3.C8731d;
import p082e.p083a.p090o.C3432b;
import p082e.p126k.p129c.p130i.C3884d;
import p082e.p126k.p129c.p130i.C3888f;
import p082e.p147t.p148e.C4163h0;
import p082e.p147t.p148e.C4165i0;
import p082e.p147t.p148e.C4168j0;
import p082e.p147t.p148e.C4177k0;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4621c;
import p159f.p166c.p224o.C4622d;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4625g;
import p159f.p166c.p224o.C4627i;
import p159f.p166c.p224o.p225k.C4631c;
import p159f.p166c.p224o.p225k.C4635g;
import p159f.p166c.p224o.p226l.C4647b;
import p159f.p166c.p224o.p226l.C4649d;
import p159f.p166c.p224o.p226l.C4655f;
import p159f.p166c.p224o.p226l.C4657g;
import p159f.p166c.p224o.p226l.C4658h;
import p159f.p166c.p224o.p226l.C4663m;
import p159f.p166c.p224o.p226l.C4664n;
import p159f.p166c.p224o.p226l.C4666o;
import p159f.p166c.p224o.p226l.C4667p;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p226l.C4671r;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p159f.p166c.p224o.p228n.p229b.C4714a;
import p159f.p166c.p224o.p228n.p230c.C4736s;
import p159f.p166c.p224o.p228n.p230c.C4745t;
import p159f.p166c.p231p.p233b.C4796a;
import p159f.p166c.p231p.p233b.C4800d;
import p159f.p166c.p231p.p233b.C4801e;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p159f.p243f.p245b.p304b.p317y.C7571b;
import p360h.p361a.p365b.p366a.C8370b;
import p369i.C8446k;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8529b;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p369i.p387z.p389d.C8606x;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.videolibrary.ui.i.q */
/* compiled from: VideoFragment.kt */
public final class C2650q extends C2557e {

    /* renamed from: E0 */
    public static final C2651a f9118E0 = new C2651a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public static final String f9119F0;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public VideoConfigBean f9120A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public PlayerHelper f9121B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public final C2661e f9122C0;

    /* renamed from: D0 */
    private final C2663f f9123D0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C4815n f9124h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C4681i f9125i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C2643p f9126j0;

    /* renamed from: k0 */
    private C4631c f9127k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C4168j0<Video> f9128l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C4613a f9129m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C3432b f9130n0;

    /* renamed from: o0 */
    private C8446k<String, Boolean> f9131o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public final ArrayList<Video> f9132p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public final ArrayList<Video> f9133q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public String f9134r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public Video f9135s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public String f9136t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C0133c f9137u0;

    /* renamed from: v0 */
    private C4635g f9138v0;

    /* renamed from: w0 */
    private String f9139w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public int f9140x0;

    /* renamed from: y0 */
    private boolean f9141y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public boolean f9142z0;

    /* renamed from: com.coocent.videolibrary.ui.i.q$a */
    /* compiled from: VideoFragment.kt */
    public static final class C2651a {
        private C2651a() {
        }

        public /* synthetic */ C2651a(C8589g gVar) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C2650q m12152c(C2651a aVar, String str, int i, boolean z, VideoConfigBean videoConfigBean, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = BuildConfig.FLAVOR;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            if ((i2 & 8) != 0) {
                videoConfigBean = null;
            }
            return aVar.mo10159b(str, i, z, videoConfigBean);
        }

        /* renamed from: a */
        public final String mo10158a() {
            return C2650q.f9119F0;
        }

        /* renamed from: b */
        public final C2650q mo10159b(String str, int i, boolean z, VideoConfigBean videoConfigBean) {
            C8594l.m46771e(str, "key");
            C2650q qVar = new C2650q();
            Bundle bundle = new Bundle();
            bundle.putString("key", str);
            bundle.putInt("function", i);
            bundle.putBoolean(qVar.mo10048Z2(), z);
            bundle.putParcelable("video_config_bean", videoConfigBean);
            C8457t tVar = C8457t.f34900a;
            qVar.mo3581C2(bundle);
            return qVar;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$b */
    /* compiled from: VideoFragment.kt */
    public static final class C2652b implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ C2650q f9143a;

        /* renamed from: b */
        final /* synthetic */ List<Video> f9144b;

        C2652b(C2650q qVar, List<? extends Video> list) {
            this.f9143a = qVar;
            this.f9144b = list;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10160b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10160b(int i) {
            if (i == -1) {
                C4815n x3 = this.f9143a.f9124h0;
                if (x3 != null) {
                    x3.mo15548h(this.f9144b);
                    this.f9143a.m12114p4(this.f9144b);
                    C3432b j3 = this.f9143a.f9130n0;
                    if (j3 != null) {
                        j3.mo703c();
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$encryptedVideoObserver$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.i.q$c */
    /* compiled from: VideoFragment.kt */
    static final class C2653c extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Video $video;
        int label;
        final /* synthetic */ C2650q this$0;

        /* renamed from: com.coocent.videolibrary.ui.i.q$c$a */
        /* compiled from: VideoFragment.kt */
        public static final class C2654a implements C4800d {

            /* renamed from: a */
            final /* synthetic */ C2650q f9145a;

            C2654a(C2650q qVar) {
                this.f9145a = qVar;
            }

            /* renamed from: a */
            public void mo10074a(double d) {
                C4681i w3 = this.f9145a.f9125i0;
                if (w3 != null) {
                    w3.mo15413i().mo4153l(Integer.valueOf((int) d));
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            }
        }

        /* renamed from: com.coocent.videolibrary.ui.i.q$c$b */
        /* compiled from: VideoFragment.kt */
        public static final class C2655b implements C4664n {

            /* renamed from: a */
            final /* synthetic */ C2650q f9146a;

            /* renamed from: b */
            final /* synthetic */ Video f9147b;

            @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$encryptedVideoObserver$1$2$encryptedVideo$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
            /* renamed from: com.coocent.videolibrary.ui.i.q$c$b$a */
            /* compiled from: VideoFragment.kt */
            static final class C2656a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
                final /* synthetic */ String $path;
                final /* synthetic */ Video $video;
                int label;
                final /* synthetic */ C2650q this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2656a(C2650q qVar, Video video, String str, C8508d<? super C2656a> dVar) {
                    super(2, dVar);
                    this.this$0 = qVar;
                    this.$video = video;
                    this.$path = str;
                }

                public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                    return new C2656a(this.this$0, this.$video, this.$path, dVar);
                }

                public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                    return ((C2656a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object unused = C8527d.m46722d();
                    if (this.label == 0) {
                        C8450m.m46575b(obj);
                        C4681i w3 = this.this$0.f9125i0;
                        if (w3 != null) {
                            w3.mo15407E(false);
                            C0133c r3 = this.this$0.f9137u0;
                            if (r3 != null) {
                                r3.dismiss();
                            }
                            this.this$0.f9137u0 = null;
                            this.this$0.f9133q0.clear();
                            this.this$0.f9133q0.add(this.$video);
                            this.this$0.f9134r0 = this.$path;
                            C4815n x3 = this.this$0.f9124h0;
                            if (x3 != null) {
                                x3.mo15549k(this.this$0.f9133q0, this.$path);
                                if (Build.VERSION.SDK_INT < 30) {
                                    this.this$0.m12114p4(C8482l.m46668i(this.$video));
                                    List unused2 = this.this$0.m12116q4(2, C8482l.m46668i(this.$video));
                                }
                                return C8457t.f34900a;
                            }
                            C8594l.m46783q("mVideoStoreViewModel");
                            throw null;
                        }
                        C8594l.m46783q("mVideoLibraryViewModel");
                        throw null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            C2655b(C2650q qVar, Video video) {
                this.f9146a = qVar;
                this.f9147b = video;
            }

            /* renamed from: a */
            public void mo10075a(String str, boolean z) {
                C8594l.m46771e(str, "path");
                if (z) {
                    C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this.f9146a), C8768g1.m47303c(), (C8910t0) null, new C2656a(this.f9146a, this.f9147b, str, (C8508d<? super C2656a>) null), 2, (Object) null);
                }
            }

            /* renamed from: b */
            public void mo10076b(Uri uri, boolean z) {
                C4664n.C4665a.m20174a(this, uri, z);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2653c(C2650q qVar, Video video, C8508d<? super C2653c> dVar) {
            super(2, dVar);
            this.this$0 = qVar;
            this.$video = video;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2653c(this.this$0, this.$video, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2653c) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                Application application = this.this$0.mo3705u2().getApplication();
                C8594l.m46770d(application, "requireActivity().application");
                Video video = this.$video;
                C2650q qVar = this.this$0;
                C4671r.m20194e(application, video, new C2654a(qVar), new C2655b(qVar, video));
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$d */
    /* compiled from: VideoFragment.kt */
    public static final class C2657d implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ C2650q f9148a;

        /* renamed from: b */
        final /* synthetic */ Video f9149b;

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$firstEncryptedShowDialog$1$onDialogResult$1", mo30600f = "VideoFragment.kt", mo30601l = {1271}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.i.q$d$a */
        /* compiled from: VideoFragment.kt */
        static final class C2658a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ Video $video;
            int label;
            final /* synthetic */ C2650q this$0;

            @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$firstEncryptedShowDialog$1$onDialogResult$1$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
            /* renamed from: com.coocent.videolibrary.ui.i.q$d$a$a */
            /* compiled from: VideoFragment.kt */
            static final class C2659a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
                final /* synthetic */ boolean $isNight;
                final /* synthetic */ Video $video;
                int label;
                final /* synthetic */ C2650q this$0;

                /* renamed from: com.coocent.videolibrary.ui.i.q$d$a$a$a */
                /* compiled from: VideoFragment.kt */
                public static final class C2660a implements C2576n {

                    /* renamed from: a */
                    final /* synthetic */ C2650q f9150a;

                    /* renamed from: b */
                    final /* synthetic */ Video f9151b;

                    C2660a(C2650q qVar, Video video) {
                        this.f9150a = qVar;
                        this.f9151b = video;
                    }

                    /* renamed from: a */
                    public void mo10061a() {
                        if (this.f9150a.mo3622Q0()) {
                            this.f9150a.m12120s4(0);
                            this.f9150a.m12080M3(this.f9151b);
                        }
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2659a(C2650q qVar, boolean z, Video video, C8508d<? super C2659a> dVar) {
                    super(2, dVar);
                    this.this$0 = qVar;
                    this.$isNight = z;
                    this.$video = video;
                }

                public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                    return new C2659a(this.this$0, this.$isNight, this.$video, dVar);
                }

                public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                    return ((C2659a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object unused = C8527d.m46722d();
                    if (this.label == 0) {
                        C8450m.m46575b(obj);
                        EncryptActivity.C2559a aVar = EncryptActivity.f8973L;
                        Context v2 = this.this$0.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        aVar.mo10056c(v2, this.$isNight, true, new C2660a(this.this$0, this.$video));
                        return C8457t.f34900a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2658a(C2650q qVar, Video video, C8508d<? super C2658a> dVar) {
                super(2, dVar);
                this.this$0 = qVar;
                this.$video = video;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2658a(this.this$0, this.$video, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2658a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d = C8527d.m46722d();
                int i = this.label;
                if (i == 0) {
                    C8450m.m46575b(obj);
                    C4668q.C4669a aVar = C4668q.f13454a;
                    Context v2 = this.this$0.mo3708v2();
                    C8594l.m46770d(v2, "requireContext()");
                    boolean j = aVar.mo15404j(v2);
                    C8874l2 c = C8768g1.m47303c();
                    C2659a aVar2 = new C2659a(this.this$0, j, this.$video, (C8508d<? super C2659a>) null);
                    this.label = 1;
                    if (C8864k.m47676e(c, aVar2, this) == d) {
                        return d;
                    }
                } else if (i == 1) {
                    C8450m.m46575b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C8457t.f34900a;
            }
        }

        C2657d(C2650q qVar, Video video) {
            this.f9148a = qVar;
            this.f9149b = video;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10163b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10163b(int i) {
            if (i == 17039370) {
                C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this.f9148a), C8768g1.m47302b(), (C8910t0) null, new C2658a(this.f9148a, this.f9149b, (C8508d<? super C2658a>) null), 2, (Object) null);
            }
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$e */
    /* compiled from: VideoFragment.kt */
    public static final class C2661e implements C3432b.C3433a {

        /* renamed from: a */
        final /* synthetic */ C2650q f9152a;

        /* renamed from: com.coocent.videolibrary.ui.i.q$e$a */
        /* compiled from: VideoFragment.kt */
        static final class C2662a extends C8595m implements C8570l<List<? extends Parcelable>, C8457t> {
            final /* synthetic */ C2650q this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2662a(C2650q qVar) {
                super(1);
                this.this$0 = qVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends Parcelable>) (List) obj);
                return C8457t.f34900a;
            }

            public final void invoke(List<? extends Parcelable> list) {
                C8594l.m46771e(list, "it");
                C2650q qVar = this.this$0;
                qVar.m12079L3(qVar.f9132p0);
            }
        }

        C2661e(C2650q qVar) {
            this.f9152a = qVar;
        }

        /* renamed from: a */
        public void mo592a(C3432b bVar) {
            this.f9152a.f9130n0 = null;
            C4168j0 y3 = this.f9152a.f9128l0;
            if (y3 != null) {
                y3.mo14293e();
                C2643p u3 = this.f9152a.f9126j0;
                if (u3 != null) {
                    u3.mo10138q("no_select_mode");
                    if (this.f9152a.mo3606L() != null && (this.f9152a.mo3705u2() instanceof C2627h)) {
                        this.f9152a.f9142z0 = false;
                        ((C2627h) this.f9152a.mo3705u2()).mo10042J(true);
                    }
                    if (this.f9152a.mo3690p0() != null && (this.f9152a.mo3710w2() instanceof C2627h)) {
                        this.f9152a.f9142z0 = false;
                        ((C2627h) this.f9152a.mo3710w2()).mo10042J(true);
                    }
                    if (this.f9152a.mo3705u2() instanceof C2592f) {
                        ((C2592f) this.f9152a.mo3705u2()).mo10081a(false);
                    }
                    if (this.f9152a.mo3690p0() != null && (this.f9152a.mo3710w2() instanceof C2592f)) {
                        ((C2592f) this.f9152a.mo3710w2()).mo10081a(false);
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mVideoAdapter");
                throw null;
            }
            C8594l.m46783q("mVideoTracker");
            throw null;
        }

        /* renamed from: b */
        public boolean mo593b(C3432b bVar, Menu menu) {
            Window window;
            MenuInflater f;
            C8594l.m46771e(menu, "menu");
            if (!(bVar == null || (f = bVar.mo706f()) == null)) {
                f.inflate(C4625g.video_menu_action_mode, menu);
            }
            if (bVar != null) {
                StringBuilder sb = new StringBuilder();
                C4168j0 y3 = this.f9152a.f9128l0;
                if (y3 != null) {
                    sb.append(y3.mo14298j().size());
                    sb.append('/');
                    C2643p u3 = this.f9152a.f9126j0;
                    if (u3 != null) {
                        sb.append(u3.getItemCount());
                        bVar.mo715r(sb.toString());
                    } else {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mVideoTracker");
                    throw null;
                }
            }
            if (Build.VERSION.SDK_INT < 21 || (window = this.f9152a.mo3705u2().getWindow()) == null) {
                return true;
            }
            window.setStatusBarColor(C4647b.m20153b(this.f9152a.mo3705u2(), C4619a.colorPrimaryDark, 0, 4, (Object) null));
            return true;
        }

        /* renamed from: c */
        public boolean mo594c(C3432b bVar, Menu menu) {
            C8594l.m46771e(menu, "menu");
            if (this.f9152a.mo3606L() != null && (this.f9152a.mo3705u2() instanceof C2627h)) {
                this.f9152a.f9142z0 = true;
                ((C2627h) this.f9152a.mo3705u2()).mo10042J(false);
            }
            if (this.f9152a.mo3690p0() != null && (this.f9152a.mo3710w2() instanceof C2627h)) {
                this.f9152a.f9142z0 = true;
                ((C2627h) this.f9152a.mo3710w2()).mo10042J(false);
            }
            if (this.f9152a.mo3705u2() instanceof C2592f) {
                ((C2592f) this.f9152a.mo3705u2()).mo10081a(true);
            }
            if (this.f9152a.mo3690p0() != null && (this.f9152a.mo3710w2() instanceof C2592f)) {
                ((C2592f) this.f9152a.mo3710w2()).mo10081a(true);
            }
            Context v2 = this.f9152a.mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            C4663m.m20168a(menu, v2);
            return true;
        }

        /* renamed from: d */
        public boolean mo595d(C3432b bVar, MenuItem menuItem) {
            Integer valueOf = menuItem == null ? null : Integer.valueOf(menuItem.getItemId());
            int i = C4623e.action_select_all;
            if (valueOf != null && valueOf.intValue() == i) {
                C4168j0 y3 = this.f9152a.f9128l0;
                if (y3 != null) {
                    int size = y3.mo14298j().size();
                    C2643p u3 = this.f9152a.f9126j0;
                    if (u3 == null) {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    } else if (size == u3.getItemCount()) {
                        C4168j0 y32 = this.f9152a.f9128l0;
                        if (y32 != null) {
                            y32.mo14293e();
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    } else {
                        C4168j0 y33 = this.f9152a.f9128l0;
                        if (y33 != null) {
                            C2643p u32 = this.f9152a.f9126j0;
                            if (u32 != null) {
                                List c = u32.mo5380c();
                                C8594l.m46770d(c, "mVideoAdapter.currentList");
                                y33.mo14304p(c, true);
                            } else {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                } else {
                    C8594l.m46783q("mVideoTracker");
                    throw null;
                }
            } else {
                int i2 = C4623e.action_delete;
                if (valueOf != null && valueOf.intValue() == i2) {
                    C4168j0 y34 = this.f9152a.f9128l0;
                    if (y34 == null) {
                        C8594l.m46783q("mVideoTracker");
                        throw null;
                    } else if (y34.mo14298j().isEmpty()) {
                        return true;
                    } else {
                        this.f9152a.f9132p0.clear();
                        ArrayList m3 = this.f9152a.f9132p0;
                        C4168j0 y35 = this.f9152a.f9128l0;
                        if (y35 != null) {
                            C4163h0 j = y35.mo14298j();
                            C8594l.m46770d(j, "mVideoTracker.selection");
                            boolean unused = C8487q.m46675p(m3, j);
                            C4613a v3 = this.f9152a.f9129m0;
                            if (v3 != null) {
                                FragmentActivity u2 = this.f9152a.mo3705u2();
                                C8594l.m46770d(u2, "requireActivity()");
                                v3.mo15367m(u2, this.f9152a.f9132p0, new C2662a(this.f9152a));
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$f */
    /* compiled from: VideoFragment.kt */
    public static final class C2663f implements C2643p.C2644a {

        /* renamed from: a */
        final /* synthetic */ C2650q f9153a;

        /* renamed from: com.coocent.videolibrary.ui.i.q$f$a */
        /* compiled from: VideoFragment.kt */
        public static final class C2664a implements C4745t<String> {

            /* renamed from: a */
            final /* synthetic */ C2650q f9154a;

            /* renamed from: b */
            final /* synthetic */ Video f9155b;

            C2664a(C2650q qVar, Video video) {
                this.f9154a = qVar;
                this.f9155b = video;
            }

            /* renamed from: b */
            public void mo10036a(String str) {
                C8594l.m46771e(str, "result");
                this.f9154a.m12110n4(this.f9155b, str);
            }
        }

        /* renamed from: com.coocent.videolibrary.ui.i.q$f$b */
        /* compiled from: VideoFragment.kt */
        static final class C2665b extends C8595m implements C8570l<List<? extends Parcelable>, C8457t> {
            final /* synthetic */ C2650q this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2665b(C2650q qVar) {
                super(1);
                this.this$0 = qVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends Parcelable>) (List) obj);
                return C8457t.f34900a;
            }

            public final void invoke(List<? extends Parcelable> list) {
                C8594l.m46771e(list, "it");
                C2650q qVar = this.this$0;
                qVar.m12079L3(qVar.f9132p0);
            }
        }

        C2663f(C2650q qVar) {
            this.f9153a = qVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final boolean m12168d(C2650q qVar, Video video, int i, MenuItem menuItem) {
            C8594l.m46771e(qVar, "this$0");
            C8594l.m46771e(video, "$video");
            int itemId = menuItem.getItemId();
            if (itemId == C4623e.action_play) {
                C4613a v3 = qVar.f9129m0;
                if (v3 != null) {
                    if (qVar.mo3651a0() != null) {
                        Context v2 = qVar.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        v3.mo15369o(v2, video);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    PlayerHelper q3 = qVar.f9121B0;
                    if (q3 != null) {
                        q3.updateLastPlaybackTime(video, currentTimeMillis);
                        PlayerHelper q32 = qVar.f9121B0;
                        if (q32 != null) {
                            q32.updateIsEncrypted(video);
                            C2643p u3 = qVar.f9126j0;
                            if (u3 != null) {
                                u3.mo10137p(video.mo10553l());
                                VideoConfigBean.C2691a aVar = new VideoConfigBean.C2691a();
                                VideoConfigBean l3 = qVar.f9120A0;
                                if (l3 != null) {
                                    aVar.mo10225c(l3.mo10218h());
                                    aVar.mo10226d(l3.mo10220j());
                                }
                                C2643p u32 = qVar.f9126j0;
                                if (u32 != null) {
                                    List c = u32.mo5380c();
                                    C8594l.m46770d(c, "mVideoAdapter.currentList");
                                    aVar.mo10229g(c);
                                    aVar.mo10231i(i);
                                    Context v22 = qVar.mo3708v2();
                                    C8594l.m46770d(v22, "requireContext()");
                                    v3.mo15360f(v22, aVar.mo10223a());
                                } else {
                                    C8594l.m46783q("mVideoAdapter");
                                    throw null;
                                }
                            } else {
                                C8594l.m46783q("mVideoAdapter");
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
            } else if (itemId == C4623e.action_edit) {
                C4613a v32 = qVar.f9129m0;
                if (v32 != null) {
                    Context v23 = qVar.mo3708v2();
                    C8594l.m46770d(v23, "requireContext()");
                    String t = video.mo10561t();
                    C8594l.m46770d(t, "video.path");
                    v32.mo15356b(v23, t);
                }
            } else if (itemId == C4623e.action_encrypted) {
                C4681i w3 = qVar.f9125i0;
                if (w3 != null) {
                    w3.mo15407E(true);
                    qVar.m12097d4(video);
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else if (itemId == C4623e.action_share) {
                Uri parse = Uri.parse(video.mo10567x());
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", parse);
                intent.setType(video.mo10560s());
                qVar.mo3627R2(Intent.createChooser(intent, qVar.mo3582D0(C4627i.coocent_video_share)));
            } else if (itemId == C4623e.action_rename) {
                C4736s sVar = C4736s.f13541a;
                C0602j q0 = qVar.mo3693q0();
                C8594l.m46770d(q0, "parentFragmentManager");
                sVar.mo15463f(q0, video, new C2664a(qVar, video));
            } else if (itemId == C4623e.action_delete) {
                qVar.f9132p0.clear();
                qVar.f9132p0.add(video);
                C4613a v33 = qVar.f9129m0;
                if (v33 != null) {
                    FragmentActivity u2 = qVar.mo3705u2();
                    C8594l.m46770d(u2, "requireActivity()");
                    v33.mo15367m(u2, qVar.f9132p0, new C2665b(qVar));
                }
            } else if (itemId == C4623e.action_info) {
                C4736s sVar2 = C4736s.f13541a;
                C0602j q02 = qVar.mo3693q0();
                C8594l.m46770d(q02, "parentFragmentManager");
                sVar2.mo15462e(q02, video);
            }
            return true;
        }

        /* renamed from: a */
        public void mo10071a(View view, Video video, int i) {
            C8594l.m46771e(view, "view");
            C8594l.m46771e(video, "video");
            Boolean m = video.mo10554m();
            C8594l.m46770d(m, "video.isPrivateVideo");
            if (m.booleanValue() || video.mo10554m() == null) {
                video.mo10526O(Boolean.FALSE);
            }
            C0315v vVar = new C0315v(this.f9153a.mo3708v2(), view, 8388613);
            C2650q qVar = this.f9153a;
            vVar.mo2141c(C4625g.video_menu_video_item);
            vVar.mo2142d(new C2642o(qVar, video, i));
            vVar.mo2143e();
        }

        /* renamed from: b */
        public void mo10072b(Video video, int i) {
            C8594l.m46771e(video, "video");
            Boolean m = video.mo10554m();
            C8594l.m46770d(m, "video.isPrivateVideo");
            if (m.booleanValue() || video.mo10554m() == null) {
                video.mo10526O(Boolean.FALSE);
            }
            if (this.f9153a.f9130n0 == null) {
                C4613a v3 = this.f9153a.f9129m0;
                if (v3 != null) {
                    C2650q qVar = this.f9153a;
                    Context applicationContext = qVar.mo3708v2().getApplicationContext();
                    C8594l.m46770d(applicationContext, "requireContext().applicationContext");
                    v3.mo15369o(applicationContext, video);
                    long currentTimeMillis = System.currentTimeMillis();
                    PlayerHelper q3 = qVar.f9121B0;
                    if (q3 != null) {
                        q3.updateLastPlaybackTime(video, currentTimeMillis);
                        PlayerHelper q32 = qVar.f9121B0;
                        if (q32 != null) {
                            q32.updateIsEncrypted(video);
                            C2643p u3 = qVar.f9126j0;
                            if (u3 != null) {
                                u3.mo10137p(video.mo10553l());
                                VideoConfigBean.C2691a aVar = new VideoConfigBean.C2691a();
                                VideoConfigBean l3 = qVar.f9120A0;
                                if (l3 != null) {
                                    aVar.mo10225c(l3.mo10218h());
                                    aVar.mo10226d(l3.mo10220j());
                                }
                                C2643p u32 = qVar.f9126j0;
                                if (u32 != null) {
                                    List c = u32.mo5380c();
                                    C8594l.m46770d(c, "mVideoAdapter.currentList");
                                    aVar.mo10229g(c);
                                    aVar.mo10231i(i);
                                    Context v2 = qVar.mo3708v2();
                                    C8594l.m46770d(v2, "requireContext()");
                                    v3.mo15360f(v2, aVar.mo10223a());
                                    return;
                                }
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        }
                        C8594l.m46783q("mPlayerHelper");
                        throw null;
                    }
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
                return;
            }
            C4168j0 y3 = this.f9153a.f9128l0;
            if (y3 != null) {
                y3.mo14304p(C8482l.m46668i(video), true);
                return;
            }
            C8594l.m46783q("mVideoTracker");
            throw null;
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$onActionEncrypt$1", mo30600f = "VideoFragment.kt", mo30601l = {1341, 1252}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.i.q$g */
    /* compiled from: VideoFragment.kt */
    static final class C2666g extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Video $video;
        int label;
        final /* synthetic */ C2650q this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$onActionEncrypt$1$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.i.q$g$a */
        /* compiled from: VideoFragment.kt */
        static final class C2667a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ String $success;
            final /* synthetic */ Video $video;
            int label;
            final /* synthetic */ C2650q this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2667a(String str, C2650q qVar, Video video, C8508d<? super C2667a> dVar) {
                super(2, dVar);
                this.$success = str;
                this.this$0 = qVar;
                this.$video = video;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2667a(this.$success, this.this$0, this.$video, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2667a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    if (TextUtils.isEmpty(this.$success)) {
                        this.this$0.m12081N3(this.$video);
                    } else {
                        this.this$0.m12118r4(this.$video);
                    }
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2666g(C2650q qVar, Video video, C8508d<? super C2666g> dVar) {
            super(2, dVar);
            this.this$0 = qVar;
            this.$video = video;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2666g(this.this$0, this.$video, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2666g) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C4655f fVar = C4655f.f13444a;
                Context v2 = this.this$0.mo3708v2();
                C8594l.m46770d(v2, "requireContext()");
                C4649d dVar = new C4649d(C4657g.m20158a(v2).mo13321b());
                this.label = 1;
                obj = C8731d.m47259d(dVar, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else if (i == 2) {
                C8450m.m46575b(obj);
                return C8457t.f34900a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8874l2 c = C8768g1.m47303c();
            C2667a aVar = new C2667a((String) obj, this.this$0, this.$video, (C8508d<? super C2667a>) null);
            this.label = 2;
            if (C8864k.m47676e(c, aVar, this) == d) {
                return d;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$h */
    /* compiled from: VideoFragment.kt */
    public static final class C2668h implements C4745t<String> {

        /* renamed from: a */
        final /* synthetic */ boolean f9156a;

        /* renamed from: b */
        final /* synthetic */ C2650q f9157b;

        C2668h(boolean z, C2650q qVar) {
            this.f9156a = z;
            this.f9157b = qVar;
        }

        /* renamed from: b */
        public void mo10036a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (this.f9156a) {
                SearchActivity.C2683a aVar = SearchActivity.f9167E;
                FragmentActivity u2 = this.f9157b.mo3705u2();
                C8594l.m46770d(u2, "requireActivity()");
                aVar.mo10185a(u2, str);
                return;
            }
            C0620p i = this.f9157b.mo3693q0().mo3957i();
            C8594l.m46770d(i, "parentFragmentManager.beginTransaction()");
            Fragment Y = this.f9157b.mo3693q0().mo3938Y(str);
            if (Y == null) {
                C2651a aVar2 = C2650q.f9118E0;
                C8594l.m46769c(str);
                Y = C2651a.m12152c(aVar2, str, 2, false, (VideoConfigBean) null, 12, (Object) null);
                i.mo4069c(C4623e.layout_container, Y, str);
                i.mo4073g(str);
            } else {
                i.mo4076s(C4623e.layout_container, Y, str);
                i.mo4073g(str);
            }
            Fragment Y2 = this.f9157b.mo3693q0().mo3938Y(C2650q.f9118E0.mo10158a());
            if (Y2 != null) {
                i.mo3821p(Y2);
            }
            i.mo3826v(Y);
            i.mo3815i();
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$i */
    /* compiled from: VideoFragment.kt */
    public static final class C2669i implements C4745t<C8446k<? extends String, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C2650q f9158a;

        C2669i(C2650q qVar) {
            this.f9158a = qVar;
        }

        /* renamed from: b */
        public void mo10036a(C8446k<String, Boolean> kVar) {
            C8594l.m46771e(kVar, "result");
            C4681i w3 = this.f9158a.f9125i0;
            if (w3 != null) {
                w3.mo15408F(kVar.getFirst(), kVar.getSecond().booleanValue(), false, this.f9158a.f9140x0 == 3);
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$onActivityResult$2", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.i.q$j */
    /* compiled from: VideoFragment.kt */
    static final class C2670j extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ C2650q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2670j(C2650q qVar, C8508d<? super C2670j> dVar) {
            super(2, dVar);
            this.this$0 = qVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2670j(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2670j) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                Iterator it = this.this$0.f9133q0.iterator();
                while (it.hasNext()) {
                    Video video = (Video) it.next();
                    File file = new File(this.this$0.f9134r0);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$k */
    /* compiled from: VideoFragment.kt */
    public static final class C2671k extends C0084b {

        /* renamed from: c */
        final /* synthetic */ C2650q f9159c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2671k(C2650q qVar, boolean z) {
            super(z);
            this.f9159c = qVar;
        }

        /* renamed from: b */
        public void mo400b() {
            if (this.f9159c.mo3705u2() instanceof C2592f) {
                ((C2592f) this.f9159c.mo3705u2()).mo10081a(false);
            }
            if (this.f9159c.mo3690p0() != null && (this.f9159c.mo3710w2() instanceof C2592f)) {
                ((C2592f) this.f9159c.mo3710w2()).mo10081a(false);
            }
            if (this.f9159c.mo3606L() != null && (this.f9159c.mo3705u2() instanceof C2627h)) {
                String D0 = this.f9159c.mo3582D0(C4627i.coocent_mime_type_video);
                C8594l.m46770d(D0, "getString(R.string.coocent_mime_type_video)");
                ((C2627h) this.f9159c.mo3705u2()).mo10046v0(D0);
            }
            if (this.f9159c.mo3690p0() != null && (this.f9159c.mo3710w2() instanceof C2627h)) {
                String D02 = this.f9159c.mo3582D0(C4627i.coocent_mime_type_video);
                C8594l.m46770d(D02, "getString(R.string.coocent_mime_type_video)");
                ((C2627h) this.f9159c.mo3710w2()).mo10046v0(D02);
            }
            this.f9159c.mo3693q0().mo3917H0((String) null, 1);
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$onEncrypted$1", mo30600f = "VideoFragment.kt", mo30601l = {1341, 1028}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.i.q$l */
    /* compiled from: VideoFragment.kt */
    static final class C2672l extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        boolean Z$0;
        int label;
        final /* synthetic */ C2650q this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$onEncrypted$1$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.i.q$l$a */
        /* compiled from: VideoFragment.kt */
        static final class C2673a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ boolean $isNight;
            final /* synthetic */ String $success;
            int label;
            final /* synthetic */ C2650q this$0;

            /* renamed from: com.coocent.videolibrary.ui.i.q$l$a$a */
            /* compiled from: VideoFragment.kt */
            public static final class C2674a implements C4745t<Integer> {

                /* renamed from: a */
                final /* synthetic */ C2650q f9160a;

                /* renamed from: b */
                final /* synthetic */ boolean f9161b;

                C2674a(C2650q qVar, boolean z) {
                    this.f9160a = qVar;
                    this.f9161b = z;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
                    mo10176b(((Number) obj).intValue());
                }

                /* renamed from: b */
                public void mo10176b(int i) {
                    if (i == 17039370) {
                        EncryptActivity.C2559a aVar = EncryptActivity.f8973L;
                        Context v2 = this.f9160a.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        EncryptActivity.C2559a.m11826d(aVar, v2, this.f9161b, false, (C2576n) null, 12, (Object) null);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2673a(String str, C2650q qVar, boolean z, C8508d<? super C2673a> dVar) {
                super(2, dVar);
                this.$success = str;
                this.this$0 = qVar;
                this.$isNight = z;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2673a(this.$success, this.this$0, this.$isNight, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2673a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    if (TextUtils.isEmpty(this.$success)) {
                        C4736s sVar = C4736s.f13541a;
                        String string = this.this$0.mo3708v2().getString(C4627i.video_first_encrypt_dialog_message);
                        C8594l.m46770d(string, "requireContext().getStri…                        )");
                        C0602j q0 = this.this$0.mo3693q0();
                        C8594l.m46770d(q0, "parentFragmentManager");
                        sVar.mo15460c((String) null, string, q0, new C2674a(this.this$0, this.$isNight));
                    } else {
                        EncryptActivity.C2559a aVar = EncryptActivity.f8973L;
                        Context v2 = this.this$0.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        EncryptActivity.C2559a.m11826d(aVar, v2, this.$isNight, false, (C2576n) null, 12, (Object) null);
                    }
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2672l(C2650q qVar, C8508d<? super C2672l> dVar) {
            super(2, dVar);
            this.this$0 = qVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2672l(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2672l) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C4668q.C4669a aVar = C4668q.f13454a;
                Context v2 = this.this$0.mo3708v2();
                C8594l.m46770d(v2, "requireContext()");
                z = aVar.mo15404j(v2);
                C4655f fVar = C4655f.f13444a;
                Context v22 = this.this$0.mo3708v2();
                C8594l.m46770d(v22, "requireContext()");
                C4649d dVar = new C4649d(C4657g.m20158a(v22).mo13321b());
                this.Z$0 = z;
                this.label = 1;
                obj = C8731d.m47259d(dVar, this);
                if (obj == d) {
                    return d;
                }
            } else if (i == 1) {
                z = this.Z$0;
                C8450m.m46575b(obj);
            } else if (i == 2) {
                C8450m.m46575b(obj);
                return C8457t.f34900a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C8874l2 c = C8768g1.m47303c();
            C2673a aVar2 = new C2673a((String) obj, this.this$0, z, (C8508d<? super C2673a>) null);
            this.label = 2;
            if (C8864k.m47676e(c, aVar2, this) == d) {
                return d;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$m */
    /* compiled from: VideoFragment.kt */
    public static final class C2675m implements C4801e {

        /* renamed from: a */
        final /* synthetic */ C2650q f9162a;

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$onRenameVideo$1$onRenameError$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.i.q$m$a */
        /* compiled from: VideoFragment.kt */
        static final class C2676a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ Exception $exception;
            int label;
            final /* synthetic */ C2650q this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2676a(Exception exc, C2650q qVar, C8508d<? super C2676a> dVar) {
                super(2, dVar);
                this.$exception = exc;
                this.this$0 = qVar;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2676a(this.$exception, this.this$0, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2676a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    if (Build.VERSION.SDK_INT >= 29) {
                        Exception exc = this.$exception;
                        if (exc instanceof RecoverableSecurityException) {
                            try {
                                IntentSender intentSender = ((RecoverableSecurityException) exc).getUserAction().getActionIntent().getIntentSender();
                                C8594l.m46770d(intentSender, "exception.userAction.actionIntent.intentSender");
                                this.this$0.mo3641V2(intentSender, 1113, (Intent) null, 0, 0, 0, (Bundle) null);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            Toast.makeText(this.this$0.mo3708v2(), C4627i.coocent_video_rename_failed, 0).show();
                        }
                    } else {
                        Toast.makeText(this.this$0.mo3708v2(), C4627i.coocent_video_rename_failed, 0).show();
                    }
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$onRenameVideo$1$onRenameSuccess$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.i.q$m$b */
        /* compiled from: VideoFragment.kt */
        static final class C2677b extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ String $displayName;
            final /* synthetic */ String $path;
            final /* synthetic */ String $title;
            final /* synthetic */ long $videoId;
            int label;
            final /* synthetic */ C2650q this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2677b(C2650q qVar, long j, String str, String str2, String str3, C8508d<? super C2677b> dVar) {
                super(2, dVar);
                this.this$0 = qVar;
                this.$videoId = j;
                this.$title = str;
                this.$displayName = str2;
                this.$path = str3;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2677b(this.this$0, this.$videoId, this.$title, this.$displayName, this.$path, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2677b) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    C4815n x3 = this.this$0.f9124h0;
                    if (x3 != null) {
                        x3.mo15547Y(this.$videoId, this.$title, this.$displayName, this.$path);
                        Video t3 = this.this$0.f9135s0;
                        if (t3 != null) {
                            C2650q qVar = this.this$0;
                            PlayerHelper q3 = qVar.f9121B0;
                            if (q3 != null) {
                                if (q3.isWindows()) {
                                    PlayerHelper q32 = qVar.f9121B0;
                                    if (q32 != null) {
                                        q32.reVideoTitle(t3, qVar.f9136t0);
                                    } else {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    }
                                } else {
                                    PlayerHelper q33 = qVar.f9121B0;
                                    if (q33 == null) {
                                        C8594l.m46783q("mPlayerHelper");
                                        throw null;
                                    } else if (q33.isAudioPlay()) {
                                        qVar.mo3708v2().sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_RENAME()).putExtra(AudioPlayService.KEY_RENAME, qVar.f9136t0).putExtra(AudioPlayService.KEY_RENAME_VIDEO, t3));
                                    }
                                }
                                t3.mo10538a0(qVar.f9136t0);
                                List H3 = qVar.m12116q4(1, C8482l.m46668i(t3));
                                C2643p u3 = qVar.f9126j0;
                                if (u3 != null) {
                                    u3.mo5382e(C8490t.m46689z(H3));
                                    C2643p u32 = qVar.f9126j0;
                                    if (u32 != null) {
                                        C2643p u33 = qVar.f9126j0;
                                        if (u33 != null) {
                                            u32.notifyItemChanged(0, C8529b.m46724b(u33.getItemCount()));
                                        } else {
                                            C8594l.m46783q("mVideoAdapter");
                                            throw null;
                                        }
                                    } else {
                                        C8594l.m46783q("mVideoAdapter");
                                        throw null;
                                    }
                                } else {
                                    C8594l.m46783q("mVideoAdapter");
                                    throw null;
                                }
                            } else {
                                C8594l.m46783q("mPlayerHelper");
                                throw null;
                            }
                        }
                        return C8457t.f34900a;
                    }
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C2675m(C2650q qVar) {
            this.f9162a = qVar;
        }

        /* renamed from: a */
        public void mo10177a(Exception exc) {
            C8594l.m46771e(exc, "exception");
            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this.f9162a), C8768g1.m47303c(), (C8910t0) null, new C2676a(exc, this.f9162a, (C8508d<? super C2676a>) null), 2, (Object) null);
        }

        /* renamed from: b */
        public void mo10178b(long j, String str, String str2, String str3) {
            C8594l.m46771e(str, "title");
            String str4 = str2;
            C8594l.m46771e(str4, "displayName");
            String str5 = str3;
            C8594l.m46771e(str5, "path");
            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this.f9162a), C8768g1.m47303c(), (C8910t0) null, new C2677b(this.f9162a, j, str, str4, str5, (C8508d<? super C2677b>) null), 2, (Object) null);
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$n */
    /* compiled from: VideoFragment.kt */
    public static final class C2678n extends RecyclerView.C0817t {

        /* renamed from: a */
        final /* synthetic */ C2650q f9163a;

        C2678n(C2650q qVar) {
            this.f9163a = qVar;
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            C8594l.m46771e(recyclerView, "recyclerView");
            if (this.f9163a.mo3606L() != null && (this.f9163a.mo3705u2() instanceof C2627h)) {
                ((C2627h) this.f9163a.mo3705u2()).mo10042J(!this.f9163a.f9142z0 && !recyclerView.canScrollVertically(-1));
            }
            super.mo4985b(recyclerView, i, i2);
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$o */
    /* compiled from: VideoFragment.kt */
    public static final class C2679o extends C4168j0.C4174b<Video> {

        /* renamed from: a */
        final /* synthetic */ C2650q f9164a;

        C2679o(C2650q qVar) {
            this.f9164a = qVar;
        }

        /* renamed from: b */
        public void mo10079b() {
            Menu e;
            Menu e2;
            super.mo10079b();
            C4168j0 y3 = this.f9164a.f9128l0;
            if (y3 != null) {
                boolean z = true;
                if (!y3.mo14298j().isEmpty()) {
                    if (this.f9164a.f9130n0 == null) {
                        C2650q qVar = this.f9164a;
                        qVar.f9130n0 = ((AppCompatActivity) qVar.mo3705u2()).mo479Z1(this.f9164a.f9122C0);
                    }
                    C3432b j3 = this.f9164a.f9130n0;
                    if (j3 != null) {
                        j3.mo12166j();
                    }
                    C3432b j32 = this.f9164a.f9130n0;
                    if (!(j32 == null || (e2 = j32.mo705e()) == null)) {
                        Context v2 = this.f9164a.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        C4168j0 y32 = this.f9164a.f9128l0;
                        if (y32 != null) {
                            int size = y32.mo14298j().size();
                            C2643p u3 = this.f9164a.f9126j0;
                            if (u3 != null) {
                                if (size != u3.getItemCount()) {
                                    z = false;
                                }
                                C4663m.m20169b(e2, v2, z);
                            } else {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                    C3432b j33 = this.f9164a.f9130n0;
                    if (j33 != null) {
                        StringBuilder sb = new StringBuilder();
                        C4168j0 y33 = this.f9164a.f9128l0;
                        if (y33 != null) {
                            sb.append(y33.mo14298j().size());
                            sb.append('/');
                            C2643p u32 = this.f9164a.f9126j0;
                            if (u32 != null) {
                                sb.append(u32.getItemCount());
                                j33.mo715r(sb.toString());
                            } else {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                    C2643p u33 = this.f9164a.f9126j0;
                    if (u33 != null) {
                        if (!C8594l.m46767a(u33.mo10132k(), "no_select_mode")) {
                            C2643p u34 = this.f9164a.f9126j0;
                            if (u34 == null) {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            } else if (!C8594l.m46767a(u34.mo10132k(), "un_select_mode")) {
                                return;
                            }
                        }
                        C2643p u35 = this.f9164a.f9126j0;
                        if (u35 != null) {
                            u35.mo10138q("select_mode");
                        } else {
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    }
                } else if (this.f9164a.f9130n0 == null) {
                    C2643p u36 = this.f9164a.f9126j0;
                    if (u36 == null) {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    } else if (C8594l.m46767a(u36.mo10132k(), "select_mode")) {
                        C2643p u37 = this.f9164a.f9126j0;
                        if (u37 != null) {
                            u37.mo10138q("no_select_mode");
                        } else {
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        }
                    }
                } else {
                    C3432b j34 = this.f9164a.f9130n0;
                    if (!(j34 == null || (e = j34.mo705e()) == null)) {
                        Context v22 = this.f9164a.mo3708v2();
                        C8594l.m46770d(v22, "requireContext()");
                        C4168j0 y34 = this.f9164a.f9128l0;
                        if (y34 != null) {
                            int size2 = y34.mo14298j().size();
                            C2643p u38 = this.f9164a.f9126j0;
                            if (u38 != null) {
                                if (size2 != u38.getItemCount()) {
                                    z = false;
                                }
                                C4663m.m20169b(e, v22, z);
                            } else {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                    C3432b j35 = this.f9164a.f9130n0;
                    if (j35 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        C4168j0 y35 = this.f9164a.f9128l0;
                        if (y35 != null) {
                            sb2.append(y35.mo14298j().size());
                            sb2.append('/');
                            C2643p u39 = this.f9164a.f9126j0;
                            if (u39 != null) {
                                sb2.append(u39.getItemCount());
                                j35.mo715r(sb2.toString());
                            } else {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                    C2643p u310 = this.f9164a.f9126j0;
                    if (u310 == null) {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    } else if (C8594l.m46767a(u310.mo10132k(), "select_mode")) {
                        C2643p u311 = this.f9164a.f9126j0;
                        if (u311 != null) {
                            u311.mo10138q("un_select_mode");
                        } else {
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        }
                    }
                }
            } else {
                C8594l.m46783q("mVideoTracker");
                throw null;
            }
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$releasePlayBack$1$1", mo30600f = "VideoFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.i.q$p */
    /* compiled from: VideoFragment.kt */
    static final class C2680p extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ List<Video> $deleteList;
        final /* synthetic */ PlayerHelper $this_apply;
        int label;
        final /* synthetic */ C2650q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2680p(C2650q qVar, List<? extends Video> list, PlayerHelper playerHelper, C8508d<? super C2680p> dVar) {
            super(2, dVar);
            this.this$0 = qVar;
            this.$deleteList = list;
            this.$this_apply = playerHelper;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2680p(this.this$0, this.$deleteList, this.$this_apply, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2680p) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                C4815n x3 = this.this$0.f9124h0;
                if (x3 != null) {
                    Video v = x3.mo15558v(false);
                    if (v != null) {
                        List<Video> list = this.$deleteList;
                        PlayerHelper playerHelper = this.$this_apply;
                        for (Video l : list) {
                            if (v.mo10553l() == l.mo10553l()) {
                                playerHelper.saveVideoInfo();
                            }
                        }
                    }
                    return C8457t.f34900a;
                }
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.q$q */
    /* compiled from: VideoFragment.kt */
    public static final class C2681q implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ C2650q f9165a;

        /* renamed from: b */
        final /* synthetic */ Video f9166b;

        C2681q(C2650q qVar, Video video) {
            this.f9165a = qVar;
            this.f9166b = video;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10182b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10182b(int i) {
            if (i == 1) {
                this.f9165a.m12120s4(0);
                this.f9165a.m12080M3(this.f9166b);
                return;
            }
            C4681i w3 = this.f9165a.f9125i0;
            if (w3 != null) {
                w3.mo15407E(false);
                C0133c r3 = this.f9165a.f9137u0;
                if (r3 != null) {
                    r3.dismiss();
                }
                this.f9165a.f9137u0 = null;
                return;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.video.VideoFragment$subscribeUI$11", mo30600f = "VideoFragment.kt", mo30601l = {801}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.i.q$r */
    /* compiled from: VideoFragment.kt */
    static final class C2682r extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ C2650q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2682r(C2650q qVar, C8508d<? super C2682r> dVar) {
            super(2, dVar);
            this.this$0 = qVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2682r(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2682r) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                PlayerHelper q3 = this.this$0.f9121B0;
                if (q3 != null) {
                    this.label = 1;
                    obj = PlayerHelper.getLastPlayVideoId$default(q3, false, this, 1, (Object) null);
                    if (obj == d) {
                        return d;
                    }
                } else {
                    C8594l.m46783q("mPlayerHelper");
                    throw null;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long longValue = ((Number) obj).longValue();
            C2643p u3 = this.this$0.f9126j0;
            if (u3 != null) {
                u3.mo10137p(longValue);
                return C8457t.f34900a;
            }
            C8594l.m46783q("mVideoAdapter");
            throw null;
        }
    }

    static {
        String canonicalName = C2650q.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "VideoFragment";
        }
        f9119F0 = canonicalName;
    }

    public C2650q() {
        C4616c a = C4615b.m20080a();
        this.f9129m0 = a == null ? null : a.mo15370a();
        this.f9131o0 = new C8446k<>("date_modified", Boolean.FALSE);
        this.f9132p0 = new ArrayList<>();
        this.f9133q0 = new ArrayList<>();
        this.f9134r0 = BuildConfig.FLAVOR;
        this.f9136t0 = BuildConfig.FLAVOR;
        this.f9139w0 = BuildConfig.FLAVOR;
        this.f9122C0 = new C2661e(this);
        this.f9123D0 = new C2663f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final void m12062A4(C2650q qVar, Boolean bool) {
        C8594l.m46771e(qVar, "this$0");
        C4681i iVar = qVar.f9125i0;
        if (iVar != null) {
            iVar.mo15420p().mo4149h(qVar.mo3607L0(), new C2639l(qVar, bool));
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public static final void m12064B4(C2650q qVar, Boolean bool, C8446k kVar) {
        C8594l.m46771e(qVar, "this$0");
        C8594l.m46770d(kVar, "it");
        qVar.f9131o0 = kVar;
        C8594l.m46770d(bool, "granted");
        if (!bool.booleanValue()) {
            return;
        }
        if (!TextUtils.isEmpty(qVar.f9139w0)) {
            int i = qVar.f9140x0;
            if (i == 2) {
                C4815n nVar = qVar.f9124h0;
                if (nVar != null) {
                    nVar.mo15544U(qVar.f9139w0, kVar, false);
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            } else if (i != 3) {
                C4815n nVar2 = qVar.f9124h0;
                if (nVar2 != null) {
                    nVar2.mo15539A(qVar.f9139w0, kVar, false);
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            } else {
                C4815n nVar3 = qVar.f9124h0;
                if (nVar3 != null) {
                    nVar3.mo15551o(kVar, true);
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            }
        } else {
            C4815n nVar4 = qVar.f9124h0;
            if (nVar4 != null) {
                nVar4.mo15551o(kVar, false);
            } else {
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final void m12066C4(C2650q qVar, Integer num) {
        C8594l.m46771e(qVar, "this$0");
        int O3 = qVar.mo10151O3();
        if (num == null || num.intValue() != O3) {
            if (num != null && num.intValue() == 1) {
                C4631c cVar = qVar.f9127k0;
                if (cVar != null) {
                    cVar.f13366e.setLayoutManager(new GridLayoutManager(qVar.mo3708v2(), 2, 1, false));
                } else {
                    C8594l.m46783q("mVideoFragmentVideoBinding");
                    throw null;
                }
            } else if (num != null && num.intValue() == 0) {
                C4631c cVar2 = qVar.f9127k0;
                if (cVar2 != null) {
                    cVar2.f13366e.setLayoutManager(new LinearLayoutManager(qVar.mo3708v2(), 1, false));
                } else {
                    C8594l.m46783q("mVideoFragmentVideoBinding");
                    throw null;
                }
            }
            C2643p pVar = qVar.f9126j0;
            if (pVar != null) {
                C8594l.m46770d(num, "viewType");
                pVar.mo10140t(num.intValue());
                return;
            }
            C8594l.m46783q("mVideoAdapter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public static final void m12068D4(C2650q qVar, Boolean bool) {
        C8594l.m46771e(qVar, "this$0");
        C4631c cVar = qVar.f9127k0;
        if (cVar != null) {
            LinearLayout c = cVar.f13364c.mo7577a();
            C8594l.m46770d(c, "mVideoFragmentVideoBinding.layoutPermission.root");
            C8594l.m46770d(bool, "it");
            c.setVisibility(bool.booleanValue() ? 0 : 8);
            return;
        }
        C8594l.m46783q("mVideoFragmentVideoBinding");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: E4 */
    public static final void m12070E4(C2650q qVar, View view) {
        C8594l.m46771e(qVar, "this$0");
        if (qVar.mo3705u2() instanceof C2625g) {
            C2625g.C2626a.m12024a((C2625g) qVar.mo3705u2(), false, 1, (Object) null);
            return;
        }
        Context v2 = qVar.mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            qVar.m12095c3();
        } else {
            qVar.mo10050d3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F4 */
    public static final void m12072F4(C2650q qVar, Integer num) {
        C8594l.m46771e(qVar, "this$0");
        C8594l.m46770d(num, "it");
        qVar.m12120s4(num.intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: G4 */
    public static final void m12074G4(C2650q qVar, Object obj) {
        C8594l.m46771e(qVar, "this$0");
        if (obj == null) {
            Toast.makeText(qVar.mo3708v2(), C4627i.coocent_video_delete_successfully, 0).show();
        } else if (Build.VERSION.SDK_INT < 30) {
            Toast.makeText(qVar.mo3708v2(), C4627i.coocent_video_delete_failed, 0).show();
        } else if (obj instanceof PendingIntent) {
            try {
                qVar.mo3641V2(((PendingIntent) obj).getIntentSender(), 1115, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public final void m12079L3(List<? extends Video> list) {
        if (Build.VERSION.SDK_INT >= 30) {
            C4815n nVar = this.f9124h0;
            if (nVar != null) {
                nVar.mo15548h(list);
                C3432b bVar = this.f9130n0;
                if (bVar != null) {
                    bVar.mo703c();
                    return;
                }
                return;
            }
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15459b(q0, new C2652b(this, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public final void m12080M3(Video video) {
        C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2653c(this, video, (C8508d<? super C2653c>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m12081N3(Video video) {
        C4736s sVar = C4736s.f13541a;
        String string = mo3708v2().getString(C4627i.video_first_encrypt_dialog_title);
        String string2 = mo3708v2().getString(C4627i.video_first_encrypt_dialog_message);
        C8594l.m46770d(string2, "requireContext().getStri…log_message\n            )");
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15460c(string, string2, q0, new C2657d(this, video));
    }

    /* renamed from: c3 */
    private final void m12095c3() {
        C4681i iVar = this.f9125i0;
        if (iVar != null) {
            iVar.mo15406D(false);
            C4681i iVar2 = this.f9125i0;
            if (iVar2 != null) {
                iVar2.mo15409G(true);
                C4681i iVar3 = this.f9125i0;
                if (iVar3 != null) {
                    iVar3.mo15410H(false);
                    if (C4658h.m20159a() >= 5242880) {
                        C4815n nVar = this.f9124h0;
                        if (nVar != null) {
                            nVar.mo15543S();
                        } else {
                            C8594l.m46783q("mVideoStoreViewModel");
                            throw null;
                        }
                    } else {
                        if (mo3606L() != null && (mo3705u2() instanceof C2627h)) {
                            ((C2627h) mo3705u2()).mo10045s1(false);
                        }
                        Toast.makeText(mo3708v2(), "Internal storage has not enough space", 0).show();
                    }
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public final void m12097d4(Video video) {
        C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2666g(this, video, (C8508d<? super C2666g>) null), 2, (Object) null);
    }

    /* renamed from: e3 */
    private final void m12098e3() {
        FragmentActivity u2 = mo3705u2();
        Application application = mo3705u2().getApplication();
        C8594l.m46770d(application, "requireActivity().application");
        C0696m0 b = new C0703o0((C0712q0) u2, (C0703o0.C0705b) new C4814m(application)).mo4263b(this.f9139w0, C4815n.class);
        C8594l.m46770d(b, "ViewModelProvider(\n     …del::class.java\n        )");
        this.f9124h0 = (C4815n) b;
        FragmentActivity u22 = mo3705u2();
        Application application2 = mo3705u2().getApplication();
        C8594l.m46770d(application2, "requireActivity().application");
        C0696m0 a = new C0703o0((C0712q0) u22, (C0703o0.C0705b) new C4680h(application2)).mo4262a(C4681i.class);
        C8594l.m46770d(a, "ViewModelProvider(\n     …aryViewModel::class.java)");
        this.f9125i0 = (C4681i) a;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        C0684j.m4231b(PlayerHelperKt.getDataStore(v2).mo13321b(), (C8513g) null, 0, 3, (Object) null).mo4149h(mo3607L0(), new C2631d(this));
        if (!TextUtils.isEmpty(this.f9139w0)) {
            int i = this.f9140x0;
            if (i == 2) {
                C4815n nVar = this.f9124h0;
                if (nVar != null) {
                    nVar.mo15544U(this.f9139w0, this.f9131o0, false);
                    C4815n nVar2 = this.f9124h0;
                    if (nVar2 != null) {
                        nVar2.mo15561y().mo4149h(mo3607L0(), new C2638k(this));
                    } else {
                        C8594l.m46783q("mVideoStoreViewModel");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            } else if (i != 3) {
                C4815n nVar3 = this.f9124h0;
                if (nVar3 != null) {
                    nVar3.mo15539A(this.f9139w0, this.f9131o0, false);
                    C4815n nVar4 = this.f9124h0;
                    if (nVar4 != null) {
                        nVar4.mo15540B().mo4149h(mo3607L0(), new C2629b(this));
                    } else {
                        C8594l.m46783q("mVideoStoreViewModel");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            } else {
                C4815n nVar5 = this.f9124h0;
                if (nVar5 != null) {
                    nVar5.mo15550n().mo4149h(mo3607L0(), new C2633f(this));
                } else {
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                }
            }
        } else {
            C4815n nVar6 = this.f9124h0;
            if (nVar6 != null) {
                nVar6.mo15550n().mo4149h(mo3607L0(), new C2640m(this));
            } else {
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
        }
        C4815n nVar7 = this.f9124h0;
        if (nVar7 != null) {
            nVar7.mo15552p().mo4149h(mo3607L0(), new C2636i(this));
            C4681i iVar = this.f9125i0;
            if (iVar != null) {
                iVar.mo15419o().mo4149h(mo3607L0(), new C2632e(this));
                C4681i iVar2 = this.f9125i0;
                if (iVar2 != null) {
                    iVar2.mo15421q().mo4149h(mo3607L0(), new C2628a(this));
                    C4681i iVar3 = this.f9125i0;
                    if (iVar3 != null) {
                        iVar3.mo15418n().mo4149h(mo3607L0(), new C2641n(this));
                        C4631c cVar = this.f9127k0;
                        if (cVar != null) {
                            cVar.f13364c.f13380b.setOnClickListener(new C2637j(this));
                            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47303c(), (C8910t0) null, new C2682r(this, (C8508d<? super C2682r>) null), 2, (Object) null);
                            C4681i iVar4 = this.f9125i0;
                            if (iVar4 != null) {
                                iVar4.mo15413i().mo4149h(mo3607L0(), new C2634g(this));
                                C4815n nVar8 = this.f9124h0;
                                if (nVar8 != null) {
                                    nVar8.mo15555s().mo4149h(mo3607L0(), new C2635h(this));
                                } else {
                                    C8594l.m46783q("mVideoStoreViewModel");
                                    throw null;
                                }
                            } else {
                                C8594l.m46783q("mVideoLibraryViewModel");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoFragmentVideoBinding");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mVideoLibraryViewModel");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
    }

    /* renamed from: e4 */
    private final void m12099e4() {
        C4681i iVar = this.f9125i0;
        if (iVar != null) {
            iVar.mo15412h(1);
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* renamed from: k4 */
    private final void m12105k4() {
        if (!TextUtils.isEmpty(this.f9139w0)) {
            mo3705u2().onBackPressed();
        } else {
            mo3705u2().finish();
        }
    }

    /* renamed from: l4 */
    private final void m12107l4() {
        OnBackPressedDispatcher z = mo3705u2().mo391z();
        C0718v L0 = mo3607L0();
        int i = this.f9140x0;
        boolean z2 = true;
        if (!(i == 1 || i == 2)) {
            z2 = false;
        }
        z.mo395a(L0, new C2671k(this, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public final void m12110n4(Video video, String str) {
        this.f9135s0 = video;
        this.f9136t0 = str;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        C4796a.m20382g(v2, video, str, new C2675m(this));
    }

    /* renamed from: o4 */
    private final void m12112o4() {
        ActionBar R1;
        FragmentActivity L = mo3606L();
        AppCompatActivity appCompatActivity = L instanceof AppCompatActivity ? (AppCompatActivity) L : null;
        if (appCompatActivity != null && (R1 = appCompatActivity.mo471R1()) != null) {
            boolean z = false;
            boolean z2 = ((R1.mo410i() & 4) == 0 || (R1.mo410i() & 2) == 0) ? false : true;
            this.f9141y0 = z2;
            if (!z2) {
                int i = this.f9140x0;
                if (i == 1 || i == 2) {
                    z = true;
                }
                R1.mo423v(z);
                R1.mo420s(z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public final void m12114p4(List<? extends Video> list) {
        PlayerHelper playerHelper = this.f9121B0;
        if (playerHelper == null) {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        } else if (playerHelper.isWindows() || playerHelper.isAudioPlay()) {
            playerHelper.deleteVideoList(C8606x.m46797a(list));
            if (playerHelper.isAudioPlay() && playerHelper.getVideo() == null) {
                mo3708v2().sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_RELEASE()));
            } else if (playerHelper.isWindows() && playerHelper.getVideo() == null) {
                playerHelper.savePlayingVideoIdAndPath(false);
                playerHelper.setWindows(false);
                C4613a aVar = this.f9129m0;
                if (aVar != null) {
                    Application application = mo3705u2().getApplication();
                    C8594l.m46770d(application, "requireActivity().application");
                    aVar.mo15364j(application, true);
                }
                playerHelper.closeWindow();
                playerHelper.release();
            }
        } else {
            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2680p(this, list, playerHelper, (C8508d<? super C2680p>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public final List<Video> m12116q4(int i, List<Video> list) {
        C4666o oVar = C4666o.f13452a;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        C2643p pVar = this.f9126j0;
        if (pVar != null) {
            List c = pVar.mo5380c();
            C8594l.m46770d(c, "mVideoAdapter.currentList");
            List<Video> C = C8490t.m46678C(c);
            oVar.mo15397a(v2, i, list, C);
            return C;
        }
        C8594l.m46783q("mVideoAdapter");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public final void m12118r4(Video video) {
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15461d(q0, new C2681q(this, video));
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public final void m12120s4(int i) {
        Window window;
        C4681i iVar = this.f9125i0;
        if (iVar == null) {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        } else if (!iVar.mo15423s()) {
            C0133c cVar = this.f9137u0;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f9137u0 = null;
        } else if (this.f9137u0 == null) {
            C4635g d = C4635g.m20108d(LayoutInflater.from(mo3651a0()), (ViewGroup) null, false);
            C8594l.m46770d(d, "inflate(\n               …      false\n            )");
            this.f9138v0 = d;
            if (this.f9137u0 == null) {
                Context v2 = mo3708v2();
                C4668q.C4669a aVar = C4668q.f13454a;
                Context v22 = mo3708v2();
                C8594l.m46770d(v22, "requireContext()");
                C0133c.C0134a aVar2 = new C0133c.C0134a(v2, aVar.mo15398a(v22));
                C4635g gVar = this.f9138v0;
                if (gVar != null) {
                    aVar2.mo646q(gVar.mo7577a());
                    aVar2.mo638i(17039360, new C2630c(this));
                    aVar2.mo645p(mo3582D0(C4627i.coocent_video_private_videos));
                    aVar2.mo633d(false);
                    this.f9137u0 = aVar2.mo630a();
                    C4635g gVar2 = this.f9138v0;
                    if (gVar2 != null) {
                        gVar2.f13383c.setText(mo3582D0(C4627i.video_loading));
                        C4635g gVar3 = this.f9138v0;
                        if (gVar3 != null) {
                            gVar3.f13382b.setMax(100);
                            C4635g gVar4 = this.f9138v0;
                            if (gVar4 != null) {
                                gVar4.f13382b.setProgress(i);
                                C0133c cVar2 = this.f9137u0;
                                if (!(cVar2 == null || (window = cVar2.getWindow()) == null)) {
                                    window.setBackgroundDrawable(C0506a.m3152d(mo3708v2(), C4622d.video_drawable_dialog_show_tips_round));
                                }
                            } else {
                                C8594l.m46783q("mProgressBinding");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mProgressBinding");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mProgressBinding");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mProgressBinding");
                    throw null;
                }
            }
            C0133c cVar3 = this.f9137u0;
            if (cVar3 != null) {
                cVar3.show();
            }
        } else {
            C4635g gVar5 = this.f9138v0;
            if (gVar5 != null) {
                gVar5.f13382b.setProgress(i);
                C4635g gVar6 = this.f9138v0;
                if (gVar6 != null) {
                    TextView textView = gVar6.f13383c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append('%');
                    textView.setText(sb.toString());
                    if (i > 99) {
                        C4681i iVar2 = this.f9125i0;
                        if (iVar2 != null) {
                            iVar2.mo15407E(false);
                            C0133c cVar4 = this.f9137u0;
                            if (cVar4 != null) {
                                cVar4.dismiss();
                            }
                            this.f9137u0 = null;
                        } else {
                            C8594l.m46783q("mVideoLibraryViewModel");
                            throw null;
                        }
                    }
                    C0133c cVar5 = this.f9137u0;
                    if (cVar5 != null) {
                        cVar5.show();
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mProgressBinding");
                throw null;
            }
            C8594l.m46783q("mProgressBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final void m12122t4(C2650q qVar, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(qVar, "this$0");
        dialogInterface.dismiss();
        C4671r.m20191b();
        C4681i iVar = qVar.f9125i0;
        if (iVar != null) {
            iVar.mo15407E(false);
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final void m12124u4(C2650q qVar, C3884d dVar) {
        C8594l.m46771e(qVar, "this$0");
        Long l = (Long) dVar.mo13377b(C3888f.m16600e(ConsantsKt.KEY_LAST_PLAY_VIDEO_ID));
        long longValue = l == null ? -1 : l.longValue();
        C2643p pVar = qVar.f9126j0;
        if (pVar != null) {
            pVar.mo10137p(longValue);
        } else {
            C8594l.m46783q("mVideoAdapter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m12126v4(C2650q qVar, List list) {
        C8594l.m46771e(qVar, "this$0");
        C4631c cVar = qVar.f9127k0;
        if (cVar != null) {
            LinearLayout c = cVar.f13365d.mo7577a();
            C8594l.m46770d(c, "mVideoFragmentVideoBinding.layoutVideoEmpty.root");
            c.setVisibility(list.isEmpty() ? 0 : 8);
            C2643p pVar = qVar.f9126j0;
            if (pVar != null) {
                pVar.mo5382e(list);
            } else {
                C8594l.m46783q("mVideoAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentVideoBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final void m12128w4(C2650q qVar, List list) {
        C8594l.m46771e(qVar, "this$0");
        C4631c cVar = qVar.f9127k0;
        if (cVar != null) {
            LinearLayout c = cVar.f13365d.mo7577a();
            C8594l.m46770d(c, "mVideoFragmentVideoBinding.layoutVideoEmpty.root");
            c.setVisibility(list.isEmpty() ? 0 : 8);
            C2643p pVar = qVar.f9126j0;
            if (pVar != null) {
                pVar.mo5382e(list);
            } else {
                C8594l.m46783q("mVideoAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentVideoBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final void m12130x4(C2650q qVar, List list) {
        C8594l.m46771e(qVar, "this$0");
        C4631c cVar = qVar.f9127k0;
        if (cVar != null) {
            LinearLayout c = cVar.f13365d.mo7577a();
            C8594l.m46770d(c, "mVideoFragmentVideoBinding.layoutVideoEmpty.root");
            c.setVisibility(list.isEmpty() ? 0 : 8);
            C2643p pVar = qVar.f9126j0;
            if (pVar != null) {
                pVar.mo5382e(list);
            } else {
                C8594l.m46783q("mVideoAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentVideoBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final void m12132y4(C2650q qVar, List list) {
        C8594l.m46771e(qVar, "this$0");
        C4631c cVar = qVar.f9127k0;
        if (cVar != null) {
            LinearLayout c = cVar.f13365d.mo7577a();
            C8594l.m46770d(c, "mVideoFragmentVideoBinding.layoutVideoEmpty.root");
            c.setVisibility(list.isEmpty() ? 0 : 8);
            C2643p pVar = qVar.f9126j0;
            if (pVar != null) {
                pVar.mo5382e(list);
            } else {
                C8594l.m46783q("mVideoAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentVideoBinding");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final void m12134z4(C2650q qVar, Object obj) {
        C8594l.m46771e(qVar, "this$0");
        if (obj == null) {
            Toast.makeText(qVar.mo3708v2(), C4627i.coocent_video_delete_successfully, 0).show();
            qVar.m12116q4(0, qVar.f9132p0);
        } else if (Build.VERSION.SDK_INT < 30) {
            Toast.makeText(qVar.mo3708v2(), C4627i.coocent_video_delete_failed, 0).show();
        } else if (obj instanceof PendingIntent) {
            try {
                qVar.mo3641V2(((PendingIntent) obj).getIntentSender(), 1114, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: F1 */
    public void mo3589F1(boolean z) {
        ActionBar R1;
        super.mo3589F1(z);
        if (!z) {
            if (mo3606L() != null && (mo3705u2() instanceof C2627h)) {
                String D0 = mo3582D0(C4627i.coocent_mime_type_video);
                C8594l.m46770d(D0, "getString(R.string.coocent_mime_type_video)");
                ((C2627h) mo3705u2()).mo10046v0(D0);
            }
            if (mo3690p0() != null && (mo3710w2() instanceof C2627h)) {
                String D02 = mo3582D0(C4627i.coocent_mime_type_video);
                C8594l.m46770d(D02, "getString(R.string.coocent_mime_type_video)");
                ((C2627h) mo3705u2()).mo10046v0(D02);
                return;
            }
            return;
        }
        FragmentActivity L = mo3606L();
        AppCompatActivity appCompatActivity = L instanceof AppCompatActivity ? (AppCompatActivity) L : null;
        if (appCompatActivity != null && (R1 = appCompatActivity.mo471R1()) != null) {
            int i = this.f9140x0;
            boolean z2 = true;
            if (!(i == 1 || i == 2)) {
                z2 = false;
            }
            if (!this.f9141y0 && z2) {
                R1.mo423v(false);
                R1.mo420s(false);
            }
        }
    }

    /* renamed from: H4 */
    public final void mo10150H4(int i) {
        if (mo10151O3() != i) {
            C4681i iVar = this.f9125i0;
            if (iVar != null) {
                iVar.mo15411L(i);
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        }
    }

    /* renamed from: J1 */
    public boolean mo3601J1(MenuItem menuItem) {
        boolean z;
        C8594l.m46771e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            m12105k4();
        } else if (itemId == C4623e.action_search) {
            C4613a aVar = this.f9129m0;
            if (aVar != null) {
                C8594l.m46769c(aVar);
                if (aVar.mo15366l()) {
                    z = true;
                    mo10152f4(z);
                }
            }
            z = false;
            mo10152f4(z);
        } else if (itemId == C4623e.action_select_all) {
            mo10153g4();
        } else if (itemId == C4623e.action_function) {
            m12099e4();
        } else if (itemId == C4623e.action_encrypted) {
            mo10157m4();
        } else if (itemId == C4623e.action_sort) {
            mo10154h4();
        } else if (itemId == C4623e.action_view_list) {
            mo10156j4();
        } else if (itemId == C4623e.action_view_grid) {
            mo10155i4();
        }
        return super.mo3601J1(menuItem);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r0.mo15366l() == false) goto L_0x0061;
     */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3614N1(android.view.Menu r7) {
        /*
            r6 = this;
            java.lang.String r0 = "menu"
            p369i.p387z.p389d.C8594l.m46771e(r7, r0)
            super.mo3614N1(r7)
            int r0 = r6.f9140x0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            int r3 = p159f.p166c.p224o.C4623e.action_search
            android.view.MenuItem r3 = r7.findItem(r3)
            android.content.Context r4 = r6.mo3708v2()
            java.lang.String r5 = "requireContext()"
            p369i.p387z.p389d.C8594l.m46770d(r4, r5)
            int r5 = r6.mo10151O3()
            p159f.p166c.p224o.p226l.C4663m.m20171d(r7, r4, r5)
            f.c.m.a r4 = r6.f9129m0
            if (r4 != 0) goto L_0x0031
            r4 = r0 ^ 1
            r3.setVisible(r4)
            goto L_0x0043
        L_0x0031:
            p369i.p387z.p389d.C8594l.m46769c(r4)
            boolean r4 = r4.mo15362h()
            if (r4 == 0) goto L_0x0040
            r4 = r0 ^ 1
            r3.setVisible(r4)
            goto L_0x0043
        L_0x0040:
            r3.setVisible(r1)
        L_0x0043:
            int r3 = p159f.p166c.p224o.C4623e.action_function
            android.view.MenuItem r7 = r7.findItem(r3)
            int r3 = p159f.p166c.p224o.C4627i.coocent_mime_type_folder
            java.lang.String r3 = r6.mo3582D0(r3)
            r7.setTitle(r3)
            if (r0 != 0) goto L_0x0062
            f.c.m.a r0 = r6.f9129m0
            if (r0 == 0) goto L_0x0061
            p369i.p387z.p389d.C8594l.m46769c(r0)
            boolean r0 = r0.mo15366l()
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r1 = 1
        L_0x0062:
            r7.setVisible(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videolibrary.p058ui.p059i.C2650q.mo3614N1(android.view.Menu):void");
    }

    /* renamed from: O3 */
    public final int mo10151O3() {
        C2643p pVar = this.f9126j0;
        if (pVar != null) {
            return pVar.mo10131j();
        }
        C8594l.m46783q("mVideoAdapter");
        throw null;
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        C8594l.m46771e(bundle, "outState");
        super.mo3626R1(bundle);
        if (!this.f9132p0.isEmpty()) {
            bundle.putParcelableArrayList("delete_list", this.f9132p0);
        }
        if (!this.f9133q0.isEmpty()) {
            bundle.putParcelableArrayList("encrypted_list", this.f9133q0);
        }
        if (!TextUtils.isEmpty(this.f9136t0)) {
            bundle.putString("rename_title", this.f9136t0);
        }
        Video video = this.f9135s0;
        if (video != null) {
            bundle.putParcelable(AudioPlayService.KEY_RENAME_VIDEO, video);
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        String str;
        String str2;
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        mo3590F2(true);
        if (mo3705u2() instanceof C2627h) {
            C2627h hVar = (C2627h) mo3705u2();
            int i = this.f9140x0;
            if (i == 1) {
                hVar.mo10046v0(C8555j.m46758d(new File(this.f9139w0)));
            } else if (i == 2) {
                if (TextUtils.isEmpty(this.f9139w0)) {
                    str2 = mo3582D0(C4627i.coocent_video_search);
                } else {
                    str2 = this.f9139w0;
                }
                C8594l.m46770d(str2, "if (TextUtils.isEmpty(mK…                else mKey");
                hVar.mo10046v0(str2);
            } else if (i != 3) {
                String D0 = mo3582D0(C4627i.coocent_mime_type_video);
                C8594l.m46770d(D0, "getString(R.string.coocent_mime_type_video)");
                hVar.mo10046v0(D0);
            } else {
                String D02 = mo3582D0(C4627i.video_encrypted_video);
                C8594l.m46770d(D02, "getString(R.string.video_encrypted_video)");
                hVar.mo10046v0(D02);
            }
        }
        if (mo3690p0() != null && (mo3710w2() instanceof C2627h)) {
            C2627h hVar2 = (C2627h) mo3710w2();
            int i2 = this.f9140x0;
            if (i2 == 1) {
                hVar2.mo10046v0(C8555j.m46758d(new File(this.f9139w0)));
            } else if (i2 == 2) {
                if (TextUtils.isEmpty(this.f9139w0)) {
                    str = mo3582D0(C4627i.coocent_video_search);
                } else {
                    str = this.f9139w0;
                }
                C8594l.m46770d(str, "if (TextUtils.isEmpty(mK…                else mKey");
                hVar2.mo10046v0(str);
            } else if (i2 != 3) {
                String D03 = mo3582D0(C4627i.coocent_mime_type_video);
                C8594l.m46770d(D03, "getString(R.string.coocent_mime_type_video)");
                hVar2.mo10046v0(D03);
            } else {
                String D04 = mo3582D0(C4627i.video_encrypted_video);
                C8594l.m46770d(D04, "getString(R.string.video_encrypted_video)");
                hVar2.mo10046v0(D04);
            }
        }
        m12112o4();
        m12107l4();
        C4631c cVar = this.f9127k0;
        if (cVar != null) {
            RecyclerView recyclerView = cVar.f13366e;
            recyclerView.setHasFixedSize(true);
            Context v2 = mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            recyclerView.mo4622h(new C4714a(v2, C4621c.video_recycler_view_default_spacing));
            recyclerView.setItemAnimator(new C8370b(new OvershootInterpolator(1.0f)));
            recyclerView.setLayoutManager(new GridLayoutManager(mo3708v2(), 2, 1, false));
            Context v22 = mo3708v2();
            C8594l.m46770d(v22, "requireContext()");
            C2643p pVar = new C2643p(v22, 0, 0, 6, (C8589g) null);
            this.f9126j0 = pVar;
            recyclerView.setAdapter(pVar);
            recyclerView.mo4634l(new C2678n(this));
            String str3 = f9119F0;
            C4631c cVar2 = this.f9127k0;
            if (cVar2 != null) {
                RecyclerView recyclerView2 = cVar2.f13366e;
                C2643p pVar2 = this.f9126j0;
                if (pVar2 != null) {
                    C2643p.C2647d dVar = new C2643p.C2647d(pVar2);
                    C4631c cVar3 = this.f9127k0;
                    if (cVar3 != null) {
                        RecyclerView recyclerView3 = cVar3.f13366e;
                        C8594l.m46770d(recyclerView3, "mVideoFragmentVideoBinding.rvVideo");
                        C4168j0.C4169a aVar = new C4168j0.C4169a(str3, recyclerView2, dVar, new C2643p.C2646c(recyclerView3), C4177k0.m18418a(Video.class));
                        aVar.mo14328b(C4165i0.m18384a());
                        C4168j0<Video> a = aVar.mo14327a();
                        a.mo14291c(new C2679o(this));
                        C8457t tVar = C8457t.f34900a;
                        C8594l.m46770d(a, "Builder(\n            TAG…         })\n            }");
                        this.f9128l0 = a;
                        C2643p pVar3 = this.f9126j0;
                        if (pVar3 == null) {
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        } else if (a != null) {
                            pVar3.mo10139r(a);
                            pVar3.mo10136o(this.f9123D0);
                            m12098e3();
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mVideoFragmentVideoBinding");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mVideoAdapter");
                    throw null;
                }
            } else {
                C8594l.m46783q("mVideoFragmentVideoBinding");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentVideoBinding");
            throw null;
        }
    }

    /* renamed from: e1 */
    public void mo3662e1(int i, int i2, Intent intent) {
        Video video;
        super.mo3662e1(i, i2, intent);
        if (i == 1113) {
            if (i2 == -1 && (video = this.f9135s0) != null) {
                m12110n4(video, this.f9136t0);
            }
        } else if (i != 1114 || Build.VERSION.SDK_INT < 30) {
            if (i == 1115 && Build.VERSION.SDK_INT >= 30) {
                if (i2 == -1) {
                    Toast.makeText(mo3708v2(), C4627i.video_move_private_successfully, 0).show();
                    m12114p4(this.f9133q0);
                    C4815n nVar = this.f9124h0;
                    if (nVar != null) {
                        nVar.mo15546X(this.f9133q0, this.f9134r0);
                        m12116q4(2, this.f9133q0);
                        return;
                    }
                    C8594l.m46783q("mVideoStoreViewModel");
                    throw null;
                } else if (i2 == 0) {
                    C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2670j(this, (C8508d<? super C2670j>) null), 2, (Object) null);
                }
            }
        } else if (i2 == -1) {
            Toast.makeText(mo3708v2(), C4627i.coocent_video_delete_successfully, 0).show();
            m12114p4(this.f9132p0);
            C4815n nVar2 = this.f9124h0;
            if (nVar2 != null) {
                nVar2.mo15542Q(this.f9132p0);
                m12116q4(0, this.f9132p0);
                return;
            }
            C8594l.m46783q("mVideoStoreViewModel");
            throw null;
        }
    }

    /* renamed from: f4 */
    public final void mo10152f4(boolean z) {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (!C4667p.m20178b(v2)) {
            mo10050d3();
            return;
        }
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15464g(q0, new C2668h(z, this));
    }

    /* renamed from: g4 */
    public final void mo10153g4() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (C4667p.m20178b(v2)) {
            C4168j0<Video> j0Var = this.f9128l0;
            if (j0Var != null) {
                C2643p pVar = this.f9126j0;
                if (pVar != null) {
                    List c = pVar.mo5380c();
                    C8594l.m46770d(c, "mVideoAdapter.currentList");
                    j0Var.mo14304p(c, true);
                    return;
                }
                C8594l.m46783q("mVideoAdapter");
                throw null;
            }
            C8594l.m46783q("mVideoTracker");
            throw null;
        }
    }

    /* renamed from: h4 */
    public final void mo10154h4() {
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15466i(q0, 0, this.f9131o0.getFirst(), this.f9131o0.getSecond().booleanValue(), new C2669i(this));
    }

    /* renamed from: i4 */
    public final void mo10155i4() {
        mo10150H4(1);
    }

    /* renamed from: j4 */
    public final void mo10156j4() {
        mo10150H4(0);
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        mo3584D2(new C7571b());
        mo3587E2(new C7571b());
        mo3612M2(new C7571b());
        Bundle V = mo3638V();
        if (V != null) {
            String string = V.getString("key", BuildConfig.FLAVOR);
            C8594l.m46770d(string, "getString(ARG_KEY, \"\")");
            this.f9139w0 = string;
            this.f9140x0 = V.getInt("function", 0);
            this.f9120A0 = (VideoConfigBean) V.getParcelable("video_config_bean");
        }
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        Context applicationContext = mo3708v2().getApplicationContext();
        C8594l.m46770d(applicationContext, "requireContext().applicationContext");
        this.f9121B0 = companion.getInstance(applicationContext);
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("delete_list");
            if (parcelableArrayList != null && (!parcelableArrayList.isEmpty())) {
                this.f9132p0.clear();
                this.f9132p0.addAll(parcelableArrayList);
            }
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("encrypted_list");
            if (parcelableArrayList2 != null && (!parcelableArrayList2.isEmpty())) {
                this.f9133q0.clear();
                this.f9133q0.addAll(parcelableArrayList2);
            }
            Video video = (Video) bundle.getParcelable(AudioPlayService.KEY_RENAME_VIDEO);
            if (video != null) {
                this.f9135s0 = video;
            }
            String string2 = bundle.getString("rename_title", BuildConfig.FLAVOR);
            C8594l.m46770d(string2, "getString(ARG_RENAME_TITLE, \"\")");
            this.f9136t0 = string2;
        }
    }

    /* renamed from: m4 */
    public final void mo10157m4() {
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        if (!C4667p.m20178b(v2)) {
            mo10050d3();
        } else {
            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2672l(this, (C8508d<? super C2672l>) null), 2, (Object) null);
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8594l.m46771e(layoutInflater, "inflater");
        C4631c d = C4631c.m20093d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "it");
        this.f9127k0 = d;
        FrameLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…nding = it\n        }.root");
        return c;
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C4681i iVar = this.f9125i0;
        if (iVar != null) {
            iVar.mo15407E(false);
            C0133c cVar = this.f9137u0;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f9137u0 = null;
            return;
        }
        C8594l.m46783q("mVideoLibraryViewModel");
        throw null;
    }
}
