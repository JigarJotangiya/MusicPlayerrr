package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import com.google.android.material.imageview.ShapeableImageView;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.d */
/* compiled from: VideoLayoutDialogAudioPlaylistItemBinding */
public final class C2714d implements C4257a {

    /* renamed from: a */
    private final RelativeLayout f9314a;

    /* renamed from: b */
    public final AppCompatImageView f9315b;

    /* renamed from: c */
    public final ShapeableImageView f9316c;

    /* renamed from: d */
    public final AppCompatTextView f9317d;

    /* renamed from: e */
    public final AppCompatTextView f9318e;

    private C2714d(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, ShapeableImageView shapeableImageView, RelativeLayout relativeLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f9314a = relativeLayout;
        this.f9315b = appCompatImageView;
        this.f9316c = shapeableImageView;
        this.f9317d = appCompatTextView;
        this.f9318e = appCompatTextView2;
    }

    /* renamed from: b */
    public static C2714d m12283b(View view) {
        int i = C2706m.iv_remove;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C4258b.m18705a(view, i);
        if (appCompatImageView != null) {
            i = C2706m.iv_thumb;
            ShapeableImageView shapeableImageView = (ShapeableImageView) C4258b.m18705a(view, i);
            if (shapeableImageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = C2706m.tv_duration;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                if (appCompatTextView != null) {
                    i = C2706m.tv_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C2714d(relativeLayout, appCompatImageView, shapeableImageView, relativeLayout, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C2714d m12284d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_dialog_audio_playlist_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12283b(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo7577a() {
        return this.f9314a;
    }
}
