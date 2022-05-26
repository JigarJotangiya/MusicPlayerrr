package com.coocent.videoplayer.p062t.p065c;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0506a;
import androidx.fragment.app.C0584b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.coocent.video.videoplayercore.player.PlayerHelper;
import com.coocent.videoplayer.C2703j;
import com.coocent.videoplayer.C2705l;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2708o;
import com.coocent.videoplayer.C2709p;
import com.coocent.videoplayer.p060r.C2717g;
import com.coocent.videoplayer.p060r.C2718h;
import com.coocent.videoplayer.p061s.C2725e;
import com.coocent.videostore.p067po.Video;
import java.util.Arrays;
import java.util.List;
import p369i.C8457t;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8605w;

/* renamed from: com.coocent.videoplayer.t.c.k */
/* compiled from: PlayListDialog.kt */
public final class C2768k extends C0584b {

    /* renamed from: t0 */
    public static final C2769a f9469t0 = new C2769a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public static final String f9470u0 = C2768k.class.getCanonicalName();

    /* renamed from: q0 */
    private C2717g f9471q0;

    /* renamed from: r0 */
    private C2771c f9472r0;

    /* renamed from: s0 */
    private boolean f9473s0;

    /* renamed from: com.coocent.videoplayer.t.c.k$a */
    /* compiled from: PlayListDialog.kt */
    public static final class C2769a {
        private C2769a() {
        }

        public /* synthetic */ C2769a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo10347a() {
            return C2768k.f9470u0;
        }

        /* renamed from: b */
        public final C2768k mo10348b(boolean z) {
            C2768k kVar = new C2768k();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_landscape", z);
            C8457t tVar = C8457t.f34900a;
            kVar.mo3581C2(bundle);
            return kVar;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.k$b */
    /* compiled from: PlayListDialog.kt */
    public interface C2770b {
        /* renamed from: R0 */
        void mo10192R0(int i);

        /* renamed from: V0 */
        void mo10193V0(int i);
    }

    /* renamed from: com.coocent.videoplayer.t.c.k$c */
    /* compiled from: PlayListDialog.kt */
    public static final class C2771c extends RecyclerView.C0797h<C2773b> {

        /* renamed from: a */
        private final Context f9474a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<Video> f9475b;

        /* renamed from: c */
        private int f9476c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C2772a f9477d;

        /* renamed from: com.coocent.videoplayer.t.c.k$c$a */
        /* compiled from: PlayListDialog.kt */
        public interface C2772a {
            /* renamed from: a */
            void mo10353a(Video video, int i);

            /* renamed from: b */
            void mo10354b(Video video, int i);
        }

        /* renamed from: com.coocent.videoplayer.t.c.k$c$b */
        /* compiled from: PlayListDialog.kt */
        public final class C2773b extends RecyclerView.C0792c0 implements View.OnClickListener {

            /* renamed from: g */
            private final C2718h f9478g;

            /* renamed from: h */
            final /* synthetic */ C2771c f9479h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2773b(C2771c cVar, C2718h hVar) {
                super(hVar.mo7577a());
                C8594l.m46771e(cVar, "this$0");
                C8594l.m46771e(hVar, "binding");
                this.f9479h = cVar;
                this.f9478g = hVar;
                hVar.mo7577a().setOnClickListener(this);
                hVar.f9351b.setOnClickListener(this);
            }

            /* renamed from: a */
            public final C2718h mo10355a() {
                return this.f9478g;
            }

            public void onClick(View view) {
                C8594l.m46771e(view, "v");
                if (view.getId() == C2706m.iv_remove) {
                    C2772a c = this.f9479h.f9477d;
                    if (c != null) {
                        c.mo10354b((Video) this.f9479h.f9475b.get(getAbsoluteAdapterPosition()), getAbsoluteAdapterPosition());
                        return;
                    }
                    return;
                }
                C2772a c2 = this.f9479h.f9477d;
                if (c2 != null) {
                    c2.mo10353a((Video) this.f9479h.f9475b.get(getAbsoluteAdapterPosition()), getAbsoluteAdapterPosition());
                }
            }
        }

        public C2771c(Context context, List<? extends Video> list) {
            C8594l.m46771e(context, "mContext");
            C8594l.m46771e(list, "mVideoList");
            this.f9474a = context;
            this.f9475b = list;
        }

        /* renamed from: e */
        public void onBindViewHolder(C2773b bVar, int i) {
            C8594l.m46771e(bVar, "holder");
            Video video = this.f9475b.get(i);
            C2718h a = bVar.mo10355a();
            a.f9354e.setText(video.mo10565w());
            a.f9353d.setText(C2725e.m12317a(video.mo10547g(), C2725e.m12318b(video.mo10547g())));
            if (i == this.f9476c) {
                int b = C0506a.m3150b(this.f9474a, C2703j.videoColorAccent);
                a.f9354e.setTextColor(b);
                a.f9353d.setTextColor(b);
            } else {
                a.f9354e.setTextColor(-1);
                a.f9353d.setTextColor(-6710887);
            }
            C1738j<Drawable> K0 = C1719b.m8597t(this.f9474a).mo7665u(video.mo10564v()).mo7636K0(0.1f);
            int i2 = C2705l.video_drawable_placeholder_cover;
            ((C1738j) ((C1738j) K0.mo8391j(i2)).mo8375Z(i2)).mo7645z0(a.f9352c);
        }

        /* renamed from: f */
        public C2773b onCreateViewHolder(ViewGroup viewGroup, int i) {
            C8594l.m46771e(viewGroup, "parent");
            C2718h d = C2718h.m12300d(LayoutInflater.from(this.f9474a), viewGroup, false);
            C8594l.m46770d(d, "inflate(\n               …rent, false\n            )");
            return new C2773b(this, d);
        }

        /* renamed from: g */
        public final void mo10351g(int i) {
            this.f9476c = i;
        }

        public int getItemCount() {
            return this.f9475b.size();
        }

        /* renamed from: h */
        public final void mo10352h(C2772a aVar) {
            C8594l.m46771e(aVar, "listener");
            this.f9477d = aVar;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.k$d */
    /* compiled from: PlayListDialog.kt */
    public static final class C2774d implements C2771c.C2772a {

        /* renamed from: a */
        final /* synthetic */ C2768k f9480a;

        C2774d(C2768k kVar) {
            this.f9480a = kVar;
        }

        /* renamed from: a */
        public void mo10353a(Video video, int i) {
            C8594l.m46771e(video, "video");
            if (this.f9480a.mo3705u2() instanceof C2770b) {
                ((C2770b) this.f9480a.mo3705u2()).mo10193V0(i);
            }
            this.f9480a.mo3831X2();
        }

        /* renamed from: b */
        public void mo10354b(Video video, int i) {
            C8594l.m46771e(video, "video");
            if (this.f9480a.mo3705u2() instanceof C2770b) {
                ((C2770b) this.f9480a.mo3705u2()).mo10192R0(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m12500l3(C2768k kVar, View view) {
        C8594l.m46771e(kVar, "this$0");
        Dialog a3 = kVar.mo3834a3();
        if (a3 != null) {
            a3.hide();
        }
    }

    /* renamed from: L1 */
    public void mo3608L1() {
        super.mo3608L1();
        mo3831X2();
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        Window window;
        super.mo3630S1();
        Dialog a3 = mo3834a3();
        if (a3 != null && (window = a3.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            C8594l.m46770d(attributes, "it.attributes");
            attributes.dimAmount = 0.0f;
            DisplayMetrics displayMetrics = mo3698s0().getDisplayMetrics();
            if (!this.f9473s0) {
                window.setGravity(80);
                window.setLayout(displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                window.setGravity(8388613);
                window.setLayout(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        if (this.f9473s0) {
            C2717g gVar = this.f9471q0;
            if (gVar != null) {
                gVar.mo7577a().setOrientation(0);
                C2717g gVar2 = this.f9471q0;
                if (gVar2 != null) {
                    gVar2.f9349d.setBackground(C0506a.m3152d(mo3708v2(), C2705l.video_drawable_dialog_linear_gradient_angle180));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C2717g gVar3 = this.f9471q0;
            if (gVar3 != null) {
                gVar3.mo7577a().setOrientation(1);
                C2717g gVar4 = this.f9471q0;
                if (gVar4 != null) {
                    gVar4.f9349d.setBackground(C0506a.m3152d(mo3708v2(), C2705l.video_drawable_dialog_linear_gradient_angle90));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
        PlayerHelper.Companion companion = PlayerHelper.Companion;
        Application application = mo3705u2().getApplication();
        C8594l.m46770d(application, "requireActivity().application");
        PlayerHelper instance = companion.getInstance(application);
        C2717g gVar5 = this.f9471q0;
        if (gVar5 != null) {
            AppCompatTextView appCompatTextView = gVar5.f9348c;
            C8605w wVar = C8605w.f34938a;
            String D0 = mo3582D0(C2708o.video_play_list);
            C8594l.m46770d(D0, "getString(R.string.video_play_list)");
            String format = String.format(D0, Arrays.copyOf(new Object[]{Integer.valueOf(instance.getVideoList().size())}, 1));
            C8594l.m46770d(format, "java.lang.String.format(format, *args)");
            appCompatTextView.setText(format);
            C2717g gVar6 = this.f9471q0;
            if (gVar6 != null) {
                RecyclerView recyclerView = gVar6.f9347b;
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(mo3708v2(), 1, false));
                Context v2 = mo3708v2();
                C8594l.m46770d(v2, "requireContext()");
                C2771c cVar = new C2771c(v2, instance.getVideoList());
                this.f9472r0 = cVar;
                if (cVar != null) {
                    cVar.mo10351g(instance.getPlayPosition());
                    C2771c cVar2 = this.f9472r0;
                    if (cVar2 != null) {
                        recyclerView.setAdapter(cVar2);
                        recyclerView.mo4657q1(instance.getPlayPosition());
                        C2771c cVar3 = this.f9472r0;
                        if (cVar3 != null) {
                            cVar3.mo10352h(new C2774d(this));
                            C2717g gVar7 = this.f9471q0;
                            if (gVar7 != null) {
                                gVar7.f9349d.setOnClickListener(new C2748g(this));
                            } else {
                                C8594l.m46783q("mBinding");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("mAdapter");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mAdapter");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mAdapter");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: k3 */
    public final void mo10346k3(int i) {
        C2771c cVar = this.f9472r0;
        if (cVar != null) {
            cVar.mo10351g(i);
            C2771c cVar2 = this.f9472r0;
            if (cVar2 == null) {
                C8594l.m46783q("mAdapter");
                throw null;
            } else if (cVar2 != null) {
                cVar2.notifyItemRangeChanged(0, cVar2.getItemCount());
                C2717g gVar = this.f9471q0;
                if (gVar != null) {
                    gVar.f9347b.mo4657q1(i);
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mAdapter");
                throw null;
            }
        } else {
            C8594l.m46783q("mAdapter");
            throw null;
        }
    }

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        int i;
        super.mo3679l1(bundle);
        Bundle V = mo3638V();
        if (V != null) {
            this.f9473s0 = V.getBoolean("is_landscape", false);
        }
        if (this.f9473s0) {
            i = C2709p.VideoTheme_Dialog_FullScreen;
        } else {
            i = C2709p.VideoTheme_Dialog_Normal;
        }
        mo3839f3(2, i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C8594l.m46771e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo3831X2();
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C8594l.m46771e(layoutInflater, "inflater");
        Dialog a3 = mo3834a3();
        if (a3 != null) {
            a3.setCanceledOnTouchOutside(true);
            Window window = a3.getWindow();
            if (window != null && (i = Build.VERSION.SDK_INT) >= 21) {
                window.getDecorView().setSystemUiVisibility(5888);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(Color.parseColor("#99000000"));
                window.setNavigationBarColor(Color.parseColor("#99000000"));
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    C8594l.m46770d(attributes, "it.attributes");
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
            }
        }
        C2717g d = C2717g.m12296d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "it");
        this.f9471q0 = d;
        LinearLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…nding = it\n        }.root");
        return c;
    }
}
