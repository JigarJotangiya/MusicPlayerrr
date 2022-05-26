package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.a */
/* compiled from: VideoLayoutCoverControllerBinding */
public final class C2711a implements C4257a {

    /* renamed from: a */
    private final ConstraintLayout f9274a;

    /* renamed from: b */
    public final AppCompatImageButton f9275b;

    /* renamed from: c */
    public final AppCompatImageView f9276c;

    /* renamed from: d */
    public final AppCompatImageView f9277d;

    /* renamed from: e */
    public final AppCompatImageView f9278e;

    /* renamed from: f */
    public final AppCompatImageView f9279f;

    /* renamed from: g */
    public final AppCompatImageView f9280g;

    /* renamed from: h */
    public final AppCompatImageView f9281h;

    /* renamed from: i */
    public final AppCompatImageView f9282i;

    /* renamed from: j */
    public final AppCompatImageView f9283j;

    /* renamed from: k */
    public final AppCompatImageView f9284k;

    /* renamed from: l */
    public final AppCompatImageView f9285l;

    /* renamed from: m */
    public final AppCompatImageView f9286m;

    /* renamed from: n */
    public final AppCompatImageView f9287n;

    /* renamed from: o */
    public final AppCompatImageView f9288o;

    /* renamed from: p */
    public final ConstraintLayout f9289p;

    /* renamed from: q */
    public final ConstraintLayout f9290q;

    /* renamed from: r */
    public final RelativeLayout f9291r;

    /* renamed from: s */
    public final AppCompatSeekBar f9292s;

    /* renamed from: t */
    public final AppCompatTextView f9293t;

    /* renamed from: u */
    public final AppCompatTextView f9294u;

    /* renamed from: v */
    public final AppCompatTextView f9295v;

    private C2711a(ConstraintLayout constraintLayout, AppCompatImageButton appCompatImageButton, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, AppCompatImageView appCompatImageView6, AppCompatImageView appCompatImageView7, AppCompatImageView appCompatImageView8, AppCompatImageView appCompatImageView9, AppCompatImageView appCompatImageView10, AppCompatImageView appCompatImageView11, AppCompatImageView appCompatImageView12, AppCompatImageView appCompatImageView13, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout, ConstraintLayout constraintLayout3, RelativeLayout relativeLayout2, AppCompatSeekBar appCompatSeekBar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f9274a = constraintLayout;
        this.f9275b = appCompatImageButton;
        this.f9276c = appCompatImageView;
        this.f9277d = appCompatImageView2;
        this.f9278e = appCompatImageView3;
        this.f9279f = appCompatImageView4;
        this.f9280g = appCompatImageView5;
        this.f9281h = appCompatImageView6;
        this.f9282i = appCompatImageView7;
        this.f9283j = appCompatImageView8;
        this.f9284k = appCompatImageView9;
        this.f9285l = appCompatImageView10;
        this.f9286m = appCompatImageView11;
        this.f9287n = appCompatImageView12;
        this.f9288o = appCompatImageView13;
        this.f9289p = constraintLayout2;
        this.f9290q = constraintLayout3;
        this.f9291r = relativeLayout2;
        this.f9292s = appCompatSeekBar;
        this.f9293t = appCompatTextView;
        this.f9294u = appCompatTextView2;
        this.f9295v = appCompatTextView3;
    }

    /* renamed from: b */
    public static C2711a m12271b(View view) {
        View view2 = view;
        int i = C2706m.ib_play;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C4258b.m18705a(view2, i);
        if (appCompatImageButton != null) {
            i = C2706m.iv_back;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view2, i);
            if (appCompatImageView != null) {
                i = C2706m.iv_eq;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C4258b.m18705a(view2, i);
                if (appCompatImageView2 != null) {
                    i = C2706m.iv_fast_forward;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) C4258b.m18705a(view2, i);
                    if (appCompatImageView3 != null) {
                        i = C2706m.iv_fast_rewind;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) C4258b.m18705a(view2, i);
                        if (appCompatImageView4 != null) {
                            i = C2706m.iv_lock;
                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) C4258b.m18705a(view2, i);
                            if (appCompatImageView5 != null) {
                                i = C2706m.iv_more;
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                if (appCompatImageView6 != null) {
                                    i = C2706m.iv_mute;
                                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                    if (appCompatImageView7 != null) {
                                        i = C2706m.iv_next;
                                        AppCompatImageView appCompatImageView8 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                        if (appCompatImageView8 != null) {
                                            i = C2706m.iv_orientation;
                                            AppCompatImageView appCompatImageView9 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                            if (appCompatImageView9 != null) {
                                                i = C2706m.iv_play_list;
                                                AppCompatImageView appCompatImageView10 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                                if (appCompatImageView10 != null) {
                                                    i = C2706m.iv_previous;
                                                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                                    if (appCompatImageView11 != null) {
                                                        i = C2706m.iv_screenshot;
                                                        AppCompatImageView appCompatImageView12 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                                        if (appCompatImageView12 != null) {
                                                            i = C2706m.iv_windows_play;
                                                            AppCompatImageView appCompatImageView13 = (AppCompatImageView) C4258b.m18705a(view2, i);
                                                            if (appCompatImageView13 != null) {
                                                                i = C2706m.layout_bottom;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) C4258b.m18705a(view2, i);
                                                                if (constraintLayout != null) {
                                                                    i = C2706m.layout_center;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) C4258b.m18705a(view2, i);
                                                                    if (relativeLayout != null) {
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                                                                        i = C2706m.layout_top;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) C4258b.m18705a(view2, i);
                                                                        if (relativeLayout2 != null) {
                                                                            i = C2706m.seek_bar;
                                                                            AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) C4258b.m18705a(view2, i);
                                                                            if (appCompatSeekBar != null) {
                                                                                i = C2706m.tv_current_position;
                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                if (appCompatTextView != null) {
                                                                                    i = C2706m.tv_duration;
                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                    if (appCompatTextView2 != null) {
                                                                                        i = C2706m.tv_title;
                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                        if (appCompatTextView3 != null) {
                                                                                            return new C2711a(constraintLayout2, appCompatImageButton, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, appCompatImageView9, appCompatImageView10, appCompatImageView11, appCompatImageView12, appCompatImageView13, constraintLayout, relativeLayout, constraintLayout2, relativeLayout2, appCompatSeekBar, appCompatTextView, appCompatTextView2, appCompatTextView3);
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
    public static C2711a m12272d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_cover_controller, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12271b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo7577a() {
        return this.f9274a;
    }
}
