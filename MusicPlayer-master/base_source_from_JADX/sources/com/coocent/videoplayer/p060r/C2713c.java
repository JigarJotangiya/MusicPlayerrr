package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.videoplayer.C2706m;
import com.coocent.videoplayer.C2707n;
import p082e.p157y.C4257a;
import p082e.p157y.C4258b;

/* renamed from: com.coocent.videoplayer.r.c */
/* compiled from: VideoLayoutDialogAudioPlaylistBinding */
public final class C2713c implements C4257a {

    /* renamed from: a */
    private final LinearLayout f9309a;

    /* renamed from: b */
    public final ImageView f9310b;

    /* renamed from: c */
    public final RecyclerView f9311c;

    /* renamed from: d */
    public final AppCompatTextView f9312d;

    /* renamed from: e */
    public final AppCompatTextView f9313e;

    private C2713c(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f9309a = linearLayout;
        this.f9310b = imageView;
        this.f9311c = recyclerView;
        this.f9312d = appCompatTextView;
        this.f9313e = appCompatTextView2;
    }

    /* renamed from: b */
    public static C2713c m12279b(View view) {
        int i = C2706m.iv_sequential_play;
        ImageView imageView = (ImageView) C4258b.m18705a(view, i);
        if (imageView != null) {
            i = C2706m.rv_play_list;
            RecyclerView recyclerView = (RecyclerView) C4258b.m18705a(view, i);
            if (recyclerView != null) {
                i = C2706m.tv_play_list;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C4258b.m18705a(view, i);
                if (appCompatTextView != null) {
                    i = C2706m.tv_play_order;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C4258b.m18705a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C2713c((LinearLayout) view, imageView, recyclerView, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C2713c m12280d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_dialog_audio_playlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12279b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f9309a;
    }
}
