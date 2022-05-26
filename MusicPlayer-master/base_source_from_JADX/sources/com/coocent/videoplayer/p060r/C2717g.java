package com.coocent.videoplayer.p060r;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.videoplayer.C2707n;
import p082e.p157y.C4257a;

/* renamed from: com.coocent.videoplayer.r.g */
/* compiled from: VideoLayoutDialogPlaylistBinding */
public final class C2717g implements C4257a {

    /* renamed from: a */
    private final LinearLayout f9346a;

    /* renamed from: b */
    public final RecyclerView f9347b;

    /* renamed from: c */
    public final AppCompatTextView f9348c;

    /* renamed from: d */
    public final View f9349d;

    private C2717g(LinearLayout linearLayout, RecyclerView recyclerView, AppCompatTextView appCompatTextView, View view) {
        this.f9346a = linearLayout;
        this.f9347b = recyclerView;
        this.f9348c = appCompatTextView;
        this.f9349d = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = com.coocent.videoplayer.C2706m.view_top;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.coocent.videoplayer.p060r.C2717g m12295b(android.view.View r4) {
        /*
            int r0 = com.coocent.videoplayer.C2706m.rv_play_list
            android.view.View r1 = p082e.p157y.C4258b.m18705a(r4, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x0024
            int r0 = com.coocent.videoplayer.C2706m.tv_playlist
            android.view.View r2 = p082e.p157y.C4258b.m18705a(r4, r0)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            if (r2 == 0) goto L_0x0024
            int r0 = com.coocent.videoplayer.C2706m.view_top
            android.view.View r3 = p082e.p157y.C4258b.m18705a(r4, r0)
            if (r3 == 0) goto L_0x0024
            com.coocent.videoplayer.r.g r0 = new com.coocent.videoplayer.r.g
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0024:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videoplayer.p060r.C2717g.m12295b(android.view.View):com.coocent.videoplayer.r.g");
    }

    /* renamed from: d */
    public static C2717g m12296d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2707n.video_layout_dialog_playlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m12295b(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo7577a() {
        return this.f9346a;
    }
}
