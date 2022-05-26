package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.b */
/* compiled from: VideoLayoutCoverGestureBinding */
public final class C2712b implements C4257a {

    /* renamed from: a */
    private final ConstraintLayout f9296a;

    /* renamed from: b */
    public final AppCompatImageView f9297b;

    /* renamed from: c */
    public final AppCompatImageView f9298c;

    /* renamed from: d */
    public final AppCompatImageView f9299d;

    /* renamed from: e */
    public final LinearLayout f9300e;

    /* renamed from: f */
    public final LinearLayout f9301f;

    /* renamed from: g */
    public final LinearLayout f9302g;

    /* renamed from: h */
    public final ProgressBar f9303h;

    /* renamed from: i */
    public final ProgressBar f9304i;

    /* renamed from: j */
    public final AppCompatTextView f9305j;

    /* renamed from: k */
    public final AppCompatTextView f9306k;

    /* renamed from: l */
    public final AppCompatTextView f9307l;

    /* renamed from: m */
    public final AppCompatTextView f9308m;

    private C2712b(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, ProgressBar progressBar2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.f9296a = constraintLayout;
        this.f9297b = appCompatImageView2;
        this.f9298c = appCompatImageView3;
        this.f9299d = appCompatImageView4;
        this.f9300e = linearLayout;
        this.f9301f = linearLayout2;
        this.f9302g = linearLayout3;
        this.f9303h = progressBar;
        this.f9304i = progressBar2;
        this.f9305j = appCompatTextView;
        this.f9306k = appCompatTextView2;
        this.f9307l = appCompatTextView3;
        this.f9308m = appCompatTextView4;
    }

    /* renamed from: b */
    public static C2712b m12275b(View view) {
        View view2 = view;
        int i = C2706m.iv_brightness;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view2, i);
        if (appCompatImageView != null) {
            i = C2706m.iv_fast_forward;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C4258b.m18705a(view2, i);
            if (appCompatImageView2 != null) {
                i = C2706m.iv_fast_rewind;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) C4258b.m18705a(view2, i);
                if (appCompatImageView3 != null) {
                    i = C2706m.iv_volume;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) C4258b.m18705a(view2, i);
                    if (appCompatImageView4 != null) {
                        i = C2706m.layout_container_brightness;
                        LinearLayout linearLayout = (LinearLayout) C4258b.m18705a(view2, i);
                        if (linearLayout != null) {
                            i = C2706m.layout_container_fast_forward;
                            LinearLayout linearLayout2 = (LinearLayout) C4258b.m18705a(view2, i);
                            if (linearLayout2 != null) {
                                i = C2706m.layout_container_volume;
                                LinearLayout linearLayout3 = (LinearLayout) C4258b.m18705a(view2, i);
                                if (linearLayout3 != null) {
                                    i = C2706m.progress_bar_brightness;
                                    ProgressBar progressBar = (ProgressBar) C4258b.m18705a(view2, i);
                                    if (progressBar != null) {
                                        i = C2706m.progress_bar_volume;
                                        ProgressBar progressBar2 = (ProgressBar) C4258b.m18705a(view2, i);
                                        if (progressBar2 != null) {
                                            i = C2706m.tv_brightness;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view2, i);
                                            if (appCompatTextView != null) {
                                                i = C2706m.tv_fast_forward_progress_time;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                if (appCompatTextView2 != null) {
                                                    i = C2706m.tv_fast_forward_time;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                    if (appCompatTextView3 != null) {
                                                        i = C2706m.tv_volume;
                                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                        if (appCompatTextView4 != null) {
                                                            return new C2712b((ConstraintLayout) view2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, linearLayout, linearLayout2, linearLayout3, progressBar, progressBar2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C2712b m12276d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_cover_gesture, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12275b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo7577a() {
        return this.f9296a;
    }
}
