package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.j */
/* compiled from: VideoPlayerLayoutFrameBinding */
public final class C2720j implements C4257a {

    /* renamed from: a */
    private final LinearLayout f9364a;

    /* renamed from: b */
    public final FrameLayout f9365b;

    private C2720j(LinearLayout linearLayout, FrameLayout frameLayout) {
        this.f9364a = linearLayout;
        this.f9365b = frameLayout;
    }

    /* renamed from: b */
    public static C2720j m12307b(View view) {
        int i = C2706m.layout_container;
        FrameLayout frameLayout = (FrameLayout) C4258b.m18705a(view, i);
        if (frameLayout != null) {
            return new C2720j((LinearLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C2720j m12308d(LayoutInflater layoutInflater) {
        return m12309e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C2720j m12309e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_player_layout_frame, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12307b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f9364a;
    }
}
