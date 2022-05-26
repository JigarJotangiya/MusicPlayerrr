package com.coocent.videolibrary.p058ui.encrypted;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import androidx.appcompat.widget.C0315v;
import androidx.core.content.C0506a;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0684j;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0719w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.video.videoplayercore.ConsantsKt;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.video.videoplayercore.player.PlayerHelperKt;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.videolibrary.p058ui.C2557e;
import com.coocent.videolibrary.p058ui.C2625g;
import com.coocent.videolibrary.p058ui.C2627h;
import com.coocent.videolibrary.p058ui.p059i.C2643p;
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.coocent.videostore.p067po.Video;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
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
import p159f.p166c.p231p.p233b.C4800d;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p159f.p243f.p245b.p304b.p317y.C7571b;
import p360h.p361a.p365b.p366a.C8370b;
import p369i.C8446k;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p369i.p387z.p389d.C8606x;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.videolibrary.ui.encrypted.o */
/* compiled from: EncryptedFragment.kt */
public final class C2577o extends C2557e {

    /* renamed from: A0 */
    private static final String f9002A0;

    /* renamed from: z0 */
    public static final C2578a f9003z0 = new C2578a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C4815n f9004h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C4681i f9005i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C2643p f9006j0;

    /* renamed from: k0 */
    private C4631c f9007k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C4168j0<Video> f9008l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C4613a f9009m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C3432b f9010n0;

    /* renamed from: o0 */
    private C8446k<String, Boolean> f9011o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public final ArrayList<Video> f9012p0;

    /* renamed from: q0 */
    private Video f9013q0;

    /* renamed from: r0 */
    private String f9014r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public boolean f9015s0;

    /* renamed from: t0 */
    private boolean f9016t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C0133c f9017u0;

    /* renamed from: v0 */
    private C4635g f9018v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public PlayerHelper f9019w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public final C2580c f9020x0;

    /* renamed from: y0 */
    private final C2582d f9021y0;

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$a */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2578a {
        private C2578a() {
        }

        public /* synthetic */ C2578a(C8589g gVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C2577o m11897b(C2578a aVar, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = BuildConfig.FLAVOR;
            }
            if ((i2 & 2) != 0) {
                i = 3;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            return aVar.mo10068a(str, i, z);
        }

        /* renamed from: a */
        public final C2577o mo10068a(String str, int i, boolean z) {
            C8594l.m46771e(str, "key");
            C2577o oVar = new C2577o();
            Bundle bundle = new Bundle();
            bundle.putString("key", str);
            bundle.putInt("function", i);
            bundle.putBoolean(oVar.mo10048Z2(), z);
            C8457t tVar = C8457t.f34900a;
            oVar.mo3581C2(bundle);
            return oVar;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$b */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2579b implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ C2577o f9022a;

        /* renamed from: b */
        final /* synthetic */ List<Video> f9023b;

        C2579b(C2577o oVar, List<? extends Video> list) {
            this.f9022a = oVar;
            this.f9023b = list;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10069b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10069b(int i) {
            if (i == -1) {
                C4815n p3 = this.f9022a.f9004h0;
                if (p3 != null) {
                    p3.mo15548h(this.f9023b);
                    this.f9022a.m11850Q3(this.f9023b);
                    this.f9022a.m11851R3(0, C8490t.m46678C(this.f9023b));
                    C3432b h3 = this.f9022a.f9010n0;
                    if (h3 != null) {
                        h3.mo703c();
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$c */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2580c implements C3432b.C3433a {

        /* renamed from: a */
        final /* synthetic */ C2577o f9024a;

        /* renamed from: com.coocent.videolibrary.ui.encrypted.o$c$a */
        /* compiled from: EncryptedFragment.kt */
        static final class C2581a extends C8595m implements C8570l<List<? extends Parcelable>, C8457t> {
            final /* synthetic */ C2577o this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2581a(C2577o oVar) {
                super(1);
                this.this$0 = oVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends Parcelable>) (List) obj);
                return C8457t.f34900a;
            }

            public final void invoke(List<? extends Parcelable> list) {
                C8594l.m46771e(list, "it");
                C2577o oVar = this.this$0;
                oVar.m11881x3(oVar.f9012p0);
            }
        }

        C2580c(C2577o oVar) {
            this.f9024a = oVar;
        }

        /* renamed from: a */
        public void mo592a(C3432b bVar) {
            this.f9024a.f9010n0 = null;
            C4168j0 q3 = this.f9024a.f9008l0;
            if (q3 != null) {
                q3.mo14293e();
                C2643p m3 = this.f9024a.f9006j0;
                if (m3 != null) {
                    m3.mo10138q("no_select_mode");
                    if (this.f9024a.mo3705u2() instanceof C2627h) {
                        this.f9024a.f9015s0 = false;
                        ((C2627h) this.f9024a.mo3705u2()).mo10042J(true);
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
                C4168j0 q3 = this.f9024a.f9008l0;
                if (q3 != null) {
                    sb.append(q3.mo14298j().size());
                    sb.append('/');
                    C2643p m3 = this.f9024a.f9006j0;
                    if (m3 != null) {
                        sb.append(m3.getItemCount());
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
            if (Build.VERSION.SDK_INT < 21 || (window = this.f9024a.mo3705u2().getWindow()) == null) {
                return true;
            }
            window.setStatusBarColor(C4647b.m20153b(this.f9024a.mo3705u2(), C4619a.colorPrimaryDark, 0, 4, (Object) null));
            return true;
        }

        /* renamed from: c */
        public boolean mo594c(C3432b bVar, Menu menu) {
            C8594l.m46771e(menu, "menu");
            if (this.f9024a.mo3705u2() instanceof C2627h) {
                this.f9024a.f9015s0 = true;
                ((C2627h) this.f9024a.mo3705u2()).mo10042J(false);
            }
            Context v2 = this.f9024a.mo3708v2();
            C8594l.m46770d(v2, "requireContext()");
            C4663m.m20168a(menu, v2);
            return true;
        }

        /* renamed from: d */
        public boolean mo595d(C3432b bVar, MenuItem menuItem) {
            Integer valueOf = menuItem == null ? null : Integer.valueOf(menuItem.getItemId());
            int i = C4623e.action_select_all;
            if (valueOf != null && valueOf.intValue() == i) {
                C4168j0 q3 = this.f9024a.f9008l0;
                if (q3 != null) {
                    int size = q3.mo14298j().size();
                    C2643p m3 = this.f9024a.f9006j0;
                    if (m3 == null) {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    } else if (size == m3.getItemCount()) {
                        C4168j0 q32 = this.f9024a.f9008l0;
                        if (q32 != null) {
                            q32.mo14293e();
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    } else {
                        C4168j0 q33 = this.f9024a.f9008l0;
                        if (q33 != null) {
                            C2643p m32 = this.f9024a.f9006j0;
                            if (m32 != null) {
                                List c = m32.mo5380c();
                                C8594l.m46770d(c, "mVideoAdapter.currentList");
                                q33.mo14304p(c, true);
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
                    C4168j0 q34 = this.f9024a.f9008l0;
                    if (q34 == null) {
                        C8594l.m46783q("mVideoTracker");
                        throw null;
                    } else if (q34.mo14298j().isEmpty()) {
                        return true;
                    } else {
                        this.f9024a.f9012p0.clear();
                        ArrayList j3 = this.f9024a.f9012p0;
                        C4168j0 q35 = this.f9024a.f9008l0;
                        if (q35 != null) {
                            C4163h0 j = q35.mo14298j();
                            C8594l.m46770d(j, "mVideoTracker.selection");
                            boolean unused = C8487q.m46675p(j3, j);
                            C4613a n3 = this.f9024a.f9009m0;
                            if (n3 != null) {
                                FragmentActivity u2 = this.f9024a.mo3705u2();
                                C8594l.m46770d(u2, "requireActivity()");
                                n3.mo15367m(u2, this.f9024a.f9012p0, new C2581a(this.f9024a));
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

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$d */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2582d implements C2643p.C2644a {

        /* renamed from: a */
        final /* synthetic */ C2577o f9025a;

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.encrypted.EncryptedFragment$mOnVideoClickListener$1$onVideoMenuClick$popupMenu$1$1$2", mo30600f = "EncryptedFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.encrypted.o$d$a */
        /* compiled from: EncryptedFragment.kt */
        static final class C2583a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ Video $video;
            int label;
            final /* synthetic */ C2577o this$0;

            /* renamed from: com.coocent.videolibrary.ui.encrypted.o$d$a$a */
            /* compiled from: EncryptedFragment.kt */
            public static final class C2584a implements C4800d {

                /* renamed from: a */
                final /* synthetic */ C2577o f9026a;

                C2584a(C2577o oVar) {
                    this.f9026a = oVar;
                }

                /* renamed from: a */
                public void mo10074a(double d) {
                    C4681i o3 = this.f9026a.f9005i0;
                    if (o3 != null) {
                        o3.mo15413i().mo4153l(Integer.valueOf((int) d));
                    } else {
                        C8594l.m46783q("mVideoLibraryViewModel");
                        throw null;
                    }
                }
            }

            /* renamed from: com.coocent.videolibrary.ui.encrypted.o$d$a$b */
            /* compiled from: EncryptedFragment.kt */
            public static final class C2585b implements C4664n {

                /* renamed from: a */
                final /* synthetic */ C2577o f9027a;

                /* renamed from: b */
                final /* synthetic */ Video f9028b;

                C2585b(C2577o oVar, Video video) {
                    this.f9027a = oVar;
                    this.f9028b = video;
                }

                /* renamed from: a */
                public void mo10075a(String str, boolean z) {
                    C4664n.C4665a.m20175b(this, str, z);
                }

                /* renamed from: b */
                public void mo10076b(Uri uri, boolean z) {
                    C4681i o3 = this.f9027a.f9005i0;
                    if (o3 != null) {
                        o3.mo15407E(false);
                        C0133c l3 = this.f9027a.f9017u0;
                        if (l3 != null) {
                            l3.dismiss();
                        }
                        this.f9027a.f9017u0 = null;
                        if (z) {
                            C4815n p3 = this.f9027a.f9004h0;
                            if (p3 != null) {
                                p3.mo15545W(this.f9028b, uri);
                                this.f9027a.m11850Q3(C8482l.m46668i(this.f9028b));
                                this.f9027a.m11851R3(3, C8482l.m46668i(this.f9028b));
                                return;
                            }
                            C8594l.m46783q("mVideoStoreViewModel");
                            throw null;
                        }
                        return;
                    }
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2583a(C2577o oVar, Video video, C8508d<? super C2583a> dVar) {
                super(2, dVar);
                this.this$0 = oVar;
                this.$video = video;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2583a(this.this$0, this.$video, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2583a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    Application application = this.this$0.mo3705u2().getApplication();
                    C8594l.m46770d(application, "requireActivity().application");
                    Video video = this.$video;
                    C2577o oVar = this.this$0;
                    C4671r.m20192c(application, video, new C2584a(oVar), new C2585b(oVar, video));
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.coocent.videolibrary.ui.encrypted.o$d$b */
        /* compiled from: EncryptedFragment.kt */
        static final class C2586b extends C8595m implements C8570l<List<? extends Parcelable>, C8457t> {
            final /* synthetic */ C2577o this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2586b(C2577o oVar) {
                super(1);
                this.this$0 = oVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends Parcelable>) (List) obj);
                return C8457t.f34900a;
            }

            public final void invoke(List<? extends Parcelable> list) {
                C8594l.m46771e(list, "it");
                C2577o oVar = this.this$0;
                oVar.m11881x3(oVar.f9012p0);
            }
        }

        C2582d(C2577o oVar) {
            this.f9025a = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final boolean m11906d(C2577o oVar, Video video, int i, MenuItem menuItem) {
            C8594l.m46771e(oVar, "this$0");
            C8594l.m46771e(video, "$video");
            int itemId = menuItem.getItemId();
            if (itemId == C4623e.action_play) {
                C4613a n3 = oVar.f9009m0;
                if (n3 != null) {
                    Context v2 = oVar.mo3708v2();
                    C8594l.m46770d(v2, "requireContext()");
                    n3.mo15369o(v2, video);
                    PlayerHelper.Companion companion = PlayerHelper.Companion;
                    Context applicationContext = oVar.mo3708v2().getApplicationContext();
                    C8594l.m46770d(applicationContext, "requireContext().applicationContext");
                    PlayerHelper instance = companion.getInstance(applicationContext);
                    instance.updateLastPlaybackTime(video, System.currentTimeMillis());
                    instance.updateIsEncrypted(video);
                    C2643p m3 = oVar.f9006j0;
                    if (m3 != null) {
                        m3.mo10137p(video.mo10553l());
                        Context v22 = oVar.mo3708v2();
                        C8594l.m46770d(v22, "requireContext()");
                        VideoConfigBean.C2691a aVar = new VideoConfigBean.C2691a();
                        C2643p m32 = oVar.f9006j0;
                        if (m32 != null) {
                            List c = m32.mo5380c();
                            C8594l.m46770d(c, "mVideoAdapter.currentList");
                            aVar.mo10229g(c);
                            aVar.mo10231i(i);
                            n3.mo15360f(v22, aVar.mo10223a());
                        } else {
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    }
                }
            } else if (itemId == C4623e.action_decrypt) {
                C4681i o3 = oVar.f9005i0;
                if (o3 != null) {
                    o3.mo15407E(true);
                    C8665a2 unused = C8875m.m47725b(C0719w.m4282a(oVar), C8768g1.m47302b(), (C8910t0) null, new C2583a(oVar, video, (C8508d<? super C2583a>) null), 2, (Object) null);
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else if (itemId == C4623e.action_delete) {
                oVar.f9012p0.clear();
                oVar.f9012p0.add(video);
                C4613a n32 = oVar.f9009m0;
                if (n32 != null) {
                    FragmentActivity u2 = oVar.mo3705u2();
                    C8594l.m46770d(u2, "requireActivity()");
                    n32.mo15367m(u2, oVar.f9012p0, new C2586b(oVar));
                }
            } else if (itemId == C4623e.action_info) {
                C4736s sVar = C4736s.f13541a;
                C0602j q0 = oVar.mo3693q0();
                C8594l.m46770d(q0, "parentFragmentManager");
                sVar.mo15462e(q0, video);
            }
            return true;
        }

        /* renamed from: a */
        public void mo10071a(View view, Video video, int i) {
            C8594l.m46771e(view, "view");
            C8594l.m46771e(video, "video");
            if (!video.mo10554m().booleanValue() || video.mo10554m() == null) {
                video.mo10526O(Boolean.TRUE);
            }
            C0315v vVar = new C0315v(this.f9025a.mo3708v2(), view, 8388613);
            C2577o oVar = this.f9025a;
            vVar.mo2141c(C4625g.video_menu_encrypted_item);
            vVar.mo2142d(new C2573k(oVar, video, i));
            vVar.mo2143e();
        }

        /* renamed from: b */
        public void mo10072b(Video video, int i) {
            C8594l.m46771e(video, "video");
            if (!video.mo10554m().booleanValue() || video.mo10554m() == null) {
                video.mo10526O(Boolean.TRUE);
            }
            if (this.f9025a.f9010n0 == null) {
                C4613a n3 = this.f9025a.f9009m0;
                if (n3 != null) {
                    C2577o oVar = this.f9025a;
                    Context applicationContext = oVar.mo3708v2().getApplicationContext();
                    C8594l.m46770d(applicationContext, "requireContext().applicationContext");
                    n3.mo15369o(applicationContext, video);
                    long currentTimeMillis = System.currentTimeMillis();
                    PlayerHelper k3 = oVar.f9019w0;
                    if (k3 != null) {
                        k3.updateLastPlaybackTime(video, currentTimeMillis);
                        PlayerHelper k32 = oVar.f9019w0;
                        if (k32 != null) {
                            k32.updateIsEncrypted(video);
                            C2643p m3 = oVar.f9006j0;
                            if (m3 != null) {
                                m3.mo10137p(video.mo10553l());
                                Context v2 = oVar.mo3708v2();
                                C8594l.m46770d(v2, "requireContext()");
                                VideoConfigBean.C2691a aVar = new VideoConfigBean.C2691a();
                                C2643p m32 = oVar.f9006j0;
                                if (m32 != null) {
                                    List c = m32.mo5380c();
                                    C8594l.m46770d(c, "mVideoAdapter.currentList");
                                    aVar.mo10229g(c);
                                    aVar.mo10231i(i);
                                    n3.mo15360f(v2, aVar.mo10223a());
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
            C4168j0 q3 = this.f9025a.f9008l0;
            if (q3 != null) {
                q3.mo14304p(C8482l.m46668i(video), true);
                return;
            }
            C8594l.m46783q("mVideoTracker");
            throw null;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$e */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2587e implements C4745t<C8446k<? extends String, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ C2577o f9029a;

        C2587e(C2577o oVar) {
            this.f9029a = oVar;
        }

        /* renamed from: b */
        public void mo10036a(C8446k<String, Boolean> kVar) {
            C8594l.m46771e(kVar, "result");
            C4681i o3 = this.f9029a.f9005i0;
            if (o3 != null) {
                o3.mo15408F(kVar.getFirst(), kVar.getSecond().booleanValue(), false, true);
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$f */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2588f extends C0084b {

        /* renamed from: c */
        final /* synthetic */ C2577o f9030c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2588f(C2577o oVar) {
            super(false);
            this.f9030c = oVar;
        }

        /* renamed from: b */
        public void mo400b() {
            this.f9030c.mo3693q0().mo3917H0((String) null, 1);
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$g */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2589g extends RecyclerView.C0817t {

        /* renamed from: a */
        final /* synthetic */ C2577o f9031a;

        C2589g(C2577o oVar) {
            this.f9031a = oVar;
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            C8594l.m46771e(recyclerView, "recyclerView");
            if (this.f9031a.mo3606L() != null && (this.f9031a.mo3705u2() instanceof C2627h)) {
                ((C2627h) this.f9031a.mo3705u2()).mo10042J(!this.f9031a.f9015s0 && !recyclerView.canScrollVertically(-1));
            }
            super.mo4985b(recyclerView, i, i2);
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$h */
    /* compiled from: EncryptedFragment.kt */
    public static final class C2590h extends C4168j0.C4174b<Video> {

        /* renamed from: a */
        final /* synthetic */ C2577o f9032a;

        C2590h(C2577o oVar) {
            this.f9032a = oVar;
        }

        /* renamed from: b */
        public void mo10079b() {
            Menu e;
            Menu e2;
            super.mo10079b();
            C4168j0 q3 = this.f9032a.f9008l0;
            if (q3 != null) {
                boolean z = true;
                if (!q3.mo14298j().isEmpty()) {
                    if (this.f9032a.f9010n0 == null) {
                        C2577o oVar = this.f9032a;
                        oVar.f9010n0 = ((AppCompatActivity) oVar.mo3705u2()).mo479Z1(this.f9032a.f9020x0);
                    }
                    C3432b h3 = this.f9032a.f9010n0;
                    if (!(h3 == null || (e2 = h3.mo705e()) == null)) {
                        Context v2 = this.f9032a.mo3708v2();
                        C8594l.m46770d(v2, "requireContext()");
                        C4168j0 q32 = this.f9032a.f9008l0;
                        if (q32 != null) {
                            int size = q32.mo14298j().size();
                            C2643p m3 = this.f9032a.f9006j0;
                            if (m3 != null) {
                                if (size != m3.getItemCount()) {
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
                    C3432b h32 = this.f9032a.f9010n0;
                    if (h32 != null) {
                        StringBuilder sb = new StringBuilder();
                        C4168j0 q33 = this.f9032a.f9008l0;
                        if (q33 != null) {
                            sb.append(q33.mo14298j().size());
                            sb.append('/');
                            C2643p m32 = this.f9032a.f9006j0;
                            if (m32 != null) {
                                sb.append(m32.getItemCount());
                                h32.mo715r(sb.toString());
                            } else {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                    C2643p m33 = this.f9032a.f9006j0;
                    if (m33 == null) {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    } else if (C8594l.m46767a(m33.mo10132k(), "no_select_mode")) {
                        C2643p m34 = this.f9032a.f9006j0;
                        if (m34 != null) {
                            m34.mo10138q("select_mode");
                        } else {
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        }
                    }
                } else if (this.f9032a.f9010n0 == null) {
                    C2643p m35 = this.f9032a.f9006j0;
                    if (m35 == null) {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    } else if (C8594l.m46767a(m35.mo10132k(), "select_mode")) {
                        C2643p m36 = this.f9032a.f9006j0;
                        if (m36 != null) {
                            m36.mo10138q("no_select_mode");
                        } else {
                            C8594l.m46783q("mVideoAdapter");
                            throw null;
                        }
                    }
                } else {
                    C3432b h33 = this.f9032a.f9010n0;
                    if (!(h33 == null || (e = h33.mo705e()) == null)) {
                        Context v22 = this.f9032a.mo3708v2();
                        C8594l.m46770d(v22, "requireContext()");
                        C4168j0 q34 = this.f9032a.f9008l0;
                        if (q34 != null) {
                            int size2 = q34.mo14298j().size();
                            C2643p m37 = this.f9032a.f9006j0;
                            if (m37 != null) {
                                if (size2 != m37.getItemCount()) {
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
                    C3432b h34 = this.f9032a.f9010n0;
                    if (h34 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        C4168j0 q35 = this.f9032a.f9008l0;
                        if (q35 != null) {
                            sb2.append(q35.mo14298j().size());
                            sb2.append('/');
                            C2643p m38 = this.f9032a.f9006j0;
                            if (m38 != null) {
                                sb2.append(m38.getItemCount());
                                h34.mo715r(sb2.toString());
                            } else {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mVideoTracker");
                            throw null;
                        }
                    }
                    C2643p m39 = this.f9032a.f9006j0;
                    if (m39 == null) {
                        C8594l.m46783q("mVideoAdapter");
                        throw null;
                    } else if (C8594l.m46767a(m39.mo10132k(), "select_mode")) {
                        C2643p m310 = this.f9032a.f9006j0;
                        if (m310 != null) {
                            m310.mo10138q("un_select_mode");
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

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.encrypted.EncryptedFragment$releasePlayBack$1$1", mo30600f = "EncryptedFragment.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.encrypted.o$i */
    /* compiled from: EncryptedFragment.kt */
    static final class C2591i extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ List<Video> $deleteList;
        final /* synthetic */ PlayerHelper $this_apply;
        int label;
        final /* synthetic */ C2577o this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2591i(C2577o oVar, List<? extends Video> list, PlayerHelper playerHelper, C8508d<? super C2591i> dVar) {
            super(2, dVar);
            this.this$0 = oVar;
            this.$deleteList = list;
            this.$this_apply = playerHelper;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2591i(this.this$0, this.$deleteList, this.$this_apply, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2591i) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                C4815n p3 = this.this$0.f9004h0;
                if (p3 != null) {
                    Video v = p3.mo15558v(true);
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

    static {
        String canonicalName = C2577o.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "EncryptedFragment";
        }
        f9002A0 = canonicalName;
    }

    public C2577o() {
        C4616c a = C4615b.m20080a();
        this.f9009m0 = a == null ? null : a.mo15370a();
        this.f9011o0 = new C8446k<>("date_modified", Boolean.FALSE);
        this.f9012p0 = new ArrayList<>();
        this.f9014r0 = BuildConfig.FLAVOR;
        this.f9020x0 = new C2580c(this);
        this.f9021y0 = new C2582d(this);
    }

    /* renamed from: N3 */
    private final void m11847N3() {
        mo3705u2().finish();
        C4681i iVar = this.f9005i0;
        if (iVar != null) {
            iVar.mo15407E(false);
            C0133c cVar = this.f9017u0;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f9017u0 = null;
            return;
        }
        C8594l.m46783q("mVideoLibraryViewModel");
        throw null;
    }

    /* renamed from: O3 */
    private final void m11848O3() {
        mo3705u2().mo391z().mo395a(mo3607L0(), new C2588f(this));
    }

    /* renamed from: P3 */
    private final void m11849P3() {
        ActionBar R1;
        FragmentActivity L = mo3606L();
        AppCompatActivity appCompatActivity = L instanceof AppCompatActivity ? (AppCompatActivity) L : null;
        if (appCompatActivity != null && (R1 = appCompatActivity.mo471R1()) != null) {
            boolean z = ((R1.mo410i() & 4) == 0 || (R1.mo410i() & 2) == 0) ? false : true;
            this.f9016t0 = z;
            if (!z) {
                R1.mo423v(false);
                R1.mo420s(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public final void m11850Q3(List<? extends Video> list) {
        PlayerHelper playerHelper = this.f9019w0;
        if (playerHelper == null) {
            C8594l.m46783q("mPlayerHelper");
            throw null;
        } else if (playerHelper.isAudioPlay() || playerHelper.isWindows()) {
            playerHelper.deleteVideoList(C8606x.m46797a(list));
            if (playerHelper.isAudioPlay() && playerHelper.getVideo() == null) {
                mo3708v2().sendBroadcast(new Intent(AudioPlayService.Companion.getNOTIFICATION_RELEASE()));
            } else if (playerHelper.isWindows() && playerHelper.getVideo() == null) {
                playerHelper.savePlayingVideoIdAndPath(true);
                playerHelper.setWindows(false);
                C4613a aVar = this.f9009m0;
                if (aVar != null) {
                    Application application = mo3705u2().getApplication();
                    C8594l.m46770d(application, "requireActivity().application");
                    aVar.mo15364j(application, true);
                }
                playerHelper.closeWindow();
                playerHelper.release();
            }
        } else {
            C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2591i(this, list, playerHelper, (C8508d<? super C2591i>) null), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public final void m11851R3(int i, List<Video> list) {
        C4666o oVar = C4666o.f13452a;
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        C2643p pVar = this.f9006j0;
        if (pVar != null) {
            List c = pVar.mo5380c();
            C8594l.m46770d(c, "mVideoAdapter.currentList");
            oVar.mo15397a(v2, i, list, C8490t.m46678C(c));
            return;
        }
        C8594l.m46783q("mVideoAdapter");
        throw null;
    }

    /* renamed from: S3 */
    private final void m11852S3(int i) {
        Window window;
        C4681i iVar = this.f9005i0;
        if (iVar == null) {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        } else if (!iVar.mo15423s()) {
            C0133c cVar = this.f9017u0;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f9017u0 = null;
        } else if (this.f9017u0 == null) {
            C4635g d = C4635g.m20108d(LayoutInflater.from(mo3651a0()), (ViewGroup) null, false);
            C8594l.m46770d(d, "inflate(\n               …      false\n            )");
            this.f9018v0 = d;
            if (this.f9017u0 == null) {
                Context v2 = mo3708v2();
                C4668q.C4669a aVar = C4668q.f13454a;
                Context v22 = mo3708v2();
                C8594l.m46770d(v22, "requireContext()");
                C0133c.C0134a aVar2 = new C0133c.C0134a(v2, aVar.mo15398a(v22));
                C4635g gVar = this.f9018v0;
                if (gVar != null) {
                    aVar2.mo646q(gVar.mo7577a());
                    aVar2.mo638i(17039360, new C2568f(this));
                    aVar2.mo645p(mo3582D0(C4627i.video_decrypt_video));
                    aVar2.mo633d(false);
                    this.f9017u0 = aVar2.mo630a();
                    C4635g gVar2 = this.f9018v0;
                    if (gVar2 != null) {
                        gVar2.f13383c.setText(mo3582D0(C4627i.video_loading));
                        C4635g gVar3 = this.f9018v0;
                        if (gVar3 != null) {
                            gVar3.f13382b.setMax(100);
                            C4635g gVar4 = this.f9018v0;
                            if (gVar4 != null) {
                                gVar4.f13382b.setProgress(i);
                                C0133c cVar2 = this.f9017u0;
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
            C0133c cVar3 = this.f9017u0;
            if (cVar3 != null) {
                cVar3.show();
            }
        } else {
            C4635g gVar5 = this.f9018v0;
            if (gVar5 != null) {
                gVar5.f13382b.setProgress(i);
                C4635g gVar6 = this.f9018v0;
                if (gVar6 != null) {
                    TextView textView = gVar6.f13383c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append('%');
                    textView.setText(sb.toString());
                    if (i > 99) {
                        C4681i iVar2 = this.f9005i0;
                        if (iVar2 != null) {
                            iVar2.mo15407E(false);
                            C0133c cVar4 = this.f9017u0;
                            if (cVar4 != null) {
                                cVar4.dismiss();
                            }
                            this.f9017u0 = null;
                        } else {
                            C8594l.m46783q("mVideoLibraryViewModel");
                            throw null;
                        }
                    }
                    C0133c cVar5 = this.f9017u0;
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
    /* renamed from: T3 */
    public static final void m11853T3(C2577o oVar, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(oVar, "this$0");
        dialogInterface.dismiss();
        C4671r.m20190a();
        C4681i iVar = oVar.f9005i0;
        if (iVar != null) {
            iVar.mo15407E(false);
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public static final void m11854U3(C2577o oVar, List list) {
        C8594l.m46771e(oVar, "this$0");
        C4631c cVar = oVar.f9007k0;
        if (cVar != null) {
            LinearLayout c = cVar.f13365d.mo7577a();
            C8594l.m46770d(c, "mVideoFragmentVideoBinding.layoutVideoEmpty.root");
            c.setVisibility(list.isEmpty() ? 0 : 8);
            C2643p pVar = oVar.f9006j0;
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
    /* renamed from: V3 */
    public static final void m11855V3(C2577o oVar, Boolean bool) {
        C8594l.m46771e(oVar, "this$0");
        C4681i iVar = oVar.f9005i0;
        if (iVar != null) {
            iVar.mo15414j().mo4149h(oVar.mo3607L0(), new C2566d(oVar, bool));
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public static final void m11856W3(C2577o oVar, Boolean bool, C8446k kVar) {
        C8594l.m46771e(oVar, "this$0");
        C8594l.m46770d(kVar, "it");
        oVar.f9011o0 = kVar;
        C8594l.m46770d(bool, "granted");
        if (bool.booleanValue()) {
            C4815n nVar = oVar.f9004h0;
            if (nVar != null) {
                nVar.mo15551o(kVar, true);
            } else {
                C8594l.m46783q("mVideoStoreViewModel");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public static final void m11857X3(C2577o oVar, Integer num) {
        C8594l.m46771e(oVar, "this$0");
        int y3 = oVar.mo10067y3();
        if (num == null || num.intValue() != y3) {
            if (num != null && num.intValue() == 1) {
                C4631c cVar = oVar.f9007k0;
                if (cVar != null) {
                    cVar.f13366e.setLayoutManager(new GridLayoutManager(oVar.mo3708v2(), 2, 1, false));
                } else {
                    C8594l.m46783q("mVideoFragmentVideoBinding");
                    throw null;
                }
            } else if (num != null && num.intValue() == 0) {
                C4631c cVar2 = oVar.f9007k0;
                if (cVar2 != null) {
                    cVar2.f13366e.setLayoutManager(new LinearLayoutManager(oVar.mo3708v2(), 1, false));
                } else {
                    C8594l.m46783q("mVideoFragmentVideoBinding");
                    throw null;
                }
            }
            C2643p pVar = oVar.f9006j0;
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
    /* renamed from: Y3 */
    public static final void m11858Y3(C2577o oVar, Integer num) {
        C8594l.m46771e(oVar, "this$0");
        C8594l.m46770d(num, "it");
        oVar.m11852S3(num.intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public static final void m11859Z3(C2577o oVar, Boolean bool) {
        C8594l.m46771e(oVar, "this$0");
        C4631c cVar = oVar.f9007k0;
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
    /* renamed from: a4 */
    public static final void m11860a4(C2577o oVar, View view) {
        C8594l.m46771e(oVar, "this$0");
        if (oVar.mo3705u2() instanceof C2625g) {
            ((C2625g) oVar.mo3705u2()).mo10035p1(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m11861b4(C2577o oVar, C3884d dVar) {
        C8594l.m46771e(oVar, "this$0");
        Long l = (Long) dVar.mo13377b(C3888f.m16600e(ConsantsKt.KEY_LAST_PLAY_VIDEO_ID));
        long longValue = l == null ? -1 : l.longValue();
        C2643p pVar = oVar.f9006j0;
        if (pVar != null) {
            pVar.mo10137p(longValue);
        } else {
            C8594l.m46783q("mVideoAdapter");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static final void m11862c4(C2577o oVar, Object obj) {
        C8594l.m46771e(oVar, "this$0");
        if (obj == null) {
            Toast.makeText(oVar.mo3708v2(), C4627i.coocent_video_delete_successfully, 0).show();
            oVar.m11851R3(0, oVar.f9012p0);
        } else if (Build.VERSION.SDK_INT < 30) {
            Toast.makeText(oVar.mo3708v2(), C4627i.coocent_video_delete_failed, 0).show();
        } else if (obj instanceof PendingIntent) {
            try {
                oVar.mo3641V2(((PendingIntent) obj).getIntentSender(), 1114, (Intent) null, 0, 0, 0, (Bundle) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e3 */
    private final void m11863e3() {
        Application application = mo3705u2().getApplication();
        C8594l.m46770d(application, "requireActivity().application");
        C0696m0 a = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4814m(application)).mo4262a(C4815n.class);
        C8594l.m46770d(a, "ViewModelProvider(\n     …oreViewModel::class.java)");
        this.f9004h0 = (C4815n) a;
        Application application2 = mo3705u2().getApplication();
        C8594l.m46770d(application2, "requireActivity().application");
        C0696m0 a2 = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4680h(application2)).mo4262a(C4681i.class);
        C8594l.m46770d(a2, "ViewModelProvider(\n     …aryViewModel::class.java)");
        this.f9005i0 = (C4681i) a2;
        C4815n nVar = this.f9004h0;
        if (nVar != null) {
            nVar.mo15550n().mo4149h(mo3607L0(), new C2571i(this));
            C4681i iVar = this.f9005i0;
            if (iVar != null) {
                Context v2 = mo3708v2();
                C8594l.m46770d(v2, "requireContext()");
                iVar.mo15409G(C4667p.m20178b(v2));
                C4681i iVar2 = this.f9005i0;
                if (iVar2 != null) {
                    iVar2.mo15419o().mo4149h(mo3607L0(), new C2567e(this));
                    C4681i iVar3 = this.f9005i0;
                    if (iVar3 != null) {
                        iVar3.mo15421q().mo4149h(mo3607L0(), new C2575m(this));
                        C4681i iVar4 = this.f9005i0;
                        if (iVar4 != null) {
                            iVar4.mo15413i().mo4149h(mo3607L0(), new C2574l(this));
                            C4681i iVar5 = this.f9005i0;
                            if (iVar5 != null) {
                                iVar5.mo15418n().mo4149h(mo3607L0(), new C2565c(this));
                                C4631c cVar = this.f9007k0;
                                if (cVar != null) {
                                    cVar.f13364c.f13380b.setOnClickListener(new C2572j(this));
                                    Context v22 = mo3708v2();
                                    C8594l.m46770d(v22, "requireContext()");
                                    C0684j.m4231b(PlayerHelperKt.getDataStore(v22).mo13321b(), (C8513g) null, 0, 3, (Object) null).mo4149h(mo3607L0(), new C2570h(this));
                                    C4815n nVar2 = this.f9004h0;
                                    if (nVar2 != null) {
                                        nVar2.mo15552p().mo4149h(mo3607L0(), new C2569g(this));
                                    } else {
                                        C8594l.m46783q("mVideoStoreViewModel");
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

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m11881x3(List<? extends Video> list) {
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15459b(q0, new C2579b(this, list));
    }

    /* renamed from: F1 */
    public void mo3589F1(boolean z) {
        ActionBar R1;
        super.mo3589F1(z);
        if (z) {
            FragmentActivity L = mo3606L();
            AppCompatActivity appCompatActivity = L instanceof AppCompatActivity ? (AppCompatActivity) L : null;
            if (appCompatActivity != null && (R1 = appCompatActivity.mo471R1()) != null && !this.f9016t0) {
                R1.mo423v(false);
                R1.mo420s(false);
            }
        } else if (mo3705u2() instanceof C2627h) {
            String D0 = mo3582D0(C4627i.coocent_mime_type_video);
            C8594l.m46770d(D0, "getString(R.string.coocent_mime_type_video)");
            ((C2627h) mo3705u2()).mo10046v0(D0);
        }
    }

    /* renamed from: J1 */
    public boolean mo3601J1(MenuItem menuItem) {
        C8594l.m46771e(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            m11847N3();
        } else if (itemId == C4623e.action_select_all) {
            mo10062J3();
        } else if (itemId == C4623e.action_sort) {
            mo10063K3();
        } else if (itemId == C4623e.action_view_list) {
            mo10065M3();
        } else if (itemId == C4623e.action_view_grid) {
            mo10064L3();
        }
        return super.mo3601J1(menuItem);
    }

    /* renamed from: J3 */
    public final void mo10062J3() {
        C4168j0<Video> j0Var = this.f9008l0;
        if (j0Var != null) {
            C2643p pVar = this.f9006j0;
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

    /* renamed from: K3 */
    public final void mo10063K3() {
        C4736s sVar = C4736s.f13541a;
        C0602j q0 = mo3693q0();
        C8594l.m46770d(q0, "parentFragmentManager");
        sVar.mo15466i(q0, 3, this.f9011o0.getFirst(), this.f9011o0.getSecond().booleanValue(), new C2587e(this));
    }

    /* renamed from: L3 */
    public final void mo10064L3() {
        mo10066d4(1);
    }

    /* renamed from: M3 */
    public final void mo10065M3() {
        mo10066d4(0);
    }

    /* renamed from: N1 */
    public void mo3614N1(Menu menu) {
        C8594l.m46771e(menu, "menu");
        super.mo3614N1(menu);
        menu.findItem(C4623e.action_search).setVisible(false);
        menu.findItem(C4623e.action_function).setVisible(false);
        menu.findItem(C4623e.action_encrypted).setVisible(false);
        Context v2 = mo3708v2();
        C8594l.m46770d(v2, "requireContext()");
        C4663m.m20171d(menu, v2, mo10067y3());
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        C8594l.m46771e(bundle, "outState");
        super.mo3626R1(bundle);
        if (!this.f9012p0.isEmpty()) {
            bundle.putParcelableArrayList("delete_list", this.f9012p0);
        }
        if (!TextUtils.isEmpty(this.f9014r0)) {
            bundle.putString("rename_title", this.f9014r0);
        }
        Video video = this.f9013q0;
        if (video != null) {
            bundle.putParcelable(AudioPlayService.KEY_RENAME_VIDEO, video);
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        mo3590F2(true);
        if (mo3705u2() instanceof C2627h) {
            String D0 = mo3582D0(C4627i.video_encrypted_video);
            C8594l.m46770d(D0, "getString(R.string.video_encrypted_video)");
            ((C2627h) mo3705u2()).mo10046v0(D0);
        }
        m11849P3();
        m11848O3();
        C4631c cVar = this.f9007k0;
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
            this.f9006j0 = pVar;
            if (pVar != null) {
                recyclerView.setAdapter(pVar);
                recyclerView.mo4634l(new C2589g(this));
                String str = f9002A0;
                C4631c cVar2 = this.f9007k0;
                if (cVar2 != null) {
                    RecyclerView recyclerView2 = cVar2.f13366e;
                    C2643p pVar2 = this.f9006j0;
                    if (pVar2 != null) {
                        C2643p.C2647d dVar = new C2643p.C2647d(pVar2);
                        C4631c cVar3 = this.f9007k0;
                        if (cVar3 != null) {
                            RecyclerView recyclerView3 = cVar3.f13366e;
                            C8594l.m46770d(recyclerView3, "mVideoFragmentVideoBinding.rvVideo");
                            C4168j0.C4169a aVar = new C4168j0.C4169a(str, recyclerView2, dVar, new C2643p.C2646c(recyclerView3), C4177k0.m18418a(Video.class));
                            aVar.mo14328b(C4165i0.m18384a());
                            C4168j0<Video> a = aVar.mo14327a();
                            a.mo14291c(new C2590h(this));
                            C8457t tVar = C8457t.f34900a;
                            C8594l.m46770d(a, "Builder(\n            TAG…         })\n            }");
                            this.f9008l0 = a;
                            C2643p pVar3 = this.f9006j0;
                            if (pVar3 == null) {
                                C8594l.m46783q("mVideoAdapter");
                                throw null;
                            } else if (a != null) {
                                pVar3.mo10139r(a);
                                pVar3.mo10136o(this.f9021y0);
                                m11863e3();
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
                C8594l.m46783q("mVideoAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoFragmentVideoBinding");
            throw null;
        }
    }

    /* renamed from: d4 */
    public final void mo10066d4(int i) {
        if (mo10067y3() != i) {
            C4681i iVar = this.f9005i0;
            if (iVar != null) {
                iVar.mo15411L(i);
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        }
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        mo3584D2(new C7571b());
        mo3587E2(new C7571b());
        mo3612M2(new C7571b());
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        Context applicationContext = mo3708v2().getApplicationContext();
        C8594l.m46770d(applicationContext, "requireContext().applicationContext");
        this.f9019w0 = companion.getInstance(applicationContext);
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("delete_list");
            if (parcelableArrayList != null && (!parcelableArrayList.isEmpty())) {
                this.f9012p0.clear();
                this.f9012p0.addAll(parcelableArrayList);
            }
            Video video = (Video) bundle.getParcelable(AudioPlayService.KEY_RENAME_VIDEO);
            if (video != null) {
                this.f9013q0 = video;
            }
            String string = bundle.getString("rename_title", BuildConfig.FLAVOR);
            C8594l.m46770d(string, "getString(ARG_RENAME_TITLE, \"\")");
            this.f9014r0 = string;
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8594l.m46771e(layoutInflater, "inflater");
        C4631c d = C4631c.m20093d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "it");
        this.f9007k0 = d;
        FrameLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…nding = it\n        }.root");
        return c;
    }

    /* renamed from: v1 */
    public void mo3707v1() {
        super.mo3707v1();
        C4681i iVar = this.f9005i0;
        if (iVar != null) {
            iVar.mo15407E(false);
            C0133c cVar = this.f9017u0;
            if (cVar != null) {
                cVar.dismiss();
            }
            this.f9017u0 = null;
            return;
        }
        C8594l.m46783q("mVideoLibraryViewModel");
        throw null;
    }

    /* renamed from: y3 */
    public final int mo10067y3() {
        C2643p pVar = this.f9006j0;
        if (pVar != null) {
            return pVar.mo10131j();
        }
        C8594l.m46783q("mVideoAdapter");
        throw null;
    }
}
