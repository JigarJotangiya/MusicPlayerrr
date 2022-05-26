package com.coocent.videoplayer.p062t.p065c;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.videoplayer.C2703j;
import com.coocent.videoplayer.C2705l;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2708o;
import com.coocent.videoplayer.C2709p;
import com.coocent.videoplayer.p060r.C2713c;
import com.coocent.videoplayer.p060r.C2714d;
import com.coocent.videoplayer.p061s.C2725e;
import com.coocent.videostore.p067po.Video;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p369i.C8457t;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8605w;
import p369i.p387z.p389d.C8606x;

/* renamed from: com.coocent.videoplayer.t.c.h */
/* compiled from: AudioPlayListDialog.kt */
public final class C2749h extends C0584b {

    /* renamed from: v0 */
    public static final C2750a f9425v0 = new C2750a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public static final String f9426w0 = C2749h.class.getCanonicalName();
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public static volatile C2749h f9427x0;

    /* renamed from: q0 */
    private C2713c f9428q0;

    /* renamed from: r0 */
    private C2751b f9429r0;

    /* renamed from: s0 */
    private List<Video> f9430s0;

    /* renamed from: t0 */
    private int f9431t0;

    /* renamed from: u0 */
    private int f9432u0;

    /* renamed from: com.coocent.videoplayer.t.c.h$a */
    /* compiled from: AudioPlayListDialog.kt */
    public static final class C2750a {
        private C2750a() {
        }

        public /* synthetic */ C2750a(C8589g gVar) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C2749h m12420b(C2750a aVar, ArrayList arrayList, Video video, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                video = null;
            }
            return aVar.mo10313a(arrayList, video, i, i2);
        }

        /* renamed from: a */
        public final C2749h mo10313a(ArrayList<Parcelable> arrayList, Video video, int i, int i2) {
            C8594l.m46771e(arrayList, "videoList");
            if (C2749h.f9427x0 == null) {
                synchronized (C2749h.class) {
                    if (C2749h.f9427x0 == null) {
                        C2749h hVar = new C2749h();
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArrayList("videoList", arrayList);
                        bundle.putParcelable("playVideo", video);
                        bundle.putInt("playPosition", i);
                        bundle.putInt("playMode", i2);
                        C8457t tVar = C8457t.f34900a;
                        hVar.mo3581C2(bundle);
                        return hVar;
                    }
                    C8457t tVar2 = C8457t.f34900a;
                }
            }
            C2749h i3 = C2749h.f9427x0;
            if (i3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("videoList", arrayList);
            bundle2.putParcelable("playVideo", video);
            bundle2.putInt("playPosition", i);
            bundle2.putInt("playMode", i2);
            C8457t tVar3 = C8457t.f34900a;
            i3.mo3581C2(bundle2);
            return i3;
        }

        /* renamed from: c */
        public final String mo10314c() {
            return C2749h.f9426w0;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.h$b */
    /* compiled from: AudioPlayListDialog.kt */
    public static final class C2751b extends RecyclerView.C0797h<C2753b> {

        /* renamed from: a */
        private final Context f9433a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<Video> f9434b;

        /* renamed from: c */
        private int f9435c;

        /* renamed from: d */
        private int f9436d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2752a f9437e;

        /* renamed from: com.coocent.videoplayer.t.c.h$b$a */
        /* compiled from: AudioPlayListDialog.kt */
        public interface C2752a {
            /* renamed from: a */
            void mo10322a(Video video, int i);

            /* renamed from: b */
            void mo10323b(Video video, int i);
        }

        /* renamed from: com.coocent.videoplayer.t.c.h$b$b */
        /* compiled from: AudioPlayListDialog.kt */
        public final class C2753b extends RecyclerView.C0792c0 implements View.OnClickListener {

            /* renamed from: g */
            private final C2714d f9438g;

            /* renamed from: h */
            final /* synthetic */ C2751b f9439h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2753b(C2751b bVar, C2714d dVar) {
                super(dVar.mo7577a());
                C8594l.m46771e(bVar, "this$0");
                C8594l.m46771e(dVar, "binding");
                this.f9439h = bVar;
                this.f9438g = dVar;
                dVar.mo7577a().setOnClickListener(this);
                dVar.f9315b.setOnClickListener(this);
            }

            /* renamed from: a */
            public final C2714d mo10324a() {
                return this.f9438g;
            }

            public void onClick(View view) {
                C8594l.m46771e(view, "v");
                if (getAbsoluteAdapterPosition() != -1 && !this.f9439h.f9434b.isEmpty()) {
                    if (view.getId() == C2706m.iv_remove) {
                        C2752a c = this.f9439h.f9437e;
                        if (c != null) {
                            c.mo10323b((Video) this.f9439h.f9434b.get(getAbsoluteAdapterPosition()), getAbsoluteAdapterPosition());
                            return;
                        }
                        return;
                    }
                    C2752a c2 = this.f9439h.f9437e;
                    if (c2 != null) {
                        c2.mo10322a((Video) this.f9439h.f9434b.get(getAbsoluteAdapterPosition()), getAbsoluteAdapterPosition());
                    }
                }
            }
        }

        public C2751b(Context context, List<? extends Video> list) {
            C8594l.m46771e(context, "mContext");
            C8594l.m46771e(list, "mVideoList");
            this.f9433a = context;
            this.f9434b = list;
        }

        /* renamed from: e */
        public final int mo10315e() {
            return this.f9435c;
        }

        /* renamed from: f */
        public final int mo10316f() {
            return this.f9436d;
        }

        /* renamed from: g */
        public void onBindViewHolder(C2753b bVar, int i) {
            C8594l.m46771e(bVar, "holder");
            Video video = this.f9434b.get(i);
            C2714d a = bVar.mo10324a();
            a.f9318e.setText(video.mo10546f());
            a.f9317d.setText(C2725e.m12317a(video.mo10547g(), C2725e.m12318b(video.mo10547g())));
            if (i == this.f9435c) {
                AppCompatTextView appCompatTextView = a.f9318e;
                Context context = this.f9433a;
                int i2 = C2703j.videoTextColorPrimaryVariant_dark;
                appCompatTextView.setTextColor(C0506a.m3150b(context, i2));
                a.f9317d.setTextColor(C0506a.m3150b(this.f9433a, i2));
                a.f9316c.setVisibility(0);
                C1738j<Drawable> K0 = C1719b.m8597t(this.f9433a).mo7665u(video.mo10564v()).mo7636K0(0.1f);
                int i3 = C2705l.video_drawable_placeholder_cover;
                C8594l.m46770d(((C1738j) ((C1738j) K0.mo8391j(i3)).mo8375Z(i3)).mo7645z0(a.f9316c), "{\n                      …mb)\n                    }");
            } else if (i == this.f9436d) {
                a.f9318e.setTextColor(C0506a.m3150b(this.f9433a, C2703j.videoTextColorPrimary_dark));
                a.f9317d.setTextColor(C0506a.m3150b(this.f9433a, C2703j.videoTextColorSecondary_dark));
                a.f9316c.setVisibility(8);
            } else {
                a.f9318e.setTextColor(C0506a.m3150b(this.f9433a, C2703j.videoTextColorPrimary_dark));
                a.f9317d.setTextColor(C0506a.m3150b(this.f9433a, C2703j.videoTextColorSecondary_dark));
                a.f9316c.setVisibility(8);
            }
        }

        public int getItemCount() {
            return this.f9434b.size();
        }

        /* renamed from: h */
        public C2753b onCreateViewHolder(ViewGroup viewGroup, int i) {
            C8594l.m46771e(viewGroup, "parent");
            C2714d d = C2714d.m12284d(LayoutInflater.from(this.f9433a), viewGroup, false);
            C8594l.m46770d(d, "inflate(\n               …rent, false\n            )");
            return new C2753b(this, d);
        }

        /* renamed from: i */
        public final void mo10319i(int i) {
            this.f9435c = i;
        }

        /* renamed from: j */
        public final void mo10320j(int i) {
            this.f9436d = i;
        }

        /* renamed from: k */
        public final void mo10321k(C2752a aVar) {
            C8594l.m46771e(aVar, "listener");
            this.f9437e = aVar;
        }
    }

    /* renamed from: com.coocent.videoplayer.t.c.h$c */
    /* compiled from: AudioPlayListDialog.kt */
    public static final class C2754c implements C2751b.C2752a {
        C2754c() {
        }

        /* renamed from: a */
        public void mo10322a(Video video, int i) {
            C8594l.m46771e(video, "video");
            AudioPlayService instance = AudioPlayService.Companion.getInstance();
            if (instance != null) {
                instance.onClickPosition(video, i);
            }
        }

        /* renamed from: b */
        public void mo10323b(Video video, int i) {
            C8594l.m46771e(video, "video");
            AudioPlayService instance = AudioPlayService.Companion.getInstance();
            if (instance != null) {
                instance.onRemoveVideoPosition(video, i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m12409q3(View view) {
        AudioPlayService instance = AudioPlayService.Companion.getInstance();
        if (instance != null) {
            instance.onAudioSwitchMode();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m12410r3(View view) {
        AudioPlayService instance = AudioPlayService.Companion.getInstance();
        if (instance != null) {
            instance.onAudioSwitchMode();
        }
    }

    /* renamed from: R1 */
    public void mo3626R1(Bundle bundle) {
        C8594l.m46771e(bundle, "outState");
        super.mo3626R1(bundle);
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        Window window;
        super.mo3630S1();
        Dialog a3 = mo3834a3();
        if (a3 != null && (window = a3.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            C8594l.m46770d(attributes, "it.attributes");
            attributes.dimAmount = 0.6f;
            DisplayMetrics displayMetrics = mo3698s0().getDisplayMetrics();
            window.setGravity(80);
            window.setLayout(displayMetrics.widthPixels, (int) (((double) displayMetrics.heightPixels) * 0.56d));
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        C8594l.m46771e(view, "view");
        super.mo3636U1(view, bundle);
        C2713c cVar = this.f9428q0;
        if (cVar != null) {
            cVar.mo7577a().setOrientation(1);
            C2713c cVar2 = this.f9428q0;
            if (cVar2 != null) {
                AppCompatTextView appCompatTextView = cVar2.f9312d;
                C8605w wVar = C8605w.f34938a;
                String D0 = mo3582D0(C2708o.video_play_list);
                C8594l.m46770d(D0, "getString(R.string.video_play_list)");
                Object[] objArr = new Object[1];
                List<Video> list = this.f9430s0;
                if (list != null) {
                    objArr[0] = Integer.valueOf(list.size());
                    String format = String.format(D0, Arrays.copyOf(objArr, 1));
                    C8594l.m46770d(format, "java.lang.String.format(format, *args)");
                    appCompatTextView.setText(format);
                    C2713c cVar3 = this.f9428q0;
                    if (cVar3 != null) {
                        RecyclerView recyclerView = cVar3.f9311c;
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setLayoutManager(new LinearLayoutManager(mo3705u2(), 1, false));
                        FragmentActivity u2 = mo3705u2();
                        C8594l.m46770d(u2, "requireActivity()");
                        List<Video> list2 = this.f9430s0;
                        if (list2 != null) {
                            C2751b bVar = new C2751b(u2, list2);
                            this.f9429r0 = bVar;
                            if (bVar != null) {
                                bVar.mo10319i(this.f9431t0);
                            }
                            C2751b bVar2 = this.f9429r0;
                            if (bVar2 != null) {
                                bVar2.mo10320j(this.f9431t0);
                            }
                            recyclerView.setAdapter(this.f9429r0);
                            recyclerView.mo4657q1(this.f9431t0);
                            FragmentActivity u22 = mo3705u2();
                            C8594l.m46770d(u22, "requireActivity()");
                            mo10312p3(u22, this.f9432u0);
                            C2751b bVar3 = this.f9429r0;
                            if (bVar3 != null) {
                                bVar3.mo10321k(new C2754c());
                            }
                            C2713c cVar4 = this.f9428q0;
                            if (cVar4 != null) {
                                cVar4.f9313e.setOnClickListener(C2743b.f9418g);
                                C2713c cVar5 = this.f9428q0;
                                if (cVar5 != null) {
                                    cVar5.f9310b.setOnClickListener(C2742a.f9417g);
                                } else {
                                    C8594l.m46783q("mBinding");
                                    throw null;
                                }
                            } else {
                                C8594l.m46783q("mBinding");
                                throw null;
                            }
                        } else {
                            C8594l.m46783q("videoList");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("videoList");
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

    /* renamed from: l1 */
    public void mo3679l1(Bundle bundle) {
        super.mo3679l1(bundle);
        Bundle V = mo3638V();
        if (V != null) {
            ArrayList parcelableArrayList = V.getParcelableArrayList("videoList");
            Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<com.coocent.videostore.po.Video>");
            this.f9430s0 = C8606x.m46797a(parcelableArrayList);
            Video video = (Video) V.getParcelable("playVideo");
            this.f9431t0 = V.getInt("playPosition", 0);
            this.f9432u0 = V.getInt("playMode", 0);
            Video video2 = (Video) V.getParcelable("playVideo");
        }
        mo3839f3(2, C2709p.VideoTheme_Dialog_Normal);
    }

    /* renamed from: m3 */
    public final void mo10309m3(int i, Video video) {
        C2751b bVar = this.f9429r0;
        if (bVar != null) {
            bVar.notifyItemChanged(bVar.mo10316f());
            bVar.mo10320j(i);
            bVar.mo10319i(i);
            bVar.notifyItemChanged(bVar.mo10315e());
        }
    }

    /* renamed from: n3 */
    public final void mo10310n3(int i, int i2) {
        C2713c cVar = this.f9428q0;
        if (cVar != null) {
            AppCompatTextView appCompatTextView = cVar.f9312d;
            C8605w wVar = C8605w.f34938a;
            String D0 = mo3582D0(C2708o.video_play_list);
            C8594l.m46770d(D0, "getString(R.string.video_play_list)");
            String format = String.format(D0, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            C8594l.m46770d(format, "java.lang.String.format(format, *args)");
            appCompatTextView.setText(format);
            C2751b bVar = this.f9429r0;
            if (bVar != null) {
                bVar.notifyItemRemoved(i);
                if (i < bVar.mo10316f()) {
                    bVar.mo10320j(bVar.mo10316f() - 1);
                    bVar.notifyItemChanged(bVar.mo10316f());
                }
                if (i < bVar.mo10315e()) {
                    bVar.mo10319i(bVar.mo10315e() - 1);
                    bVar.notifyItemChanged(bVar.mo10315e());
                    return;
                }
                return;
            }
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* renamed from: o3 */
    public final void mo10311o3(Video video, String str) {
        C8594l.m46771e(video, "reVideo");
        C8594l.m46771e(str, "title");
        C2751b bVar = this.f9429r0;
        if (bVar != null) {
            int i = 0;
            List<Video> list = this.f9430s0;
            if (list != null) {
                int size = list.size() - 1;
                int i2 = -1;
                if (size >= 0) {
                    while (true) {
                        int i3 = i + 1;
                        List<Video> list2 = this.f9430s0;
                        if (list2 != null) {
                            if (list2.get(i).mo10553l() == video.mo10553l()) {
                                List<Video> list3 = this.f9430s0;
                                if (list3 != null) {
                                    list3.get(i).mo10538a0(str);
                                    String str2 = str + '.' + video.mo10548h();
                                    List<Video> list4 = this.f9430s0;
                                    if (list4 != null) {
                                        list4.get(i).mo10519F(str2);
                                        i2 = i;
                                    } else {
                                        C8594l.m46783q("videoList");
                                        throw null;
                                    }
                                } else {
                                    C8594l.m46783q("videoList");
                                    throw null;
                                }
                            }
                            if (i3 > size) {
                                break;
                            }
                            i = i3;
                        } else {
                            C8594l.m46783q("videoList");
                            throw null;
                        }
                    }
                }
                if (i2 != -1) {
                    bVar.notifyItemChanged(i2);
                    return;
                }
                return;
            }
            C8594l.m46783q("videoList");
            throw null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C8594l.m46771e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo3831X2();
    }

    /* renamed from: p3 */
    public final void mo10312p3(Context context, int i) {
        C8594l.m46771e(context, "context");
        this.f9432u0 = i;
        if (i == 0) {
            C2713c cVar = this.f9428q0;
            if (cVar != null) {
                cVar.f9313e.setText(context.getString(C2708o.video_play_mode_sequential_play));
                C2713c cVar2 = this.f9428q0;
                if (cVar2 != null) {
                    cVar2.f9310b.setImageDrawable(C0506a.m3152d(context, C2705l.ic_playlist_sequential_play));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else if (i == 1) {
            C2713c cVar3 = this.f9428q0;
            if (cVar3 != null) {
                cVar3.f9313e.setText(context.getString(C2708o.video_play_mode_list_loop));
                C2713c cVar4 = this.f9428q0;
                if (cVar4 != null) {
                    cVar4.f9310b.setImageDrawable(C0506a.m3152d(context, C2705l.ic_playlist_loop));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        } else if (i == 2) {
            C2713c cVar5 = this.f9428q0;
            if (cVar5 != null) {
                cVar5.f9313e.setText(context.getString(C2708o.video_play_mode_single_cycle));
                C2713c cVar6 = this.f9428q0;
                if (cVar6 != null) {
                    cVar6.f9310b.setImageDrawable(C0506a.m3152d(context, C2705l.ic_playlist_single_loop));
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8594l.m46771e(layoutInflater, "inflater");
        Dialog a3 = mo3834a3();
        if (a3 != null) {
            a3.setCanceledOnTouchOutside(true);
            Window window = a3.getWindow();
            if (window != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 21) {
                    window.setNavigationBarColor(Color.parseColor("#99000000"));
                    window.setStatusBarColor(Color.parseColor("#99000000"));
                    window.getDecorView().setSystemUiVisibility(5888);
                    window.addFlags(Integer.MIN_VALUE);
                }
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    C8594l.m46770d(attributes, "it.attributes");
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
            }
        }
        C2713c d = C2713c.m12280d(layoutInflater, viewGroup, false);
        C8594l.m46770d(d, "it");
        this.f9428q0 = d;
        LinearLayout c = d.mo7577a();
        C8594l.m46770d(c, "inflate(inflater, contai…g = it\n            }.root");
        return c;
    }
}
