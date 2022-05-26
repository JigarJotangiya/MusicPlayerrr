package com.coocent.videoplayer.weidget.view;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: com.coocent.videoplayer.weidget.view.f */
/* compiled from: lambda */
public final /* synthetic */ class C2781f implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ AudioPlayBackItemView f9507g;

    /* renamed from: h */
    public final /* synthetic */ FragmentActivity f9508h;

    public /* synthetic */ C2781f(AudioPlayBackItemView audioPlayBackItemView, FragmentActivity fragmentActivity) {
        this.f9507g = audioPlayBackItemView;
        this.f9508h = fragmentActivity;
    }

    public final void onClick(View view) {
        AudioPlayBackItemView.m12531j(this.f9507g, this.f9508h, view);
    }
}
