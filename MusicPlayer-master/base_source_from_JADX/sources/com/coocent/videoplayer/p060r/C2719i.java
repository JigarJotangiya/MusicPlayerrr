package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.i */
/* compiled from: VideoPlayerLayoutCoverWindowControllerBinding */
public final class C2719i implements C4257a {

    /* renamed from: a */
    private final ConstraintLayout f9355a;

    /* renamed from: b */
    public final ConstraintLayout f9356b;

    /* renamed from: c */
    public final AppCompatImageView f9357c;

    /* renamed from: d */
    public final AppCompatImageView f9358d;

    /* renamed from: e */
    public final AppCompatImageView f9359e;

    /* renamed from: f */
    public final AppCompatImageView f9360f;

    /* renamed from: g */
    public final AppCompatImageView f9361g;

    /* renamed from: h */
    public final AppCompatImageView f9362h;

    /* renamed from: i */
    public final TextView f9363i;

    private C2719i(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView) {
        this.f9355a = constraintLayout;
        this.f9356b = constraintLayout2;
        this.f9357c = appCompatImageView;
        this.f9358d = appCompatImageView2;
        this.f9359e = appCompatImageView3;
        this.f9360f = appCompatImageView4;
        this.f9361g = appCompatImageView5;
        this.f9362h = appCompatImageView6;
        this.f9363i = textView;
    }

    /* renamed from: b */
    public static C2719i m12303b(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C2706m.iv_close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
        if (appCompatImageView != null) {
            i = C2706m.iv_next;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C4258b.m18705a(view, i);
            if (appCompatImageView2 != null) {
                i = C2706m.iv_play;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) C4258b.m18705a(view, i);
                if (appCompatImageView3 != null) {
                    i = C2706m.iv_previous;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) C4258b.m18705a(view, i);
                    if (appCompatImageView4 != null) {
                        i = C2706m.iv_resize;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) C4258b.m18705a(view, i);
                        if (appCompatImageView5 != null) {
                            i = C2706m.iv_restore;
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) C4258b.m18705a(view, i);
                            if (appCompatImageView6 != null) {
                                i = C2706m.rl_center_container;
                                RelativeLayout relativeLayout = (RelativeLayout) C4258b.m18705a(view, i);
                                if (relativeLayout != null) {
                                    i = C2706m.rl_top_container;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) C4258b.m18705a(view, i);
                                    if (relativeLayout2 != null) {
                                        i = C2706m.tv_title;
                                        TextView textView = (TextView) C4258b.m18705a(view, i);
                                        if (textView != null) {
                                            return new C2719i(constraintLayout, constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, relativeLayout, relativeLayout2, textView);
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
    public static C2719i m12304d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_player_layout_cover_window_controller, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12303b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo7577a() {
        return this.f9355a;
    }
}
