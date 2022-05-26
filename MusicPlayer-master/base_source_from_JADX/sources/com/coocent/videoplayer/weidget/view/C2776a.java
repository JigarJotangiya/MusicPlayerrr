package com.coocent.videoplayer.weidget.view;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.coocent.video.videoplayercore.service.AudioPlayService;

/* renamed from: com.coocent.videoplayer.weidget.view.a */
/* compiled from: lambda */
public final /* synthetic */ class C2776a implements View.OnClickListener {

    /* renamed from: g */
    public final /* synthetic */ AudioPlayBackItemView f9499g;

    /* renamed from: h */
    public final /* synthetic */ AudioPlayService f9500h;

    /* renamed from: i */
    public final /* synthetic */ FragmentActivity f9501i;

    public /* synthetic */ C2776a(AudioPlayBackItemView audioPlayBackItemView, AudioPlayService audioPlayService, FragmentActivity fragmentActivity) {
        this.f9499g = audioPlayBackItemView;
        this.f9500h = audioPlayService;
        this.f9501i = fragmentActivity;
    }

    public final void onClick(View view) {
        AudioPlayBackItemView.m12529h(this.f9499g, this.f9500h, this.f9501i, view);
    }
}
