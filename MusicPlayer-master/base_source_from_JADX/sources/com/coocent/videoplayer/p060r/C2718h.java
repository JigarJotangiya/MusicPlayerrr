package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import com.google.android.material.imageview.ShapeableImageView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.h */
/* compiled from: VideoLayoutItemPlayListBinding */
public final class C2718h implements C4257a {

    /* renamed from: a */
    private final ConstraintLayout f9350a;

    /* renamed from: b */
    public final AppCompatImageView f9351b;

    /* renamed from: c */
    public final ShapeableImageView f9352c;

    /* renamed from: d */
    public final AppCompatTextView f9353d;

    /* renamed from: e */
    public final AppCompatTextView f9354e;

    private C2718h(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f9350a = constraintLayout;
        this.f9351b = appCompatImageView;
        this.f9352c = shapeableImageView;
        this.f9353d = appCompatTextView;
        this.f9354e = appCompatTextView2;
    }

    /* renamed from: b */
    public static C2718h m12299b(View view) {
        int i = C2706m.iv_remove;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
        if (appCompatImageView != null) {
            i = C2706m.iv_thumb;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C4258b.m18705a(view, i);
            if (shapeableImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C2706m.tv_duration;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                if (appCompatTextView != null) {
                    i = C2706m.tv_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C2718h(constraintLayout, appCompatImageView, shapeableImageView, constraintLayout, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C2718h m12300d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_item_play_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12299b(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo7577a() {
        return this.f9350a;
    }
}
