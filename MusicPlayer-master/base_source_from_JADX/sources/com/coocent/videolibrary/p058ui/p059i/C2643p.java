package com.coocent.videolibrary.p058ui.p059i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.C0865h;
import androidx.recyclerview.widget.C0903r;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.coocent.videostore.p067po.Video;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import p082e.p147t.p148e.C4168j0;
import p082e.p147t.p148e.C4204s;
import p082e.p147t.p148e.C4206t;
import p082e.p157y.C4257a;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4622d;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.p225k.C4642n;
import p159f.p166c.p224o.p225k.C4643o;
import p159f.p166c.p224o.p226l.C4647b;
import p369i.C8457t;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8605w;

/* renamed from: com.coocent.videolibrary.ui.i.p */
/* compiled from: VideoAdapter.kt */
public final class C2643p extends C0903r<Video, C2648e> {

    /* renamed from: c */
    private final Context f9104c;

    /* renamed from: d */
    private int f9105d;

    /* renamed from: e */
    private long f9106e;

    /* renamed from: f */
    private final Calendar f9107f;

    /* renamed from: g */
    private final SimpleDateFormat f9108g;

    /* renamed from: h */
    private C4168j0<Video> f9109h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2644a f9110i;

    /* renamed from: j */
    private String f9111j;

    /* renamed from: com.coocent.videolibrary.ui.i.p$a */
    /* compiled from: VideoAdapter.kt */
    public interface C2644a {
        /* renamed from: a */
        void mo10071a(View view, Video video, int i);

        /* renamed from: b */
        void mo10072b(Video video, int i);
    }

    /* renamed from: com.coocent.videolibrary.ui.i.p$b */
    /* compiled from: VideoAdapter.kt */
    private static final class C2645b extends C0865h.C0871f<Video> {
        /* renamed from: d */
        public boolean mo5271a(Video video, Video video2) {
            C8594l.m46771e(video, "oldItem");
            C8594l.m46771e(video2, "newItem");
            return video.mo10547g() == video2.mo10547g() && video.mo10568y() == video2.mo10568y() && video.mo10552k() == video2.mo10552k() && TextUtils.equals(video.mo10565w(), video2.mo10565w()) && TextUtils.equals(video.mo10564v(), video2.mo10564v()) && video.mo10559r() == video2.mo10559r() && video.mo10558q() == video2.mo10558q();
        }

        /* renamed from: e */
        public boolean mo5272b(Video video, Video video2) {
            C8594l.m46771e(video, "oldItem");
            C8594l.m46771e(video2, "newItem");
            return video.mo10553l() == video2.mo10553l();
        }

        /* renamed from: f */
        public Object mo5273c(Video video, Video video2) {
            C8594l.m46771e(video, "oldItem");
            C8594l.m46771e(video2, "newItem");
            if (video.mo10553l() == video2.mo10553l()) {
                Bundle bundle = new Bundle();
                if (!TextUtils.equals(video.mo10565w(), video2.mo10565w())) {
                    bundle.putString("title_changed", video2.mo10565w());
                }
                if (!(video.mo10568y() == video2.mo10568y() && video.mo10552k() == video2.mo10552k())) {
                    bundle.putString("resolution_changed", video2.mo10568y() + " x " + video2.mo10552k());
                }
                if (video.mo10547g() != video2.mo10547g()) {
                    bundle.putLong("duration_changed", video2.mo10547g());
                }
                if (!TextUtils.equals(video.mo10564v(), video2.mo10564v())) {
                    bundle.putString("thumbnail_changed", video2.mo10564v());
                }
                if (video.mo10559r() != video2.mo10559r()) {
                    bundle.putLong("watch_progress_changed", video2.mo10559r());
                }
                if (bundle.size() != 0) {
                    return bundle;
                }
            }
            return super.mo5273c(video, video2);
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.p$c */
    /* compiled from: VideoAdapter.kt */
    public static final class C2646c extends C4204s<Video> {

        /* renamed from: a */
        private final RecyclerView f9112a;

        public C2646c(RecyclerView recyclerView) {
            C8594l.m46771e(recyclerView, "mRecyclerView");
            this.f9112a = recyclerView;
        }

        /* renamed from: a */
        public C4204s.C4205a<Video> mo10098a(MotionEvent motionEvent) {
            C8594l.m46771e(motionEvent, "e");
            View S = this.f9112a.mo4562S(motionEvent.getX(), motionEvent.getY());
            if (S == null) {
                return null;
            }
            RecyclerView.C0792c0 j0 = this.f9112a.mo4632j0(S);
            Objects.requireNonNull(j0, "null cannot be cast to non-null type com.coocent.videolibrary.ui.video.VideoAdapter.VideoViewHolder");
            return ((C2648e) j0).mo10146a();
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.p$d */
    /* compiled from: VideoAdapter.kt */
    public static final class C2647d extends C4206t<Video> {

        /* renamed from: b */
        private final C2643p f9113b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2647d(C2643p pVar) {
            super(1);
            C8594l.m46771e(pVar, "mAdapter");
            this.f9113b = pVar;
        }

        /* renamed from: d */
        public Video mo10099a(int i) {
            Video f = C2643p.m12028f(this.f9113b, i);
            C8594l.m46770d(f, "mAdapter.getItem(position)");
            return f;
        }

        /* renamed from: e */
        public int mo10100b(Video video) {
            C8594l.m46771e(video, "key");
            List<Video> c = this.f9113b.mo5380c();
            C8594l.m46770d(c, "mAdapter.currentList");
            int i = 0;
            for (Video a : c) {
                if (C8594l.m46767a(a, video)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.i.p$e */
    /* compiled from: VideoAdapter.kt */
    public final class C2648e extends RecyclerView.C0792c0 implements View.OnClickListener {

        /* renamed from: g */
        private final C4257a f9114g;

        /* renamed from: h */
        final /* synthetic */ C2643p f9115h;

        /* renamed from: com.coocent.videolibrary.ui.i.p$e$a */
        /* compiled from: VideoAdapter.kt */
        public static final class C2649a extends C4204s.C4205a<Video> {

            /* renamed from: a */
            final /* synthetic */ C2648e f9116a;

            /* renamed from: b */
            final /* synthetic */ C2643p f9117b;

            C2649a(C2648e eVar, C2643p pVar) {
                this.f9116a = eVar;
                this.f9117b = pVar;
            }

            /* renamed from: a */
            public int mo10106a() {
                return this.f9116a.getAbsoluteAdapterPosition();
            }

            /* renamed from: g */
            public Video mo10107b() {
                return C2643p.m12028f(this.f9117b, this.f9116a.getAbsoluteAdapterPosition());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2648e(C2643p pVar, C4257a aVar) {
            super(aVar.mo7577a());
            C8594l.m46771e(pVar, "this$0");
            C8594l.m46771e(aVar, "mBinding");
            this.f9115h = pVar;
            this.f9114g = aVar;
            aVar.mo7577a().setOnClickListener(this);
            ((AppCompatImageView) aVar.mo7577a().findViewById(C4623e.iv_more)).setOnClickListener(this);
        }

        /* renamed from: a */
        public final C4204s.C4205a<Video> mo10146a() {
            return new C2649a(this, this.f9115h);
        }

        /* renamed from: b */
        public final C4257a mo10147b() {
            return this.f9114g;
        }

        public void onClick(View view) {
            C2644a g;
            C2644a g2;
            C8594l.m46771e(view, "v");
            if (view.getId() == C4623e.iv_more) {
                if (getAbsoluteAdapterPosition() <= this.f9115h.getItemCount() - 1 && (g2 = this.f9115h.f9110i) != null) {
                    Video f = C2643p.m12028f(this.f9115h, getAbsoluteAdapterPosition());
                    C8594l.m46770d(f, "getItem(absoluteAdapterPosition)");
                    g2.mo10071a(view, f, getAbsoluteAdapterPosition());
                }
            } else if (getAbsoluteAdapterPosition() <= this.f9115h.getItemCount() - 1 && (g = this.f9115h.f9110i) != null) {
                Video f2 = C2643p.m12028f(this.f9115h, getAbsoluteAdapterPosition());
                C8594l.m46770d(f2, "getItem(absoluteAdapterPosition)");
                g.mo10072b(f2, getAbsoluteAdapterPosition());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2643p(Context context, int i, long j, int i2, C8589g gVar) {
        this(context, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? -1 : j);
    }

    /* renamed from: f */
    public static final /* synthetic */ Video m12028f(C2643p pVar, int i) {
        return (Video) pVar.getItem(i);
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: h */
    private final void m12030h(Video video, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView3, ProgressBar progressBar, AppCompatCheckBox appCompatCheckBox, AppCompatTextView appCompatTextView4, boolean z) {
        int i;
        AppCompatTextView appCompatTextView5 = appCompatTextView;
        AppCompatTextView appCompatTextView6 = appCompatTextView2;
        AppCompatImageView appCompatImageView4 = appCompatImageView;
        AppCompatImageView appCompatImageView5 = appCompatImageView2;
        ProgressBar progressBar2 = progressBar;
        AppCompatCheckBox appCompatCheckBox2 = appCompatCheckBox;
        AppCompatTextView appCompatTextView7 = appCompatTextView4;
        appCompatTextView5.setText(video.mo10565w());
        boolean z2 = true;
        if (appCompatTextView6 != null) {
            C8605w wVar = C8605w.f34938a;
            String format = String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Float.valueOf(((float) (video.mo10563u() / ((long) 1024))) / 1024.0f)}, 1));
            C8594l.m46770d(format, "java.lang.String.format(locale, format, *args)");
            appCompatTextView6.setText(format);
        }
        if (appCompatImageView4 != null) {
            appCompatImageView4.setVisibility(video.mo10569z() && (video.mo10559r() > Long.MIN_VALUE ? 1 : (video.mo10559r() == Long.MIN_VALUE ? 0 : -1)) == 0 ? 0 : 8);
        }
        if (video.mo10547g() > 0) {
            i = (int) ((((float) video.mo10559r()) / ((float) video.mo10547g())) * ((float) 100));
            progressBar2.setProgress(i);
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('%');
        String sb2 = sb.toString();
        if (appCompatTextView7 != null) {
            appCompatTextView7.setText(sb2);
        }
        progressBar2.setVisibility((this.f9106e > video.mo10553l() ? 1 : (this.f9106e == video.mo10553l() ? 0 : -1)) == 0 && (video.mo10559r() > Long.MIN_VALUE ? 1 : (video.mo10559r() == Long.MIN_VALUE ? 0 : -1)) != 0 ? 0 : 8);
        if (appCompatTextView7 != null) {
            appCompatTextView7.setVisibility((this.f9106e > video.mo10553l() ? 1 : (this.f9106e == video.mo10553l() ? 0 : -1)) == 0 && (video.mo10559r() > Long.MIN_VALUE ? 1 : (video.mo10559r() == Long.MIN_VALUE ? 0 : -1)) != 0 ? 0 : 8);
        }
        if (z) {
            if (appCompatTextView6 != null) {
                if (!(video.mo10559r() == Long.MIN_VALUE || appCompatTextView7 != null || video.mo10559r() == 0)) {
                    z2 = false;
                }
                appCompatTextView6.setVisibility(z2 ? 0 : 8);
            }
        } else if (appCompatTextView6 != null) {
            appCompatTextView6.setVisibility((progressBar.getVisibility() == 0) ^ true ? 0 : 8);
        }
        appCompatTextView5.setTextColor(m12032s(video.mo10553l(), video.mo10559r()));
        this.f9107f.setTimeInMillis(video.mo10547g());
        this.f9108g.applyPattern(video.mo10547g() >= 3600000 ? "HH:mm:ss" : "mm:ss");
        appCompatTextView3.setText(this.f9108g.format(this.f9107f.getTime()));
        String str = this.f9111j;
        if (C8594l.m46767a(str, "select_mode")) {
            appCompatCheckBox2.setVisibility(0);
            appCompatImageView5.setVisibility(4);
        } else if (C8594l.m46767a(str, "un_select_mode")) {
            appCompatCheckBox2.setChecked(false);
            appCompatCheckBox2.setVisibility(0);
            appCompatImageView5.setVisibility(4);
        } else {
            appCompatCheckBox2.setVisibility(8);
            appCompatImageView5.setVisibility(0);
        }
        C4168j0<Video> j0Var = this.f9109h;
        if (j0Var == null) {
            Video video2 = video;
        } else {
            appCompatCheckBox2.setChecked(j0Var.mo14301m(video));
        }
        C1738j<Drawable> K0 = C1719b.m8597t(this.f9104c).mo7665u(video.mo10564v()).mo7636K0(0.1f);
        Context context = this.f9104c;
        int i2 = C4622d.video_drawable_placeholder_cover;
        ((C1738j) ((C1738j) K0.mo8393k(C0506a.m3152d(context, i2))).mo8376a0(C0506a.m3152d(this.f9104c, i2))).mo7645z0(appCompatImageView3);
    }

    /* renamed from: i */
    static /* synthetic */ void m12031i(C2643p pVar, Video video, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView3, ProgressBar progressBar, AppCompatCheckBox appCompatCheckBox, AppCompatTextView appCompatTextView4, boolean z, int i, Object obj) {
        int i2 = i;
        pVar.m12030h(video, appCompatTextView, (i2 & 4) != 0 ? null : appCompatTextView2, (i2 & 8) != 0 ? null : appCompatImageView, appCompatImageView2, appCompatTextView3, appCompatImageView3, progressBar, appCompatCheckBox, (i2 & 512) != 0 ? null : appCompatTextView4, (i2 & 1024) != 0 ? false : z);
    }

    /* renamed from: s */
    private final int m12032s(long j, long j2) {
        if (j2 == Long.MIN_VALUE) {
            if (this.f9106e == j) {
                return C4647b.m20153b(this.f9104c, C4619a.videoTextColorPrimaryVariant, 0, 4, (Object) null);
            }
            return C4647b.m20153b(this.f9104c, C4619a.videoTextColorPrimary, 0, 4, (Object) null);
        } else if (j2 == 0) {
            if (this.f9106e == j) {
                return C4647b.m20153b(this.f9104c, C4619a.videoTextColorPrimaryVariant, 0, 4, (Object) null);
            }
            return C4647b.m20153b(this.f9104c, C4619a.videoTextColorOnSecondary, 0, 4, (Object) null);
        } else if (this.f9106e == j) {
            return C4647b.m20153b(this.f9104c, C4619a.videoTextColorPrimaryVariant, 0, 4, (Object) null);
        } else {
            return C4647b.m20153b(this.f9104c, C4619a.videoTextColorPrimary, 0, 4, (Object) null);
        }
    }

    public int getItemViewType(int i) {
        return this.f9105d;
    }

    /* renamed from: j */
    public final int mo10131j() {
        return this.f9105d;
    }

    /* renamed from: k */
    public final String mo10132k() {
        return this.f9111j;
    }

    /* renamed from: l */
    public void onBindViewHolder(C2648e eVar, int i) {
        C8594l.m46771e(eVar, "holder");
        Video video = (Video) getItem(i);
        if (eVar.mo10147b() instanceof C4642n) {
            C4642n nVar = (C4642n) eVar.mo10147b();
            AppCompatTextView appCompatTextView = nVar.f13420i;
            AppCompatTextView appCompatTextView2 = nVar.f13419h;
            ShapeableImageView shapeableImageView = nVar.f13415d;
            AppCompatTextView appCompatTextView3 = nVar.f13418g;
            ShapeableImageView shapeableImageView2 = nVar.f13416e;
            ShapeableImageView shapeableImageView3 = nVar.f13414c;
            ProgressBar progressBar = nVar.f13417f;
            AppCompatCheckBox appCompatCheckBox = nVar.f13413b;
            C8594l.m46770d(video, "video");
            C8594l.m46770d(appCompatTextView, "tvTitle");
            C8594l.m46770d(shapeableImageView, "ivMore");
            C8594l.m46770d(appCompatTextView3, "tvDuration");
            C8594l.m46770d(shapeableImageView3, "ivCover");
            C8594l.m46770d(progressBar, "pbPlay");
            C8594l.m46770d(appCompatCheckBox, "cbSelect");
            m12031i(this, video, appCompatTextView, appCompatTextView2, shapeableImageView2, shapeableImageView, appCompatTextView3, shapeableImageView3, progressBar, appCompatCheckBox, (AppCompatTextView) null, false, 512, (Object) null);
            return;
        }
        C4643o oVar = (C4643o) eVar.mo10147b();
        AppCompatTextView appCompatTextView4 = oVar.f13430j;
        AppCompatTextView appCompatTextView5 = oVar.f13429i;
        AppCompatImageView appCompatImageView = oVar.f13424d;
        AppCompatTextView appCompatTextView6 = oVar.f13427g;
        ShapeableImageView shapeableImageView4 = oVar.f13425e;
        ShapeableImageView shapeableImageView5 = oVar.f13423c;
        ProgressBar progressBar2 = oVar.f13426f;
        ShapeableImageView shapeableImageView6 = shapeableImageView4;
        AppCompatCheckBox appCompatCheckBox2 = oVar.f13422b;
        MaterialTextView materialTextView = oVar.f13428h;
        C8594l.m46770d(video, "video");
        C8594l.m46770d(appCompatTextView4, "tvTitle");
        C8594l.m46770d(appCompatImageView, "ivMore");
        C8594l.m46770d(appCompatTextView6, "tvDuration");
        C8594l.m46770d(shapeableImageView5, "ivCover");
        C8594l.m46770d(progressBar2, "pbPlay");
        C8594l.m46770d(appCompatCheckBox2, "cbSelect");
        m12030h(video, appCompatTextView4, appCompatTextView5, shapeableImageView6, appCompatImageView, appCompatTextView6, shapeableImageView5, progressBar2, appCompatCheckBox2, materialTextView, true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.coocent.videolibrary.p058ui.p059i.C2643p.C2648e r21, int r22, java.util.List<java.lang.Object> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            java.lang.String r2 = "holder"
            r3 = r21
            p369i.p387z.p389d.C8594l.m46771e(r3, r2)
            java.lang.String r2 = "payloads"
            p369i.p387z.p389d.C8594l.m46771e(r1, r2)
            boolean r2 = r23.isEmpty()
            if (r2 == 0) goto L_0x001b
            super.onBindViewHolder(r21, r22, r23)
            goto L_0x0377
        L_0x001b:
            r2 = 0
            java.lang.Object r4 = r1.get(r2)
            boolean r4 = r4 instanceof android.os.Bundle
            if (r4 == 0) goto L_0x0372
            r4 = r22
            java.lang.Object r4 = r0.getItem(r4)
            com.coocent.videostore.po.Video r4 = (com.coocent.videostore.p067po.Video) r4
            java.lang.Object r1 = r1.get(r2)
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.util.Set r5 = r1.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x003a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0377
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x003a
            int r7 = r6.hashCode()
            switch(r7) {
                case -2126866314: goto L_0x02a7;
                case -340808095: goto L_0x0243;
                case -109882419: goto L_0x020f;
                case 181568265: goto L_0x01b5;
                case 1807369234: goto L_0x0052;
                default: goto L_0x004f;
            }
        L_0x004f:
            r6 = 0
            goto L_0x036f
        L_0x0052:
            java.lang.String r7 = "watch_progress_changed"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x005b
            goto L_0x003a
        L_0x005b:
            long r9 = r4.mo10559r()
            long r6 = r1.getLong(r6, r9)
            long r9 = r4.mo10553l()
            int r9 = r0.m12032s(r9, r6)
            e.y.a r10 = r21.mo10147b()
            boolean r10 = r10 instanceof p159f.p166c.p224o.p225k.C4642n
            r11 = 100
            r12 = 0
            r14 = -9223372036854775808
            r16 = 1
            if (r10 == 0) goto L_0x011c
            e.y.a r10 = r21.mo10147b()
            f.c.o.k.n r10 = (p159f.p166c.p224o.p225k.C4642n) r10
            com.google.android.material.imageview.ShapeableImageView r10 = r10.f13416e
            java.lang.String r8 = "holder.mBinding.ivNew"
            p369i.p387z.p389d.C8594l.m46770d(r10, r8)
            boolean r8 = r4.mo10569z()
            if (r8 == 0) goto L_0x0094
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x0094
            r8 = 1
            goto L_0x0095
        L_0x0094:
            r8 = 0
        L_0x0095:
            if (r8 == 0) goto L_0x0099
            r8 = 0
            goto L_0x009b
        L_0x0099:
            r8 = 8
        L_0x009b:
            r10.setVisibility(r8)
            e.y.a r8 = r21.mo10147b()
            f.c.o.k.n r8 = (p159f.p166c.p224o.p225k.C4642n) r8
            android.widget.ProgressBar r8 = r8.f13417f
            java.lang.String r10 = "holder.mBinding.pbPlay"
            p369i.p387z.p389d.C8594l.m46770d(r8, r10)
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x00bb
            long r14 = r0.f9106e
            long r17 = r4.mo10553l()
            int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x00bb
            r14 = 1
            goto L_0x00bc
        L_0x00bb:
            r14 = 0
        L_0x00bc:
            if (r14 == 0) goto L_0x00c0
            r14 = 0
            goto L_0x00c2
        L_0x00c0:
            r14 = 8
        L_0x00c2:
            r8.setVisibility(r14)
            e.y.a r8 = r21.mo10147b()
            f.c.o.k.n r8 = (p159f.p166c.p224o.p225k.C4642n) r8
            androidx.appcompat.widget.AppCompatTextView r8 = r8.f13419h
            java.lang.String r14 = "holder.mBinding.tvSize"
            p369i.p387z.p389d.C8594l.m46770d(r8, r14)
            e.y.a r14 = r21.mo10147b()
            f.c.o.k.n r14 = (p159f.p166c.p224o.p225k.C4642n) r14
            android.widget.ProgressBar r14 = r14.f13417f
            p369i.p387z.p389d.C8594l.m46770d(r14, r10)
            int r10 = r14.getVisibility()
            if (r10 != 0) goto L_0x00e5
            r10 = 1
            goto L_0x00e6
        L_0x00e5:
            r10 = 0
        L_0x00e6:
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x00ec
            r10 = 0
            goto L_0x00ee
        L_0x00ec:
            r10 = 8
        L_0x00ee:
            r8.setVisibility(r10)
            long r14 = r4.mo10547g()
            int r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x010f
            float r6 = (float) r6
            long r7 = r4.mo10547g()
            float r7 = (float) r7
            float r6 = r6 / r7
            float r7 = (float) r11
            float r6 = r6 * r7
            int r6 = (int) r6
            e.y.a r7 = r21.mo10147b()
            f.c.o.k.n r7 = (p159f.p166c.p224o.p225k.C4642n) r7
            android.widget.ProgressBar r7 = r7.f13417f
            r7.setProgress(r6)
        L_0x010f:
            e.y.a r6 = r21.mo10147b()
            f.c.o.k.n r6 = (p159f.p166c.p224o.p225k.C4642n) r6
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f13420i
            r6.setTextColor(r9)
            goto L_0x003a
        L_0x011c:
            e.y.a r8 = r21.mo10147b()
            f.c.o.k.o r8 = (p159f.p166c.p224o.p225k.C4643o) r8
            com.google.android.material.imageview.ShapeableImageView r10 = r8.f13425e
            java.lang.String r2 = "binding.ivNew"
            p369i.p387z.p389d.C8594l.m46770d(r10, r2)
            boolean r2 = r4.mo10569z()
            if (r2 == 0) goto L_0x0135
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0135
            r2 = 1
            goto L_0x0136
        L_0x0135:
            r2 = 0
        L_0x0136:
            if (r2 == 0) goto L_0x013a
            r2 = 0
            goto L_0x013c
        L_0x013a:
            r2 = 8
        L_0x013c:
            r10.setVisibility(r2)
            long r18 = r4.mo10547g()
            int r2 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0158
            float r2 = (float) r6
            long r12 = r4.mo10547g()
            float r10 = (float) r12
            float r2 = r2 / r10
            float r10 = (float) r11
            float r2 = r2 * r10
            int r2 = (int) r2
            android.widget.ProgressBar r10 = r8.f13426f
            r10.setProgress(r2)
            goto L_0x0159
        L_0x0158:
            r2 = 0
        L_0x0159:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r2 = 37
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            com.google.android.material.textview.MaterialTextView r10 = r8.f13428h
            r10.setText(r2)
            android.widget.ProgressBar r2 = r8.f13426f
            java.lang.String r10 = "binding.pbPlay"
            p369i.p387z.p389d.C8594l.m46770d(r2, r10)
            int r11 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r11 == 0) goto L_0x0186
            long r6 = r0.f9106e
            long r11 = r4.mo10553l()
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0186
            r6 = 1
            goto L_0x0187
        L_0x0186:
            r6 = 0
        L_0x0187:
            if (r6 == 0) goto L_0x018b
            r6 = 0
            goto L_0x018d
        L_0x018b:
            r6 = 8
        L_0x018d:
            r2.setVisibility(r6)
            com.google.android.material.textview.MaterialTextView r2 = r8.f13428h
            java.lang.String r6 = "binding.tvPlayProgress"
            p369i.p387z.p389d.C8594l.m46770d(r2, r6)
            android.widget.ProgressBar r6 = r8.f13426f
            p369i.p387z.p389d.C8594l.m46770d(r6, r10)
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x01a3
            goto L_0x01a5
        L_0x01a3:
            r16 = 0
        L_0x01a5:
            if (r16 == 0) goto L_0x01a9
            r6 = 0
            goto L_0x01ab
        L_0x01a9:
            r6 = 8
        L_0x01ab:
            r2.setVisibility(r6)
            androidx.appcompat.widget.AppCompatTextView r2 = r8.f13430j
            r2.setTextColor(r9)
            goto L_0x036f
        L_0x01b5:
            java.lang.String r2 = "duration_changed"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x01bf
            goto L_0x036f
        L_0x01bf:
            long r7 = r4.mo10547g()
            long r6 = r1.getLong(r6, r7)
            java.util.Calendar r2 = r0.f9107f
            r2.setTimeInMillis(r6)
            java.text.SimpleDateFormat r2 = r0.f9108g
            long r6 = r4.mo10547g()
            r8 = 3600000(0x36ee80, double:1.7786363E-317)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x01dc
            java.lang.String r6 = "HH:mm:ss"
            goto L_0x01de
        L_0x01dc:
            java.lang.String r6 = "mm:ss"
        L_0x01de:
            r2.applyPattern(r6)
            java.text.SimpleDateFormat r2 = r0.f9108g
            java.util.Calendar r6 = r0.f9107f
            java.util.Date r6 = r6.getTime()
            java.lang.String r2 = r2.format(r6)
            e.y.a r6 = r21.mo10147b()
            boolean r6 = r6 instanceof p159f.p166c.p224o.p225k.C4642n
            if (r6 == 0) goto L_0x0202
            e.y.a r6 = r21.mo10147b()
            f.c.o.k.n r6 = (p159f.p166c.p224o.p225k.C4642n) r6
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f13418g
            r6.setText(r2)
            goto L_0x036f
        L_0x0202:
            e.y.a r6 = r21.mo10147b()
            f.c.o.k.o r6 = (p159f.p166c.p224o.p225k.C4643o) r6
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f13427g
            r6.setText(r2)
            goto L_0x036f
        L_0x020f:
            java.lang.String r2 = "title_changed"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0219
            goto L_0x036f
        L_0x0219:
            java.lang.String r2 = r4.mo10565w()
            java.lang.String r2 = r1.getString(r6, r2)
            e.y.a r6 = r21.mo10147b()
            boolean r6 = r6 instanceof p159f.p166c.p224o.p225k.C4642n
            if (r6 == 0) goto L_0x0236
            e.y.a r6 = r21.mo10147b()
            f.c.o.k.n r6 = (p159f.p166c.p224o.p225k.C4642n) r6
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f13420i
            r6.setText(r2)
            goto L_0x036f
        L_0x0236:
            e.y.a r6 = r21.mo10147b()
            f.c.o.k.o r6 = (p159f.p166c.p224o.p225k.C4643o) r6
            androidx.appcompat.widget.AppCompatTextView r6 = r6.f13430j
            r6.setText(r2)
            goto L_0x036f
        L_0x0243:
            java.lang.String r2 = "thumbnail_changed"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x024d
            goto L_0x036f
        L_0x024d:
            java.lang.String r2 = r4.mo10564v()
            java.lang.String r2 = r1.getString(r6, r2)
            android.content.Context r6 = r0.f9104c
            com.bumptech.glide.k r6 = com.bumptech.glide.C1719b.m8597t(r6)
            com.bumptech.glide.j r2 = r6.mo7665u(r2)
            r6 = 1036831949(0x3dcccccd, float:0.1)
            com.bumptech.glide.j r2 = r2.mo7636K0(r6)
            android.content.Context r6 = r0.f9104c
            int r7 = p159f.p166c.p224o.C4622d.video_drawable_placeholder_cover
            android.graphics.drawable.Drawable r6 = androidx.core.content.C0506a.m3152d(r6, r7)
            com.bumptech.glide.q.a r2 = r2.mo8393k(r6)
            com.bumptech.glide.j r2 = (com.bumptech.glide.C1738j) r2
            android.content.Context r6 = r0.f9104c
            android.graphics.drawable.Drawable r6 = androidx.core.content.C0506a.m3152d(r6, r7)
            com.bumptech.glide.q.a r2 = r2.mo8376a0(r6)
            java.lang.String r6 = "with(mContext).load(thum…                        )"
            p369i.p387z.p389d.C8594l.m46770d(r2, r6)
            com.bumptech.glide.j r2 = (com.bumptech.glide.C1738j) r2
            e.y.a r6 = r21.mo10147b()
            boolean r6 = r6 instanceof p159f.p166c.p224o.p225k.C4642n
            if (r6 == 0) goto L_0x029a
            e.y.a r6 = r21.mo10147b()
            f.c.o.k.n r6 = (p159f.p166c.p224o.p225k.C4642n) r6
            com.google.android.material.imageview.ShapeableImageView r6 = r6.f13414c
            r2.mo7645z0(r6)
            goto L_0x036f
        L_0x029a:
            e.y.a r6 = r21.mo10147b()
            f.c.o.k.o r6 = (p159f.p166c.p224o.p225k.C4643o) r6
            com.google.android.material.imageview.ShapeableImageView r6 = r6.f13423c
            r2.mo7645z0(r6)
            goto L_0x036f
        L_0x02a7:
            java.lang.String r2 = "selection_mode"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x02b1
            goto L_0x036f
        L_0x02b1:
            java.lang.String r2 = r0.f9111j
            java.lang.String r2 = r1.getString(r6, r2)
            e.y.a r6 = r21.mo10147b()
            boolean r6 = r6 instanceof p159f.p166c.p224o.p225k.C4642n
            java.lang.String r7 = "un_select_mode"
            java.lang.String r8 = "select_mode"
            r9 = 4
            if (r6 == 0) goto L_0x0330
            boolean r6 = p369i.p387z.p389d.C8594l.m46767a(r2, r8)
            if (r6 == 0) goto L_0x02e3
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            com.google.android.material.imageview.ShapeableImageView r2 = r2.f13415d
            r2.setVisibility(r9)
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            androidx.appcompat.widget.AppCompatCheckBox r2 = r2.f13413b
            r6 = 0
            r2.setVisibility(r6)
            goto L_0x036f
        L_0x02e3:
            r6 = 0
            boolean r2 = p369i.p387z.p389d.C8594l.m46767a(r2, r7)
            if (r2 == 0) goto L_0x030c
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            com.google.android.material.imageview.ShapeableImageView r2 = r2.f13415d
            r2.setVisibility(r9)
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            androidx.appcompat.widget.AppCompatCheckBox r2 = r2.f13413b
            r2.setChecked(r6)
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            androidx.appcompat.widget.AppCompatCheckBox r2 = r2.f13413b
            r2.setVisibility(r6)
            goto L_0x036f
        L_0x030c:
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            androidx.appcompat.widget.AppCompatCheckBox r2 = r2.f13413b
            r2.setChecked(r6)
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            androidx.appcompat.widget.AppCompatCheckBox r2 = r2.f13413b
            r7 = 8
            r2.setVisibility(r7)
            e.y.a r2 = r21.mo10147b()
            f.c.o.k.n r2 = (p159f.p166c.p224o.p225k.C4642n) r2
            com.google.android.material.imageview.ShapeableImageView r2 = r2.f13415d
            r2.setVisibility(r6)
            goto L_0x036f
        L_0x0330:
            r6 = 0
            e.y.a r10 = r21.mo10147b()
            f.c.o.k.o r10 = (p159f.p166c.p224o.p225k.C4643o) r10
            boolean r8 = p369i.p387z.p389d.C8594l.m46767a(r2, r8)
            if (r8 == 0) goto L_0x0348
            androidx.appcompat.widget.AppCompatImageView r2 = r10.f13424d
            r2.setVisibility(r9)
            androidx.appcompat.widget.AppCompatCheckBox r2 = r10.f13422b
            r2.setVisibility(r6)
            goto L_0x036f
        L_0x0348:
            boolean r2 = p369i.p387z.p389d.C8594l.m46767a(r2, r7)
            if (r2 == 0) goto L_0x035e
            androidx.appcompat.widget.AppCompatImageView r2 = r10.f13424d
            r2.setVisibility(r9)
            androidx.appcompat.widget.AppCompatCheckBox r2 = r10.f13422b
            r2.setChecked(r6)
            androidx.appcompat.widget.AppCompatCheckBox r2 = r10.f13422b
            r2.setVisibility(r6)
            goto L_0x036f
        L_0x035e:
            androidx.appcompat.widget.AppCompatImageView r2 = r10.f13424d
            r2.setVisibility(r6)
            androidx.appcompat.widget.AppCompatCheckBox r2 = r10.f13422b
            r2.setChecked(r6)
            androidx.appcompat.widget.AppCompatCheckBox r2 = r10.f13422b
            r7 = 8
            r2.setVisibility(r7)
        L_0x036f:
            r2 = 0
            goto L_0x003a
        L_0x0372:
            r4 = r22
            super.onBindViewHolder(r21, r22, r23)
        L_0x0377:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videolibrary.p058ui.p059i.C2643p.onBindViewHolder(com.coocent.videolibrary.ui.i.p$e, int, java.util.List):void");
    }

    /* renamed from: n */
    public C2648e onCreateViewHolder(ViewGroup viewGroup, int i) {
        C4257a aVar;
        C8594l.m46771e(viewGroup, "parent");
        if (i == 1) {
            aVar = C4642n.m20135d(LayoutInflater.from(this.f9104c), viewGroup, false);
            C8594l.m46770d(aVar, "{\n            VideoLayou… parent, false)\n        }");
        } else {
            aVar = C4643o.m20139d(LayoutInflater.from(this.f9104c), viewGroup, false);
            C8594l.m46770d(aVar, "{\n            VideoLayou… parent, false)\n        }");
        }
        return new C2648e(this, aVar);
    }

    /* renamed from: o */
    public final void mo10136o(C2644a aVar) {
        C8594l.m46771e(aVar, "listener");
        this.f9110i = aVar;
    }

    /* renamed from: p */
    public final void mo10137p(long j) {
        if (this.f9106e != j) {
            this.f9106e = j;
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    /* renamed from: q */
    public final void mo10138q(String str) {
        C8594l.m46771e(str, "selectionMode");
        this.f9111j = str;
        Bundle bundle = new Bundle();
        bundle.putString("selection_mode", str);
        notifyItemRangeChanged(0, getItemCount(), bundle);
    }

    /* renamed from: r */
    public final void mo10139r(C4168j0<Video> j0Var) {
        C8594l.m46771e(j0Var, "tracker");
        this.f9109h = j0Var;
    }

    /* renamed from: t */
    public final void mo10140t(int i) {
        if (this.f9105d != i) {
            this.f9105d = i;
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2643p(Context context, int i, long j) {
        super(new C2645b());
        C8594l.m46771e(context, "mContext");
        this.f9104c = context;
        this.f9105d = i;
        this.f9106e = j;
        this.f9107f = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        C8457t tVar = C8457t.f34900a;
        this.f9108g = simpleDateFormat;
        this.f9111j = "no_select_mode";
    }
}
