package com.coocent.videolibrary.p058ui.folder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.C0865h;
import androidx.recyclerview.widget.C0903r;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.bumptech.glide.p047q.C2144a;
import com.coocent.videostore.p067po.Video;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import java.util.Objects;
import p082e.p147t.p148e.C4168j0;
import p082e.p147t.p148e.C4204s;
import p082e.p147t.p148e.C4206t;
import p082e.p157y.C4257a;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4622d;
import p159f.p166c.p224o.C4623e;
import p159f.p166c.p224o.C4626h;
import p159f.p166c.p224o.p225k.C4640l;
import p159f.p166c.p224o.p225k.C4641m;
import p159f.p166c.p224o.p226l.C4668q;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.videolibrary.ui.folder.k */
/* compiled from: FolderAdapter.kt */
public final class C2604k extends C0903r<Video, C2608d> {

    /* renamed from: c */
    private final Context f9050c;

    /* renamed from: d */
    private int f9051d;

    /* renamed from: e */
    private C4168j0<String> f9052e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2610e f9053f;

    /* renamed from: g */
    private String f9054g;

    /* renamed from: h */
    private String f9055h;

    /* renamed from: com.coocent.videolibrary.ui.folder.k$a */
    /* compiled from: FolderAdapter.kt */
    private static final class C2605a extends C0865h.C0871f<Video> {
        /* renamed from: d */
        public boolean mo5271a(Video video, Video video2) {
            C8594l.m46771e(video, "oldItem");
            C8594l.m46771e(video2, "newItem");
            return TextUtils.equals(video.mo10550i(), video2.mo10550i()) && TextUtils.equals(video.mo10564v(), video2.mo10564v()) && video.mo10539b() == video2.mo10539b() && video.mo10537a() == video2.mo10537a();
        }

        /* renamed from: e */
        public boolean mo5272b(Video video, Video video2) {
            C8594l.m46771e(video, "oldItem");
            C8594l.m46771e(video2, "newItem");
            return TextUtils.equals(video.mo10551j(), video2.mo10551j());
        }

        /* renamed from: f */
        public Object mo5273c(Video video, Video video2) {
            C8594l.m46771e(video, "oldItem");
            C8594l.m46771e(video2, "newItem");
            if (TextUtils.equals(video.mo10551j(), video2.mo10551j())) {
                Bundle bundle = new Bundle();
                if (!TextUtils.equals(video.mo10550i(), video2.mo10550i())) {
                    bundle.putString("folder_name_changed", video2.mo10550i());
                }
                if (video.mo10539b() != video2.mo10539b()) {
                    bundle.putInt("video_count_changed", video2.mo10539b());
                }
                if (!TextUtils.equals(video.mo10564v(), video2.mo10564v())) {
                    bundle.putString("thumbnail_changed", video2.mo10564v());
                }
                if (video.mo10537a() != video2.mo10537a()) {
                    bundle.putInt("recent_added_video_changed", video2.mo10537a());
                }
                if (bundle.size() != 0) {
                    return bundle;
                }
            }
            return super.mo5273c(video, video2);
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.k$b */
    /* compiled from: FolderAdapter.kt */
    public static final class C2606b extends C4204s<String> {

        /* renamed from: a */
        private final RecyclerView f9056a;

        public C2606b(RecyclerView recyclerView) {
            C8594l.m46771e(recyclerView, "mRecyclerView");
            this.f9056a = recyclerView;
        }

        /* renamed from: a */
        public C4204s.C4205a<String> mo10098a(MotionEvent motionEvent) {
            C8594l.m46771e(motionEvent, "e");
            View S = this.f9056a.mo4562S(motionEvent.getX(), motionEvent.getY());
            if (S == null) {
                return null;
            }
            RecyclerView.C0792c0 j0 = this.f9056a.mo4632j0(S);
            Objects.requireNonNull(j0, "null cannot be cast to non-null type com.coocent.videolibrary.ui.folder.FolderAdapter.FolderViewHolder");
            return ((C2608d) j0).mo10103a();
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.k$c */
    /* compiled from: FolderAdapter.kt */
    public static final class C2607c extends C4206t<String> {

        /* renamed from: b */
        private final C2604k f9057b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2607c(C2604k kVar) {
            super(1);
            C8594l.m46771e(kVar, "mAdapter");
            this.f9057b = kVar;
        }

        /* renamed from: d */
        public String mo10099a(int i) {
            return C2604k.m11920f(this.f9057b, i).mo10551j();
        }

        /* renamed from: e */
        public int mo10100b(String str) {
            C8594l.m46771e(str, "key");
            List<Video> c = this.f9057b.mo5380c();
            C8594l.m46770d(c, "mAdapter.currentList");
            int i = 0;
            for (Video j : c) {
                if (TextUtils.equals(j.mo10551j(), str)) {
                    return i;
                }
                i++;
            }
            return -1;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.k$d */
    /* compiled from: FolderAdapter.kt */
    public final class C2608d extends RecyclerView.C0792c0 implements View.OnClickListener {

        /* renamed from: g */
        private final C4257a f9058g;

        /* renamed from: h */
        final /* synthetic */ C2604k f9059h;

        /* renamed from: com.coocent.videolibrary.ui.folder.k$d$a */
        /* compiled from: FolderAdapter.kt */
        public static final class C2609a extends C4204s.C4205a<String> {

            /* renamed from: a */
            final /* synthetic */ C2608d f9060a;

            /* renamed from: b */
            final /* synthetic */ C2604k f9061b;

            C2609a(C2608d dVar, C2604k kVar) {
                this.f9060a = dVar;
                this.f9061b = kVar;
            }

            /* renamed from: a */
            public int mo10106a() {
                return this.f9060a.getAbsoluteAdapterPosition();
            }

            /* renamed from: g */
            public String mo10107b() {
                return C2604k.m11920f(this.f9061b, this.f9060a.getAbsoluteAdapterPosition()).mo10551j();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2608d(C2604k kVar, C4257a aVar) {
            super(aVar.mo7577a());
            C8594l.m46771e(kVar, "this$0");
            C8594l.m46771e(aVar, "mBinding");
            this.f9059h = kVar;
            this.f9058g = aVar;
            aVar.mo7577a().setOnClickListener(this);
            ((AppCompatImageView) aVar.mo7577a().findViewById(C4623e.iv_more)).setOnClickListener(this);
        }

        /* renamed from: a */
        public final C4204s.C4205a<String> mo10103a() {
            return new C2609a(this, this.f9059h);
        }

        /* renamed from: b */
        public final C4257a mo10104b() {
            return this.f9058g;
        }

        public void onClick(View view) {
            C8594l.m46771e(view, "v");
            if (view.getId() == C4623e.iv_more) {
                C2610e g = this.f9059h.f9053f;
                if (g != null) {
                    Video f = C2604k.m11920f(this.f9059h, getAbsoluteAdapterPosition());
                    C8594l.m46770d(f, "getItem(absoluteAdapterPosition)");
                    g.mo10110b(view, f, getAbsoluteAdapterPosition());
                    return;
                }
                return;
            }
            C2610e g2 = this.f9059h.f9053f;
            if (g2 != null) {
                Video f2 = C2604k.m11920f(this.f9059h, getAbsoluteAdapterPosition());
                C8594l.m46770d(f2, "getItem(absoluteAdapterPosition)");
                g2.mo10109a(f2, getAbsoluteAdapterPosition());
            }
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.folder.k$e */
    /* compiled from: FolderAdapter.kt */
    public interface C2610e {
        /* renamed from: a */
        void mo10109a(Video video, int i);

        /* renamed from: b */
        void mo10110b(View view, Video video, int i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2604k(Context context, int i, int i2, C8589g gVar) {
        this(context, (i2 & 2) != 0 ? 1 : i);
    }

    /* renamed from: f */
    public static final /* synthetic */ Video m11920f(C2604k kVar, int i) {
        return (Video) kVar.getItem(i);
    }

    /* renamed from: h */
    private final void m11922h(Video video, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatCheckBox appCompatCheckBox, boolean z, AppCompatTextView appCompatTextView3) {
        int i;
        AppCompatImageView appCompatImageView4;
        AppCompatTextView appCompatTextView4 = appCompatTextView;
        AppCompatImageView appCompatImageView5 = appCompatImageView2;
        AppCompatImageView appCompatImageView6 = appCompatImageView3;
        AppCompatCheckBox appCompatCheckBox2 = appCompatCheckBox;
        AppCompatTextView appCompatTextView5 = appCompatTextView3;
        appCompatTextView.setText(video.mo10550i());
        appCompatTextView2.setText(this.f9050c.getResources().getQuantityString(C4626h.count_video, video.mo10539b(), new Object[]{Integer.valueOf(video.mo10539b())}));
        if (video.mo10537a() > 0) {
            appCompatImageView4 = appCompatImageView;
            i = 0;
        } else {
            appCompatImageView4 = appCompatImageView;
            i = 8;
        }
        appCompatImageView4.setVisibility(i);
        if (!(video.mo10550i() == null || video.mo10551j() == null)) {
            String j = video.mo10551j();
            C8594l.m46770d(j, "video.folderPath");
            String substring = j.substring(0, video.mo10551j().length() - (video.mo10550i().length() + 1));
            C8594l.m46770d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (appCompatTextView5 != null) {
                appCompatTextView5.setText(substring);
            }
        }
        if (video.mo10551j() == null || !TextUtils.equals(this.f9055h, video.mo10551j())) {
            appCompatTextView.setTextColor(C4668q.f13454a.mo15402f(this.f9050c, C4619a.videoTextColorPrimary));
        } else {
            appCompatTextView.setTextColor(C4668q.f13454a.mo15402f(this.f9050c, C4619a.videoTextColorPrimaryVariant));
        }
        String str = this.f9054g;
        if (C8594l.m46767a(str, "select_mode")) {
            appCompatImageView5.setVisibility(4);
            appCompatCheckBox2.setVisibility(0);
        } else if (C8594l.m46767a(str, "un_select_mode")) {
            appCompatCheckBox2.setChecked(false);
            appCompatImageView5.setVisibility(4);
            appCompatCheckBox2.setVisibility(0);
        } else {
            appCompatImageView5.setVisibility(0);
            appCompatCheckBox2.setVisibility(8);
        }
        C4168j0<String> j0Var = this.f9052e;
        if (j0Var != null) {
            appCompatCheckBox2.setChecked(j0Var.mo14301m(video.mo10551j()));
        }
        if (z) {
            appCompatImageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
            appCompatImageView6.setImageDrawable(C0506a.m3152d(this.f9050c, C4622d.ic_folder));
            return;
        }
        appCompatImageView6.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C1738j<Drawable> K0 = C1719b.m8597t(this.f9050c).mo7665u(video.mo10564v()).mo7636K0(0.1f);
        Context context = this.f9050c;
        int i2 = C4622d.video_drawable_placeholder_cover;
        ((C1738j) ((C1738j) K0.mo8393k(C0506a.m3152d(context, i2))).mo8376a0(C0506a.m3152d(this.f9050c, i2))).mo7645z0(appCompatImageView6);
    }

    public int getItemViewType(int i) {
        return this.f9051d;
    }

    /* renamed from: i */
    public final int mo10085i() {
        return this.f9051d;
    }

    /* renamed from: j */
    public final String mo10086j() {
        return this.f9054g;
    }

    /* renamed from: k */
    public void onBindViewHolder(C2608d dVar, int i) {
        C8594l.m46771e(dVar, "holder");
        Video video = (Video) getItem(i);
        if (dVar.mo10104b() instanceof C4640l) {
            C4640l lVar = (C4640l) dVar.mo10104b();
            C8594l.m46770d(video, "video");
            AppCompatTextView appCompatTextView = lVar.f13403g;
            C8594l.m46770d(appCompatTextView, "tvTitle");
            AppCompatTextView appCompatTextView2 = lVar.f13402f;
            C8594l.m46770d(appCompatTextView2, "tvNum");
            ShapeableImageView shapeableImageView = lVar.f13401e;
            C8594l.m46770d(shapeableImageView, "ivNew");
            AppCompatImageView appCompatImageView = lVar.f13400d;
            C8594l.m46770d(appCompatImageView, "ivMore");
            ShapeableImageView shapeableImageView2 = lVar.f13399c;
            C8594l.m46770d(shapeableImageView2, "ivCover");
            AppCompatCheckBox appCompatCheckBox = lVar.f13398b;
            C8594l.m46770d(appCompatCheckBox, "cbSelect");
            m11922h(video, appCompatTextView, appCompatTextView2, shapeableImageView, appCompatImageView, shapeableImageView2, appCompatCheckBox, false, (AppCompatTextView) null);
            return;
        }
        C4641m mVar = (C4641m) dVar.mo10104b();
        C8594l.m46770d(video, "video");
        AppCompatTextView appCompatTextView3 = mVar.f13411h;
        C8594l.m46770d(appCompatTextView3, "tvTitle");
        AppCompatTextView appCompatTextView4 = mVar.f13409f;
        C8594l.m46770d(appCompatTextView4, "tvNum");
        ShapeableImageView shapeableImageView3 = mVar.f13408e;
        C8594l.m46770d(shapeableImageView3, "ivNew");
        AppCompatImageView appCompatImageView2 = mVar.f13407d;
        C8594l.m46770d(appCompatImageView2, "ivMore");
        ShapeableImageView shapeableImageView4 = mVar.f13406c;
        C8594l.m46770d(shapeableImageView4, "ivCover");
        AppCompatCheckBox appCompatCheckBox2 = mVar.f13405b;
        C8594l.m46770d(appCompatCheckBox2, "cbSelect");
        m11922h(video, appCompatTextView3, appCompatTextView4, shapeableImageView3, appCompatImageView2, shapeableImageView4, appCompatCheckBox2, true, mVar.f13410g);
    }

    /* renamed from: l */
    public void onBindViewHolder(C2608d dVar, int i, List<Object> list) {
        C8594l.m46771e(dVar, "holder");
        C8594l.m46771e(list, "payloads");
        if (list.isEmpty()) {
            super.onBindViewHolder(dVar, i, list);
        } else if (list.get(0) instanceof Bundle) {
            Video video = (Video) getItem(i);
            Bundle bundle = (Bundle) list.get(0);
            for (String str : bundle.keySet()) {
                if (str != null) {
                    boolean z = true;
                    int i2 = 8;
                    switch (str.hashCode()) {
                        case -2126866314:
                            if (str.equals("selection_mode")) {
                                String string = bundle.getString(str, this.f9054g);
                                if (dVar.mo10104b() instanceof C4640l) {
                                    if (!C8594l.m46767a(string, "select_mode")) {
                                        if (!C8594l.m46767a(string, "un_select_mode")) {
                                            ((C4640l) dVar.mo10104b()).f13400d.setVisibility(0);
                                            ((C4640l) dVar.mo10104b()).f13398b.setChecked(false);
                                            ((C4640l) dVar.mo10104b()).f13398b.setVisibility(8);
                                            break;
                                        } else {
                                            ((C4640l) dVar.mo10104b()).f13400d.setVisibility(4);
                                            ((C4640l) dVar.mo10104b()).f13398b.setChecked(false);
                                            ((C4640l) dVar.mo10104b()).f13398b.setVisibility(0);
                                            break;
                                        }
                                    } else {
                                        ((C4640l) dVar.mo10104b()).f13400d.setVisibility(4);
                                        ((C4640l) dVar.mo10104b()).f13398b.setVisibility(0);
                                        break;
                                    }
                                } else {
                                    C4641m mVar = (C4641m) dVar.mo10104b();
                                    if (!C8594l.m46767a(string, "select_mode")) {
                                        if (!C8594l.m46767a(string, "un_select_mode")) {
                                            mVar.f13405b.setChecked(false);
                                            mVar.f13407d.setVisibility(0);
                                            mVar.f13405b.setVisibility(8);
                                            break;
                                        } else {
                                            mVar.f13405b.setChecked(false);
                                            mVar.f13407d.setVisibility(4);
                                            mVar.f13405b.setVisibility(0);
                                            break;
                                        }
                                    } else {
                                        mVar.f13407d.setVisibility(4);
                                        mVar.f13405b.setVisibility(0);
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        case -795264719:
                            if (str.equals("folder_name_changed")) {
                                String string2 = bundle.getString(str, video.mo10550i());
                                if (!(dVar.mo10104b() instanceof C4640l)) {
                                    ((C4641m) dVar.mo10104b()).f13411h.setText(string2);
                                    break;
                                } else {
                                    ((C4640l) dVar.mo10104b()).f13403g.setText(string2);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -340808095:
                            if (str.equals("thumbnail_changed")) {
                                String string3 = bundle.getString(str, video.mo10564v());
                                if (!(dVar.mo10104b() instanceof C4640l)) {
                                    ((C4641m) dVar.mo10104b()).f13406c.setScaleType(ImageView.ScaleType.FIT_XY);
                                    ((C4641m) dVar.mo10104b()).f13406c.setImageDrawable(C0506a.m3152d(this.f9050c, C4622d.ic_folder));
                                    break;
                                } else {
                                    ((C4640l) dVar.mo10104b()).f13399c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    C1738j<Drawable> K0 = C1719b.m8597t(this.f9050c).mo7665u(string3).mo7636K0(0.1f);
                                    Context context = this.f9050c;
                                    int i3 = C4622d.video_drawable_placeholder_cover;
                                    C2144a a0 = ((C1738j) K0.mo8393k(C0506a.m3152d(context, i3))).mo8376a0(C0506a.m3152d(this.f9050c, i3));
                                    C8594l.m46770d(a0, "with(mContext).load(thum…                        )");
                                    ((C1738j) a0).mo7645z0(((C4640l) dVar.mo10104b()).f13399c);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -215777779:
                            if (!str.equals("recent_added_video_changed")) {
                                break;
                            } else {
                                if (bundle.getInt(str, video.mo10537a()) <= 0) {
                                    z = false;
                                }
                                if (!(dVar.mo10104b() instanceof C4640l)) {
                                    ShapeableImageView shapeableImageView = ((C4641m) dVar.mo10104b()).f13408e;
                                    C8594l.m46770d(shapeableImageView, "holder.mBinding as Video…mFolderListBinding).ivNew");
                                    if (z) {
                                        i2 = 0;
                                    }
                                    shapeableImageView.setVisibility(i2);
                                    break;
                                } else {
                                    ShapeableImageView shapeableImageView2 = ((C4640l) dVar.mo10104b()).f13401e;
                                    C8594l.m46770d(shapeableImageView2, "holder.mBinding.ivNew");
                                    if (z) {
                                        i2 = 0;
                                    }
                                    shapeableImageView2.setVisibility(i2);
                                    break;
                                }
                            }
                        case 857394880:
                            if (str.equals("video_count_changed")) {
                                int i4 = bundle.getInt(str, video.mo10539b());
                                String quantityString = this.f9050c.getResources().getQuantityString(C4626h.count_video, i4, new Object[]{Integer.valueOf(i4)});
                                C8594l.m46770d(quantityString, "mContext.resources.getQu…                        )");
                                if (!(dVar.mo10104b() instanceof C4640l)) {
                                    ((C4641m) dVar.mo10104b()).f13409f.setText(quantityString);
                                    break;
                                } else {
                                    ((C4640l) dVar.mo10104b()).f13402f.setText(quantityString);
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } else {
            super.onBindViewHolder(dVar, i, list);
        }
    }

    /* renamed from: m */
    public C2608d onCreateViewHolder(ViewGroup viewGroup, int i) {
        C4257a aVar;
        C8594l.m46771e(viewGroup, "parent");
        if (this.f9051d == 1) {
            aVar = C4640l.m20127d(LayoutInflater.from(this.f9050c), viewGroup, false);
            C8594l.m46770d(aVar, "{\n            VideoLayou… parent, false)\n        }");
        } else {
            aVar = C4641m.m20131d(LayoutInflater.from(this.f9050c), viewGroup, false);
            C8594l.m46770d(aVar, "{\n            VideoLayou… parent, false)\n        }");
        }
        return new C2608d(this, aVar);
    }

    /* renamed from: n */
    public final void mo10090n(String str) {
        C8594l.m46771e(str, "lastPlayerVideoFolderPath");
        if (!C8594l.m46767a(this.f9055h, str)) {
            this.f9055h = str;
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    /* renamed from: o */
    public final void mo10091o(C2610e eVar) {
        C8594l.m46771e(eVar, "listener");
        this.f9053f = eVar;
    }

    /* renamed from: p */
    public final void mo10092p(String str) {
        C8594l.m46771e(str, "selectionMode");
        this.f9054g = str;
        Bundle bundle = new Bundle();
        bundle.putString("selection_mode", str);
        notifyItemRangeChanged(0, getItemCount(), bundle);
    }

    /* renamed from: q */
    public final void mo10093q(C4168j0<String> j0Var) {
        C8594l.m46771e(j0Var, "tracker");
        this.f9052e = j0Var;
    }

    /* renamed from: r */
    public final void mo10094r(int i) {
        if (this.f9051d != i) {
            this.f9051d = i;
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2604k(Context context, int i) {
        super(new C2605a());
        C8594l.m46771e(context, "mContext");
        this.f9050c = context;
        this.f9051d = i;
        this.f9054g = "no_select_mode";
        this.f9055h = BuildConfig.FLAVOR;
    }
}
