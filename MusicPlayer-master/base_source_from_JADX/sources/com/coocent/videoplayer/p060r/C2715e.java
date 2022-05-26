package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import com.coocent.videoplayer.weidget.view.seekbar.VerticalSeekBar;
import com.coocent.videoplayer.weidget.view.seekbar.VerticalSeekBarWrapper;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.e */
/* compiled from: VideoLayoutDialogEqualizerBinding */
public final class C2715e implements C4257a {

    /* renamed from: a */
    private final ConstraintLayout f9319a;

    /* renamed from: b */
    public final RecyclerView f9320b;

    /* renamed from: c */
    public final VerticalSeekBar f9321c;

    /* renamed from: d */
    public final VerticalSeekBar f9322d;

    /* renamed from: e */
    public final VerticalSeekBar f9323e;

    /* renamed from: f */
    public final VerticalSeekBar f9324f;

    /* renamed from: g */
    public final VerticalSeekBar f9325g;

    /* renamed from: h */
    public final AppCompatSeekBar f9326h;

    /* renamed from: i */
    public final AppCompatSeekBar f9327i;

    /* renamed from: j */
    public final SwitchCompat f9328j;

    /* renamed from: k */
    public final AppCompatTextView f9329k;

    private C2715e(ConstraintLayout constraintLayout, RecyclerView recyclerView, VerticalSeekBar verticalSeekBar, VerticalSeekBar verticalSeekBar2, VerticalSeekBar verticalSeekBar3, VerticalSeekBar verticalSeekBar4, VerticalSeekBar verticalSeekBar5, AppCompatSeekBar appCompatSeekBar, AppCompatSeekBar appCompatSeekBar2, VerticalSeekBarWrapper verticalSeekBarWrapper, VerticalSeekBarWrapper verticalSeekBarWrapper2, VerticalSeekBarWrapper verticalSeekBarWrapper3, VerticalSeekBarWrapper verticalSeekBarWrapper4, VerticalSeekBarWrapper verticalSeekBarWrapper5, SwitchCompat switchCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9) {
        this.f9319a = constraintLayout;
        this.f9320b = recyclerView;
        this.f9321c = verticalSeekBar;
        this.f9322d = verticalSeekBar2;
        this.f9323e = verticalSeekBar3;
        this.f9324f = verticalSeekBar4;
        this.f9325g = verticalSeekBar5;
        this.f9326h = appCompatSeekBar;
        this.f9327i = appCompatSeekBar2;
        this.f9328j = switchCompat;
        this.f9329k = appCompatTextView7;
    }

    /* renamed from: b */
    public static C2715e m12287b(View view) {
        View view2 = view;
        int i = C2706m.rv_preset;
        RecyclerView recyclerView = (RecyclerView) C4258b.m18705a(view2, i);
        if (recyclerView != null) {
            i = C2706m.sb_1130;
            VerticalSeekBar verticalSeekBar = (VerticalSeekBar) C4258b.m18705a(view2, i);
            if (verticalSeekBar != null) {
                i = C2706m.sb_13500;
                VerticalSeekBar verticalSeekBar2 = (VerticalSeekBar) C4258b.m18705a(view2, i);
                if (verticalSeekBar2 != null) {
                    i = C2706m.sb_290;
                    VerticalSeekBar verticalSeekBar3 = (VerticalSeekBar) C4258b.m18705a(view2, i);
                    if (verticalSeekBar3 != null) {
                        i = C2706m.sb_4400;
                        VerticalSeekBar verticalSeekBar4 = (VerticalSeekBar) C4258b.m18705a(view2, i);
                        if (verticalSeekBar4 != null) {
                            i = C2706m.sb_75;
                            VerticalSeekBar verticalSeekBar5 = (VerticalSeekBar) C4258b.m18705a(view2, i);
                            if (verticalSeekBar5 != null) {
                                i = C2706m.sb_bass_boost;
                                AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) C4258b.m18705a(view2, i);
                                if (appCompatSeekBar != null) {
                                    i = C2706m.sb_virtualizer;
                                    AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) C4258b.m18705a(view2, i);
                                    if (appCompatSeekBar2 != null) {
                                        i = C2706m.sw_1130;
                                        VerticalSeekBarWrapper verticalSeekBarWrapper = (VerticalSeekBarWrapper) C4258b.m18705a(view2, i);
                                        if (verticalSeekBarWrapper != null) {
                                            i = C2706m.sw_13500;
                                            VerticalSeekBarWrapper verticalSeekBarWrapper2 = (VerticalSeekBarWrapper) C4258b.m18705a(view2, i);
                                            if (verticalSeekBarWrapper2 != null) {
                                                i = C2706m.sw_290;
                                                VerticalSeekBarWrapper verticalSeekBarWrapper3 = (VerticalSeekBarWrapper) C4258b.m18705a(view2, i);
                                                if (verticalSeekBarWrapper3 != null) {
                                                    i = C2706m.sw_4400;
                                                    VerticalSeekBarWrapper verticalSeekBarWrapper4 = (VerticalSeekBarWrapper) C4258b.m18705a(view2, i);
                                                    if (verticalSeekBarWrapper4 != null) {
                                                        i = C2706m.sw_75;
                                                        VerticalSeekBarWrapper verticalSeekBarWrapper5 = (VerticalSeekBarWrapper) C4258b.m18705a(view2, i);
                                                        if (verticalSeekBarWrapper5 != null) {
                                                            i = C2706m.switch_eq;
                                                            SwitchCompat switchCompat = (SwitchCompat) C4258b.m18705a(view2, i);
                                                            if (switchCompat != null) {
                                                                i = C2706m.tv_1130;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                if (appCompatTextView != null) {
                                                                    i = C2706m.tv_13500;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = C2706m.tv_290;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                        if (appCompatTextView3 != null) {
                                                                            i = C2706m.tv_4400;
                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                            if (appCompatTextView4 != null) {
                                                                                i = C2706m.tv_75;
                                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                if (appCompatTextView5 != null) {
                                                                                    i = C2706m.tv_bass_boost;
                                                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                    if (appCompatTextView6 != null) {
                                                                                        i = C2706m.tv_reverb;
                                                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                        if (appCompatTextView7 != null) {
                                                                                            i = C2706m.tv_reverb_title;
                                                                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                            if (appCompatTextView8 != null) {
                                                                                                i = C2706m.tv_virtualizer;
                                                                                                AppCompatTextView appCompatTextView9 = (AppCompatTextView) C4258b.m18705a(view2, i);
                                                                                                if (appCompatTextView9 != null) {
                                                                                                    return new C2715e((ConstraintLayout) view2, recyclerView, verticalSeekBar, verticalSeekBar2, verticalSeekBar3, verticalSeekBar4, verticalSeekBar5, appCompatSeekBar, appCompatSeekBar2, verticalSeekBarWrapper, verticalSeekBarWrapper2, verticalSeekBarWrapper3, verticalSeekBarWrapper4, verticalSeekBarWrapper5, switchCompat, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C2715e m12288d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_dialog_equalizer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12287b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo7577a() {
        return this.f9319a;
    }
}
